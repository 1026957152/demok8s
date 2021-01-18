package com.example.dm.repository;


import com.example.dm.domain.Ln3301贷款还款计划;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface Ln3301贷款还款计划Repository extends JpaRepository<Ln3301贷款还款计划, Integer> {
    Ln3301贷款还款计划 findByContractcode合同代码OrderByCurrentterm当期期次Desc(String contractcode_合同代码);

    Optional<Ln3301贷款还款计划> findTop1ByContractcode合同代码OrderByCurrentterm当期期次Desc(String contractcode合同代码);




/*    List<CM001_单位基本资料表> findTop100By();

    CM001_单位基本资料表 findByChnl(String channelId);*/



/*
    CM001_单位基本资料表 findByUnitcustid单位客户号(String unitcustid_单位客户号);


    List<CM001_单位基本资料表> findByUnitcustid单位客户号In(List<String> collect);

    CM001_单位基本资料表 findByOrgcode组织机构代码(String id);

    List<CM001_单位基本资料表> findByUnitaccname单位名称Like(String orgcode);

    Long countByUnitaccname单位名称Like(String orgcode);*/
}
