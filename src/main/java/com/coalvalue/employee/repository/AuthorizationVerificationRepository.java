package com.coalvalue.employee.repository;



import com.coalvalue.employee.domain.entity.AuthorizationVerification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface AuthorizationVerificationRepository extends JpaRepository<AuthorizationVerification, Integer> {


    AuthorizationVerification findByCompanyNoAndStatus(String companyNo, String text);

    Page<AuthorizationVerification> findByCompanyNo(String no, Pageable pageable);


    AuthorizationVerification findByCode(String code);

    AuthorizationVerification findByObjectId(String uuid);

    AuthorizationVerification findByObjectIdAndStatus(String uuid, String text);

    AuthorizationVerification findByCompanyNoAndCode(String companyNo, String code);
}
