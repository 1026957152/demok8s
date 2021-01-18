package com.example.dm.repository;


import com.example.dm.domain.Cm0001企业客户基本信息表;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface Cm0001企业客户基本信息表Repository extends JpaRepository<Cm0001企业客户基本信息表, Integer> {

    Cm0001企业客户基本信息表 findByUnitcustid单位客户号(String custid个人客户号);



/*    List<CM001_单位基本资料表> findTop100By();

    CM001_单位基本资料表 findByChnl(String channelId);*/



/*
    CM001_单位基本资料表 findByUnitcustid单位客户号(String unitcustid_单位客户号);


    List<CM001_单位基本资料表> findByUnitcustid单位客户号In(List<String> collect);

    CM001_单位基本资料表 findByOrgcode组织机构代码(String id);

    List<CM001_单位基本资料表> findByUnitaccname单位名称Like(String orgcode);

    Long countByUnitaccname单位名称Like(String orgcode);*/
}
