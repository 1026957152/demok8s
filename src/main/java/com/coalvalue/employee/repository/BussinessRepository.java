package com.coalvalue.employee.repository;



import com.coalvalue.employee.domain.entity.Bussiness;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface BussinessRepository extends PagingAndSortingRepository<Bussiness, Integer> {


    List<Bussiness> findByCompanyId(String uuid);

    Bussiness findByCompanyIdAndName(String uuid, String text);

    Page<Bussiness> findByCompanyId(String uuid, Pageable pageable);

    Bussiness findByUuid(String id);

}
