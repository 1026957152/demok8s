package com.coalvalue.employee.repository;




import com.coalvalue.employee.domain.entity.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface CompanyRepository extends JpaSpecificationExecutor<Company>, JpaRepository<Company, Integer>, PagingAndSortingRepository<Company, Integer> {


    Optional<Company> findById(Integer companyId);






    Company findByUuid(String objectUuid);


    List<Company> findByNameLike(String s);

    Page<Company> findByType(String companyTypeInspection, Pageable pageable);

    Company findByNo(String companyNo);

    Company findByName(String companyName);

}
