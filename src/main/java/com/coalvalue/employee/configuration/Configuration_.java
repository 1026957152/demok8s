/*
 * Copyright (c) 2005-2011 Grameen Foundation USA
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * See also http://www.apache.org/licenses/LICENSE-2.0.html for an
 * explanation of the license and how it is applied.
 */

package com.coalvalue.employee.configuration;

import com.coalvalue.employee.repository.ConfigurationRepository;

//import org.mifos.config.cache.CacheRepository;
//import org.mifos.config.util.helpers.ConfigurationInitializer;

/**
 * This class is a remnant of per-office configuration, which <a
 * href="http://article.gmane.org/gmane.comp.finance.mifos.devel/3498">is
 * deprecated and may be removed</a> (-Adam 22-JAN-2008).
 */
public class Configuration_ {
    /**
     * It is the map of instances of OfficeConfig stored based on officeid. It
     * is cache of OfficeConfig instances
     */
 /*   private Map<Short, OfficeConfig> officeConfigMap;

    private SystemConfiguration systemConfig;

    private static CacheRepository cacheRepo;
*/
    private static Configuration_ config;
    private static boolean needToVerifyShipmentByVerifyCodeToEnterYard = true;

    private static Integer expires = 30;
    private static Integer customerMessageExpireHour = 48;
    private static Integer wxCapacityApplicationListNumber = 5;
    private static int storageSpaceAllowMaxCount = 100;
   // private static int capacitySupplyExpires = 300; //六个小时

    private static int capacitySupplyExpires = 3; //六个小时

    private static long wxFollowCompanyListNumber = 3;
    private static String transportBillOfLadingValidTime = "两小时";

    private static boolean createCapacitySendToFollower = true; // 发给关注着

    private static boolean createCapacitySendTCcanvasser = true;
    private static Integer wxFollowRouteListNumber = 4;
    private static String customerServerPhone = "13468801683";
    private static Integer wxResponseMessageTimeDelay =100;
    private static boolean companyScanDisplayPrice = true;
    private static Boolean companyScanDisplayContactNumber = true;
    private static Boolean companyScanDisplayStorageRealTimeInfomation =true;
    private static boolean topic_District_ScanDisplay_CompanyLinkInfomation = false;
    private static boolean topic_District_ScanDisplay_Service_HotlineInfomation =false;
    private static String chatServerHost;
    private static Boolean companyScanDisplayInventory = true;
    private static Boolean companyPriceChangeDisplayAgentContactInfo = true;
    private static Boolean addInventoryNotifyStorageDisplay = true;
    private static Integer scanQrcodeActiveAccountExpireMinutes = 100;
    private static Integer recentChangeEventMaxLimitCount = 2;
    private static Boolean report_message_display_inventory;

    public static Integer getExpires() {
        return expires;
    }

    public static void setExpires(Integer expires) {
        Configuration_.expires = expires;
    }

    private static ConfigurationRepository configurationRepository;

    public synchronized static Configuration_ getInstance() {
        if (config == null) {
            config = new Configuration_();
            config.initialize();
        }
        return config;
    }

    public static boolean getNeedToVerifyShipmentByVerifyCodeToEnterYard() {
        return needToVerifyShipmentByVerifyCodeToEnterYard;
    }

    public static boolean isNeedToVerifyShipmentByVerifyCodeToEnterYard() {
        return needToVerifyShipmentByVerifyCodeToEnterYard;
    }

    public static void setNeedToVerifyShipmentByVerifyCodeToEnterYard(boolean needToVerifyShipmentByVerifyCodeToEnterYard) {
        Configuration_.needToVerifyShipmentByVerifyCodeToEnterYard = needToVerifyShipmentByVerifyCodeToEnterYard;
    }

    public static void setConfigurationRepository(ConfigurationRepository configurationRepository) {
        Configuration_.configurationRepository = configurationRepository;
    }

    public static ConfigurationRepository getConfigurationRepository() {
        return configurationRepository;
    }

    public static Integer getCustomerMessageExpireHour() {
        return customerMessageExpireHour;
    }

    public static void setCustomerMessageExpireHour(Integer customerMessageExpireHour) {
        Configuration_.customerMessageExpireHour = customerMessageExpireHour;
    }

    public static Integer getWxCapacityApplicationListNumber() {
        return wxCapacityApplicationListNumber;
    }

    public static void setWxCapacityApplicationListNumber(Integer wxCapacityApplicationListNumber) {
        Configuration_.wxCapacityApplicationListNumber = wxCapacityApplicationListNumber;
    }

    public static int getStorageSpaceAllowMaxCount() {
        return storageSpaceAllowMaxCount;
    }

    public static void setStorageSpaceAllowMaxCount(int storageSpaceAllowMaxCount) {
        Configuration_.storageSpaceAllowMaxCount = storageSpaceAllowMaxCount;
    }

    public static int getCapacitySupplyExpires() {
        return capacitySupplyExpires;
    }

    public static void setCapacitySupplyExpires(int capacitySupplyExpires) {
        Configuration_.capacitySupplyExpires = capacitySupplyExpires;
    }

    public static long getWxFollowCompanyListNumber() {
        return wxFollowCompanyListNumber;
    }

    public static void setWxFollowCompanyListNumber(long wxFollowCompanyListNumber) {
        Configuration_.wxFollowCompanyListNumber = wxFollowCompanyListNumber;
    }

    public static String getTransportBillOfLadingValidTime() {
        return transportBillOfLadingValidTime;
    }

    public static void setTransportBillOfLadingValidTime(String transportBillOfLadingValidTime) {
        Configuration_.transportBillOfLadingValidTime = transportBillOfLadingValidTime;
    }

    public static boolean getCreateCapacitySendToFollower() {
        return createCapacitySendToFollower;
    }

    public static boolean isCreateCapacitySendToFollower() {
        return createCapacitySendToFollower;
    }

    public static void setCreateCapacitySendToFollower(boolean createCapacitySendToFollower) {
        Configuration_.createCapacitySendToFollower = createCapacitySendToFollower;
    }

    public static boolean getCreateCapacitySendTCcanvasser() {
        return createCapacitySendTCcanvasser;
    }

    public static boolean isCreateCapacitySendTCcanvasser() {
        return createCapacitySendTCcanvasser;
    }

    public static void setCreateCapacitySendTCcanvasser(boolean createCapacitySendTCcanvasser) {
        Configuration_.createCapacitySendTCcanvasser = createCapacitySendTCcanvasser;
    }

    public static Integer getWxFollowRouteListNumber() {
        return wxFollowRouteListNumber;
    }

    public static void setWxFollowRouteListNumber(Integer wxFollowRouteListNumber) {
        Configuration_.wxFollowRouteListNumber = wxFollowRouteListNumber;
    }

    public static Integer getWxResponseMessageTimeDelay() {
        return wxResponseMessageTimeDelay;
    }

    public static void setWxResponseMessageTimeDelay(Integer wxResponseMessageTimeDelay) {
        Configuration_.wxResponseMessageTimeDelay = wxResponseMessageTimeDelay;
    }

    public static boolean isCompanyScanDisplayPrice() {
        return companyScanDisplayPrice;
    }

    public static void setCompanyScanDisplayPrice(boolean companyScanDisplayPrice) {
        Configuration_.companyScanDisplayPrice = companyScanDisplayPrice;
    }

    public static void setCompanyScanDisplayContactNumber(Boolean companyScanDisplayContactNumber) {
        Configuration_.companyScanDisplayContactNumber = companyScanDisplayContactNumber;
    }

    public static Boolean getCompanyScanDisplayContactNumber() {
        return companyScanDisplayContactNumber;
    }

    public static boolean getCompanyScanDisplayStorageRealTimeInfomation() {
        return companyScanDisplayStorageRealTimeInfomation;
    }

    public static boolean isCompanyScanDisplayStorageRealTimeInfomation() {
        return companyScanDisplayStorageRealTimeInfomation;
    }

    public static void setCompanyScanDisplayStorageRealTimeInfomation(boolean companyScanDisplayStorageRealTimeInfomation) {
        Configuration_.companyScanDisplayStorageRealTimeInfomation = companyScanDisplayStorageRealTimeInfomation;
    }

    public static boolean getTopic_District_ScanDisplay_CompanyLinkInfomation() {
        return topic_District_ScanDisplay_CompanyLinkInfomation;
    }

    public static boolean isTopic_District_ScanDisplay_CompanyLinkInfomation() {
        return topic_District_ScanDisplay_CompanyLinkInfomation;
    }

    public static void setTopic_District_ScanDisplay_CompanyLinkInfomation(boolean topic_District_ScanDisplay_CompanyLinkInfomation) {
        Configuration_.topic_District_ScanDisplay_CompanyLinkInfomation = topic_District_ScanDisplay_CompanyLinkInfomation;
    }

    public static boolean getTopic_District_ScanDisplay_Service_HotlineInfomation() {
        return topic_District_ScanDisplay_Service_HotlineInfomation;
    }

    public static boolean isTopic_District_ScanDisplay_Service_HotlineInfomation() {
        return topic_District_ScanDisplay_Service_HotlineInfomation;
    }

    public static void setTopic_District_ScanDisplay_Service_HotlineInfomation(boolean topic_District_ScanDisplay_Service_HotlineInfomation) {
        Configuration_.topic_District_ScanDisplay_Service_HotlineInfomation = topic_District_ScanDisplay_Service_HotlineInfomation;
    }

    public static String getChatServerHost() {
        return chatServerHost;
    }

    public static void setChatServerHost(String chatServerHost) {
        Configuration_.chatServerHost = chatServerHost;
    }

    public static Boolean isCompanyScanDisplayInventory() {
        return companyScanDisplayInventory;
    }

    public static Boolean getCompanyScanDisplayInventory() {
        return companyScanDisplayInventory;
    }

    public static void setCompanyScanDisplayInventory(Boolean companyScanDisplayInventory) {
        Configuration_.companyScanDisplayInventory = companyScanDisplayInventory;
    }

    public static Boolean getCompanyPriceChangeDisplayAgentContactInfo() {
        return companyPriceChangeDisplayAgentContactInfo;
    }

    public static void setCompanyPriceChangeDisplayAgentContactInfo(Boolean companyPriceChangeDisplayAgentContactInfo) {
        Configuration_.companyPriceChangeDisplayAgentContactInfo = companyPriceChangeDisplayAgentContactInfo;
    }

    public static Boolean isAddInventoryNotifyStorageDisplay() {
        return addInventoryNotifyStorageDisplay;
    }

    public static Boolean getAddInventoryNotifyStorageDisplay() {
        return addInventoryNotifyStorageDisplay;
    }

    public static void setAddInventoryNotifyStorageDisplay(Boolean addInventoryNotifyStorageDisplay) {
        Configuration_.addInventoryNotifyStorageDisplay = addInventoryNotifyStorageDisplay;
    }

    public static Integer getScanQrcodeActiveAccountExpireMinutes() {
        return scanQrcodeActiveAccountExpireMinutes;
    }

    public static void setScanQrcodeActiveAccountExpireMinutes(Integer scanQrcodeActiveAccountExpireMinutes) {
        Configuration_.scanQrcodeActiveAccountExpireMinutes = scanQrcodeActiveAccountExpireMinutes;
    }

    public static Integer getRecentChangeEventMaxLimitCount() {
        return recentChangeEventMaxLimitCount;
    }

    public static void setRecentChangeEventMaxLimitCount(Integer recentChangeEventMaxLimitCount) {
        Configuration_.recentChangeEventMaxLimitCount = recentChangeEventMaxLimitCount;
    }

    public static void setReport_message_display_inventory(Boolean report_message_display_inventory) {
        Configuration_.report_message_display_inventory = report_message_display_inventory;
    }

    public static Boolean getReport_message_display_inventory() {
        return report_message_display_inventory;
    }

    private void initialize() {
/*        synchronized (cacheRepo) {
            new ConfigurationInitializer().initialize();
            initializeSystemConfiguration();
        }*/
    }

    // TODO:Currently offset is being passed for TimeZone. It should be changed
    // to Timezone value picked from database
/*
    private void initializeSystemConfiguration() {
        systemConfig = cacheRepo.getSystemConfiguration();
    }
*/

    private Configuration_() {
      /*  cacheRepo = CacheRepository.getInstance();
        officeConfigMap = new Hashtable<Short, OfficeConfig>();*/
    }

 /*   *//**
     * This method will return instance of OfficeConfig based on officeId. If
     * OfficeConfig instance is available in cache it will return the same,
     * otherwise it will create and retuen a new instance and store that into
     * cache also.
     *//*
    public OfficeConfig getOfficeConfig(Short officeId) {
        if (officeConfigMap.containsKey(officeId)) {
            return officeConfigMap.get(officeId);
        }
        OfficeConfig officeConfig = new OfficeConfig(cacheRepo, officeId);
        officeConfigMap.put(officeId, officeConfig);
        return officeConfig;
    }

    public SystemConfiguration getSystemConfig() {
        return systemConfig;
    }

    public AccountConfig getAccountConfig(Short officeId) {
        return getOfficeConfig(officeId).getAccountConfig();
    }
*/
    /**
     * For injecting mock configuration instance
     * @param config
     */
    public static void setConfig(Configuration_ config) {
        Configuration_.config = config;
    }

    public static String getCustomerServerPhone() {
        return customerServerPhone;
    }


}
