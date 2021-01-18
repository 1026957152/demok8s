package com.example.dm.service;



import com.example.dm.apidata.witV3.WitItem;
import com.example.dm.apidata.witV3.Witdata;
import com.example.dm.exception.MyBusinessException;
import com.example.dm.web.output.witV3._1_机构账户基本信息查询;
import com.example.dm.web.output.witV3._3_机构账户明细查询;
import org.springframework.data.domain.PageRequest;

import javax.servlet.http.HttpServletRequest;

//import com.gjj.api.apidata.ApiQuery;

/**
 * Created by silence yuan on 2015/7/25.
 */
public interface WitV3OrgsService {





    Witdata<_1_机构账户基本信息查询> 机构账户基本信息查询(Object principal, HttpServletRequest request, String id, WitItem query) throws MyBusinessException;


    Witdata<_1_机构账户基本信息查询> 机构账户基本信息查询_by_no(Object principal, HttpServletRequest request, String orgcode, WitItem query) throws MyBusinessException;

    Witdata<_1_机构账户基本信息查询> 机构账户基本信息查询_by_name(Object principal, HttpServletRequest request, String orgcode, WitItem query) throws MyBusinessException;

    Witdata<_3_机构账户明细查询> 机构账户明细查询(Object principal, HttpServletRequest request, String accountNo, WitItem query, PageRequest of) throws MyBusinessException;
}
