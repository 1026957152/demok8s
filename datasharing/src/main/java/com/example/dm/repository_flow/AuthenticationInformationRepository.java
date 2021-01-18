package com.example.dm.repository_flow;


import com.example.dm.domain_flow.AuthenticationInformation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface AuthenticationInformationRepository extends JpaRepository<AuthenticationInformation, Integer> {


    AuthenticationInformation findByAccessKey(String username);

    Page<AuthenticationInformation> findByClientId(String username, Pageable pageable);
}
