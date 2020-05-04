package com.coalvalue.employee.repository;

import com.coalvalue.employee.domain.entity.UserSetting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface SettingRepository extends JpaRepository<UserSetting, Integer> {


}
