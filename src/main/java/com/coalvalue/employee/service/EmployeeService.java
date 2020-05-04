package com.coalvalue.employee.service;


import com.coalvalue.employee.domain.OperationResult;
import com.coalvalue.employee.domain.UserInfo;
import com.coalvalue.employee.domain.entity.Company;
import com.coalvalue.employee.domain.entity.Employee;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.enumType.UserTypeEnum;
import com.coalvalue.employee.web.valid.EmpoyeeCreateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Map;

/**
 * Created by Peter Xu on 04/04/2015.
 */
public interface EmployeeService extends BaseService {



    Page<Employee> query(PageRequest pageRequest, User user);

    Employee edit(EmpoyeeCreateForm locationCreateForm);


    OperationResult terminate(Employee employee, User user);

    OperationResult create(EmpoyeeCreateForm locationCreateForm, String userType, Company company, User user) throws Exception;

    Employee createEmployee(Company company, User user, UserTypeEnum userTypeEnum, String phone, String note) throws Exception;

    Map getEmployeeType(String uuid, String userNo);

    boolean hasEstablishEmployee(User user);

    UserInfo getUserInfo(User user);

    UserInfo getUserInfo(String no);

    OperationResult generateInvitedCode(Employee employee, User user);

}
