package com.coalvalue.employee.repository;

import com.coalvalue.employee.domain.entity.SystemConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by zhao yuan on 01/10/2015.
 */

public interface SystemConfigurationRepository extends JpaRepository<SystemConfiguration, Integer> {








    Optional<SystemConfiguration> findById(Integer id);

    SystemConfiguration findByKey(String companyScanDisplayInventory);







}
