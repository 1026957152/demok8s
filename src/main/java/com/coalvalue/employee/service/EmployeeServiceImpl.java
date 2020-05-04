package com.coalvalue.employee.service;


import com.coalvalue.employee.configuration.CommonConstant;
import com.coalvalue.employee.domain.ListItem;
import com.coalvalue.employee.domain.NoFeign;
import com.coalvalue.employee.domain.OperationResult;
import com.coalvalue.employee.domain.UserInfo;
import com.coalvalue.employee.domain.entity.Company;
import com.coalvalue.employee.domain.entity.Employee;
import com.coalvalue.employee.domain.entity.Person;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.enumType.AuthorizationVerificationTypeEnum;
import com.coalvalue.employee.enumType.EmployeeStatusEnum;
import com.coalvalue.employee.enumType.UserRolesEnum;
import com.coalvalue.employee.enumType.UserTypeEnum;
import com.coalvalue.employee.feign.NoRemoteClient;
import com.coalvalue.employee.repository.EmployeeRepository;
import com.coalvalue.employee.repository.PersonRepository;
import com.coalvalue.employee.repository.UserRepository;
import com.coalvalue.employee.web.valid.EmpoyeeCreateForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.*;
import java.util.stream.Collectors;


/**
 * Created by Peter Xu on 04/04/2015.
 */
@Service("employeeService")
//@Transactional(readOnly = true)
public class EmployeeServiceImpl extends BaseServiceImpl implements EmployeeService {



    @Autowired
    private KafkaTemplate kafkaTemplate;


    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PermissionService permissionService;

    @Autowired
    private NoRemoteClient sequenceGenerator;

    @Autowired
    private RoleService roleService;
    @Autowired
    private AuthenticationService authenticationService;



    @Autowired
    private PersonRepository personRepository;


    @Override
    public Page<Employee> query(PageRequest pageRequest, User user) {
        return employeeRepository.findByCompanyNo(user.getCompany().getNo(),pageRequest);
    }


    @Override
    public Employee edit(EmpoyeeCreateForm locationCreateForm) {
        return null;
    }

    @Override
    @Transactional
    public OperationResult terminate(Employee employee, User user) {
        employee.setStatus(EmployeeStatusEnum.Terminated.getText());
        employee = employeeRepository.save(employee);

        return OperationResult.ok(employee);
    }






















    @Override
    @Transactional
    public OperationResult create(EmpoyeeCreateForm locationCreateForm, String userType, Company company, User user) throws Exception {


        String name = "null";
        String phone = "null"; //locationCreateForm.getPhone()
        Employee employee = createEmployee(company,null, UserTypeEnum.fromString(userType),name,phone,locationCreateForm.getNote());
        if("createInvitedCode".equals(locationCreateForm.getCreateInvitedCode())){
            OperationResult operationResult = authenticationService.generateInvitedCode(employee.getUuid(), AuthorizationVerificationTypeEnum.Establish_Employee,user.getCompany());

            if(operationResult.isSuccess()){
                employee.setStatus(EmployeeStatusEnum.WaitingBinding.getText());
                employeeRepository.save(employee);

            }
        }

        return OperationResult.ok(employee);
    }































    @Override
    public Employee createEmployee(Company company, User user, UserTypeEnum userTypeEnum, String phone, String note) throws Exception {
        Person person = personRepository.findByUserId(user.getUuid());
        List<Employee> employees = employeeRepository.findByCompanyNo(company.getNo());

        Employee employee = new Employee();
        employee.setUserNo(user.getUserId());
        employee.setUserId(user.getUuid());

        employee.setName(person.getNickName());
        employee.setMobile(user.getMobile());
        employee.setSeq(String.format("%06d",employees.size()));
        employee.setMobile(user.getMobile());
        employee.setCompanyNo(company.getNo());
        employee.setCompanyId(company.getUuid());
        String employeeNo = NoFeign.ok(sequenceGenerator.no("employee",company.getNo())).no();

        employee.setNo(employeeNo);

        employee.setStatus(EmployeeStatusEnum.ACTIVE.getText());
        employee.setType(CommonConstant.USER_TYPE_USER);
        employee = employeeRepository.save(employee);

        roleService.addRegisterEmployeeRole(UserTypeEnum.管理者,employee);

        return employee;

    }

    Employee createEmployee(Company company, User user, UserTypeEnum userTypeEnum, String name, String phone, String note) throws Exception {
        List<Employee> employees = employeeRepository.findByCompanyNo(company.getNo());

        Assert.notNull(phone,"phone不容许为空");
        Assert.notNull(name,"name不容许为空");


        Employee employee = new Employee();
        employee.setName(name);
        employee.setSeq(String.format("%06d",employees.size()));

        String no = NoFeign.ok(sequenceGenerator.no("employee",company.getNo())).no();


        employee.setNo(no);




        employee.setCompanyNo(company.getNo());
        employee.setCompanyId(company.getUuid());

        if(user != null){
            employee.setUserNo(user.getUserId());
        }

        employee.setStatus(EmployeeStatusEnum.INITIAL.getText());

        employee.setMobile(phone);
        employee.setNote(note);
        employee = employeeRepository.save(employee);
        roleService.addRegisterEmployeeRole(userTypeEnum,employee);










        Set<String> employeeRoles = permissionService.queryEmployeeRoles(employee.getUuid());
        String str2 = employeeRoles.stream().collect(Collectors.joining(","));
/*

        EmployeeEvent productEvent = EmployeeEvent.newBuilder()
                .setNo(employee.getNo())
                .setUserId(user.getUuid())
                .setUserNo(user.getUserId())

                .setNickName("nickName")
                //  .setStatus(user.getStatus())
                .setType(user.getUserType())
                .setPhone(user.getMobile())
                .setCompanyId(employee.getCompanyId())
                .setCompanyNo(employee.getCompanyNo())

                .setEvent("login")
                .setRoles(str2)


                .setTimestamp(LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli())
                .setBehavior("Create")
                .build();
        System.out.println("发送\n"+productEvent.toString());
        ProducerRecord<String, UserEvent> record = new ProducerRecord("employee-event",
                employee.getUuid(),
                productEvent);

        kafkaTemplate.send(record);
*/






        return employee;



    }



    @Override
    public Map getEmployeeType(String uuid, String userNo){

        Map data = new HashMap();
        data.put("status", true);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+userNo);

        User user = userRepository.findByUserId(userNo);
        Set<String> userRoles = permissionService.queryUserRoles(user.getId());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+userRoles.toString());
        if(userRoles.contains(UserRolesEnum.USER_ROLE_BUYER.getText())){


            List<ListItem> list = new ArrayList<ListItem>();

            ListItem element = new ListItem(UserTypeEnum.买家收货人.getText(), UserTypeEnum.买家收货人.getDisplayText(), UserTypeEnum.买家收货人.getTipsMessage());
            list.add(element);
            element = new ListItem(UserTypeEnum.买家.getText(), UserTypeEnum.买家.getDisplayText(), UserTypeEnum.买家.getTipsMessage());

            list.add(element);

            data.put("userType", list);
        }

        if(userRoles.contains(UserRolesEnum.USER_ROLE_BROKER.getText())){
            List<ListItem> list = new ArrayList<ListItem>();

            ListItem element = new ListItem(UserTypeEnum.中介商发货员.getText(), UserTypeEnum.中介商发货员.getDisplayText(), UserTypeEnum.中介商发货员.getTipsMessage());
            list.add(element);
            element = new ListItem(UserTypeEnum.中介商.getText(), UserTypeEnum.中介商.getDisplayText(), UserTypeEnum.中介商.getTipsMessage());

            list.add(element);
            data.put("userType", list);
        }

        if(userRoles.contains(UserRolesEnum.USER_ROLE_COALPIT.getText())){
            List<ListItem> list = new ArrayList<ListItem>();

            ListItem element = new ListItem(UserTypeEnum.煤矿发货员.getText(), UserTypeEnum.煤矿发货员.getDisplayText(), UserTypeEnum.煤矿发货员.getTipsMessage());
            list.add(element);
            element = new ListItem(UserTypeEnum.煤矿.getText(), UserTypeEnum.煤矿.getDisplayText(), UserTypeEnum.煤矿.getTipsMessage());

            list.add(element);
            element = new ListItem(UserTypeEnum.装车员.getText(), UserTypeEnum.装车员.getDisplayText(), UserTypeEnum.装车员.getTipsMessage());
            list.add(element);
            data.put("userType", list);
        }





        if(userRoles.contains(UserRolesEnum.USER_ROLE_LOGISTICS.getText())){
            List<ListItem> list = new ArrayList<ListItem>();

            ListItem element = new ListItem(UserTypeEnum.物流信息部.getText(), UserTypeEnum.物流信息部.getDisplayText(), UserTypeEnum.物流信息部.getTipsMessage());
            list.add(element);
            element = new ListItem(UserTypeEnum.物流信息部_业务人员.getText(), UserTypeEnum.物流信息部_业务人员.getDisplayText(), UserTypeEnum.物流信息部_业务人员.getTipsMessage());
            list.add(element);
            data.put("userType", list);
        }
        return data;
    }

    @Override
    public boolean hasEstablishEmployee(User user) {


        List<Employee> employeees = employeeRepository.findByUserNo(user.getUserId());
        Optional<Employee> employeeOptional = employeees.stream().filter(e->!EmployeeStatusEnum.Terminated.getText().equals(e.getStatus())).findFirst();
        return employeeOptional.isPresent();

    }


    @Override
    public UserInfo getUserInfo(User user) {
        Person person = personRepository.findByUserId(user.getUuid());

        UserInfo userInfo = new UserInfo();
        userInfo.setRealName(person.getFamilyName()+person.getGivenName());
        userInfo.setFamilyName(person.getFamilyName());
        userInfo.setGivenName(person.getGivenName());
        userInfo.setNickName(person.getNickName());
        userInfo.setUserNo(user.getUserId());
        userInfo.setPhone(user.getMobile());
        userInfo.setGender(person.getGender());

    //    userInfo.setIsBindingWeixin(user.isBindingWeixin());

        Employee employee = employeeRepository.findByUserNoAndStatus(user.getUserId(), EmployeeStatusEnum.ACTIVE.getText()).get(0);

        userInfo.setEmployeeNo(employee.getNo());
        userInfo.setCompanyId(employee.getCompanyId());
        return userInfo;
    }

    @Override
    public UserInfo getUserInfo(String no) {

        User user = userRepository.findByUuid(no);
        return getUserInfo(user);


    }

    @Override
    @Transactional
    public OperationResult generateInvitedCode(Employee employee, User user) {
        OperationResult operationResult =authenticationService.generateInvitedCode(employee.getUuid(), AuthorizationVerificationTypeEnum.Establish_Employee,user.getCompany());
        if(operationResult.isSuccess()) {
            employee.setStatus(EmployeeStatusEnum.WaitingBinding.getText());

            employeeRepository.save(employee);
        }


        return operationResult;
        }



}
