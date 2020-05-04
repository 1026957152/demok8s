package com.coalvalue.employee.service;


import com.coalvalue.employee.domain.entity.AuthorizationVerification;
import com.coalvalue.employee.domain.entity.Employee;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.feign.NoRemoteClient;
import com.coalvalue.employee.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;


/**
 * Created by zhongkw on 1/7/2015.
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private AuthorizationVerificationRepository authorizationVerificationRepository;
    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private EmployeeService employeeService;


    @Autowired
    private PersonRepository personRepository;



    @Autowired
    private RoleService roleService;

    @Autowired
    private CompanyRepository companyRepository;


    @Autowired
    private PermissionService permissionService;

    @Autowired
    private UserSettingRepository userSettingRepository;

    @Autowired
    private NoRemoteClient sequenceGenerator;







    @Autowired
    private EmployeeRepository employeeRepository;



    @Autowired
    private KafkaTemplate kafkaTemplate;






















    @Override
    public void getEmploymentRelationship(Map map, Employee employee) {
        User user = null;//
        if(employee.getUserId()!= null){
            user = userRepository.findByUuid(employee.getUserId());

            //    employee.setStatus(EmployeeStatusEnum.Terminated.getText());


            map.put("employmentRelationship","已经绑定");
        }else{


            AuthorizationVerification authorizationVerification =  authenticationService.getValidAuthorizationVerification(employee.getUuid());


            if(authorizationVerification!= null){

                if(authorizationVerification.getExpireDate().isBefore(LocalDateTime.now())){
                    map.put("employmentRelationship","绑定密码失效，请重新生成");

                }else{
                    map.put("employmentRelationship","绑定密码："+authorizationVerification.getCode()+"有效期："+authorizationVerification.getExpireDate());

                }
            }else{
                map.put("employmentRelationship","未绑定");
            }
        }





    }




}
