package com.coalvalue.employee.repository;


import com.coalvalue.employee.domain.entity.AuthInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface AuthInfoRepository extends JpaRepository<AuthInfo, Integer> {



    List<AuthInfo> findByUserId(Integer id);

    List<AuthInfo> findByPersonId(Integer id);

    List<AuthInfo> findByUserIdAndAuthType(Integer id, String user_authentication_type_phone);

    Page<AuthInfo> findByUserId(Integer id, Pageable pageable);



    List<AuthInfo> findByItemIdAndItemType(Integer id, String text);

    AuthInfo findByItemIdAndItemTypeAndAuthType(Integer id, String id1, String text);

    Page<AuthInfo> findByItemIdAndItemType(Integer id, String text, Pageable pageRequest);

    Optional<AuthInfo> findById(Integer id);
}
