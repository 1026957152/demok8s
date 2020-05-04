package com.coalvalue.employee.repository;

import com.coalvalue.employee.domain.entity.UserSetting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface UserSettingRepository extends JpaRepository<UserSetting, Integer> {


}
