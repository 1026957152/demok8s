package com.example.dm.repository;


import com.example.dm.domain.Dp0104个人客户基本信息;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface Dp0104个人客户基本信息Repository extends JpaRepository<Dp0104个人客户基本信息, Integer> {
    Dp0104个人客户基本信息 findByAccnum个人账号(String accnum个人账号);

    List<Dp0104个人客户基本信息> findByZjhm证件号码AndZjlx证件类型(String certinum, String text);

    List<Dp0104个人客户基本信息> findTop100By();








/*
    CM001_单位基本资料表 findByUnitcustid单位客户号(String unitcustid_单位客户号);


    List<CM001_单位基本资料表> findByUnitcustid单位客户号In(List<String> collect);

    CM001_单位基本资料表 findByOrgcode组织机构代码(String id);

    List<CM001_单位基本资料表> findByUnitaccname单位名称Like(String orgcode);

    Long countByUnitaccname单位名称Like(String orgcode);*/
}
