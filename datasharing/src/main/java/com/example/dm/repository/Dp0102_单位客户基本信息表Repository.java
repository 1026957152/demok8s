package com.example.dm.repository;


import com.example.dm.domain.Dp0102_单位客户基本信息表;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface Dp0102_单位客户基本信息表Repository extends JpaRepository<Dp0102_单位客户基本信息表, Integer> {
    Dp0102_单位客户基本信息表 findByUnitaccnum单位账号(String unitaccnum单位账号);

    Dp0102_单位客户基本信息表 findBySocietycreditcode统一社会信用代码(String orgcode);



/*    List<CM001_单位基本资料表> findTop100By();

    CM001_单位基本资料表 findByChnl(String channelId);*/



/*
    CM001_单位基本资料表 findByUnitcustid单位客户号(String unitcustid_单位客户号);


    List<CM001_单位基本资料表> findByUnitcustid单位客户号In(List<String> collect);

    CM001_单位基本资料表 findByOrgcode组织机构代码(String id);

    List<CM001_单位基本资料表> findByUnitaccname单位名称Like(String orgcode);

    Long countByUnitaccname单位名称Like(String orgcode);*/
}
