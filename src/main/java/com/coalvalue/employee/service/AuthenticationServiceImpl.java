package com.coalvalue.employee.service;

import com.coalvalue.employee.domain.OperationResult;
import com.coalvalue.employee.domain.entity.AuthInfo;
import com.coalvalue.employee.domain.entity.AuthorizationVerification;
import com.coalvalue.employee.domain.entity.Company;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.enumType.*;
import com.coalvalue.employee.repository.AuthInfoRepository;
import com.coalvalue.employee.repository.AuthorizationVerificationRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by silence yuan on 2015/7/25.
 */

@Service("authenticationService")
public class AuthenticationServiceImpl extends BaseServiceImpl implements AuthenticationService {



    @Autowired
    private AuthInfoRepository authInfoRepository;

    @Autowired
    private AuthorizationVerificationRepository authorizationVerificationRepository;


    @Override
    @Transactional
    public List<AuthInfo> getAuthInfoByUser(User user) {
        List<AuthInfo> authInfos  = authInfoRepository.findByItemIdAndItemType(user.getId(), ResourceType.USER.getText());
        //List<AuthInfo> authInfos  = authInfoRepository.findByUserId(user.getId());

        if(authInfos.size() == 0){
            AuthInfo authInfo = new AuthInfo();
            authInfo.setStatus(AuthenticationStatusEnum.unCompleted.getText());
            authInfo.setUserId(user.getId());
            authInfo.setItemId(user.getId());

            authInfo.setItemType(ResourceType.USER.getText());


            authInfo.setAuthType(AuthenticationTypeEnum.个人信息认证.getText());
            authInfoRepository.save(authInfo);

        }
        return authInfoRepository.findByItemIdAndItemType(user.getId(), ResourceType.USER.getText());
    }

    @Override
    @Transactional
    public List<AuthInfo> getAuthInfoByCompany(Company company) {

        List<AuthInfo> authInfos  = authInfoRepository.findByItemIdAndItemType(company.getId(), ResourceType.COMPANY.getText());

        if(authInfos.size() == 0){
            AuthInfo authInfo = new AuthInfo();
            authInfo.setStatus(AuthenticationStatusEnum.unCompleted.getText());
            authInfo.setItemId(company.getId());
            authInfo.setItemType(ResourceType.COMPANY.getText());
            authInfo.setAuthType(AuthenticationTypeEnum.公司信息认证.getText());
            authInfoRepository.save(authInfo);

        }
        Page<AuthInfo> authInfos_ =  authInfoRepository.findByItemIdAndItemType(company.getId(), ResourceType.COMPANY.getText(),PageRequest.of(0,10));
        return authInfos_.getContent();


    }

    @Override
    @Transactional
    @Cacheable(value="AuthInfoByCompany",key = "'AuthInfoByCompany'+#company.id+#authenticationTypeEnum.text")
    public AuthInfo getAuthInfoByCompany(Company company, AuthenticationTypeEnum authenticationTypeEnum) {

        AuthInfo authInfo  = authInfoRepository.findByItemIdAndItemTypeAndAuthType(company.getId(), ResourceType.COMPANY.getText(),authenticationTypeEnum.getText());

        if(authInfo  == null){
            authInfo = new AuthInfo();
            authInfo.setStatus(AuthenticationStatusEnum.unCompleted.getText());
            authInfo.setItemId(company.getId());
            authInfo.setItemType(ResourceType.COMPANY.getText());
            authInfo.setAuthType(authenticationTypeEnum.getText());
            authInfo = authInfoRepository.save(authInfo);

        }
        return authInfo;
    }

    @Override
    @Transactional
    public AuthInfo userInfoAuthed(User user) {
        AuthInfo authInfo = authInfoRepository.findByItemIdAndItemTypeAndAuthType(user.getId(), ResourceType.USER.getText(), AuthenticationTypeEnum.个人信息认证.getText());

        if(authInfo != null){
            authInfo.setStatus(AuthenticationStatusEnum.completed.getText());
            return     authInfoRepository.save(authInfo);

        }else {
            return null;
        }

    }

    @Override
    @Transactional
    public AuthInfo companyInfoAuthed(User user) {
        AuthInfo authInfo = authInfoRepository.findByItemIdAndItemTypeAndAuthType(user.getCompanyId(), ResourceType.COMPANY.getText(), AuthenticationTypeEnum.公司信息认证.getText());

        authInfo.setStatus(AuthenticationStatusEnum.completed.getText());
        return     authInfoRepository.save(authInfo);

    }

    @Override
    @Transactional
    public AuthInfo getPhoneAuthInfoByUser(User user) {
        AuthInfo authInfos  = authInfoRepository.findByItemIdAndItemTypeAndAuthType(user.getId(), ResourceType.USER.getText(), AuthenticationTypeEnum.个人手机认证.getText());
        //List<AuthInfo> authInfos  = authInfoRepository.findByUserId(user.getId());

        if(authInfos == null){
            AuthInfo authInfo = new AuthInfo();
            authInfo.setStatus(AuthenticationStatusEnum.unCompleted.getText());
            authInfo.setUserId(user.getId());
            authInfo.setItemId(user.getId());
            authInfo.setItemType(ResourceType.USER.getText());
            authInfo.setAuthType(AuthenticationTypeEnum.个人手机认证.getText());
            authInfos = authInfoRepository.save(authInfo);
        }

        return authInfos;
    }

    @Override
    public AuthInfo getById(Integer id) {
        AuthInfo authInfo = authInfoRepository.findById(id).get();
        return  authInfo;
    }

    @Override
    @Transactional
    public OperationResult generateInvitedCode(String objectId, AuthorizationVerificationTypeEnum type, Company company) {


        AuthorizationVerification authorizationVerification = authorizationVerificationRepository.findByObjectIdAndStatus(objectId,AuthorizationVerificationStatusEnum.Valid.getText());
        if(authorizationVerification == null){
            authorizationVerification = new AuthorizationVerification();
            authorizationVerification.setObjectId(objectId);
            authorizationVerification.setStatus(AuthorizationVerificationStatusEnum.Valid.getText());
            authorizationVerification.setCompanyNo(company.getNo());
            authorizationVerification.setItemType(type.getText());

            authorizationVerification = authorizationVerificationRepository.save(authorizationVerification);
        }
        authorizationVerification.setCode(RandomStringUtils.randomNumeric(6).toUpperCase());
        authorizationVerification.setExpireDate(LocalDateTime.now().plusMinutes(60*2));



        return OperationResult.ok(authorizationVerification);
    }


    @Override

    public Page<AuthorizationVerification> getInvitedCodeCompany(Company company, Pageable pageable) {

        Page<AuthorizationVerification> page = authorizationVerificationRepository.findByCompanyNo(company.getNo(),pageable);


        return page;
    }

    @Override
    public AuthorizationVerification getValidAuthorizationVerification(String uuid) {
        AuthorizationVerification authorizationVerification = authorizationVerificationRepository.findByObjectIdAndStatus(uuid,AuthorizationVerificationStatusEnum.Valid.getText());

        return authorizationVerification;
    }
}
