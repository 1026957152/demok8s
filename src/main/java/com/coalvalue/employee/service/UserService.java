package com.coalvalue.employee.service;


import com.coalvalue.employee.domain.entity.Employee;

import java.util.Map;

/**
 * Created by Peter Xu on 01/08/2015.
 */
public interface UserService extends BaseService {




    void getEmploymentRelationship(Map map, Employee employee);
}
