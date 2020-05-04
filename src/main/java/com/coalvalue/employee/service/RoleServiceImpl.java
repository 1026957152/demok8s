package com.coalvalue.employee.service;

import com.coalvalue.employee.configuration.CommonConstant;
import com.coalvalue.employee.domain.ListItem;
import com.coalvalue.employee.domain.OperationResult;
import com.coalvalue.employee.domain.dto.RoleDto;
import com.coalvalue.employee.domain.entity.*;
import com.coalvalue.employee.enumType.BuessinessEnum;
import com.coalvalue.employee.enumType.UserTypeEnum;
import com.coalvalue.employee.repository.EmployeeRoleRepository;
import com.coalvalue.employee.repository.PermissionRepository;
import com.coalvalue.employee.repository.RoleRepository;
import com.coalvalue.employee.repository.UserRoleRepository;
import com.coalvalue.employee.repository.specification.RoleSpec;
import com.coalvalue.employee.util.DomainPropertyCopyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Peter Xu on 01/10/2015.
 */
@Service("roleService")
@Transactional(readOnly = true)
public class RoleServiceImpl extends BaseServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;



    @Autowired
    private EmployeeRoleRepository employeeRoleRepository;
    @Autowired
    private BussinessService bussinessService;

    @Autowired
    private PermissionRepository permissionRepository;



    @Override
    public Role queryRoleById(Integer roleId) {
        return roleRepository.findById(roleId).get();
    }

    @Override
    public Page<Role> queryRoles(RoleDto roleDto, Pageable pageable) {
        RoleSpec roleSpec = new RoleSpec(roleDto);

        Specification<Role> roleSpecification = roleSpec.defaultSpec();

        return roleRepository.findAll(roleSpecification, pageable);
    }

    @Override
    @Transactional
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    @Transactional
    public Role updateRole(Role role) {
        Role original = queryRoleById(role.getId());
        DomainPropertyCopyer.copyProperty(role, original);
        return roleRepository.save(original);
    }

    @Override
    @Transactional
    public void deleteRole(Integer roleId) {
        //remove role in user_role
        userRoleRepository.deleteUserRoleAssociation(roleId);
        //remove role in permission
        permissionRepository.removePermissionByRole(roleId);
        //remove role in role
        roleRepository.deleteById(roleId);
    }

    @Override
    public Page<User> queryRoleUsers(Integer roleId, Pageable pageable) {
//        String namedQuery = "queryRoleUsers";
//        Map bindings = new HashMap<>();
//        bindings.put("roleId", roleId);
//        return userRepository.findAll(namedQuery, bindings, pageable);
        return userRoleRepository.queryRoleUsers(roleId, pageable);
    }

    @Override
    @Transactional
    public void addRegisterUserRole(User user, UserTypeEnum userType) {

        logger.debug("--------------addRegisterUserRole {} ",userType.toString());
        //Common Roles
        //10 registered user
        //20 company admin
        //21 company user
        UserRole registeUser = new UserRole(user.getId(), CommonConstant.ROLE_ID_REGISTE_USER);
        UserRole companyUser = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);
        UserRole companyAdmin = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_ADMIN);


        UserRole financeController = new UserRole(user.getId(), CommonConstant.ROLE_ID_FINANCIAL_CONTROLLER);
        //30 seller
        //40 buyer
        //50 seller delivery
        //60 logistics



        UserRole ur = new UserRole();
        ur.setUserId(user.getId());
        if (UserTypeEnum.买家.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_BUYER);
            userRoleRepository.save(registeUser);
            userRoleRepository.save(companyUser);
            userRoleRepository.save(companyAdmin);
            userRoleRepository.save(ur);
        } else if (UserTypeEnum.卖家.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_SELLER);
            userRoleRepository.save(registeUser);
            userRoleRepository.save(companyUser);
            userRoleRepository.save(companyAdmin);
            userRoleRepository.save(ur);
        } else if (UserTypeEnum.物流信息部.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_LOGISTICS);
            userRoleRepository.save(registeUser);
            userRoleRepository.save(companyUser);
            userRoleRepository.save(companyAdmin);
            userRoleRepository.save(ur);
        } else if (UserTypeEnum.私人运力.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_PRIVATECAPACITY);
            userRoleRepository.save(registeUser);
            userRoleRepository.save(ur);
        } else if (UserTypeEnum.仓库.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_WAREHOUSE);
            userRoleRepository.save(registeUser);
            userRoleRepository.save(companyUser);
            userRoleRepository.save(companyAdmin);
            userRoleRepository.save(ur);
        } else if( UserTypeEnum.个人客户.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_PERSONAL_USER);
            userRoleRepository.save(registeUser);
            userRoleRepository.save(ur);
        }else if(UserTypeEnum.买家收货员.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_Consignee_USER);
            userRoleRepository.save(registeUser);
            userRoleRepository.save(ur);
        }else if(UserTypeEnum.中介商.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_BROKER_USER);
            userRoleRepository.save(registeUser);
            userRoleRepository.save(companyAdmin);
            userRoleRepository.save(financeController);
            userRoleRepository.save(ur);


        }else if( UserTypeEnum.煤矿.equals(userType)) {
            logger.debug("--------------addRegisterUserRole {} ","煤矿");

            ur.setRoleId(CommonConstant.ROLE_ID_COALPIT_USER);
            userRoleRepository.save(companyAdmin);
            userRoleRepository.save(registeUser);
            userRoleRepository.save(companyAdmin);
            userRoleRepository.save(ur);
        }else if( CommonConstant.USER_TYPE_Anonymous.equals(userType)) {
            userRoleRepository.save(registeUser);
        }




    }

    @Override
    public void addCompanyUserRole(User user, String userType) {

        logger.debug("parm is userType is:{}",userType);
        //Common Roles
        //10 registered user
        //21 company user
        UserRole register_user = new UserRole(user.getId(), CommonConstant.ROLE_ID_REGISTE_USER);

        //30 seller
        //40 buyer
        //50 seller delivery
        UserRole ur = new UserRole();
        ur.setUserId(user.getId());


        if (UserTypeEnum.买家收货人.getText().equals(userType)) {

            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_BUYER_CONSIGNEE);

            userRoleRepository.save(register_user);
            userRoleRepository.save(ca);

            UserRole company_user = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);
            userRoleRepository.save(company_user);

        }
        if (UserTypeEnum.煤矿发货员.getText().equals(userType)) {

            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_COALPIT_DELIVER);

            userRoleRepository.save(register_user);
            userRoleRepository.save(ca);

        } else if (UserTypeEnum.煤矿.getText().equals(userType)) {
            //seller role
            ur.setRoleId(CommonConstant.ROLE_ID_SELLER);
            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);

            userRoleRepository.save(register_user);
            userRoleRepository.save(ca);
            userRoleRepository.save(ur);
        } else if (UserTypeEnum.买家收货员.getText().equals(userType)) {
            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_Consignee_USER);
            userRoleRepository.save(register_user);
            userRoleRepository.save(ca);

        }  else if (UserTypeEnum.买家.getText().equals(userType)) {
            //seller role
            ur.setRoleId(CommonConstant.ROLE_ID_BUYER);
            UserRole company_user = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);

            userRoleRepository.save(register_user);
            userRoleRepository.save(company_user);
            userRoleRepository.save(ur);

        } else if (UserTypeEnum.中介商.getText().equals(userType)) {
            //seller role
            ur.setRoleId(CommonConstant.ROLE_ID_BROKER_USER);
            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);

            userRoleRepository.save(register_user);
            userRoleRepository.save(ca);
            userRoleRepository.save(ur);
        }  else if ("0".equals(userType)) {
            //buyer role
            ur.setRoleId(CommonConstant.ROLE_ID_BUYER);
            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);

            userRoleRepository.save(register_user);
            userRoleRepository.save(ca);
            userRoleRepository.save(ur);
        } else if ("seller".equals(userType)) {
            //seller role
            ur.setRoleId(CommonConstant.ROLE_ID_SELLER);
            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);

            userRoleRepository.save(register_user);
            userRoleRepository.save(ca);
            userRoleRepository.save(ur);
        } else if ("deliver".equals(userType)) {
            //seller delivery role
            ur.setRoleId(CommonConstant.ROLE_ID_SELLDELIVERY);
            userRoleRepository.save(register_user);
            userRoleRepository.save(ur);
        } else if ("service".equals(userType)) {
            //custom service
            ur.setRoleId(CommonConstant.ROLE_ID_CUSTOMSERVICE);
            userRoleRepository.save(register_user);
            userRoleRepository.save(ur);
        }

     //   userRoleRepository.save(ru);
      //  userRoleRepository.save(ca);
       // userRoleRepository.save(ur);
    }


    @Override
    public void addCompanyUserType(User user, UserTypeEnum userRole) {

        logger.debug("parm is userType is:{}",userRole);
        //Common Roles
        //10 registered user
        //21 company user
        UserRole ru = new UserRole(user.getId(), CommonConstant.ROLE_ID_REGISTE_USER);

        //30 seller
        //40 buyer
        //50 seller delivery
        UserRole ur = new UserRole();
        ur.setUserId(user.getId());



        if (UserTypeEnum.煤矿发货员.getText().equals(userRole.getText())) {

            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_COALPIT_DELIVER);

            userRoleRepository.save(ru);
            userRoleRepository.save(ca);

        } else if (UserTypeEnum.煤矿.getText().equals(userRole.getText())) {
            //seller role
            ur.setRoleId(CommonConstant.ROLE_ID_SELLER);
            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);

            userRoleRepository.save(ru);
            userRoleRepository.save(ca);
            userRoleRepository.save(ur);
        } else if (UserTypeEnum.买家收货员.getText().equals(userRole.getText())) {
            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_Consignee_USER);
            userRoleRepository.save(ru);
            userRoleRepository.save(ca);

        }  else if (UserTypeEnum.买家.getText().equals(userRole.getText())) {
            //seller role
            ur.setRoleId(CommonConstant.ROLE_ID_BUYER);
            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);

            userRoleRepository.save(ru);
            userRoleRepository.save(ca);
            userRoleRepository.save(ur);

        } else if (UserTypeEnum.中介商.getText().equals(userRole.getText())) {
            //seller role
            ur.setRoleId(CommonConstant.ROLE_ID_BROKER_USER);
            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);

            userRoleRepository.save(ru);
            userRoleRepository.save(ca);
            userRoleRepository.save(ur);
        }  else if ("0".equals(userRole.getText())) {
            //buyer role
            ur.setRoleId(CommonConstant.ROLE_ID_BUYER);
            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);

            userRoleRepository.save(ru);
            userRoleRepository.save(ca);
            userRoleRepository.save(ur);
        } else if ("seller".equals(userRole.getText())) {
            //seller role
            ur.setRoleId(CommonConstant.ROLE_ID_SELLER);
            UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);

            userRoleRepository.save(ru);
            userRoleRepository.save(ca);
            userRoleRepository.save(ur);
        } else if (UserTypeEnum.中介商发货员.equals(userRole.getText())) {
            //seller delivery role
            ur.setRoleId(CommonConstant.ROLE_ID_SELLDELIVERY);
            userRoleRepository.save(ru);
            userRoleRepository.save(ur);
        } else if ("service".equals(userRole.getText())) {
            //custom service
            ur.setRoleId(CommonConstant.ROLE_ID_CUSTOMSERVICE);
            userRoleRepository.save(ru);
            userRoleRepository.save(ur);
        }

        //   userRoleRepository.save(ru);
        //  userRoleRepository.save(ca);
        // userRoleRepository.save(ur);
    }

    @Override
    @Transactional
    public void removeUserFromRole(User user, Role role) {
        userRoleRepository.deleteUserRoleAssociation(role.getId(), user.getId());
    }

    @Override
    public List<Role> queryUserRoles(Integer userId) {
        return userRoleRepository.queryUserRoles(userId);
    }

    @Override
    public List<Map> queryUserRolesMap(Integer userId) {


        List<Map> roleStrings = new ArrayList<Map>();
        List<Role> roles = userRoleRepository.queryUserRoles(userId);
        for(Role role:roles){
            Map map = new HashMap<>();
            map.put("name",role.getRoleName());
            map.put("description",role.getRoleDesc());
            roleStrings.add(map);
        }
        return roleStrings;
    }
    @Override
    public List<Map> queryEmployeeRolesMap(String userId) {


        List<Map> roleStrings = new ArrayList<Map>();
        List<EmployeeRole> roles = employeeRoleRepository.findByUserId(userId);
        for(EmployeeRole employeeRole:roles){
            Role role = roleRepository.findById(employeeRole.getRoleId()).get();
            Map map = new HashMap<>();
            map.put("name",role.getRoleName());
            map.put("description",role.getRoleDesc());
            roleStrings.add(map);
        }
        return roleStrings;
    }
    @Override
    public void addAdminUserRole(User user, String userRole) {
        //Common Roles
        //10 registered user
        //21 company user
        UserRole ru = new UserRole(user.getId(), CommonConstant.ROLE_ID_REGISTE_USER);
        UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);

        //30 seller
        //40 buyer
        //50 seller delivery
        UserRole ur = new UserRole();
        ur.setUserId(user.getId());
        if ("0".equals(userRole)) {
            //buyer role
            ur.setRoleId(CommonConstant.ROLE_ID_BUYER);
        } else if ("1".equals(userRole)) {
            //seller role
            ur.setRoleId(CommonConstant.ROLE_ID_SELLER);
        } else if ("2".equals(userRole)) {
            //seller delivery role
            ur.setRoleId(CommonConstant.ROLE_ID_SELLDELIVERY);
        } else if ("3".equals(userRole)) {
            //custom service
            ur.setRoleId(CommonConstant.ROLE_ID_CUSTOMSERVICE);
        }

        userRoleRepository.save(ru);
        userRoleRepository.save(ca);
        userRoleRepository.save(ur);
    }

    @Override
    public void addQualityInspectionRole(User user) {
        UserRole ru = new UserRole(user.getId(), CommonConstant.ROLE_ID_REGISTE_USER);
        UserRole ca = new UserRole(user.getId(), CommonConstant.ROLE_ID_COMPANY_USER);
        UserRole iu = new UserRole(user.getId(), CommonConstant.ROLE_ID_INSPECTION_USER);
        userRoleRepository.save(ru);
        userRoleRepository.save(ca);
        userRoleRepository.save(iu);
    }


    public List<Role> queryAllRoles(Company company) {


        return roleRepository.findAll();
    }

    @Override
    @Transactional
    public OperationResult addCompanyUserRole(User user, Integer roleId) {
       // logger.debug("parm is userType is:{}",userRole);


        List<Role> roles = queryUserRoles(user.getId());
        for(Role role : roles){
            if(role.getId().equals(roleId)){

                OperationResult operationResult = new OperationResult();
                operationResult.setSuccess(false);
                operationResult.setResultObject(role);
                return operationResult;
            }
        }
        Role role = roleRepository.findById(roleId).get();

        UserRole ru = new UserRole(user.getId(), role.getId());


        ru = userRoleRepository.save(ru);

        OperationResult operationResult = new OperationResult();
        operationResult.setSuccess(true);
        operationResult.setResultObject(ru);

        return operationResult;

    }


    @Override
    @Transactional
    public OperationResult addCompanyUserRole(User user, Role role) {

        UserRole ru = userRoleRepository.findByUserIdAndRoleId(user.getId(),role.getId());
        if(ru == null){
            ru = new UserRole(user.getId(), role.getId());
            ru = userRoleRepository.save(ru);
        }

        OperationResult operationResult1 = new OperationResult();
        operationResult1.setResultObject(ru);
        operationResult1.setSuccess(true);
        return operationResult1;
    }

    @Override
    @Transactional
    public OperationResult deleteCompanyUserRole(User user, Integer id) {

        Role role = roleRepository.findById(id).get();

        UserRole ru = userRoleRepository.findByUserIdAndRoleId(user.getId(),role.getId());


        if(ru != null){
            userRoleRepository.delete(ru);
        }

        OperationResult operationResult1 = new OperationResult();
        operationResult1.setResultObject(ru);
        operationResult1.setSuccess(true);
        return operationResult1;

    }

    @Override
    @Transactional
    public OperationResult deleteUserRole(User user, Integer userRoleRegisteredUser) {
        Role role = roleRepository.findById(userRoleRegisteredUser).get();

        OperationResult operationResult1 = new OperationResult();

        UserRole ru = userRoleRepository.findByUserIdAndRoleId(user.getId(),role.getId());


        if(ru != null){
            userRoleRepository.delete(ru);
            operationResult1.setResultObject(ru);
            operationResult1.setSuccess(true);

        }else {
            operationResult1.setErrorMessage("找不到role");
            operationResult1.setSuccess(false);
        }


        return operationResult1;

    }

    @Override
    public UserRole getUserRoleById(Integer userRoleId) {
        return userRoleRepository.findById(userRoleId).get();
    }

    @Override
    public void addRegisterUserRole(BuessinessEnum buessinessEnum, Company company, User user) {



        UserTypeEnum userType = null;

        if(buessinessEnum.getText().equals(BuessinessEnum.生产业务.getText())){
            userType = UserTypeEnum.煤矿;
        }

        if(buessinessEnum.getText().equals(BuessinessEnum.分销业务.getText())){
         //   companyService.getDistributorByCompany(company);
            userType = UserTypeEnum.中介商;
        }


        if(buessinessEnum.getText().equals(BuessinessEnum.物流业务.getText())){
            /*companyService.getDistributorByCompany(company);*/
            userType = UserTypeEnum.物流信息部;
        }


        if(buessinessEnum.getText().equals(BuessinessEnum.贸易业务.getText())){
            /*companyService.getDistributorByCompany(company);*/
            userType = UserTypeEnum.卖家;
        }


        if(userType== null){
            return;
        }



        UserRole ur = new UserRole();
        ur.setUserId(user.getId());
        if (UserTypeEnum.买家.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_BUYER);


        } else if (UserTypeEnum.卖家.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_SELLER);


        } else if (UserTypeEnum.物流信息部.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_LOGISTICS);


        } else if (UserTypeEnum.私人运力.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_PRIVATECAPACITY);


        } else if (UserTypeEnum.仓库.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_WAREHOUSE);


        } else if( UserTypeEnum.个人客户.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_PERSONAL_USER);


        }else if(UserTypeEnum.买家收货员.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_Consignee_USER);


        }else if(UserTypeEnum.中介商.equals(userType)) {

            ur.setRoleId(CommonConstant.ROLE_ID_BROKER_USER);






        }else if( UserTypeEnum.煤矿.equals(userType)) {
            logger.debug("--------------addRegisterUserRole {} ","煤矿");

            ur.setRoleId(CommonConstant.ROLE_ID_COALPIT_USER);


        }else if( UserTypeEnum.中介商.equals(userType)) {
            logger.debug("--------------addRegisterUserRole {} ","中介商");

            ur.setRoleId(CommonConstant.ROLE_ID_BROKER_USER);


        }else if( CommonConstant.USER_TYPE_Anonymous.equals(userType)) {

        }


        if(ur.getRoleId()!= null){
            if(userRoleRepository.findByUserIdAndRoleId(ur.getUserId(),ur.getRoleId())== null){
                userRoleRepository.save(ur);
            };

        }

    }












    @Override
    public  List<ListItem> getRolesForBussiness(Company company) {

        List<Bussiness> bussinesses = bussinessService.getBuessinessEnum(company);
        List<ListItem> list = new ArrayList<ListItem>();

        for(Bussiness bussiness: bussinesses){

            System.out.println("----------       ----------------------{}"+ bussiness.toString());



            if(bussiness.getName().equals(BuessinessEnum.分销业务.getText())) {
                ListItem element = new ListItem(UserTypeEnum.中介商发货员.getText(), UserTypeEnum.中介商发货员.getDisplayText(), UserTypeEnum.中介商发货员.getTipsMessage());
                list.add(element);
                element = new ListItem(UserTypeEnum.中介商.getText(), UserTypeEnum.中介商.getDisplayText(), UserTypeEnum.中介商.getTipsMessage());
                list.add(element);
            }


            if(bussiness.getName().equals(BuessinessEnum.生产业务.getText())) {
                ListItem element = new ListItem(UserTypeEnum.煤矿发货员.getText(), UserTypeEnum.煤矿发货员.getDisplayText(), UserTypeEnum.煤矿发货员.getTipsMessage());
                list.add(element);
                element = new ListItem(UserTypeEnum.煤矿.getText(), UserTypeEnum.煤矿.getDisplayText(), UserTypeEnum.煤矿.getTipsMessage());
                list.add(element);
                element = new ListItem(UserTypeEnum.装车员.getText(), UserTypeEnum.装车员.getDisplayText(), UserTypeEnum.装车员.getTipsMessage());
                list.add(element);
            }


            if(bussiness.getName().equals(BuessinessEnum.物流业务.getText())) {
                ListItem element = new ListItem(UserTypeEnum.物流信息部.getText(), UserTypeEnum.物流信息部.getDisplayText(), UserTypeEnum.物流信息部.getTipsMessage());
                list.add(element);
                element = new ListItem(UserTypeEnum.物流信息部_业务人员.getText(), UserTypeEnum.物流信息部_业务人员.getDisplayText(), UserTypeEnum.物流信息部_业务人员.getTipsMessage());
                list.add(element);
            }






        }

        return list;
    }




    @Override
    @Transactional
    public OperationResult addRegisterEmployeeRole(UserTypeEnum userType, Employee user) {

        logger.debug(userType.toString()+   "----- param is  id : {},  price:{}, notificationToIds:{}, returnTo:{}，sendMessageToFollower is:{}");


        EmployeeRole ur = new EmployeeRole();
        ur.setUserId(user.getUuid());

        if (UserTypeEnum.中介商发货员.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_BROKER_USER);


        } else
        if (UserTypeEnum.煤矿发货员.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_COALPIT_DELIVER);


        } else

        if (UserTypeEnum.管理者.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_COMPANY_ADMIN);


        } else if (UserTypeEnum.买家.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_BUYER);


        } else if (UserTypeEnum.卖家.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_SELLER);


        } else if (UserTypeEnum.物流信息部.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_LOGISTICS);


        } else if (UserTypeEnum.私人运力.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_PRIVATECAPACITY);


        } else if (UserTypeEnum.仓库.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_WAREHOUSE);


        } else if( UserTypeEnum.个人客户.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_PERSONAL_USER);


        }else if(UserTypeEnum.买家收货员.equals(userType)) {
            ur.setRoleId(CommonConstant.ROLE_ID_Consignee_USER);


        }else if(UserTypeEnum.中介商.equals(userType)) {

            ur.setRoleId(CommonConstant.ROLE_ID_BROKER_USER);






        }else if( UserTypeEnum.煤矿.equals(userType)) {
            logger.debug("--------------addRegisterUserRole {} ","煤矿");

            ur.setRoleId(CommonConstant.ROLE_ID_COALPIT_USER);


        }else if( UserTypeEnum.中介商.equals(userType)) {
            logger.debug("--------------addRegisterUserRole {} ","中介商");

            ur.setRoleId(CommonConstant.ROLE_ID_BROKER_USER);


        }else if( CommonConstant.USER_TYPE_Anonymous.equals(userType)) {

        }

        logger.debug(ur.toString()+"----- param is  id : {},  price:{}, notificationToIds:{}, returnTo:{}，sendMessageToFollower is:{}");

        if(ur.getRoleId()!= null){
            if(employeeRoleRepository.findByUserIdAndRoleId(ur.getUserId(),ur.getRoleId())== null){
                ur=  employeeRoleRepository.save(ur);
             };

        }


        return OperationResult.ok(ur);
    }

}
