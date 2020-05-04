package com.coalvalue.employee.service;


import com.coalvalue.employee.domain.OperationResult;
import com.coalvalue.employee.domain.entity.AuthInfo;
import com.coalvalue.employee.domain.entity.AuthorizationVerification;
import com.coalvalue.employee.domain.entity.Company;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.enumType.AuthenticationTypeEnum;
import com.coalvalue.employee.enumType.AuthorizationVerificationTypeEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by silence yuan on 2015/7/25.
 */
public interface AuthenticationService extends BaseService {


    List<AuthInfo> getAuthInfoByUser(User user);

    List<AuthInfo> getAuthInfoByCompany(Company company);

    AuthInfo getAuthInfoByCompany(Company company, AuthenticationTypeEnum authenticationTypeEnum);

    AuthInfo userInfoAuthed(User user);

    AuthInfo companyInfoAuthed(User user);

    AuthInfo getPhoneAuthInfoByUser(User user);

    AuthInfo getById(Integer id);


    @Transactional
    OperationResult generateInvitedCode(String objectId, AuthorizationVerificationTypeEnum type, Company company);

    Page<AuthorizationVerification> getInvitedCodeCompany(Company company, Pageable pageable);


    AuthorizationVerification getValidAuthorizationVerification(String uuid);
}
