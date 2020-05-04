package com.coalvalue.employee.api;


import com.coalvalue.employee.configuration.CommonConstant;
import com.coalvalue.employee.domain.ListItem;
import com.coalvalue.employee.domain.NoFeign;
import com.coalvalue.employee.domain.OperationResult;
import com.coalvalue.employee.domain.UserInfo;
import com.coalvalue.employee.domain.entity.*;
import com.coalvalue.employee.enumType.EmployeeStatusEnum;
import com.coalvalue.employee.enumType.UserRolesEnum;
import com.coalvalue.employee.enumType.UserStatusEnum;
import com.coalvalue.employee.enumType.UserTypeEnum;
import com.coalvalue.employee.feign.NoRemoteClient;
import com.coalvalue.employee.repository.*;
import com.coalvalue.employee.service.EmployeeService;
import com.coalvalue.employee.service.PermissionService;
import com.coalvalue.employee.service.RoleService;
import com.coalvalue.employee.service.UserService;
import com.coalvalue.employee.web.valid.EmpoyeeCreateForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.*;
import java.util.function.Function;


/**
 * Created by zohu on 6/29/2015.
 */
@RestController
@RequestMapping("/api/v1/employee")
public class V2EmployeeRestController {



    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private NoRemoteClient sequenceGenerator;
    @Autowired
    private UserService userService;



    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private PreferenceRepository preferenceRepository;


    @Autowired
    private PersonRepository personRepository;


    @Autowired
    private PermissionService permissionService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private EmployeeService employeeService;



    @GetMapping("/get/{uuid}/{userNo}")
    Map getEmployeeType(@PathVariable("uuid") String uuid, @PathVariable("userNo") String userNo){

        Map data = new HashMap();
        data.put("status", true);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+userNo);

        User user = userRepository.findByUserId(userNo);
        Set<String> userRoles = permissionService.queryEmployeeRoles(user.getUuid());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+userRoles.toString());
        if(userRoles.contains(UserRolesEnum.USER_ROLE_BUYER.getText())) {
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


        @PostMapping("/create/{uuid}/{operatorUuid}/{userType}")
        Map createEmplyee(@PathVariable("uuid") String uuid, @PathVariable("operatorUuid") String operatorUuid, @PathVariable("userType")  String userType, @RequestBody EmpoyeeCreateForm empoyeeCreateForm){


        Map data = new HashMap();
        data.put("status", true);

        try {
            if(userType.equals(UserTypeEnum.煤矿.getText()) || userType.equals(UserTypeEnum.煤矿发货员.getText())){
                Company company = companyRepository.findByUuid(uuid);
                User user = userRepository.findByUuid(operatorUuid);
                create(empoyeeCreateForm, userType,company,user);
            }


            if(userType.equals(UserTypeEnum.中介商.getText()) || userType.equals(UserTypeEnum.中介商发货员.getText())){
                Company company = companyRepository.findByUuid(uuid);
                User user = userRepository.findByUuid(operatorUuid);
                create_broker(empoyeeCreateForm, userType,company,user);
            }

            if(userType.equals(UserTypeEnum.物流信息部.getText()) || userType.equals(UserTypeEnum.物流信息部_业务人员.getText())){
                Company company = companyRepository.findByUuid(uuid);
                User user = userRepository.findByUuid(operatorUuid);
                logistics_create_employee(empoyeeCreateForm, userType,company,user);
            }





            return data;
        }catch (Exception e){
            return OperationResult.errorMap(e.getMessage());
        }


    }






    @Transactional
    public Employee create(EmpoyeeCreateForm locationCreateForm, String userType, Company company, User user) throws Exception {




        User user_new = new User();

        user_new.setUserId(NoFeign.ok(sequenceGenerator.no("user","aa")).no());

        user_new.setUserName(user_new.getUserId());

        user_new.setPassword(locationCreateForm.getPassword());
        user_new.setUserType(CommonConstant.USER_TYPE_USER);
        user_new.setStatus(UserStatusEnum.USER_STATUS_UNACTIVATED.getText());
        user_new = userRepository.save(user_new);



        Preference preference = new Preference();
        preference.setUserId(user_new.getUuid());
        preference.setStorageNo(locationCreateForm.getStorageNo());
        preference = preferenceRepository.save(preference);






        Person person = new Person();
        person.setCompanyNo(company.getNo());
        person.setNickName(locationCreateForm.getNickName());
        person.setUserNo(user_new.getUserId());
        person.setGivenName(locationCreateForm.getGivenName());
        person.setFamilyName(locationCreateForm.getFamilyName());
        person.setPhoneNumber(locationCreateForm.getPhone());

        person.setRealName(locationCreateForm.getFamilyName()+locationCreateForm.getGivenName());
        personRepository.save(person);


/*
        Map map = new HashMap<>();
        map.put("name", employee.getUserId());
        map.put("distributor",user.getDistributor().getName());

        map.put("operator",user.getUserName());
        map.put("type", DataSynchronizationTypeEnum.Employee.getText());
*/




        if(userType.equals(UserTypeEnum.煤矿.getText())){
            UserRole ur = new UserRole();
            ur.setUserId(user_new.getId());
            ur.setRoleId(CommonConstant.ROLE_ID_COALPIT_USER);
            System.out.println("-------------"+ur.toString());
            userRoleRepository.save(ur);
        }
        if(userType.equals(UserTypeEnum.煤矿发货员.getText())){
            UserRole ur = new UserRole();
            ur.setUserId(user_new.getId());
            ur.setRoleId(CommonConstant.ROLE_ID_COALPIT_DELIVER);
            System.out.println("-------------"+ur.toString());
            userRoleRepository.save(ur);
        }

        Employee employee = createEmployee(company.getNo(),user_new.getUserId(),locationCreateForm.getPhone());

        return employee;
    }





    @Transactional
    public Employee create_broker(EmpoyeeCreateForm locationCreateForm, String userType, Company distributor, User user) throws Exception {

            User user_new = new User();
        String no = NoFeign.ok(sequenceGenerator.no("user","aa")).no();
            user_new.setUserId(no);
            user_new.setUserName(user_new.getUserId());
            user_new.setUserType(CommonConstant.USER_TYPE_USER);
            user_new.setPassword(locationCreateForm.getPassword());
            user_new.setStatus(UserStatusEnum.USER_STATUS_UNACTIVATED.getText());
            user_new = userRepository.save(user_new);




           Preference preference = new Preference();
            preference.setUserId(user_new.getUuid());
            preference.setStorageNo(locationCreateForm.getStorageNo());
            preference = preferenceRepository.save(preference);






            if(locationCreateForm.getUserType().equals(UserTypeEnum.中介商发货员.getText())){
                UserRole ur = new UserRole();
                ur.setUserId(user_new.getId());
                ur.setRoleId(CommonConstant.ROLE_ID_SELLDELIVERY);
                System.out.println("-------------"+ur.toString());
                userRoleRepository.save(ur);
            }
            if(locationCreateForm.getUserType().equals(UserTypeEnum.中介商.getText())){
                UserRole ur = new UserRole();
                ur.setUserId(user_new.getId());
                ur.setRoleId(CommonConstant.ROLE_ID_BROKER_USER);
                System.out.println("-------------"+ur.toString());
                userRoleRepository.save(ur);
            }


        Person person = new Person();
        person.setCompanyNo(distributor.getNo());

        person.setUserNo(user_new.getUserId());
        person.setPhoneNumber(locationCreateForm.getPhone());
        person.setGivenName(locationCreateForm.getGivenName());
        person.setFamilyName(locationCreateForm.getFamilyName());
        person.setNickName(locationCreateForm.getNickName());
        person.setRealName(locationCreateForm.getFamilyName()+locationCreateForm.getGivenName());
        personRepository.save(person);

        Employee employee = createEmployee(distributor.getNo(),user_new.getUserId(),locationCreateForm.getPhone());
        return employee;


    }

    @Transactional
    public Employee activeEmployee_(Employee employee, String phone) {


            List<User> userList = userRepository.findByMobile(phone);
            for(User user : userList){
                user.setStatus(UserStatusEnum.USER_STATUS_UNACTIVATED.getText());
                userRepository.save(user);
            }

            User user = userRepository.findByUserId(employee.getUserNo());
            user.setStatus(UserStatusEnum.USER_STATUS_ACTIVE.getText());
            user.setMobile(phone);
            userRepository.save(user);


            employee.setStatus(EmployeeStatusEnum.ACTIVE.getText());
            employeeRepository.save(employee);

        return employee;
    }



    @Transactional
    public OperationResult logistics_create_employee(EmpoyeeCreateForm locationCreateForm, String userType, Company distributor, User user_) throws Exception {

        OperationResult operationResult = new OperationResult();



        User user = new User();



        String no = NoFeign.ok(sequenceGenerator.no("user","aa")).no();
        user.setUserId(no);
        user.setUserName(no);
        user.setUserType(CommonConstant.USER_TYPE_USER);
        user.setPassword(locationCreateForm.getPassword());
        user.setStatus(UserStatusEnum.USER_STATUS_UNACTIVATED.getText());
        user = userRepository.save(user);


/*        UserSetting setting = new UserSetting();
        setting.setPhoneStatus(CommonConstant.USER_AUTH_PHONE_STATUS_UNAUTHED);
        setting.setMailStatus(CommonConstant.USER_AUTH_MAIL_STATUS_UNAUTHED);
        setting.setUserId(user.getId());
        userSettingRepository.save(setting);*/




        if(locationCreateForm.getUserType().equals(UserTypeEnum.物流信息部.getText())){
            UserRole ur = new UserRole();
            ur.setUserId(user.getId());
            ur.setRoleId(CommonConstant.ROLE_ID_LOGISTICS);
            System.out.println("-------------"+ur.toString());
            userRoleRepository.save(ur);


        }

        if(locationCreateForm.getUserType().equals(UserTypeEnum.物流信息部_业务人员.getText())){
            UserRole ur = new UserRole();
            ur.setUserId(user.getId());
            ur.setRoleId(CommonConstant.ROLE_ID_LOGISTICS_SALES_STAFF);
            System.out.println("-------------"+ur.toString());
            userRoleRepository.save(ur);


        }



        Person person = new Person();
        person.setCompanyNo(distributor.getNo());

        person.setUserNo(user.getUserId());
        person.setPhoneNumber(locationCreateForm.getPhone());
        person.setGivenName(locationCreateForm.getGivenName());
        person.setFamilyName(locationCreateForm.getFamilyName());
        person.setNickName(locationCreateForm.getNickName());
        person.setRealName(locationCreateForm.getFamilyName()+locationCreateForm.getGivenName());
        personRepository.save(person);







        Employee employee = createEmployee(distributor.getNo(),user.getUserId(),locationCreateForm.getPhone());


        operationResult.setSuccess(true);
        operationResult.setResultObject(user);
        return operationResult;


    }


    Employee createEmployee(String companyNo, String userNo, String phone) throws Exception {
        List<Employee> employees = employeeRepository.findByCompanyNo(companyNo);

        Employee employee = new Employee();

        employee.setSeq(String.format("%06d",employees.size()));
        String no = NoFeign.ok(sequenceGenerator.no("employee","aa")).no();
        employee.setNo(no);
        employee.setCompanyNo(companyNo);
        employee.setUserNo(userNo);
        employee.setStatus(EmployeeStatusEnum.UNACTIVATED.getText());

        employee.setMobile(phone);

        employee = employeeRepository.save(employee);

        return employee;

        //AuthorizationVerification authorizationVerification = authorizationVerificationRepository.findByCompanyNoAndStatus(company.getNo(),AuthorizationVerificationStatusEnum.Valid.getText());

        //   employee.set



    }














    @RequestMapping(value = "/{uuid}/employeeByDistributor",method = RequestMethod.GET)
    @ResponseBody
    public Page<Map> employeeByDistributor(@PathVariable("uuid") String uuid, @PageableDefault(sort = "createDate", direction = Sort.Direction.DESC) Pageable pageable) {

        Company company = companyRepository.findByUuid(uuid);//.getPrincipal();

        Page<Employee> pages = employeeRepository.findByCompanyNo(company.getNo(),pageable);


        Page<Map> page = pages.map(new Function<Employee, Map>() {
            public Map apply(Employee objectEntity) {


                Map map = new HashMap<>();

                map.put("no",objectEntity.getNo());

                List<Map> roles = roleService.queryEmployeeRolesMap(objectEntity.getUuid());
                map.put("roles", roles);


                User user = null;//
                if(objectEntity.getUserNo()!= null){
                    user = userRepository.findByUserId(objectEntity.getUserNo());
                }else{
                    user = userRepository.findByUserId(objectEntity.getUserNo());


                }




                if(user!= null){
                    Person person = personRepository.findByUserNo(user.getUserId());

                    map.put("userId", user.getUserId());
 /*                   List<Map> userRoles = roleService.queryUserRolesMap(user.getId());
                    map.put("roles", userRoles);*/



                    if(person != null){
 /*                       String url = linkTo(methodOn(MobileEmployeeController.class).accountDetail(person.getUserId(),null,null)).withSelfRel().getHref();
                        map.put("url",url);*/


                        if(user.getMobile()== null){
                            map.put("phone", user.getMobile());
                        }else{
                            map.put("phone", objectEntity.getMobile());
                        }

                        map.put("familyName", person.getFamilyName());
                        map.put("givenName", person.getGivenName());
                        map.put("nickName", person.getNickName());
                        map.put("realName", person.getFamilyName()+person.getGivenName());
                        map.put("gender", person.getGender());
                        map.put("status", user.getStatus());

                    }




                }



                return map;

            }
        });
        return page;


    }

    @GetMapping(value = "/{uuid}/employee")
    @ResponseBody
    public ResponseEntity<Page<Map>> employee(@PathVariable("uuid") String uuid, @PageableDefault(sort = "createDate", direction = Sort.Direction.DESC) Pageable pageable) {

        Company company = companyRepository.findByUuid(uuid);

        Page<Employee> pages = employeeRepository.findByCompanyNo(company.getNo(),pageable);

        Page<Map> page = pages.map(new Function<Employee, Map>() {
            public Map apply(Employee objectEntity) {
                Map map = new HashMap<>();

                map.put("no",objectEntity.getNo());
                map.put("id",objectEntity.getUuid());
                User user = null;//
                if(objectEntity.getUserNo()!= null){
                    user = userRepository.findByUserId(objectEntity.getUserNo());
                }else{
                    user = userRepository.findByUserId(objectEntity.getUserNo());


                }



                userService.getEmploymentRelationship(map,objectEntity);

                List<Map> roles = roleService.queryEmployeeRolesMap(objectEntity.getUuid());
                map.put("roles", roles);

                if(user!= null){
                    map.put("phone", user.getMobile());

                    Person person = personRepository.findByUserNo(user.getUserId());

                    map.put("userId", user.getUserId());




                    if(person != null){
 /*                       String url = linkTo(methodOn(MobileEmployeeController.class).accountDetail(person.getUserId(),null,null)).withSelfRel().getHref();
                        map.put("url",url);*/




                        map.put("familyName", person.getFamilyName());
                        map.put("givenName", person.getGivenName());
                        map.put("nickName", person.getNickName());
                        map.put("realName", person.getFamilyName()+person.getGivenName());
                        map.put("gender", person.getGender());


                    }






                }

                map.put("status", objectEntity.getStatus());



                return map;

            }
        });


        return ResponseEntity.ok(page);


    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<Employee>> getEmployees(@PathVariable(value = "id") String id) {


        Company company = companyRepository.findByUuid(id);
        if(company != null){
            List<Employee> employees = employeeRepository.findByCompanyId(company.getUuid());

            return ResponseEntity.ok(employees);
        }else{
            return ResponseEntity.notFound().build();
        }


    }



    @GetMapping(value = "/userInfo/{id}")
    public UserInfo getUserInfo(@PathVariable(value = "id") String id) {

        User user = userRepository.findByUuid(id);
        UserInfo company = employeeService.getUserInfo(user);

        return company;

    }


    @GetMapping(value = "/employeeInfo/{id}")
    public UserInfo getEmployeeInfo(@PathVariable(value = "id") String id){
        Assert.notNull(id,"职工id 不能为空");
        Employee employee = employeeRepository.findByUuid(id);
        User user = userRepository.findByUuid(employee.getUserId());
        UserInfo company = employeeService.getUserInfo(user);

        return company;
    }
}
