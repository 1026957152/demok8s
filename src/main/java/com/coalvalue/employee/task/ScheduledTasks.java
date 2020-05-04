package com.coalvalue.employee.task;

import com.coalvalue.employee.configuration.CommonConstant;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.domain.entity.UserRole;
import com.coalvalue.employee.repository.*;
import com.coalvalue.employee.service.AccountService;
import com.coalvalue.employee.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;


@Component
@Qualifier("myScheduledTasks")
public class ScheduledTasks {


    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");




    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    AccountService accountService;


    @Autowired
    UserRepository userRepository;

    @Autowired
    UserRoleRepository userRoleRepository;


    @Autowired
    PersonRepository personRepository;

    @Autowired
    RoleService roleService;

    @Autowired
    RoleRepository roleRepository;


    @Transactional
    public UserRole createRole(User user) {

        UserRole ur = new UserRole();
        ur.setUserId(user.getId());
        ur.setRoleId(CommonConstant.ROLE_ID_BROKER_USER);
        return userRoleRepository.save(ur);


    }





}

/*
	var date=new Date();
	var hour=date.getHours();
	var str=‘‘;
	switch(hour){
	case 0:case 1:case 2:case 3:case 4:str=‘凌晨好！‘;break;
	case 5:case 6:str=‘早上好！‘;break;
	case 7: case 8:case 9:case 10:case 11:str=‘上午好！‘;break;
	case 12:case 13:str=‘中午好！‘;break;
	case 14:case 15:case 16:str=‘下午好！‘;break;
	case 17:case 18:case 19:case 20:str=‘晚上好！‘;break;
	case 23:case 22:case 21:str=‘太晚了，休息吧！‘;break;
	}
 */