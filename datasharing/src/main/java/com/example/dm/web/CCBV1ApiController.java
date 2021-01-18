package com.example.dm.web;


/*import com.gjj.api.apidata.Query;
import com.gjj.api.apidata.ccbV1.CcbRequestParams;
import com.gjj.api.apidata.ccbV1.Ccbdata;
import com.gjj.api.exception.ApiError;
import com.gjj.api.exception.MyBusinessException;
import com.gjj.api.service.AuthenticationServiceImpl;
import com.gjj.api.service.CCBV0ServiceImpl;
import com.gjj.api.service.CCBV1ServiceImpl;
import com.gjj.api.service.HistoryServiceImpl;*/
import com.example.dm.apidata.Query;
import com.example.dm.apidata.ccbV1.CcbRequestParams;
import com.example.dm.apidata.ccbV1.Ccbdata;
import com.example.dm.exception.ApiError;
import com.example.dm.exception.MyBusinessException;
import com.example.dm.service.CCBV1ServiceImpl;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.GitProperties;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.text.NumberFormat;

//import io.micrometer.core.instrument.MeterRegistry;
/*import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;*/


@RestController
@RequestMapping(value= "/v1/ccb")
@Api
    public class CCBV1ApiController /*extends HistoryServiceImpl*/ {
  //  String loancondition = """
   // """;

    protected transient Logger logger = LoggerFactory.getLogger(getClass());

/*    @Autowired
    private MeterRegistry registry;*/
   // @Autowired
    private GitProperties git;




    NumberFormat nf = NumberFormat.getPercentInstance();

/*
    @Autowired
    private CCBV0ServiceImpl ccbv0Service;*/
    @Autowired
    private CCBV1ServiceImpl customerService;
/*
    @Autowired
    private AuthenticationServiceImpl authenticationService;
*/




    @Autowired
    private HttpServletRequest request;

    @ApiOperation(value = "个人账户基本信息查询",httpMethod = "POST", notes="Operation Note")
    @PostMapping("/employees")
    @ResponseBody
    @ApiImplicitParams(value = {


            @ApiImplicitParam(name = "X-api-key", value = "accessKey", required = true,paramType="header", dataType = "String"),

            @ApiImplicitParam(name = "wtrjgh", value = "委托人机构号", required = true, dataType = "String"),

            @ApiImplicitParam(name = "wtrjgh", value = "委托人机构号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "wtrxm", value = "委托人名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "zjlx", value = "证件类型 1 身份证 2 军官证 3 护照 9 其他", required = true, dataType = "String",example = "1"),
            @ApiImplicitParam(name = "zjhm", value = "证件号码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "xm", value = "姓名", required = true, dataType = "String"),

    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "错误的请求", response = ApiError.class),
            @ApiResponse(code = 401, message = "未授权", response = ApiError.class),
            @ApiResponse(code = 404, message = "未找到"),

            @ApiResponse(code = 403, message = "未授权,禁止"),

            @ApiResponse(code = 407, message = "XX异常", response = ApiError.class),

            @ApiResponse(code = 500, message = "服务器内部错误", response = ApiError.class)
            })

    //@Cacheable(cacheNames="user", key="#id")



















    public Ccbdata 个人账户基本信息查询(
            @ApiParam(name = "wtrjgh", value = "wtrjgh") @RequestParam("wtrjgh") String wtrjgh,
            @ApiParam(name = "wtrxm", value = "wtrxm") @RequestParam(value = "wtrxm",required = false) String wtrxm,
            @ApiParam(name = "zjlx", value = "zjlx") @RequestParam("zjlx") String zjlx,
            @ApiParam(name = "zjhm", value = "zjhm") @RequestParam("zjhm") String zjhm,
            @ApiParam(name = "xm", value = "xm") @RequestParam("xm") String xm,

            Authentication authentication) throws MyBusinessException {

        System.out.println(authentication.getPrincipal());

        Query query = new Query();
        query.setWtrjgh(wtrjgh);
        query.setWtrxm(wtrxm);
        query.setZjlx(zjlx);
        query.setZjhm(zjhm);
        query.setXm(xm);


       return customerService.queryLoanee(authentication.getPrincipal(), request, query,zjhm);


    }






    @ApiOperation(value = "个人账户基本信息查询_json",httpMethod = "POST", notes="Operation Note")
    @PostMapping("/employees_json")
    @ResponseBody
    @ApiImplicitParams(value = {


            @ApiImplicitParam(name = "X-api-key", value = "accessKey", required = true,paramType="header", dataType = "String"),

            @ApiImplicitParam(name = "wtrjgh", value = "委托人机构号", required = true, dataType = "String"),

            @ApiImplicitParam(name = "wtrjgh", value = "委托人机构号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "wtrxm", value = "委托人名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "zjlx", value = "证件类型 1 身份证 2 军官证 3 护照 9 其他", required = true, dataType = "String",example = "1"),
            @ApiImplicitParam(name = "zjhm", value = "证件号码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "xm", value = "姓名", required = true, dataType = "String"),

    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "错误的请求", response = ApiError.class),
            @ApiResponse(code = 401, message = "未授权"),
            @ApiResponse(code = 404, message = "未找到", response = ApiError.class),

            @ApiResponse(code = 403, message = "拒绝访问"),

            @ApiResponse(code = 407, message = "XX异常", response = ApiError.class),

            @ApiResponse(code = 500, message = "服务器内部错误", response = ApiError.class)
    })

    //@Cacheable(cacheNames="user", key="#id")


    @Secured("ROLE_CCB")
    public Ccbdata 个人账户基本信息查询json(
            @Valid @RequestBody CcbRequestParams ccbRequestParams,


            Authentication authentication) throws MyBusinessException {

        System.out.println(authentication.getPrincipal());

        Query query = new Query();
        query.setWtrjgh(ccbRequestParams.getWtrjgh());
        query.setWtrxm(ccbRequestParams.getWtrxm());
        query.setZjlx(ccbRequestParams.getZjlx());
        query.setZjhm(ccbRequestParams.getZjhm());
        query.setXm(ccbRequestParams.getXm());


        return customerService.queryLoanee(authentication.getPrincipal(), request,query,ccbRequestParams.getZjhm());
    }


}
