package com.coalvalue.employee.service;

import com.coalvalue.employee.domain.OperationResult;
import com.coalvalue.employee.domain.entity.Company;
import com.coalvalue.employee.domain.entity.Configuration;
import com.coalvalue.employee.domain.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by silence yuan on 2015/7/25.
 */
public interface ConfigurationService extends BaseService {



    OperationResult refresh_database();

    Page<Configuration> getConfigurations(Pageable pageable, User user);

    Page<Configuration> getConfigurationsUser(Pageable pageable, User user);

    Configuration getConfiguration(String companyScanDisplayPrice, Company company);

    @Transactional
    Configuration getConfiguration(String companyScanDisplayPrice, User user);

    OperationResult change(Integer id, Boolean booleanValue);

    Configuration getConfiguration(String companyScanDisplayInventory);


    Page<Configuration> getGlobleConfigurations(PageRequest pageRequest);

    Configuration getById(Integer id);

    OperationResult change(Configuration configuration, String value);

    Boolean getConfiguration(String report_message_display_inventory, Integer companyId);



    OperationResult setConfiguration(String report_message_display_inventory, Class type, Object value);

    Configuration getConfiguration(String companyScanDisplayPrice, User user, Object defaultValue);

    OperationResult setConfiguration(String text, User user, Object id);
}
