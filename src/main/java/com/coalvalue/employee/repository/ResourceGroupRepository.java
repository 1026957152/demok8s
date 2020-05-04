package com.coalvalue.employee.repository;


import com.coalvalue.employee.domain.entity.ResourceGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface ResourceGroupRepository extends JpaSpecificationExecutor<ResourceGroup>, JpaRepository<ResourceGroup, Integer> {

}
