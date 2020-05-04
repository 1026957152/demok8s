package com.coalvalue.employee.repository;


import com.coalvalue.employee.domain.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {




    List<Employee> findByUserNo(String userId);

    List<Employee> findByCompanyNo(String companyNo);


    Page<Employee> findByCompanyNo(String no, Pageable pageable);


    Employee findByUuid(String s);

    Employee findByNo(String employeeNo);

    List<Employee> findByCompanyId(String companyId);

    List<Employee> findByUserNoAndStatus(String userId, String text);


    List<Employee> findByUserId(String uuid);


    Page<Employee> findByUserId(String uuid, Pageable pageable);
}
