package com.example.dm.web;


import com.example.dm.apidata.witV3.WitItem;
import com.example.dm.apidata.witV3.Witdata;
import com.example.dm.enumT.ErrorCodeEnum;
import com.example.dm.exception.ApiError;
import com.example.dm.exception.BookNotFoundException;
import com.example.dm.exception.MyBusinessException;
import com.example.dm.service.AuthenticationServiceImpl;
import com.example.dm.service.WitV3OrgsService;
import com.example.dm.service.WitV3Service;
import com.example.dm.web.output.witV3.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/*import com.gjj.api.apidata.witV3.*;
import com.gjj.api.enumT.ErrorCodeEnum;
import com.gjj.api.exception.ApiError;
import com.gjj.api.exception.BookNotFoundException;
import com.gjj.api.exception.MyBusinessException;
import com.gjj.api.service.*;
import com.gjj.api.web.output.witV3.*;*/
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.GitProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;
import java.util.Map;

//import io.micrometer.core.instrument.MeterRegistry;
/*import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;*/


/*@EnableResourceServer*/
@RestController
@RequestMapping(value= "/v3/wit")
@Api
    public class WitV3Controller extends HistoryServiceImpl {
  //  String loancondition = """
   // """;

    protected transient Logger logger = LoggerFactory.getLogger(getClass());

/*    @Autowired
    private MeterRegistry registry;*/
   // @Autowired
    private GitProperties git;
  //  @Autowired
    private WitV3OrgsService witV3OrgsService;



    NumberFormat nf = NumberFormat.getPercentInstance();


 //   @Autowired
    private WitV3Service witV2Service;
    @Autowired
    private AuthenticationServiceImpl authenticationService;


    @Autowired

    private HttpServletRequest request;
    // Find
    @GetMapping("/books")
    @ResponseBody
    @ApiIgnore
    Map findOne(/*@PathVariable Long id*/) {
        if(true){
            throw new BookNotFoundException(4l);
        }
        return null;


    }
    @RequestMapping(value = "/example", method = RequestMethod.GET)

    @ApiIgnore
    public void example(HttpServletRequest request, HttpServletResponse response)  {
        response.setStatus(HttpStatus.TOO_MANY_REQUESTS.value()); // 429
        response.addHeader("X-Rate-Limit-Retry-After-Milliseconds",
                Long.toString(12));
        ApiError apiError = new ApiError(
                HttpStatus.TOO_MANY_REQUESTS, "ex.getLocalizedMessage()", "error occurred");
        ;
        String json = null;
        try {
            json = new ObjectMapper().writeValueAsString(apiError);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    @ApiOperation(value = "个人账户基本信息查询",httpMethod = "GET",tags="A.基础信息", notes="Operation Note")
    @GetMapping("/employees/{id}/accounts")
    @ResponseBody
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "X-api-key", value = "accessKey", required = true,paramType="header", dataType = "String"),

            @ApiImplicitParam(name = "id", value = "身份证号码", required = true, dataType = "String"),
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "业务逻辑异常", response = ApiError.class),
            @ApiResponse(code = 407, message = "XX异常", response = ApiError.class),
            @ApiResponse(code = 500, message = "服务器内部错误", response = ApiError.class)
            })
    public Witdata<_1_个人账户基本信息查询> 个人账户基本信息查询(@ApiParam(name = "id", value = "id") @PathVariable("id") String id,
                      /*                   @RequestParam("apiId") String appid,
                                         @RequestParam("digest") String digest,
                                         @RequestParam("timestamp") String timestamp,*/
                                         @Valid WitItem query,
                                             Errors errors,

                                             Authentication authentication) throws MyBusinessException {
        if (errors.hasErrors()) {
            return null;//ReturnResultOutput.情况4_入参数格式错误(errors.toString());
            //  return new ResponseEntity(new ApiErrors(errors), HttpStatus.BAD_REQUEST);
        }

        System.out.println("----------------- "+ query.toString());

        return witV2Service.个人账户基本信息查询(authentication.getPrincipal(),request,id,query);
    }


    @ApiOperation(value = "个人账户明细查询",httpMethod = "GET",tags="B.明细", notes="Operation Note")
    @GetMapping("/accounts/{accountNo}/detailedList")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-api-key", value = "accessKey", required = true,paramType="header", dataType = "String"),

            @ApiImplicitParam(name = "accountNo", value = "accountNo", required = true, dataType = "String"),
/*           @ApiImplicitParam(name = "pagenum", value = "页数", required = true, dataType = "String"),
            @ApiImplicitParam(name = "pagerows", value = "数量", required = true, dataType = "String"),
            @ApiImplicitParam(name = "totalcount", value = "总数", required = true, dataType = "String")*/
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "业务逻辑异常", response = ApiError.class),
            @ApiResponse(code = 407, message = "XX异常", response = ApiError.class),

            @ApiResponse(code = 500, message = "服务器内部错误", response = ApiError.class)
    })
    @ResponseBody
    public Witdata<_3_个人账户明细查询> 个人账户明细查询(@PathVariable("accountNo") String accountNo,
                                         @ApiParam(hidden = true) @Valid @ModelAttribute WitItem query,
                                         Errors errors,
                                         Authentication authentication) throws MyBusinessException {
        if (errors.hasErrors()) {
            return null;//ReturnResultOutput.情况4_入参数格式错误(errors.toString());
            //  return new ResponseEntity(new ApiErrors(errors), HttpStatus.BAD_REQUEST);
        }
        System.out.println("----------------- "+ query.toString());
        return witV2Service.个人账户明细查询(authentication.getPrincipal(),request,accountNo,query, PageRequest.of(1,10));
    }


    @ApiOperation(value = "个人贷款基本信息查询",httpMethod = "GET",tags="A.基础信息", notes="Operation Note")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "X-api-key", value = "accessKey", required = true,paramType="header", dataType = "String"),

            @ApiImplicitParam(name = "id", value = "身份证号码", required = true, dataType = "String"),
    })
    @GetMapping("/employees/{id}/loans")
    @ApiResponses({
            @ApiResponse(code = 400, message = "业务逻辑异常", response = ApiError.class),
            @ApiResponse(code = 407, message = "XX异常", response = ApiError.class),

            @ApiResponse(code = 500, message = "服务器内部错误", response = ApiError.class)
    })
    @ResponseBody
    public Witdata<_2_个人贷款基本信息查询> 个人贷款基本信息查询(@PathVariable("id") String id,
                                             @Valid WitItem query,
                                             Errors errors,
                                             Authentication authentication) throws MyBusinessException {
        if (errors.hasErrors()) {
            return null;// ReturnResultOutput.情况4_入参数格式错误(errors.toString());
            //  return new ResponseEntity(new ApiErrors(errors), HttpStatus.BAD_REQUEST);
        }

        System.out.println("----------------- "+ query.toString());

        return witV2Service.个人贷款基本信息查询V2_20200426(authentication.getPrincipal(),request,id,query);
    }





    @ApiOperation(value = "个人贷款明细查询",httpMethod = "GET",tags="B.明细", notes="Operation Note")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "X-api-key", value = "accessKey", required = true,paramType="header", dataType = "String"),

            @ApiImplicitParam(name = "loanNo", value = "借款合同编号", required = true, dataType = "String"),
    })
    @GetMapping("/loans/{loanNo}/detailedList")
    @ApiResponses({
            @ApiResponse(code = 400, message = "业务逻辑异常", response = ApiError.class),
            @ApiResponse(code = 407, message = "XX异常", response = ApiError.class),
            @ApiResponse(code = 500, message = "服务器内部错误", response = ApiError.class)
    })
    @ResponseBody
    public Witdata<_4_个人贷款明细查询> 个人贷款明细查询(@PathVariable("loanNo") String loanNo,
                                         @Valid WitItem query,
                                         Errors errors,
                                         Authentication authentication) throws MyBusinessException {
       if (errors.hasErrors()) {
            return null;//ReturnResultOutput.情况4_入参数格式错误(errors.toString());
            //  return new ResponseEntity(new ApiErrors(errors), HttpStatus.BAD_REQUEST);
        }
        System.out.println("----------------- "+ query.toString());
        return witV2Service.个人贷款明细查询(authentication.getPrincipal(),request,loanNo,query);
    }


    @ApiOperation(value = "不良信用信息记录",httpMethod = "GET",tags="Z.不良信用信息记录", notes="Operation Note")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "X-api-key", value = "accessKey", required = true,paramType="header", dataType = "String"),

            @ApiImplicitParam(name = "id", value = "身份证号码", required = true, dataType = "String"),
    })
    @GetMapping("/employees/{id}/badCreditRecord")
    @ApiResponses({
            @ApiResponse(code = 400, message = "业务逻辑异常", response = ApiError.class),
            @ApiResponse(code = 407, message = "XX异常", response = ApiError.class),

            @ApiResponse(code = 500, message = "服务器内部错误", response = ApiError.class)
    })
    @ResponseBody
    public Witdata<_5_不良信息记录> 红黑灰名单(@PathVariable("id") String id,
                                    @Valid WitItem query,
                                    Errors errors,
                                    Authentication authentication) throws MyBusinessException {

        if (errors.hasErrors()) {
            return null;//ReturnResultOutput.情况4_入参数格式错误(errors.toString());
            //  return new ResponseEntity(new ApiErrors(errors), HttpStatus.BAD_REQUEST);
        }
        System.out.println("----------------- "+ query.toString());
        return witV2Service.红黑灰名单(authentication.getPrincipal(),request,id,query);
    }


    public static String getSignature(String s) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
//        String Token = "O-xJVg7ZEXrtjWDNhzu05R7iZtyyXmv6NGt-xymKg0eOLCwwBCIgBBaDqJabzbPVCez1BvcI8q7blDGy4ZeCQQ";
        String key = "O-xJVg7ZEXrtjWDNhzu05R7iZtyyXmv6NGt-xymKg0eOLCwwBCIgBBaDqJabzbPVCez1BvcI8q7blDGy4ZeCQQ";
        System.out.println(key);
        String request = s.toLowerCase();
        Mac mac = Mac.getInstance("HmacSHA1");
        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "HmacSHA1");
        mac.init(keySpec);
        mac.update(request.getBytes());
        byte[] encryptedBytes = mac.doFinal();
        return null;//Base64.encodeBase64String(encryptedBytes);
    }































    @ApiOperation(value = "机构账户信息",httpMethod = "GET",tags="A.基础信息", notes="unit_name，unit_account_no，org_code 仅出现一个")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "X-api-key", value = "accessKey", required = true,paramType="header", dataType = "String"),
            @ApiImplicitParam(name = "unit_name", value = "单位名称", required = false, dataType = "String"),
            @ApiImplicitParam(name = "unit_account_no", value = "单位账号", required = false, dataType = "String"),

            @ApiImplicitParam(name = "org_code", value = "Orgcode组织机构代码", required = false, dataType = "String"),
    })
    @GetMapping("/orgs")
    @ApiResponses({
            @ApiResponse(code = 400, message = "业务逻辑异常", response = ApiError.class),
            @ApiResponse(code = 407, message = "XX异常", response = ApiError.class),

            @ApiResponse(code = 500, message = "服务器内部错误", response = ApiError.class)
    })
    @ResponseBody
    public Witdata<_1_机构账户基本信息查询> 机构账户基本信息查询(@RequestParam(value = "org_code",required = false) String orgcode,
                                             @RequestParam(value = "unit_name",required = false) String unit_name,
                                             @RequestParam(value = "unit_account_no",required = false) String unit_account_no,
                                             @Valid WitItem query,
                                             Errors errors,
                                             Authentication authentication) throws MyBusinessException {
        if (errors.hasErrors()) {
            return null;// ReturnResultOutput.情况4_入参数格式错误(errors.toString());
            //  return new ResponseEntity(new ApiErrors(errors), HttpStatus.BAD_REQUEST);
        }

        if(unit_account_no!= null){
            return witV3OrgsService.机构账户基本信息查询_by_name(authentication.getPrincipal(),request,orgcode,query);

        }
        if(unit_account_no == null && unit_name != null && unit_account_no == null){
            return witV3OrgsService.机构账户基本信息查询_by_name(authentication.getPrincipal(),request,unit_name,query);

        }
        System.out.println("----------------- "+ query.toString());
        if(unit_account_no == null && unit_name == null && unit_account_no != null){
            return witV3OrgsService.机构账户基本信息查询_by_no(authentication.getPrincipal(),request,unit_account_no,query);

        }
        throw new MyBusinessException("参数错误，三个参数当前仅出现一个", ErrorCodeEnum.入参格式错误);

    }




    @ApiOperation(value = "机构账户明细查询",httpMethod = "GET",tags="B.明细", notes="Operation Note")
    @GetMapping("/orgs/{accountNo}/detailedList")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-api-key", value = "accessKey", required = true,paramType="header", dataType = "String"),

            @ApiImplicitParam(name = "accountNo", value = "单位公积金账号", required = true, dataType = "String"),
/*           @ApiImplicitParam(name = "pagenum", value = "页数", required = true, dataType = "String"),
            @ApiImplicitParam(name = "pagerows", value = "数量", required = true, dataType = "String"),
            @ApiImplicitParam(name = "totalcount", value = "总数", required = true, dataType = "String")*/
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "业务逻辑异常", response = ApiError.class),
            @ApiResponse(code = 407, message = "XX异常", response = ApiError.class),

            @ApiResponse(code = 500, message = "服务器内部错误", response = ApiError.class)
    })
    @ResponseBody
    public Witdata<_3_机构账户明细查询> 机构账户明细查询(@PathVariable("accountNo") String accountNo,
                                         @ApiParam(hidden = true) @Valid @ModelAttribute WitItem query,
                                         Errors errors,
                                         Authentication authentication) throws MyBusinessException {
        if (errors.hasErrors()) {
            return null;//ReturnResultOutput.情况4_入参数格式错误(errors.toString());
            //  return new ResponseEntity(new ApiErrors(errors), HttpStatus.BAD_REQUEST);
        }
        System.out.println("----------------- "+ query.toString());

        return witV3OrgsService.机构账户明细查询(authentication.getPrincipal(),request,accountNo,query, PageRequest.of(1,10));
    }



}
