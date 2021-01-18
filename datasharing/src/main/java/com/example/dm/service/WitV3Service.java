package com.example.dm.service;


/*import com.gjj.api.apidata.witV3.WitItem;
import com.gjj.api.apidata.witV3.Witdata;
import com.gjj.api.exception.MyBusinessException;
import com.gjj.api.web.output.witV3.*;*/
import com.example.dm.apidata.witV3.WitItem;
import com.example.dm.apidata.witV3.Witdata;
import com.example.dm.exception.MyBusinessException;
import com.example.dm.web.output.witV3.*;
import org.springframework.data.domain.PageRequest;

import javax.servlet.http.HttpServletRequest;

//import com.gjj.api.apidata.ApiQuery;

/**
 * Created by silence yuan on 2015/7/25.
 */
public interface WitV3Service {





    Witdata<_1_个人账户基本信息查询> 个人账户基本信息查询(Object principal, HttpServletRequest request, String id, WitItem query) throws MyBusinessException;

    Witdata<_4_个人贷款明细查询> 个人贷款明细查询(Object principal, HttpServletRequest request, String id, WitItem query) throws MyBusinessException;


    Witdata<_2_个人贷款基本信息查询> 个人贷款基本信息查询(Object principal, HttpServletRequest request, String id, WitItem query) throws MyBusinessException;

 //   Witdata<_2_个人贷款基本信息查询> 个人贷款基本信息查询20200426V2(Object principal, HttpServletRequest request, String id, WitItem query) throws MyBusinessException;

    Witdata<_2_个人贷款基本信息查询> 个人贷款基本信息查询V2_20200426(Object principal, HttpServletRequest request, String id, WitItem query) throws MyBusinessException;

    Witdata<_3_个人账户明细查询> 个人账户明细查询(Object principal, HttpServletRequest request, String accountNo, WitItem query, PageRequest of) throws MyBusinessException;


    Witdata<_5_不良信息记录> 红黑灰名单(Object principal, HttpServletRequest request, String loanNo, WitItem query) throws MyBusinessException;
}
