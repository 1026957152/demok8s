package com.coalvalue.employee.repository;


import com.coalvalue.employee.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface UserRepository extends JpaSpecificationExecutor<User>, JpaRepository<User, Integer> {

    public User getUserByUserName(String name);

    public User getUserByEmailAddress(String emailAddr);

    @Query("select u from User u where u.emailAddress= :email and u.password= :password")
    public User userLogin(@Param("email") String email, @Param("password") String password);

    @Query("select u from User u where u.mobile= :mobile and u.password= :password")
    User userLoginByMobileNo(@Param("mobile") String userId, @Param("password") String pwd);

    User getUserByMobile(String phone);


    User findByUserName(String username);

    User findByEmailAddress(String username);




    @Query("select u from User u,Person p  where  u.userId= p.userNo and p.companyId = :id")
    List<User> findCompanyUser(@Param("id") Integer id);

    List<User> findByMobile(String s);

    Optional<User> findById(Integer id);

    User findByUserId(String s);


    List<User> findByMobileAndStatus(String userName, String userStatusActive);


    User findByUuid(String uuid);

}
