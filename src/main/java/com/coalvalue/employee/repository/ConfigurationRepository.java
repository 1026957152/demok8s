package com.coalvalue.employee.repository;

import com.coalvalue.employee.domain.entity.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by zhao yuan on 01/10/2015.
 */

public interface ConfigurationRepository extends JpaRepository<Configuration, Integer> {


    Configuration findByCompanyId(Integer id);

    Page<Configuration> findByCompanyId(Integer companyId, Pageable pageable);

    Configuration findByCompanyIdAndKey(Integer id, String companyScanDisplayPrice);

    Optional<Configuration> findById(Integer id);

    Configuration findByKey(String companyScanDisplayInventory);


    Page<Configuration> findByCompanyIdIsNullAndUserIdIsNull(Pageable pageRequest);

    List<Configuration> findByCompanyIdIsNullAndUserIdIsNull();

    Configuration findByKeyAndCompanyIdIsNull(String key);

    Configuration findByUserIdAndKey(Integer id, String companyScanDisplayPrice);


    Page<Configuration> findByUserId(Integer id, Pageable pageable);

}
