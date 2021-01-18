package com.example.dm.service;


import com.example.dm.config.Constants;
import com.example.dm.domain_flow.AuthenticationInformation;
import com.example.dm.repository_flow.AuthenticationInformationRepository;


import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.format.DateTimeFormatter;

/**
 * Created by silence yuan on 2015/7/25.
 */

@Service
public class AuthenticationServiceImpl {

    @Autowired
    private AuthenticationInformationRepository authenticationInformationRepository;


    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");





    public Page<AuthenticationInformation> findAll(Pageable pageable) {
        return authenticationInformationRepository.findAll(pageable);

    }




    @Transactional
    public AuthenticationInformation create(String clientId) {
        AuthenticationInformation authenticationInformation = new AuthenticationInformation();
        authenticationInformation.setClientId(clientId);
        authenticationInformation.setRateLimit(Constants.StandardBucket);
        authenticationInformation.setAccessKey(RandomStringUtils.randomAlphanumeric(10));
        authenticationInformation.setSecretKey(RandomStringUtils.randomAlphanumeric(10));

        return authenticationInformationRepository.save(authenticationInformation);
    }

    public Page<AuthenticationInformation> findByClientId(String username, Pageable pageable) {
        return authenticationInformationRepository.findByClientId(username,pageable);
    }
}
