package com.example.dm.repository;


import com.example.dm.domain.Cm0024个人客户地址信息;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface Cm0024个人客户地址信息Repository extends JpaRepository<Cm0024个人客户地址信息, Integer> {

    Optional<Cm0024个人客户地址信息> findTop1ByCustid个人客户号OrderByTransdate业务发生日期Desc(String custid个人客户号);

    List<Cm0024个人客户地址信息> findByCustid个人客户号(String custid个人客户号);



/*    List<CM001_单位基本资料表> findTop100By();

    CM001_单位基本资料表 findByChnl(String channelId);*/



/*
    CM001_单位基本资料表 findByUnitcustid单位客户号(String unitcustid_单位客户号);


    List<CM001_单位基本资料表> findByUnitcustid单位客户号In(List<String> collect);

    CM001_单位基本资料表 findByOrgcode组织机构代码(String id);

    List<CM001_单位基本资料表> findByUnitaccname单位名称Like(String orgcode);

    Long countByUnitaccname单位名称Like(String orgcode);*/
}
