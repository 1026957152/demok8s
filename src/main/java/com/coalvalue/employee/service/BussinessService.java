package com.coalvalue.employee.service;


import com.coalvalue.employee.domain.dto.CompanyDto;
import com.coalvalue.employee.domain.entity.Bussiness;
import com.coalvalue.employee.domain.entity.Company;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.enumType.BuessinessEnum;
import com.coalvalue.employee.enumType.PrimaryEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface BussinessService extends BaseService {




    public Company queryCompanyById(Integer companyId);

    public Company createCompany(Company company, MultipartFile logoImage, MultipartFile backgroundFile);


    public Page<Company> queryCompany(CompanyDto companyDto, Pageable pageable);


    public Map addCompanyUser(Integer companyAdminId, Integer companyId, String userName,
                              String emailAddress, String pwd, String userRole, Boolean ispublic);



    public Boolean queryAccountHasRole(Set<String> userRoles, String[] userRole);

    public String queryCompanyType(Integer companyId);

    public List<Company> queryTopBrandCompanys();

    Map addCustomService(Integer userId, Integer companyId, String userName, String emailAddress, String pwd, String userRole);

    Bussiness primaryBussiness(Bussiness buessinessEnum, PrimaryEnum company, User user);


    Bussiness openBussiness(BuessinessEnum buessinessEnum, Company company, User user);

    List<BuessinessEnum> getNotBuessinessEnum(Company company, User u);
    Page<BuessinessEnum> getNotBuessinessEnum(Company company, Pageable pageable);
    Page<Map> getBuessinessEnum(Company company, Pageable pageable);

    List<Bussiness> getBuessinessEnum(Company company);
}
