package com.coalvalue.employee.web.validation;


import com.coalvalue.employee.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


//http://kielczewski.eu/2014/12/spring-boot-security-application/
@Component
public class UserCreateFormValidator  implements Validator {

   // private final UserService userService;

    protected transient Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

/*    public UserCreateFormValidator(UserService userService) {
       // this.userService = userService;
    }*/


    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(UserCreateForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {

        UserCreateForm form = (UserCreateForm) target;
        System.out.println("--------------------------- usercreate form is "+ form.toString());






    }


}