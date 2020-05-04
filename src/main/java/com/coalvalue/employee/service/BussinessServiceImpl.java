package com.coalvalue.employee.service;

import com.coalvalue.employee.configuration.CommonConstant;
import com.coalvalue.employee.domain.OperationResult;
import com.coalvalue.employee.domain.dto.CompanyDto;
import com.coalvalue.employee.domain.entity.Bussiness;
import com.coalvalue.employee.domain.entity.Company;
import com.coalvalue.employee.domain.entity.Person;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.enumType.BuessinessEnum;
import com.coalvalue.employee.enumType.PrimaryEnum;
import com.coalvalue.employee.repository.BussinessRepository;
import com.coalvalue.employee.repository.CompanyRepository;
import com.coalvalue.employee.repository.PersonRepository;
import com.coalvalue.employee.repository.UserRepository;
import com.coalvalue.employee.repository.specification.CompanySpec;
import com.coalvalue.employee.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Peter Xu on 01/10/2015.
 */
@Service("bussinessService")
//@Transactional(readOnly = true)
public class BussinessServiceImpl extends BaseServiceImpl implements BussinessService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private BussinessRepository bussinessRepository;

    @Autowired
    private RoleService roleService;




    @Override
    public Company queryCompanyById(Integer companyId){ return companyRepository.findById(companyId).get(); }

    @Override
    @Transactional
    public Company createCompany(Company company,
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
            person.setUserNo(user.getUserId());
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
       public Page<Company> queryCompany(CompanyDto companyDto, Pageable pageable) {
        CompanySpec companySpec = new CompanySpec(companyDto);
        Specification<Company> companySpecification = companySpec.defaultSpec();


        return companyRepository.findAll(companySpecification, pageable);
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
    public List<Company> queryTopBrandCompanys() {
        Sort descCreateDate = Sort.by(Sort.Direction.DESC, "createDate");
        Pageable pageable = PageRequest.of(0, 12, descCreateDate);
        Specification<Company> companyNameNotNullSpec =null;// CompanySpec.brandCompanyWithoutWarehouseSpec();
        Page<Company> page = companyRepository.findAll(companyNameNotNullSpec, pageable);
        return page.getContent();
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
            person.setUserNo(user.getUserId());
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
    public Bussiness primaryBussiness(Bussiness bussinesses, PrimaryEnum company, User user) {

        if(company.getText().equals(PrimaryEnum.NotPrimary.getText())){
            bussinesses.setPrimary(Boolean.FALSE);

        }


        if(company.getText().equals(PrimaryEnum.Primary.getText())){
            bussinesses.setPrimary(Boolean.TRUE);

        }
            bussinessRepository.save(bussinesses);

        return bussinesses;


    }

    @Override
    @Transactional
    public Bussiness openBussiness(BuessinessEnum buessinessEnum, Company company, User user) {


        roleService.addRegisterUserRole(buessinessEnum,company,user);
        Bussiness bussinesses = bussinessRepository.findByCompanyIdAndName(company.getUuid(),buessinessEnum.getText());

        if(bussinesses== null){
            bussinesses = new Bussiness();
            bussinesses.setCompanyId(company.getUuid());
            bussinesses.setName(buessinessEnum.getText());
            bussinessRepository.save(bussinesses);


        }

        return bussinesses;


    }

    @Override

    public List<BuessinessEnum> getNotBuessinessEnum(Company company, User u)  {

        OperationResult operationResult = new OperationResult();
        operationResult.setSuccess(true);



        List<Bussiness> bussinesses = bussinessRepository.findByCompanyId(company.getUuid());


        Set<String> bussinessesSet = bussinesses.stream().map(e->e.getName()).collect(Collectors.toSet());

        List<BuessinessEnum> a = Arrays.stream(BuessinessEnum.values()).filter(e->{


            return !bussinessesSet.contains(e.getText());

        }).collect(Collectors.toList());


        return a;



    }

    @Override
    public Page<BuessinessEnum> getNotBuessinessEnum(Company company, Pageable pageable) {



        List<Bussiness> bussinesses = bussinessRepository.findByCompanyId(company.getUuid());


        Set<String> bussinessesSet = bussinesses.stream().map(e->e.getName()).collect(Collectors.toSet());

        List<BuessinessEnum> a = Arrays.stream(BuessinessEnum.values()).filter(e->{
            return !bussinessesSet.contains(e.getText());

        }).collect(Collectors.toList());


        Page<BuessinessEnum> newPages = new PageImpl<BuessinessEnum>(a, pageable, a.size());
        return newPages;
    }


    @Override
    public Page<Map> getBuessinessEnum(Company company, Pageable pageable) {



        List<Bussiness> bussinesses = bussinessRepository.findByCompanyId(company.getUuid());


        List<Map> a = bussinesses.stream().map(e->{ BuessinessEnum b = BuessinessEnum.fromString(e.getName());

        Map map = new HashMap();
            map.put("name", BuessinessEnum.display(e.getName()));

            map.put("companyId",e.getCompanyId());
            map.put("primary",e.getPrimary());
            map.put("status",e.getStatus());
            map.put("id",e.getUuid());

           // String url = urlService.getUrl(e);
            //map.put("url",url);
        b.setHelpMessage(e.getUuid());
        return map;}).collect(Collectors.toList());


        Page<Map> newPages = new PageImpl<Map>(a, pageable, a.size());
        return newPages;
    }


    @Override
    public List<Bussiness> getBuessinessEnum(Company company) {



        List<Bussiness> bussinesses = bussinessRepository.findByCompanyId(company.getUuid());


        return bussinesses;
    }
}
