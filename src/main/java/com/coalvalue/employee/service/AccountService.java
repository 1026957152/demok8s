package com.coalvalue.employee.service;

import com.coalvalue.employee.domain.OperationResult;
import com.coalvalue.employee.domain.entity.Company;
import com.coalvalue.employee.domain.entity.Person;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.web.validation.CompanyPerfectForm;
import com.coalvalue.employee.web.validation.CompanyUserCreateForm;
import com.coalvalue.employee.web.validation.UserCreateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface AccountService extends BaseService {


    public Person queryPersonById(Integer personId);

    public Person queryPersonByRealName(String realName);


    public Boolean verifyOriginalPwd(Integer userId, String pwd);

    public User resetUserPwd(Integer userId, String pwd);

    public Company queryCompanyByCompanyName(String companyName);

    public Company queryCompanyById(Integer companyId);

    public Company createCompany(com.coalvalue.employee.domain.entity.Company company, MultipartFile logoImage, MultipartFile backgroundFile);


    public Page<Person> queryCompanyUsers(Integer companyId, Pageable pageable);

    public List<Person> queryCompanyUsers(Integer companyId);


    List<User> queryCompanyUsers(Company company);

    List<Person> queryPublicCompanyUsers(Integer companyId);


    List<Map> queryPublicCompanyUsersMap(Integer companyId);

    public Map addCompanyUser(Integer companyAdminId, Integer companyId, String userName,
                              String emailAddress, String pwd, String userRole, Boolean ispublic);



    public Boolean queryAccountHasRole(Set<String> userRoles, String[] userRole);

    public String queryCompanyType(Integer companyId);


    Map addCustomService(Integer userId, Integer companyId, String userName, String emailAddress, String pwd, String userRole);

    Map addQualityInspection(Integer companyAdminId,
                             String userName, String emailAddress, String pwd);


    OperationResult addCompanyUserAllInOne(Integer companyId, String userName, String familyName, String givenName, String emailAddress, String phone, String pwd, String userRole, Boolean ispublic) throws Exception;

    OperationResult createCompanyUser(CompanyUserCreateForm companyUserCreateForm, User u);



    Person updatePerson(Person driverPerson);



    boolean hasUserInfomationCompleted(User user);


    Company updateCompany(CompanyPerfectForm company, User user);

    OperationResult updateCompanyByMobile(CompanyPerfectForm companyForm, User user);

    OperationResult generateCompany(String userType, UserCreateForm userName, String pwd, String companyName, Integer districtId);

    OperationResult bindUser(String openIdString, Person person, Company company, String userType, String companyName);

    OperationResult editCompanyUser(CompanyUserCreateForm merchantCreateForm, User user);

    OperationResult updateCompanyImage
            (MultipartFile image, Company userCompany);


    Company updateCompanyDescription(String description, Company userCompany);


    List queryCompanyUsersMap(Integer companyId);

    @Transactional
    Company updateCompanyRegInfo(Company company);

    @Transactional
    Company updateCompanyBizInfo(Company company);

    Company updateCompanyBasicInfo(Company company, User user);

    Company updateLongitudeLatitude(String longitude, String latitude, Company userCompany);

}
