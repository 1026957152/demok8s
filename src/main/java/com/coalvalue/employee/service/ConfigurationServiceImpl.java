package com.coalvalue.employee.service;

import com.coalvalue.employee.configuration.Configuration_;
import com.coalvalue.employee.domain.OperationResult;
import com.coalvalue.employee.domain.entity.Company;
import com.coalvalue.employee.domain.entity.Configuration;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.repository.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by silence yuan on 2015/7/25.
 */

@Service("configurationService")
public class ConfigurationServiceImpl extends BaseServiceImpl implements ConfigurationService {

    public static String region_product_detail_invetnory_hour = "region_product_detail_invetnory_hour";

    public static final String mobile_company_zone_product_display_inventory = "mobile_company_zone_product_display_inventory";
    public static String text_condition_server_ip_address = "text_condition_server_ip_address";
    public static String path_qrcode_image_resoure_path = "path_qrcode_image_resoure_path";
    public static String region_product_detail_price_hour = "region_product_detail_price_hour";
    public static String path_resoure_path = "resoure_path";

    @Autowired
    private ConfigurationRepository configurationRepository;

    public static final String CapacitySupplyExpires = "CapacitySupplyExpires";
    public static final String CreateCapacitySendTCcanvasser = "CreateCapacitySendTCcanvasser";

    public static final String CompanyScanDisplayPrice = "CompanyScanDisplayPrice";
    public static final String CustomerMessageExpireHour = "CustomerMessageExpireHour";

    public static final String CompanyScanDisplayContactNumber = "CompanyScanDisplayContactNumber";

    public static final String CompanyScanDisplayStorageRealTimeInfomation = "CompanyScanDisplayStorageRealTimeInfomation";
    public static final String topic_District_ScanDisplay_Service_HotlineInfomation = "topic_District_ScanDisplay_Service_HotlineInfomation";

    public static final String chatServerHost = "chatServerHost";


    public static final String CompanyScanDisplayInventory = "CompanyScanDisplayInventory";


    public static final String CompanyPriceChangeDisplayAgentContactInfo = "CompanyPriceChangeDisplayAgentContactInfo";

    public static final String AddInventoryNotifyStorageDisplay = "AddInventoryNotifyStorageDisplay";

    public static final Integer DISTRICT_HENGSHAN_ID = 4;

    public static final String recentChangeEventMaxLimitCount = "recentChangeEventMaxLimitCount";

    public static final String GLOBAL_SINGLE_sheduler_time = "GLOBAL_SINGLE_sheduler_time";

    public static final String report_message_display_inventory = "report_message_display_inventory";
    public static final String report_message_send_to_all = "report_message_send_to_all";
    public static String report_message_display_queuing = "report_message_display_queuing";

    public static final String report_message_display_quality_indicator = "report_message_display_quality_indicator";
    public static String report_message_display_contact  = "report_message_display_contact";
    public static final String report_message_display_tail_information = "report_message_display_tail_information";
    public static String report_message_display_seq_custom_message_contact = "report_message_display_seq_custom_message_contact";


    public static String product_scan_display_inventory = "product_scan_display_inventory";
    public static String product_scan_display_inventory_queuing = "product_scan_display_inventory_queuing";

    public static String transport_scan_display_inventory_queuing = "transport_scan_display_inventory_queuing";
    public static String transport_scan_display_inventory = "transport_scan_display_inventory";


    public static String report_message_capacity_display_seq_custom_message_contact = "report_message_capacity_display_seq_custom_message_contact";

    public static String Company_Scan_Display_ReportQuality = "Company_Scan_Display_ReportQuality";
    public static String Company_Scan_Display_ContactNumber = "Company_Scan_Display_ContactNumber";


    public static String company_scan_send_voice_message = "company_scan_send_voice_message";


    public static String homepage_day_period_price_trend_by_product_by_district_granularity = "homepage_day_period_price_trend_by_product_by_district_granularity";


    public static final String mobile_company_zone_company_user_display ="mobile_company_zone_company_user_display";

    @PostConstruct
    public void initIt() throws Exception {
        refresh_database();
        System.out.println(" 初始化配置信息");
    }

    @Override
    public OperationResult refresh_database() {
        OperationResult operationResult = new OperationResult();
        List<Configuration> configurations = configurationRepository.findByCompanyIdIsNullAndUserIdIsNull();

        for(Configuration configuration : configurations){



            if(configuration.getKey().equals(CapacitySupplyExpires)){
                Configuration_.setCapacitySupplyExpires(configuration.getIntValue());

            }
            if(configuration.getKey().equals(CompanyScanDisplayPrice)){
                Configuration_.setCompanyScanDisplayPrice(configuration.getBooleanValue());

            }
            if(configuration.getKey().equals(CreateCapacitySendTCcanvasser)){
                Configuration_.setCreateCapacitySendTCcanvasser(configuration.getBooleanValue());

            }
            if(configuration.getKey().equals(CustomerMessageExpireHour)){
                Configuration_.setCustomerMessageExpireHour(configuration.getIntValue());

            }

            if(configuration.getKey().equals(CompanyScanDisplayContactNumber)){
                Configuration_.setCompanyScanDisplayContactNumber(configuration.getBooleanValue());

            }
            if(configuration.getKey().equals(CompanyScanDisplayStorageRealTimeInfomation)){
                Configuration_.setCompanyScanDisplayStorageRealTimeInfomation(configuration.getBooleanValue());

            }
            if(configuration.getKey().equals(topic_District_ScanDisplay_Service_HotlineInfomation)){
                Configuration_.setTopic_District_ScanDisplay_Service_HotlineInfomation(configuration.getBooleanValue());

            }
            if(configuration.getKey().equals(chatServerHost)){
                Configuration_.setChatServerHost(configuration.getStringValue());

            }

            if(configuration.getKey().equals(CompanyScanDisplayInventory)){
                Configuration_.setCompanyScanDisplayInventory(configuration.getBooleanValue());

            }
            if(configuration.getKey().equals(CompanyPriceChangeDisplayAgentContactInfo)){
                Configuration_.setCompanyPriceChangeDisplayAgentContactInfo(configuration.getBooleanValue());

            }
            if(configuration.getKey().equals(recentChangeEventMaxLimitCount)){
                Configuration_.setRecentChangeEventMaxLimitCount(configuration.getIntValue());

            }


            if(configuration.getKey().equals(report_message_display_inventory)){
                Configuration_.setReport_message_display_inventory(configuration.getBooleanValue());

            }



        }

        operationResult.setSuccess(true);


        return operationResult;
    }

    @Override
    public Page<Configuration> getConfigurations(Pageable pageable, User user) {
        return configurationRepository.findByCompanyId(user.getCompanyId(),pageable);
    }
    @Override
    public Page<Configuration> getConfigurationsUser(Pageable pageable, User user) {
        return configurationRepository.findByUserId(user.getId(),pageable);
    }
    @Override
    @Transactional
    public Configuration getConfiguration(String companyScanDisplayPrice, Company company) {
        Configuration configuration = configurationRepository.findByCompanyIdAndKey(company.getId(),companyScanDisplayPrice);
        if(configuration == null){
            configuration = new Configuration();
            configuration.setCompanyId(company.getId());
            configuration.setKey(companyScanDisplayPrice);
            if(companyScanDisplayPrice.equals(CompanyScanDisplayInventory)){
                configuration.setBooleanValue(false);
            }
            if(companyScanDisplayPrice.equals(CompanyScanDisplayPrice)){
                configuration.setBooleanValue(false);
            }

            if(companyScanDisplayPrice.equals(CompanyPriceChangeDisplayAgentContactInfo)){
                configuration.setBooleanValue(true);
            }
            if(companyScanDisplayPrice.equals(AddInventoryNotifyStorageDisplay)){
                configuration.setBooleanValue(false);
            }


            configuration = configurationRepository.save(configuration);
        }


        if(companyScanDisplayPrice.equals(CompanyScanDisplayInventory)){
            configuration.setBooleanValue(true);
        }
        if(companyScanDisplayPrice.equals(CompanyScanDisplayPrice)){
            configuration.setBooleanValue(true);
        }

        return configuration;
    }
    @Override
    @Transactional
    public Configuration getConfiguration(String companyScanDisplayPrice, User user) {
        Configuration configuration = configurationRepository.findByUserIdAndKey(user.getId(), companyScanDisplayPrice);
        if(configuration == null){
            configuration = new Configuration();
            configuration.setUserId(user.getId());
            configuration.setKey(companyScanDisplayPrice);
            if(companyScanDisplayPrice.equals(CompanyScanDisplayInventory)){
                configuration.setBooleanValue(false);
            }
            if(companyScanDisplayPrice.equals(CompanyScanDisplayPrice)){
                configuration.setBooleanValue(false);
            }

            if(companyScanDisplayPrice.equals(CompanyPriceChangeDisplayAgentContactInfo)){
                configuration.setBooleanValue(true);
            }
            if(companyScanDisplayPrice.equals(AddInventoryNotifyStorageDisplay)){
                configuration.setBooleanValue(false);
            }


            configuration = configurationRepository.save(configuration);
        }


        if(companyScanDisplayPrice.equals(CompanyScanDisplayInventory)){
            configuration.setBooleanValue(true);
        }
        if(companyScanDisplayPrice.equals(CompanyScanDisplayPrice)){
            configuration.setBooleanValue(true);
        }

        return configuration;
    }
    @Override
    @Transactional
    public OperationResult change(Integer id, Boolean booleanValue) {


        Configuration configuration = configurationRepository.findById(id).get();

        configuration.setBooleanValue(booleanValue);

        configurationRepository.save(configuration);

        OperationResult operationResult = new OperationResult();
        operationResult.setSuccess(true);
        operationResult.setResultObject(configuration);
        return operationResult;
    }

/*
    @Override
    @Transactional
    public Configuration getConfiguration(String companyScanDisplayInventory) {

        Configuration configuration = configurationRepository.findByKey(companyScanDisplayInventory);
        if(configuration == null){
            configuration = new Configuration();
            configuration.setKey(companyScanDisplayInventory);


            if(companyScanDisplayInventory.equals(path_qrcode_image_resoure_path)){
                configuration.setStringValue("E:/resource");
            }

            if(companyScanDisplayInventory.equals(GLOBAL_SINGLE_sheduler_time)){
                configuration.setIntValue(20000);
            }
            if(companyScanDisplayInventory.equals(recentChangeEventMaxLimitCount)){
                configuration.setIntValue(2);
            }

            if(companyScanDisplayInventory.equals(report_message_display_inventory)){
                configuration.setBooleanValue(false);
            }

            if(companyScanDisplayInventory.equals(report_message_send_to_all)){
                configuration.setBooleanValue(false);
            }

            if(companyScanDisplayInventory.equals(report_message_display_queuing)){
                configuration.setBooleanValue(false);
            }
            if(companyScanDisplayInventory.equals(report_message_display_contact)){
                configuration.setBooleanValue(false);
            }

            if(companyScanDisplayInventory.equals(report_message_display_tail_information)){
                configuration.setBooleanValue(false);
            }
            if(companyScanDisplayInventory.equals(report_message_display_seq_custom_message_contact)){
                configuration.setBooleanValue(false);
            }
            if(companyScanDisplayInventory.equals(report_message_capacity_display_seq_custom_message_contact)){
                configuration.setBooleanValue(false);
            }
            if(companyScanDisplayInventory.equals(CompanyScanDisplayContactNumber)){
                configuration.setBooleanValue(false);
            }


            if(companyScanDisplayInventory.equals(homepage_day_period_price_trend_by_product_by_district_granularity)){
                configuration.setIntValue(80);
            }


            if(companyScanDisplayInventory.equals("ffmpeg_path")){
                configuration.setStringValue("E:/");
            }


            configuration = configurationRepository.save(configuration);
        }
        return configuration;
    }
*/

    @Override
    public Page<Configuration> getGlobleConfigurations(PageRequest pageRequest) {
        return configurationRepository.findByCompanyIdIsNullAndUserIdIsNull(pageRequest);
    }

    @Override
    public Configuration getById(Integer id) {
        return configurationRepository.findById(id).get();
    }

    @Override
    @Transactional
    public OperationResult change(Configuration configuration, String value) {

        if(configuration.getIntValue()!= null){
            configuration.setIntValue(Integer.valueOf(value));
        }
        if(configuration.getBooleanValue()!= null){
            configuration.setBooleanValue(Boolean.valueOf(value));
        }
        if(configuration.getStringValue()!= null){
            configuration.setStringValue(value);
        }


        configurationRepository.save(configuration);

        OperationResult operationResult = new OperationResult();
        operationResult.setSuccess(true);
        operationResult.setResultObject(configuration);
        return operationResult;
    }

    @Override
    public Boolean getConfiguration(String key, Integer companyId) {

        Configuration configurationCompany = configurationRepository.findByCompanyIdAndKey(companyId, key);
        Configuration configuration = configurationRepository.findByKeyAndCompanyIdIsNull(key);
        if(configuration == null){
            configuration = new Configuration();
            configuration.setKey(key);
            if(key.equals(GLOBAL_SINGLE_sheduler_time)){
                configuration.setIntValue(20000);
            }
            if(key.equals(recentChangeEventMaxLimitCount)){
                configuration.setIntValue(2);
            }

            if(key.equals(report_message_display_inventory)){
                configuration.setBooleanValue(false);
            }

            if(key.equals(report_message_send_to_all)){
                configuration.setBooleanValue(false);
            }

            if(key.equals(report_message_display_queuing)){
                configuration.setBooleanValue(false);
            }
            if(key.equals(report_message_display_quality_indicator)){
                configuration.setBooleanValue(false);
            }
            if(key.equals(product_scan_display_inventory)){
                configuration.setBooleanValue(false);
            }

            if(key.equals(product_scan_display_inventory_queuing)){
                configuration.setBooleanValue(false);
            }

            if(key.equals(transport_scan_display_inventory_queuing)){
                configuration.setBooleanValue(false);
            }
            if(key.equals(transport_scan_display_inventory)){
                configuration.setBooleanValue(false);
            }
            if(key.equals(CompanyScanDisplayContactNumber)){
                configuration.setBooleanValue(false);
            }
            if(key.equals(CompanyScanDisplayStorageRealTimeInfomation)){
                configuration.setBooleanValue(false);
            }

            if(key.equals(Company_Scan_Display_ReportQuality)){
                configuration.setBooleanValue(false);
            }
            if(key.equals(Company_Scan_Display_ContactNumber)){
                configuration.setBooleanValue(false);
            }

            if(key.equals(company_scan_send_voice_message)){
                configuration.setBooleanValue(false);
            }
            if(key.equals(mobile_company_zone_company_user_display)){
                configuration.setBooleanValue(false);
            }

            configuration = configurationRepository.save(configuration);
        }


        if(configurationCompany == null){
            configurationCompany = new Configuration();
            configurationCompany.setKey(key);
            configurationCompany.setCompanyId(companyId);

            if(key.equals(GLOBAL_SINGLE_sheduler_time)){
                configurationCompany.setIntValue(20000);
            }
            if(key.equals(recentChangeEventMaxLimitCount)){
                configurationCompany.setIntValue(2);
            }

            if(key.equals(report_message_display_inventory)){
                configurationCompany.setBooleanValue(false);
            }

            if(key.equals(report_message_send_to_all)){
                configurationCompany.setBooleanValue(false);
            }
            if(key.equals(report_message_display_quality_indicator)){
                configurationCompany.setBooleanValue(false);
            }
            if(key.equals(report_message_display_queuing)){
                configurationCompany.setBooleanValue(false);
            }

            if(key.equals(product_scan_display_inventory)){
                configurationCompany.setBooleanValue(false);
            }
            if(key.equals(product_scan_display_inventory_queuing)){
                configurationCompany.setBooleanValue(false);
            }

            if(key.equals(transport_scan_display_inventory_queuing)){
                configurationCompany.setBooleanValue(false);
            }

            if(key.equals(transport_scan_display_inventory)){
                configurationCompany.setBooleanValue(false);
            }
            if(key.equals(CompanyScanDisplayContactNumber)){
                configurationCompany.setBooleanValue(false);
            }
            if(key.equals(CompanyScanDisplayStorageRealTimeInfomation)){
                configurationCompany.setBooleanValue(false);
            }
            if(key.equals(Company_Scan_Display_ReportQuality)){
                configurationCompany.setBooleanValue(false);
            }
            if(key.equals(Company_Scan_Display_ContactNumber)){
                configurationCompany.setBooleanValue(false);
            }

            if(key.equals(company_scan_send_voice_message)){
                configurationCompany.setBooleanValue(false);
            }
            configurationCompany = configurationRepository.save(configurationCompany);
        }
        if(configuration.getBooleanValue() != null && configurationCompany.getBooleanValue() != null){
            return configuration.getBooleanValue() && configurationCompany.getBooleanValue();
        }
        else {
            return false;
        }

    }

    @Override
    @Transactional
    public OperationResult setConfiguration(String key, Class type,Object value) {

        OperationResult operationResult = new OperationResult();
        Configuration configuration = configurationRepository.findByKeyAndCompanyIdIsNull(key);
        if(configuration == null) {
            configuration = new Configuration();
            configuration.setKey(key);


            if (key.equals(text_condition_server_ip_address)) {

                configuration.setStringValue((String) value);
            }
        }

        configuration = configurationRepository.save(configuration);

        operationResult.setResultObject(configuration);
        operationResult.setSuccess(true);
        return operationResult;
    }

    @Override
    @Transactional
    public Configuration getConfiguration(String companyScanDisplayPrice, User user, Object defaultValue) {
        Configuration configuration = configurationRepository.findByUserIdAndKey(user.getId(), companyScanDisplayPrice);
        if(configuration == null){
            configuration = new Configuration();
            configuration.setUserId(user.getId());
            configuration.setKey(companyScanDisplayPrice);
            if(defaultValue instanceof Integer){
                configuration.setIntValue((Integer) defaultValue);
            }
            if(defaultValue instanceof String){
                configuration.setStringValue((String) defaultValue);
            }

            if(defaultValue instanceof Boolean){
                configuration.setBooleanValue((Boolean) defaultValue);
            }


            configuration = configurationRepository.save(configuration);
        }



        logger.debug("configuration is :{}", configuration.toString());
        return configuration;
    }

    @Override
    @Transactional
    public OperationResult setConfiguration(String text, User user, Object defaultValue) {
        Configuration configuration = getConfiguration(text,user,defaultValue);

        if(configuration!= null){
            if(defaultValue instanceof Integer){
                configuration.setIntValue((Integer) defaultValue);
            }
            if(defaultValue instanceof String){
                configuration.setStringValue((String) defaultValue);
            }

            if(defaultValue instanceof Boolean){
                configuration.setBooleanValue((Boolean) defaultValue);
            }


            configuration = configurationRepository.save(configuration);
        }

        OperationResult operationResult = new OperationResult();
        operationResult.setSuccess(true);
        return operationResult;
    }



    @Override
    @Transactional
    public Configuration getConfiguration(String companyScanDisplayInventory) {



        Configuration configuration = configurationRepository.findByKey(companyScanDisplayInventory);
        if(configuration == null){
            configuration = new Configuration();
            configuration.setKey(companyScanDisplayInventory);

            if(companyScanDisplayInventory.equals(path_resoure_path)){
                configuration.setStringValue("file:E:/resource/");
            }
            if(companyScanDisplayInventory.equals(GLOBAL_SINGLE_sheduler_time)){
                configuration.setIntValue(20000);
            }
            if(companyScanDisplayInventory.equals(recentChangeEventMaxLimitCount)){
                configuration.setIntValue(2);
            }

            if(companyScanDisplayInventory.equals(report_message_display_inventory)){
                configuration.setBooleanValue(false);
            }

            if(companyScanDisplayInventory.equals(report_message_send_to_all)){
                configuration.setBooleanValue(false);
            }

            if(companyScanDisplayInventory.equals(report_message_display_queuing)){
                configuration.setBooleanValue(false);
            }
            if(companyScanDisplayInventory.equals(report_message_display_contact)){
                configuration.setBooleanValue(false);
            }

            if(companyScanDisplayInventory.equals(report_message_display_tail_information)){
                configuration.setBooleanValue(false);
            }
            if(companyScanDisplayInventory.equals(report_message_display_seq_custom_message_contact)){
                configuration.setBooleanValue(false);
            }
            if(companyScanDisplayInventory.equals(report_message_capacity_display_seq_custom_message_contact)){
                configuration.setBooleanValue(false);
            }
            if(companyScanDisplayInventory.equals(CompanyScanDisplayContactNumber)){
                configuration.setBooleanValue(false);
            }


            if(companyScanDisplayInventory.equals(homepage_day_period_price_trend_by_product_by_district_granularity)){
                configuration.setIntValue(80);
            }


            if(companyScanDisplayInventory.equals("ffmpeg_path")){
                configuration.setStringValue("E:/");
            }
            if(companyScanDisplayInventory.equals("region_product_detail_invetnory_hour")){
                configuration.setIntValue(72);
            }
            if(companyScanDisplayInventory.equals("region_product_detail_price_hour")){
                configuration.setIntValue(72);
            }
            configuration = configurationRepository.save(configuration);
        }
        return configuration;
    }

}
