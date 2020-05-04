package com.coalvalue.employee.repository;


import com.coalvalue.employee.domain.entity.Person;
import com.coalvalue.employee.domain.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {



    public Person queryPersonByRealName(String realName);



    @Query("from Person a where a.userNo = :id")
    Person findByUserNo(@Param("id") String id);

    @Query("select u from User u, Person p where u.userId = p.userNo and p.id= :personId")
    User getUserByPersonId(@Param("personId") Integer personId);

    Person findByIdAndCompanyId(Integer id, Integer currentCompanyId);


    List<Person> findByCompanyId(Integer companyId);

    Page<Person> findByCompanyIdAndIsOvert(Integer companyId, boolean b, Pageable pageRequest);


    Optional<Person> findById(Integer personId);

    Page<Person> findByCompanyId(Integer companyId, Pageable pageable);

    Person findByUserId(String uuid);

}
