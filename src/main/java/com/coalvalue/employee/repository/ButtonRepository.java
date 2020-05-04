package com.coalvalue.employee.repository;

import com.coalvalue.employee.domain.entity.Button;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface ButtonRepository extends JpaSpecificationExecutor<Button>, JpaRepository<Button, Integer> {

}
