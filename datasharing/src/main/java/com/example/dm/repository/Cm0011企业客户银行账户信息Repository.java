package com.example.dm.repository;


import com.example.dm.domain.Cm0011企业客户银行账户信息;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface Cm0011企业客户银行账户信息Repository extends JpaRepository<Cm0011企业客户银行账户信息, Integer> {
    List<Cm0011企业客户银行账户信息> findByUnitcustid单位客户号(String unitcustid单位客户号);


/*    List<CM001_单位基本资料表> findTop100By();

    CM001_单位基本资料表 findByChnl(String channelId);*/



/*
    CM001_单位基本资料表 findByUnitcustid单位客户号(String unitcustid_单位客户号);


    List<CM001_单位基本资料表> findByUnitcustid单位客户号In(List<String> collect);

    CM001_单位基本资料表 findByOrgcode组织机构代码(String id);

    List<CM001_单位基本资料表> findByUnitaccname单位名称Like(String orgcode);

    Long countByUnitaccname单位名称Like(String orgcode);*/
}
