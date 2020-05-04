package com.coalvalue.employee.service;

import com.coalvalue.employee.configuration.CommonConstant;
import com.coalvalue.employee.domain.OperationResult;
import com.coalvalue.employee.domain.entity.*;
import com.coalvalue.employee.enumType.UserTypeEnum;
import com.coalvalue.employee.repository.CompanyRepository;
import com.coalvalue.employee.repository.PersonRepository;
import com.coalvalue.employee.repository.UserRepository;
import com.coalvalue.employee.repository.UserSettingRepository;
import com.coalvalue.employee.util.FileUtil;
import com.coalvalue.employee.util.GenerateShortUUID;
import com.coalvalue.employee.util.StringUtil;
import com.coalvalue.employee.web.validation.CompanyPerfectForm;
import com.coalvalue.employee.web.validation.CompanyUserCreateForm;
import com.coalvalue.employee.web.validation.UserCreateForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.persistence.criteria.Predicate;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by Peter Xu on 01/10/2015.
 */
@Service("accountService")
//@Transactional(readOnly = true)
public class AccountServiceImpl extends BaseServiceImpl implements AccountService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CompanyRepository companyRepository;


    @Autowired
    private RoleService roleService;




    @Autowired
    private UserService userService;



    @Autowired
    private UserSettingRepository userSettingRepository;



    @Override
    public Person queryPersonById(Integer personId) { return personRepository.findById(personId).get(); }

    @Override
    public Person queryPersonByRealName(String realName) { return personRepository.queryPersonByRealName(realName);}




    @Override
    public Boolean verifyOriginalPwd(Integer userId, String pwd) {
        User user = userRepository.findById(userId).get();
        return user.getPassword().equals(pwd);
    }

    @Override
    @Transactional
    public User resetUserPwd(Integer userId, String pwd) {
        User user = userRepository.findById(userId).get();
        //user.setPassword(MD5Util.getMD5StringWithSalt(pwd,user.getUserName()));
        user.setPassword(pwd);
        return userRepository.save(user);
    }


    @Override
    public Company queryCompanyByCompanyName(String companyName){
        return companyRepository.findByName(companyName);
    }

    @Override
    public Company queryCompanyById(Integer companyId){ return companyRepository.findById(companyId).get(); }

    @Override
    @Transactional
    public Company createCompany(com.coalvalue.employee.domain.entity.Company company,
                                 MultipartFile logoImage,
                                 MultipartFile backgroundFile) {


        if (logoImage != null ) {
            InputStream inputStream = null;
            BufferedImage imBuff = null;

            try {
                inputStream = logoImage.getInputStream();
                imBuff = ImageIO.read(inputStream);

            } catch (IOException e) {
                logger.debug("convert file to InputStream error");
            }

            String logoPath = FileUtil.saveThumbImage(FileUtil.LOGO_IMAGE_DIR, imBuff, 160, 160);
            // BufferedImage bi= Thumbnails.of(imBuff).size(120,120).asBufferedImage();
            //   ImageIO.write(bi,"jpg",toPic);
            //   String logoPath = FileUtil.saveFile(FileUtil.LOGO_IMAGE_DIR, logoImage);


            company.setLogoImage(logoPath);


            String smallInamePath = FileUtil.saveThumbImage(FileUtil.LOGO_IMAGE_DIR, imBuff, 120, 120);
            company.setSmallImage(smallInamePath);

            String thumbnailInmage = FileUtil.saveThumbImage(FileUtil.LOGO_IMAGE_DIR, imBuff, 80, 102);
            company.setThumbnailImage(thumbnailInmage);

        }
        if(backgroundFile != null) {
            String filePath = FileUtil.saveFile(FileUtil.COMPANY_FILE_DIR, backgroundFile);
            company.setBackgroundFile(filePath);


        }
        return companyRepository.save(company);
    }

    @Override
    public Page<Person> queryCompanyUsers(Integer companyId, Pageable pageable) {

        Page<Person> page = personRepository.findByCompanyId(companyId, pageable);


        return page;
    }







    @Override
    public List<Person> queryCompanyUsers(Integer companyId) {

        List<Person> c = personRepository.findByCompanyId(companyId);
        return c;

    }
    @Override
    public List<User> queryCompanyUsers(Company company) {


        return userRepository.findCompanyUser(company.getId());

    }
    @Override
    public List<Person> queryPublicCompanyUsers(Integer companyId) {


        Specification<User> specification = (root, query, cb) -> {

            // 主要运用，选择发送信息到不同类型的公司
            Predicate predicate =
                    cb.equal(root.<String>get("overt"), true);
            return cb.and(cb.equal(root.<Integer>get("companyId"), companyId),predicate);
        };

        List<Person> c = personRepository.findByCompanyId(companyId);
        return c;

    }

    @Override
    public List<Map> queryPublicCompanyUsersMap(Integer companyId) {


        List<Person> c = personRepository.findByCompanyId(companyId);

        List list = new ArrayList<>();
        for(Person person : c){
            Map map = new HashMap<>();
            map.put("name", person.getRealName());
            map.put("phoneNumber", person.getPhoneNumber());


            User user = userRepository.findByUuid(person.getUserId());
            List<Map> userRoles = roleService.queryUserRolesMap(user.getId());
            map.put("roles", userRoles);

            list.add(map);
        }

        return list;

    }


    @Override
    @Transactional
    public Map addCompanyUser(Integer companyAdminId, Integer companyId,
                              String userName, String emailAddress, String pwd,
                              String userRole, Boolean ispublic) {
        Map ret = new HashMap<String, String>();
        ret.put("STATUS", true);
        try {
            User user = new User();
            user.setUserName(userName);
            user.setUserType(CommonConstant.USER_TYPE_USER);
            user.setStatus(CommonConstant.USER_STATUS_ACTIVE);
            user.setEmailAddress(emailAddress);
            //user.setPassword(MD5Util.getMD5StringWithSalt(pwd, realName));
            user.setPassword(pwd);
            userRepository.save(user);

            Person person = new Person();
            person.setUserId(user.getUuid());
            person.setCompanyId(companyId);
            person.setRealName(userName);
            person.setCreateBy(companyAdminId);
            person.setOvert(ispublic);
            personRepository.save(person);

            roleService.addCompanyUserRole(user, userRole);
        } catch (Exception e) {
            ret.put("STATUS", false);
            ret.put("MESSAGE", e.getMessage());
        }
        return ret;
    }




    @Override
    public Boolean queryAccountHasRole(Set<String> accountUserRoles,String[] userRoles){
        Boolean ret = true;
        for(String tmp : userRoles){
            if(!accountUserRoles.contains(tmp)) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    @Override
    public String queryCompanyType(Integer companyId){
        Company company = companyRepository.findById(companyId).get();
        return company.getType();
    }

    @Override
        @Transactional
        public Map addCustomService(Integer companyAdminId, Integer companyId,
                                    String userName, String emailAddress, String pwd,
                                    String userRole) {
        Map ret = new HashMap<String, String>();
        ret.put("STATUS", true);
        try {
            User user = new User();
            user.setUserName(userName);
            user.setUserType(CommonConstant.USER_TYPE_ADMIN);
            user.setStatus(CommonConstant.USER_STATUS_ACTIVE);
            user.setEmailAddress(emailAddress);
            //user.setPassword(MD5Util.getMD5StringWithSalt(pwd, realName));
            user.setPassword(pwd);
            userRepository.save(user);

            Person person = new Person();
            person.setUserId(user.getUuid());
            person.setCompanyId(companyId);
            person.setRealName(userName);
            personRepository.save(person);

            roleService.addAdminUserRole(user, userRole);
        } catch (Exception e) {
            ret.put("STATUS", false);
            ret.put("MESSAGE", e.getMessage());
        }
        return ret;
    }



    @Override
    @Transactional
    public Map addQualityInspection(Integer createBy,
                                String userName, String emailAddress, String pwd
                                ) {
        Map ret = new HashMap<String, String>();
        ret.put("STATUS", true);
        try {
            User user = new User();
            user.setUserName(userName);
            user.setUserType(CommonConstant.USER_TYPE_USER);
            user.setStatus(CommonConstant.USER_STATUS_ACTIVE);
            user.setEmailAddress(emailAddress);
            user.setCreateBy(createBy);
            //user.setPassword(MD5Util.getMD5StringWithSalt(pwd, realName));
            user.setPassword(pwd);
            userRepository.save(user);


            roleService.addQualityInspectionRole(user);

            Company company = new Company();

            //add by zhaoyuan 30/06/2015
            company.setOpen(true);
            company.setStatus(CommonConstant.COMPANY_PARTIALAPPLICATION);
            company.setType(CommonConstant.COMPANY_TYPE_INSPECTION);

            companyRepository.save(company);

            Person person = new Person();
            person.setUserId(user.getUuid());
            person.setCompanyId(company.getId());
            person.setRealName(userName);//Here,temporary,set the usename as real name

            personRepository.save(person);




        } catch (Exception e) {
            ret.put("STATUS", false);
            ret.put("MESSAGE", e.getMessage());
        }
        return ret;
    }

    @Override
    @Transactional
    public OperationResult createCompanyUser(CompanyUserCreateForm companyUserCreateForm,User u )  {

     //   Integer companyId, String userName,String familyName, String givenName, String emailAddress, String phone, String pwd, String userRole, Boolean ispublic

        OperationResult operationResult = new OperationResult();
        operationResult.setSuccess(true);
        String no = null;//sequenceGenerator.nextUserNO();
        companyUserCreateForm.setEmailAddress(no);
        if(userRepository.getUserByEmailAddress(companyUserCreateForm.getEmailAddress())!= null){
            operationResult.setSuccess(false);
            operationResult.setErrorMessage("用户名已经注册,请更改其他用户名");
            return operationResult;//throw new Exception("用户更好名已经注册");
        }
        User user = new User();



        user.setUserId(no);
        user.setUserName(no);

        // user.setUserName(userName);


        user.setUserType(CommonConstant.USER_TYPE_USER);
        user.setStatus(CommonConstant.USER_STATUS_ACTIVE);
        user.setEmailAddress(companyUserCreateForm.getEmailAddress());
        UserSetting setting = new UserSetting();
        setting.setPhoneStatus(CommonConstant.USER_AUTH_PHONE_STATUS_UNAUTHED);
        setting.setMailStatus(CommonConstant.USER_AUTH_MAIL_STATUS_UNAUTHED);
        setting.setUserId(user.getId());

        userSettingRepository.save(setting);



      //  user.setUserSetting(setting);
        //userService.setSetting(user, setting);



        //user.setPassword(MD5Util.getMD5StringWithSalt(pwd, realName));

        user.setPassword(companyUserCreateForm.getPwd());
        user =userRepository.save(user);

        Role role = roleService.queryRoleById(companyUserCreateForm.getUserRoleId());
        OperationResult operationResult1 = roleService.addCompanyUserRole(user, role);

        Person person = new Person();
        person.setUserId(user.getUuid());
        person.setCompanyId(u.getCompanyId());
        person.setFamilyName(companyUserCreateForm.getFamilyName());
        person.setGivenName(companyUserCreateForm.getGivenName());


        person.setRealName(companyUserCreateForm.getFamilyName()+companyUserCreateForm.getGivenName());

        if(companyUserCreateForm.getPhone() != null) {
            person.setPhoneNumber(companyUserCreateForm.getPhone() );
        }

        if(companyUserCreateForm.getEmailAddress() != null) {
            person.setEmailAddress(companyUserCreateForm.getEmailAddress());
        }

        person.setOvert(companyUserCreateForm.getIspublic());
        personRepository.save(person);

        // List<ConditionTask> tasks = conditionTaskService.createTaskForAddCompanyUser(user);



        operationResult.setResultObject(user);
        return operationResult;



    }



    @Override
    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public boolean hasUserInfomationCompleted(User user) {

        return user.getPerson().getRealName() != null && !"".equals(user.getPerson().getRealName());
    }

    @Override
    public Company updateCompany(CompanyPerfectForm companyForm,User user) {

        com.coalvalue.employee.domain.entity.Company original = companyRepository.findById(user.getCompanyId()).get();
        String[] ignoredProperties = null;

        original.setBusinessLicense(companyForm.getBusinessLicense());
        original.setTaxAccount(companyForm.getTaxAccount());

        original.setOperatingPeriod(companyForm.getOperatingPeriod());
        original.setBusinessLicense(companyForm.getBusinessLicense());
        original.setTaxPeriod(companyForm.getTaxPeriod());
        original.setCoalLicense(companyForm.getCoalLicense());
        original.setCoalLicensePeriod(companyForm.getCoalLicensePeriod());
        original.setOrgCodeCertification(companyForm.getOrgCodeCertification());
        original.setName(companyForm.getCompanyName());


        if(original.getStatus().equals(CommonConstant.CANVASSING_APPROVED)) {
            ignoredProperties = new String[]{"latitudeLongitudePosition","address","operating_period", "Business_license", "tax_period", "coal_license", "coal_license_period",
                    "apply_verification_time", "approved_time", "public", "brand", "CREATE_BY",
                    "CREATE_DATE", "MODIFY_BY", "VERSION", "MODIFY_DATE", "ORG_CODE_CERTIFICATION",
                    "COMPANY_NAME", "ID", "company_no", "company_type", "ORG_CODE_CERTIFICATION",

                    "logoImage", "backgroundFile", "certifiedBrand", "status", "thumbnail_image", "small_image"};

        } else {
            ignoredProperties = new String[]{"latitudeLongitudePosition","address","logoImage", "backgroundFile", "certifiedBrand", "status", "thumbnail_image", "small_image",
                    "public", "brand", "CREATE_DATE", "MODIFY_BY", "VERSION", "MODIFY_DATE","ID", "company_no", "company_type", };

        }

        if(original.getStatus().equals(CommonConstant.COMPANY_PARTIALAPPLICATION)) {

        }




        if(companyForm.getLocation() != null){

           // Location location =  original.getLatitudeLongitudePosition();

       //     Location location = pozitionLocationAddressService.createLocation(original, coalAddress.toStringAddress());


 /*
            original.setLatitudeLongitudePosition(pozitionLocationAddressService.getLocation(location, coalAddress.toStringAddress()));
            original.getLatitudeLongitudePosition().setCompany(original);*/

        }



        if(companyForm.getLogoImageData() != null) {
            InputStream inputStream = null;
            BufferedImage imBuff = null;
            try {
                inputStream = companyForm.getLogoImageData().getInputStream();
                imBuff = ImageIO.read(inputStream);


            }catch (IOException e) {
                logger.debug("convert file to InputStream error");
            }

            if(imBuff != null) {
                logger.debug("imBuff is with is{}, height is {} , imBuff is ",imBuff.getWidth(),imBuff.getHeight(), imBuff.toString());

                String logoPath =  FileUtil.saveThumbImage(FileUtil.LOGO_IMAGE_DIR, imBuff, 160, 160);

                String smallInamePath =  FileUtil.saveThumbImage(FileUtil.LOGO_IMAGE_DIR, imBuff, 120, 120);

                String thumbnailInmage =  FileUtil.saveThumbImage(FileUtil.LOGO_IMAGE_DIR, imBuff, 80, 102);

                logger.debug("image logo is {}, smalImage is {}, thumbnailImage is {}", companyForm.getLogoImageData(), smallInamePath, thumbnailInmage);
                if (!StringUtil.isEmpty(logoPath) && !StringUtil.isEmpty(smallInamePath) && !StringUtil.isEmpty(thumbnailInmage) ) {
                    original.setLogoImage(logoPath);
                    original.setSmallImage(smallInamePath);
                    original.setThumbnailImage(thumbnailInmage);
                }

            }
        }
        if(companyForm.getBackgroundFileDate() != null) {
            String filePath = FileUtil.saveFile(FileUtil.COMPANY_FILE_DIR, companyForm.getBackgroundFileDate());
            if (filePath != null) {
                original.setBackgroundFile(filePath);
            }
        }

        return companyRepository.save(original);
    }


    @Override
    @Transactional
    public OperationResult updateCompanyByMobile(CompanyPerfectForm companyForm,User user) {

        OperationResult operationResult = new OperationResult();

        Company original = companyRepository.findById(user.getCompanyId()).get();

        original.setBusinessLicense(companyForm.getBusinessLicense());
        original.setTaxAccount(companyForm.getTaxAccount());

        original.setOperatingPeriod(companyForm.getOperatingPeriod());
        original.setBusinessLicense(companyForm.getBusinessLicense());
        original.setTaxPeriod(companyForm.getTaxPeriod());
        original.setCoalLicense(companyForm.getCoalLicense());
        original.setCoalLicensePeriod(companyForm.getCoalLicensePeriod());
        original.setOrgCodeCertification(companyForm.getOrgCodeCertification());
        original.setName(companyForm.getCompanyName());
        original.setZipcode(companyForm.getZip());
        original.setPhoneNumber(companyForm.getPhoneNumber());

        original.setUrl(companyForm.getUrl());

        original = companyRepository.save(original);

        operationResult.setSuccess(true);
        operationResult.setResultObject(original);
        return operationResult;
    }

    @Override
    @Transactional
    public OperationResult generateCompany(String userType, UserCreateForm userName, String pwd, String companyName, Integer districtId) {


       // userService.registerUser(null, null,null,pwd,UserTypeEnum.煤矿.getText(),"--------",new Person(),null);

        Person person = new Person();
        person.setNickName(userName.getNickName());
        person.setFamilyName(userName.getFamilyName());
        person.setGivenName(userName.getGivenName());
        person.setRealName(userName.getFamilyName()+userName.getGivenName());


        User user = new User();
       // user.setUserId(sequenceGenerator.nextUserNO());
       // user.setUserName(userName);
        user.setPassword(pwd);

        user.setUserType(CommonConstant.USER_TYPE_USER);
        user.setStatus(CommonConstant.USER_STATUS_ACTIVE);
        UserSetting userSetting = new UserSetting();

        user = userRepository.save(user);
        userSetting.setUserId(user.getId());
        userSettingRepository.save(userSetting);


        person.setUserId(user.getUuid());
        UserTypeEnum customerType = UserTypeEnum.fromString(userType);
        roleService.addRegisterUserRole(user, customerType);


        if (UserTypeEnum.煤矿.equals(customerType)) {
            Company company = null;//companyService.createCompany(CooperationType.COALPIT, person, companyName,oreDistrict);
            person.setCompanyId(company.getId());
        } else if (UserTypeEnum.中介商.equals(customerType)) {
            Company company = null;// companyService.createCompany(CooperationType.BROKER, person ,companyName, oreDistrict);
            person.setCompanyId(company.getId());
        }

        person = personRepository.save(person);

        OperationResult operationResult = new OperationResult();
        operationResult.setSuccess(true);
        operationResult.setResultObject(user);
        return  operationResult;
    }



    @Override
    public OperationResult bindUser(String openIdString, Person person, Company company, String userType, String companyName) {
        OperationResult operationResult = new OperationResult();



        String password = GenerateShortUUID.generateRandomNumberCode(6, true);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("您选择了回答是 的答案,已经进入 上传回单模式").append("\n");

        return operationResult;


    }



    @Override
    @Transactional
    public OperationResult addCompanyUserAllInOne(Integer companyId, String userName,String familyName, String givenName, String emailAddress, String phone, String pwd, String type, Boolean ispublic) {

        OperationResult operationResult = new OperationResult();

/*        if(userRepository.findByMobile(phone)!= null){
            operationResult.setSuccess(false);
            operationResult.setErrorMessage("手机号已注册");
           return operationResult;// throw new Exception("用户名已经注册");
        }*/
        User user = new User();


       // user.setUserId(sequenceGenerator.nextUserNO());
        user.setUserName(userName);

        user.setUserType(CommonConstant.USER_TYPE_USER);
        user.setStatus(CommonConstant.USER_STATUS_ACTIVE);
        if(!StringUtil.isEmpty(emailAddress)){
            user.setEmailAddress(emailAddress);
        }

        UserSetting setting = new UserSetting();
        setting.setPhoneStatus(CommonConstant.USER_AUTH_PHONE_STATUS_UNAUTHED);
        setting.setMailStatus(CommonConstant.USER_AUTH_MAIL_STATUS_UNAUTHED);




        //user.setUserSetting(setting);

        //user.setPassword(MD5Util.getMD5StringWithSalt(pwd, realName));

        user.setPassword(pwd);
        user =userRepository.save(user);
        setting.setUserId(user.getId());

            userSettingRepository.save(setting);





        roleService.addCompanyUserRole(user, type);

        Person person = new Person();
        person.setUserId(user.getUuid());
        person.setCompanyId(companyId);
        person.setFamilyName(familyName);
        person.setGivenName(givenName);
        person.setPhoneNumber(phone);
        person.setPhoneNumber(phone);
        person.setRealName(userName);

        if(phone != null) {
          //  person.setMobileNumber(phone);
        }

        if(emailAddress != null) {
            person.setEmailAddress(emailAddress);
        }

        person.setOvert(ispublic);
        personRepository.save(person);

    //    List<ConditionTask> tasks = conditionTaskService.createTaskForAddCompanyUser(user);

        operationResult.setSuccess(true);
        operationResult.setResultObject(user);
        return operationResult;


    }

    @Override
    public OperationResult editCompanyUser(CompanyUserCreateForm companyUserCreateForm, User u) {
        OperationResult operationResult = new OperationResult();
        operationResult.setSuccess(true);

        User user = userRepository.findById(companyUserCreateForm.getEmployeeId()).get();



        user.setPassword(companyUserCreateForm.getPwd());
        user =userRepository.save(user);

        //roleService.addCompanyUserRole(user, companyUserCreateForm.getUserRole());

        Person person = personRepository.findByUserId(user.getUuid());


        person.setFamilyName(companyUserCreateForm.getFamilyName());
        person.setGivenName(companyUserCreateForm.getGivenName());

        person.setRealName(person.getFamilyName()+person.getGivenName());

        //person.setRealName(companyUserCreateForm.getUserName());

        if(companyUserCreateForm.getPhone() != null) {
            person.setPhoneNumber(companyUserCreateForm.getPhone() );
        }

        if(companyUserCreateForm.getEmailAddress() != null) {
            person.setEmailAddress(companyUserCreateForm.getEmailAddress());
        }

        person.setOvert(companyUserCreateForm.getIspublic());
        personRepository.save(person);


        operationResult.setResultObject(user);
        return operationResult;
    }


    @Override
    @Transactional
    public OperationResult updateCompanyImage(MultipartFile image, Company company) {

        OperationResult operationResult = new OperationResult();
        InputStream inputStream = null;
        BufferedImage imBuff = null;
        try {
            inputStream = image.getInputStream();
            imBuff = ImageIO.read(inputStream);


        }catch (IOException e) {
            logger.debug("convert file to InputStream error");
        }

      if(imBuff != null) {
                logger.debug("imBuff is with is{}, height is {} , imBuff is ",imBuff.getWidth(),imBuff.getHeight(), imBuff.toString());

                String logoPath =  FileUtil.saveThumbImage(FileUtil.LOGO_IMAGE_DIR, imBuff, 160, 160);

                String smallInamePath =  FileUtil.saveThumbImage(FileUtil.LOGO_IMAGE_DIR, imBuff, 120, 120);

                String thumbnailInmage =  FileUtil.saveThumbImage(FileUtil.LOGO_IMAGE_DIR, imBuff, 80, 102);

                logger.debug("image logo is {}, smalImage is {}, thumbnailImage is {}", logoPath, smallInamePath, thumbnailInmage);
                if (!StringUtil.isEmpty(logoPath) && !StringUtil.isEmpty(smallInamePath) && !StringUtil.isEmpty(thumbnailInmage) ) {
                    company.setLogoImage(logoPath);
                    company.setSmallImage(smallInamePath);
                    company.setThumbnailImage(thumbnailInmage);
                    companyRepository.save(company);
                }


            }
        return operationResult;

    }



    @Override
    @Transactional
    public Company updateCompanyDescription(String description, Company userCompany) {


        Company company = companyRepository.findById(userCompany.getId()).get();


        company.setCompanyDesc(description);

        companyRepository.save(company);



        return null;

    }

    @Override
    @Transactional
    public Company updateLongitudeLatitude(String longitude, String latitude, Company userCompany){




        logger.debug("longitude :{} latitude:{}", longitude,latitude);

        if(longitude == null || latitude == null){
            return null;
        }
/*
        Location location = pozitionLocationAddressService.getLocation(userCompany);
        if(location == null){
            location = new Location();
            location.setCompanyId(userCompany.getId());
            location.setItemId(userCompany.getId());
            location.setItemType(ResourceType.COMPANY.getText());
        }

        location = pozitionLocationAddressService.updateLongitudeLatitude(longitude,latitude, location);

*/


        return userCompany;

    }

    @Override
    public List queryCompanyUsersMap(Integer companyId) {
        List<Person> sumary =   queryCompanyUsers(companyId);

        List<Map<String,Object>> types= new ArrayList<Map<String,Object>>();

        for (Person user : sumary) {
            Map<String, Object> feeMap = new LinkedHashMap<String, Object>();
            feeMap.put("id", user.getId());

            feeMap.put("coalType", user.getRealName());
            feeMap.put("granularity", user.getPhoneNumber());
            feeMap.put("id", user.getId());



            feeMap.put("name", user.getRealName());
            feeMap.put("phone", user.getPhoneNumber());
            types.add(feeMap);
        }

        return types;
    }







    @Override
    @Transactional
    public Company updateCompanyRegInfo(Company company) {
        Company original = companyRepository.findById(company.getId()).get();

        //original.setBusinessLicense(company.getBusinessLicense());
        //original.setTaxAccount(company.getTaxAccount());

        original.setOrgCode(company.getOrgCode());
        original.setOperatingPeriod(company.getOperatingPeriod());
        original.setUnifiedSocialCreditCode(company.getUnifiedSocialCreditCode());

        original.setLegalRepresentative(company.getLegalRepresentative());
        original.setBankAccount(company.getBankAccount());
        original.setBankBranch(company.getBankBranch());
        original.setBankName(company.getBankName());
        original.setAccountName(company.getAccountName());


        return companyRepository.save(original);
    }

    @Override
    @Transactional
    public Company updateCompanyBizInfo(Company company) {
        Company original = companyRepository.findById(company.getId()).get();

        //original.setBusinessLicense(company.getBusinessLicense());
        //original.setTaxAccount(company.getTaxAccount());

        original.setOperationalProduct(company.getOperationalProduct());
        original.setMainBusiness(company.getMainBusiness());

        return companyRepository.save(original);
    }

    @Override
    @Transactional
    public Company updateCompanyBasicInfo(Company companyForm, User user) {
        Company original = companyRepository.findById(user.getCompanyId()).get();

        original.setZipcode(companyForm.getZipcode());
        original.setFaxNumber(companyForm.getFaxNumber());
        original.setPhoneNumber(companyForm.getPhoneNumber());
        original.setUrl(companyForm.getUrl());
        original.setCompanyDesc(companyForm.getCompanyDesc());
        original.setAbbreviationName(companyForm.getAbbreviationName());
        original.setCity(companyForm.getCity());
        original.setCountry(companyForm.getCountry());
        original.setName(companyForm.getName());





        return companyRepository.save(original);
    }
}
