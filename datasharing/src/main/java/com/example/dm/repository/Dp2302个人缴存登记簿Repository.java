package com.example.dm.repository;


import com.example.dm.domain.Dp2302个人缴存登记簿;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface Dp2302个人缴存登记簿Repository extends JpaRepository<Dp2302个人缴存登记簿, Integer> {



    List<Dp2302个人缴存登记簿> findByAccnum个人账号(String trim);



/*
    CM001_单位基本资料表 findByUnitcustid单位客户号(String unitcustid_单位客户号);


    List<CM001_单位基本资料表> findByUnitcustid单位客户号In(List<String> collect);

    CM001_单位基本资料表 findByOrgcode组织机构代码(String id);

    List<CM001_单位基本资料表> findByUnitaccname单位名称Like(String orgcode);

    Long countByUnitaccname单位名称Like(String orgcode);*/
}
