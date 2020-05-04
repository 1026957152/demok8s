package com.coalvalue.employee.repository;


import com.coalvalue.employee.domain.entity.Preference;
import org.springframework.data.jpa.repository.JpaRepository;

;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface PreferenceRepository extends JpaRepository<Preference, Integer> {




    Preference findByUserId(String id);

    Preference findByEmployeeId(String uuid);
}
