package com.example.dm.web;


import com.example.dm.apidata.PerClientRateLimitInterceptor;
import com.example.dm.apidata.ccbV1.CcbItem;
import com.example.dm.domain_flow.AuthenticationInformation;
import com.example.dm.domain_flow.QuickLog;
import com.example.dm.exception.MyBusinessException;
import com.example.dm.repository_flow.AuthenticationInformationRepository;
import com.example.dm.repository_flow.QuickLogRepository;
import com.example.dm.service.AuthenticationServiceImpl;
import com.example.dm.service.LogServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
/*import com.gjj.api.apidata.PerClientRateLimitInterceptor;
import com.gjj.api.apidata.ccbV1.CcbItem;
import com.gjj.api.domain_flow.AuthenticationInformation;
import com.gjj.api.domain_flow.QuickLog;
import com.gjj.api.exception.MyBusinessException;
import com.gjj.api.repository_flow.AuthenticationInformationRepository;
import com.gjj.api.repository_flow.QuickLogRepository;
import com.gjj.api.service.AuthenticationServiceImpl;
import com.gjj.api.service.HistoryServiceImpl;
import com.gjj.api.service.LogServiceImpl;*/
import com.google.common.collect.ArrayTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Table;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.GitProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.beans.PropertyDescriptor;
import java.text.NumberFormat;
import java.util.*;
import java.util.function.Function;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;


@RestController
@RequestMapping()
    public class IndexController extends HistoryServiceImpl {
  //  String loancondition = "
   // ";

    protected transient Logger logger = LoggerFactory.getLogger(this.getClass());


/*
   @Autowired
    private GitProperties git;
*/


    @Autowired
    private AuthenticationServiceImpl authenticationService;


    NumberFormat nf = NumberFormat.getPercentInstance();


    @Autowired
    private AuthenticationInformationRepository authenticationInformationRepository;


    @Autowired
    private LogServiceImpl logService;

    @Autowired
    private QuickLogRepository quickLogRepository;
    public Map CEB() throws MyBusinessException {


        Map modelAndView = new HashMap();
        modelAndView.put("name","个人账户基本信息查询");


        String authInfo  = linkTo(methodOn(CCBV1ApiController.class).个人账户基本信息查询( null,null,null,null,null,null)).toUri().getRawPath();


        modelAndView.put("articles",Arrays.asList(
                Map.of("name","请求URL","value",authInfo),
                Map.of("name","请求方式","value","POST"),
                Map.of("name","返回格式","value","JSON"),
                Map.of("name","导则接口分类","value","信息查询类服务2"),
                Map.of("name","说明","value","详见 swagger api  ")

/*1.	登录后可以调用该功能，注意公共信息项中渠道登录用户名，渠道登录用户名类型，需要按登录时信息如实上传，是否加密请查看公共信息项说明。
        2.	标准化接口要求渠道上传信息项在ybmapMessage变量中，其中需要明确标准化接口查询上传要素信息，“cxlx”查询类型，“cxlxz”查询要素值。
        3.	查询类型为“cxlx”为“03” 公积金个人账号。
        4.	如需使用此它参数作为查询条件，请跟据各中心核心业务不同自行组合上传参数到ybmapMessage变量中，默认为JSON格式字符串，可跟据实际情况上传。
        5.	明细查询返回数据应按日期降序排序，最近发生的排在最前面。是否分页处理请根据上传信息项中"ispaging"进行控制。
        6.	查询明细数据项不包含提取业务业数据。*/

        ));
        {


            List<Object> headerRowTable
                    = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
            List<Object> universityRowTable
                    = Lists.newArrayList("cxlx", "cxlxz","pagenum","pagerows","startdate","enddate","ispaging");
            List<Object> courseColumnTables
                    = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
            Table<Object, Object, Integer> universityCourseSeatTable
                    = ArrayTable.create(universityRowTable, courseColumnTables);
 /*           universityCourseSeatTable.put("Mumbai", "Chemical", 120);
            universityCourseSeatTable.put("Mumbai", "IT", 60);
            universityCourseSeatTable.put("Harvard", "Electrical", 60);
            universityCourseSeatTable.put("Harvard", "IT", 120);*/

            // modelAndView.put("parametersUp",universityCourseSeatTable);
        }



        {
            List<Object> headerRowTable
                    = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
            List<Object> universityRowTable
                    = Lists.newArrayList("cxlx", "cxlxz","pagenum","pagerows","startdate","enddate","ispaging");
            List<Object> courseColumnTables
                    = Lists.newArrayList("数据项代码", "数据项名称","数据项内容","数据类型","数据格式","应符合的相关标准及规定");
            Table<Object, Object, String> universityCourseSeatTable
                    = ArrayTable.create(universityRowTable, courseColumnTables);


            universityCourseSeatTable.put("cxlx", "数据项代码", "cxlx");
            universityCourseSeatTable.put("cxlx", "数据项名称", "记账日期");
            universityCourseSeatTable.put("cxlx", "数据项内容", "个人业务明细账记账日期");
            universityCourseSeatTable.put("cxlx", "数据类型", "字符型");
            universityCourseSeatTable.put("cxlx", "数据格式", "YYYYMMDD");
            universityCourseSeatTable.put("cxlx", "应符合的相关标准及规定", "《数据元和交换格式 信息交换日期和时间表示法》GB/T 7408");



            BeanUtils.getPropertyDescriptors(CcbItem.class);

            PropertyDescriptor[] pds = BeanUtils.getPropertyDescriptors(CcbItem.class);
            for(PropertyDescriptor pd : pds) {
                System.out.println(pd.getName());
            }



/*            E_DP007_个人分户账_证件类型.values();
            E_DP007_个人分户账_个人账户状态;
            E_CM001_单位基本资料表_单位性质;
                private String 	__ywzl_20_业务种类_Y;//
                "01 基本公积金
               02 补充公积金
                03 住房补贴
                04 二次补贴"

            data.set__zzlmkbz_42_制作联名卡标志_O("??");
                       0 否
                       1 是"

            data.set__lmkzkztdm_43_联名卡制卡状态代码_O("??");
            02 已制卡
            03 不制卡
            04 待制卡
            05 制卡中"
            E_DP005_单位分户账_单位账户状态*/





            //modelAndView.put("parametersDown",universityCourseSeatTable.rowMap());

        }

        return modelAndView;
    }

    public Map CCB() throws MyBusinessException {


        Map modelAndView = new HashMap();
        modelAndView.put("name","个人账户基本信息查询");


        String authInfo  = linkTo(methodOn(CCBV1ApiController.class).个人账户基本信息查询( null,null,null,null,null,null)).toUri().getRawPath();


        modelAndView.put("articles",Arrays.asList(
                Map.of("name","请求URL","value",authInfo),
                Map.of("name","请求方式","value","POST"),
                Map.of("name","返回格式","value","JSON"),
                Map.of("name","导则接口分类","value","信息查询类服务2"),
                Map.of("name","说明","value","详见 swagger api  ")

/*1.	登录后可以调用该功能，注意公共信息项中渠道登录用户名，渠道登录用户名类型，需要按登录时信息如实上传，是否加密请查看公共信息项说明。
        2.	标准化接口要求渠道上传信息项在ybmapMessage变量中，其中需要明确标准化接口查询上传要素信息，“cxlx”查询类型，“cxlxz”查询要素值。
        3.	查询类型为“cxlx”为“03” 公积金个人账号。
        4.	如需使用此它参数作为查询条件，请跟据各中心核心业务不同自行组合上传参数到ybmapMessage变量中，默认为JSON格式字符串，可跟据实际情况上传。
        5.	明细查询返回数据应按日期降序排序，最近发生的排在最前面。是否分页处理请根据上传信息项中"ispaging"进行控制。
        6.	查询明细数据项不包含提取业务业数据。*/

        ));
        {


            List<Object> headerRowTable
                    = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
            List<Object> universityRowTable
                    = Lists.newArrayList("cxlx", "cxlxz","pagenum","pagerows","startdate","enddate","ispaging");
            List<Object> courseColumnTables
                    = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
            Table<Object, Object, Integer> universityCourseSeatTable
                    = ArrayTable.create(universityRowTable, courseColumnTables);
 /*           universityCourseSeatTable.put("Mumbai", "Chemical", 120);
            universityCourseSeatTable.put("Mumbai", "IT", 60);
            universityCourseSeatTable.put("Harvard", "Electrical", 60);
            universityCourseSeatTable.put("Harvard", "IT", 120);*/

           // modelAndView.put("parametersUp",universityCourseSeatTable);
        }



        {
            List<Object> headerRowTable
                    = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
            List<Object> universityRowTable
                    = Lists.newArrayList("cxlx", "cxlxz","pagenum","pagerows","startdate","enddate","ispaging");
            List<Object> courseColumnTables
                    = Lists.newArrayList("数据项代码", "数据项名称","数据项内容","数据类型","数据格式","应符合的相关标准及规定");
            Table<Object, Object, String> universityCourseSeatTable
                    = ArrayTable.create(universityRowTable, courseColumnTables);


            universityCourseSeatTable.put("cxlx", "数据项代码", "cxlx");
            universityCourseSeatTable.put("cxlx", "数据项名称", "记账日期");
            universityCourseSeatTable.put("cxlx", "数据项内容", "个人业务明细账记账日期");
            universityCourseSeatTable.put("cxlx", "数据类型", "字符型");
            universityCourseSeatTable.put("cxlx", "数据格式", "YYYYMMDD");
            universityCourseSeatTable.put("cxlx", "应符合的相关标准及规定", "《数据元和交换格式 信息交换日期和时间表示法》GB/T 7408");



            BeanUtils.getPropertyDescriptors(CcbItem.class);

            PropertyDescriptor[] pds = BeanUtils.getPropertyDescriptors(CcbItem.class);
            for(PropertyDescriptor pd : pds) {
                System.out.println(pd.getName());
            }



/*            E_DP007_个人分户账_证件类型.values();
            E_DP007_个人分户账_个人账户状态;
            E_CM001_单位基本资料表_单位性质;
                private String 	__ywzl_20_业务种类_Y;//
                "01 基本公积金
               02 补充公积金
                03 住房补贴
                04 二次补贴"

            data.set__zzlmkbz_42_制作联名卡标志_O("??");
                       0 否
                       1 是"

            data.set__lmkzkztdm_43_联名卡制卡状态代码_O("??");
            02 已制卡
            03 不制卡
            04 待制卡
            05 制卡中"
            E_DP005_单位分户账_单位账户状态*/





            //modelAndView.put("parametersDown",universityCourseSeatTable.rowMap());

        }

        return modelAndView;
    }
    public Map 个人账户基本信息查询() throws MyBusinessException {


        Map modelAndView = new HashMap();
        modelAndView.put("name","个人账户基本信息查询");


        String authInfo  ="";// linkTo(methodOn(WitV2Controller.class).个人账户基本信息查询( null,null,null,null)).toUri().getRawPath();


       modelAndView.put("articles",Arrays.asList(
                Map.of("name","请求URL","value",authInfo),
                Map.of("name","请求方式","value","POST"),
                Map.of("name","返回格式","value","JSON"),
                Map.of("name","导则接口分类","value","信息查询类服务2"),
                Map.of("name","说明","value","")

/*1.	登录后可以调用该功能，注意公共信息项中渠道登录用户名，渠道登录用户名类型，需要按登录时信息如实上传，是否加密请查看公共信息项说明。
        2.	标准化接口要求渠道上传信息项在ybmapMessage变量中，其中需要明确标准化接口查询上传要素信息，“cxlx”查询类型，“cxlxz”查询要素值。
        3.	查询类型为“cxlx”为“03” 公积金个人账号。
        4.	如需使用此它参数作为查询条件，请跟据各中心核心业务不同自行组合上传参数到ybmapMessage变量中，默认为JSON格式字符串，可跟据实际情况上传。
        5.	明细查询返回数据应按日期降序排序，最近发生的排在最前面。是否分页处理请根据上传信息项中"ispaging"进行控制。
        6.	查询明细数据项不包含提取业务业数据。*/

        ));
        {


            List<Object> headerRowTable
                    = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
            List<Object> universityRowTable
                    = Lists.newArrayList("cxlx", "cxlxz","pagenum","pagerows","startdate","enddate","ispaging");
            List<Object> courseColumnTables
                    = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
            Table<Object, Object, Integer> universityCourseSeatTable
                    = ArrayTable.create(universityRowTable, courseColumnTables);
 /*           universityCourseSeatTable.put("Mumbai", "Chemical", 120);
            universityCourseSeatTable.put("Mumbai", "IT", 60);
            universityCourseSeatTable.put("Harvard", "Electrical", 60);
            universityCourseSeatTable.put("Harvard", "IT", 120);*/

            modelAndView.put("parametersUp",universityCourseSeatTable);
        }



        {
            List<Object> headerRowTable
                    = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
            List<Object> universityRowTable
                    = Lists.newArrayList("cxlx", "cxlxz","pagenum","pagerows","startdate","enddate","ispaging");
            List<Object> courseColumnTables
                    = Lists.newArrayList("数据项代码", "数据项名称","数据项内容","数据类型","数据格式","应符合的相关标准及规定");
            Table<Object, Object, String> universityCourseSeatTable
                    = ArrayTable.create(universityRowTable, courseColumnTables);
            universityCourseSeatTable.put("cxlx", "数据项代码", "cxlx");
            universityCourseSeatTable.put("cxlx", "数据项名称", "记账日期");
            universityCourseSeatTable.put("cxlx", "数据项内容", "个人业务明细账记账日期");
            universityCourseSeatTable.put("cxlx", "数据类型", "字符型");
            universityCourseSeatTable.put("cxlx", "数据格式", "YYYYMMDD");
            universityCourseSeatTable.put("cxlx", "应符合的相关标准及规定", "《数据元和交换格式 信息交换日期和时间表示法》GB/T 7408");

            modelAndView.put("parametersDown",universityCourseSeatTable.rowMap());

        }

        return modelAndView;
    }
    public Map 个人贷款基本信息查询() throws MyBusinessException {


        Map modelAndView = new HashMap();
        modelAndView.put("name","个人贷款基本信息查询");
        String authInfo  ="";// linkTo(methodOn(WitV2Controller.class).个人贷款基本信息查询( null,null,null,null)).toUri().getRawPath();

        modelAndView.put("articles",Arrays.asList(
                Map.of("name","请求URL","value",authInfo),
                Map.of("name","请求方式","value","POST"),
                Map.of("name","返回格式","value","JSON"),
                Map.of("name","导则接口分类","value","信息查询类服务2"),
                Map.of("name","说明","value","")

/*1.	登录后可以调用该功能，注意公共信息项中渠道登录用户名，渠道登录用户名类型，需要按登录时信息如实上传，是否加密请查看公共信息项说明。
        2.	标准化接口要求渠道上传信息项在ybmapMessage变量中，其中需要明确标准化接口查询上传要素信息，“cxlx”查询类型，“cxlxz”查询要素值。
        3.	查询类型为“cxlx”为“03” 公积金个人账号。
        4.	如需使用此它参数作为查询条件，请跟据各中心核心业务不同自行组合上传参数到ybmapMessage变量中，默认为JSON格式字符串，可跟据实际情况上传。
        5.	明细查询返回数据应按日期降序排序，最近发生的排在最前面。是否分页处理请根据上传信息项中"ispaging"进行控制。
        6.	查询明细数据项不包含提取业务业数据。*/


        ));



        Map<String, String> parameters
                = Map.of(
                "请求URL", "My New Article",
                "请求方式", "POST",
                "返回格式", "My New Article",
                "导则接口分类", "信息查询类服务2",
                "说明", "",
/*1.	登录后可以调用该功能，注意公共信息项中渠道登录用户名，渠道登录用户名类型，需要按登录时信息如实上传，是否加密请查看公共信息项说明。
        2.	标准化接口要求渠道上传信息项在ybmapMessage变量中，其中需要明确标准化接口查询上传要素信息，“cxlx”查询类型，“cxlxz”查询要素值。
        3.	查询类型为“cxlx”为“03” 公积金个人账号。
        4.	如需使用此它参数作为查询条件，请跟据各中心核心业务不同自行组合上传参数到ybmapMessage变量中，默认为JSON格式字符串，可跟据实际情况上传。
        5.	明细查询返回数据应按日期降序排序，最近发生的排在最前面。是否分页处理请根据上传信息项中"ispaging"进行控制。
        6.	查询明细数据项不包含提取业务业数据。*/


                "Title2", "Second Article");


        List<Object> headerRowTable
                = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
        List<Object> universityRowTable
                = Lists.newArrayList("cxlx", "cxlxz","pagenum","pagerows","startdate","enddate","ispaging");
        List<Object> courseColumnTables
                = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
        Table<Object, Object, Integer> universityCourseSeatTable
                = ArrayTable.create(universityRowTable, courseColumnTables);

        return modelAndView;

    }
    public Map 个人账户明细查询() {

        Map modelAndView = new HashMap();
        modelAndView.put("name","个人账户明细查询");
        String authInfo  = null;

            authInfo = "";//linkTo(methodOn(WitV2Controller.class).个人账户明细查询( null,null,null,null)).toUri().getRawPath();


        modelAndView.put("articles",Arrays.asList(
                Map.of("name","请求URL","value",authInfo),
                Map.of("name","请求方式","value","POST"),
                Map.of("name","返回格式","value","JSON"),
                Map.of("name","导则接口分类","value","信息查询类服务2"),
                Map.of("name","说明","value","")

/*1.	登录后可以调用该功能，注意公共信息项中渠道登录用户名，渠道登录用户名类型，需要按登录时信息如实上传，是否加密请查看公共信息项说明。
        2.	标准化接口要求渠道上传信息项在ybmapMessage变量中，其中需要明确标准化接口查询上传要素信息，“cxlx”查询类型，“cxlxz”查询要素值。
        3.	查询类型为“cxlx”为“03” 公积金个人账号。
        4.	如需使用此它参数作为查询条件，请跟据各中心核心业务不同自行组合上传参数到ybmapMessage变量中，默认为JSON格式字符串，可跟据实际情况上传。
        5.	明细查询返回数据应按日期降序排序，最近发生的排在最前面。是否分页处理请根据上传信息项中"ispaging"进行控制。
        6.	查询明细数据项不包含提取业务业数据。*/


        ));



        Map<String, String> parameters
                = Map.of(
                "请求URL", "My New Article",
                "请求方式", "POST",
                "返回格式", "My New Article",
                "导则接口分类", "信息查询类服务2",
                "说明", "",
/*1.	登录后可以调用该功能，注意公共信息项中渠道登录用户名，渠道登录用户名类型，需要按登录时信息如实上传，是否加密请查看公共信息项说明。
        2.	标准化接口要求渠道上传信息项在ybmapMessage变量中，其中需要明确标准化接口查询上传要素信息，“cxlx”查询类型，“cxlxz”查询要素值。
        3.	查询类型为“cxlx”为“03” 公积金个人账号。
        4.	如需使用此它参数作为查询条件，请跟据各中心核心业务不同自行组合上传参数到ybmapMessage变量中，默认为JSON格式字符串，可跟据实际情况上传。
        5.	明细查询返回数据应按日期降序排序，最近发生的排在最前面。是否分页处理请根据上传信息项中"ispaging"进行控制。
        6.	查询明细数据项不包含提取业务业数据。*/


                "Title2", "Second Article");


        List<Object> headerRowTable
                = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
        List<Object> universityRowTable
                = Lists.newArrayList("cxlx", "cxlxz","pagenum","pagerows","startdate","enddate","ispaging");
        List<Object> courseColumnTables
                = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
        Table<Object, Object, Integer> universityCourseSeatTable
                = ArrayTable.create(universityRowTable, courseColumnTables);

        return modelAndView;
    }
    public Map 个人贷款明细查询() {

        Map modelAndView = new HashMap();
        modelAndView.put("name","个人贷款明细查询");
        String authInfo  = null;

            authInfo = "";//linkTo(methodOn(WitV2Controller.class).个人贷款明细查询( null,null,null,null)).toUri().getRawPath();


        modelAndView.put("articles",Arrays.asList(
                Map.of("name","名称","value",authInfo),

                Map.of("name","请求URL","value","My New Article"),
                Map.of("name","请求方式","value","POST"),
                Map.of("name","返回格式","value","JSON"),
                Map.of("name","导则接口分类","value","信息查询类服务2"),
                Map.of("name","说明","value","")


/*        1.	登录后可以调用该功能，注意公共信息项中渠道登录用户名，渠道登录用户名类型，需要按登录时信息如实上传，是否加密请查看公共信息项说明。
        2.	标准化接口要求渠道上传信息项在ybmapMessage变量中，其中需要明确标准化接口查询上传要素信息，“cxlx”查询类型，“cxlxz”查询要素值。
        3.	查询类型为“cxlx”为“03” 公积金个人账号。
        4.	如需使用此它参数作为查询条件，请跟据各中心核心业务不同自行组合上传参数到ybmapMessage变量中，默认为JSON格式字符串，可跟据实际情况上传。
        5.	明细查询返回数据应按日期降序排序，最近发生的排在最前面。是否分页处理请根据上传信息项中"ispaging"进行控制。
        6.	查询明细数据项不包含提取业务业数据。*/

        ));



        Map<String, String> parameters
                = Map.of(

                "请求URL", "My New Article",
                "请求方式", "POST",
                "返回格式", "My New Article",
                "导则接口分类", "信息查询类服务2",
                "说明", "",
/*1.	登录后可以调用该功能，注意公共信息项中渠道登录用户名，渠道登录用户名类型，需要按登录时信息如实上传，是否加密请查看公共信息项说明。
        2.	标准化接口要求渠道上传信息项在ybmapMessage变量中，其中需要明确标准化接口查询上传要素信息，“cxlx”查询类型，“cxlxz”查询要素值。
        3.	查询类型为“cxlx”为“03” 公积金个人账号。
        4.	如需使用此它参数作为查询条件，请跟据各中心核心业务不同自行组合上传参数到ybmapMessage变量中，默认为JSON格式字符串，可跟据实际情况上传。
        5.	明细查询返回数据应按日期降序排序，最近发生的排在最前面。是否分页处理请根据上传信息项中"ispaging"进行控制。
        6.	查询明细数据项不包含提取业务业数据。*/


                "Title2", "Second Article");


        List<Object> headerRowTable
                = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
        List<Object> universityRowTable
                = Lists.newArrayList("cxlx", "cxlxz","pagenum","pagerows","startdate","enddate","ispaging");
        List<Object> courseColumnTables
                = Lists.newArrayList("参数", "类型","是否必填","最大长度","描述","是否加密","示例值");
        Table<Object, Object, Integer> universityCourseSeatTable
                = ArrayTable.create(universityRowTable, courseColumnTables);

        return modelAndView;
    }






    @GetMapping
        public ModelAndView home(HttpServletRequest request, Authentication authentication) throws MyBusinessException {



            ModelAndView modelAndView = new ModelAndView("/api/api_index");

    //    modelAndView.addObject("git", git.toString()+git.get("build.version")+"--"+git.get("branch"));
     //   modelAndView.addObject("version", git.get("build.version"));
        modelAndView.addObject("git", "===");
        modelAndView.addObject("version", "build.version");
/*
            modelAndView.addObject("principals",authentication.getPrincipal());
*/



        String authInfo  = linkTo(methodOn(IndexController.class).authInfo( null,null)).toUri().getRawPath();
        modelAndView.addObject("authInfoUrl",authInfo);


            makeAuthUser(modelAndView,authentication);



        modelAndView.addObject("limited",Arrays.asList(
             //   Map.of("name","名称","value","调用限制说明"),
                Map.of("name","最大访问量","value","未限制"),
                Map.of("name","最大并发请求","value","100"),
                Map.of("name","每分钟访问限制","value","200")

/*
1.	普通账户，最大请求 50000每分钟，注意公共信息项中渠道登录用户名，渠道登录用户名类型，需要按登录时信息如实上传，是否加密请查看公共信息项说明。
        2.	特权用户，最大请求 100000每分钟*/


        ));



        modelAndView.addObject("auth",Arrays.asList(

                Map.of("name","说明","value","通讯采用 https ,  http header X-api-key 添加 accessKey")


/*1.	普通账户，最大请求 50000每分钟，注意公共信息项中渠道登录用户名，渠道登录用户名类型，需要按登录时信息如实上传，是否加密请查看公共信息项说明。
        2.	特权用户，最大请求 100000每分钟*/


        ));


        String addAuthUrl  = linkTo(methodOn(IndexController.class).addAuth( null)).toUri().getRawPath();
        modelAndView.addObject("addAuthUrl",addAuthUrl);
        if(authentication.getAuthorities().stream().map(e->e.getAuthority()).filter(e->e.equals("ROLE_CEB")).count()>0){
            modelAndView.addObject("swaggerUrl","/swagger-ui.html?urls.primaryName=CEBV1.0");
            modelAndView.addObject("documents",Arrays.asList(CEB()));

        }

        if(authentication.getAuthorities().stream().map(e->e.getAuthority()).filter(e->e.equals("ROLE_CCB")).count()>0){
            modelAndView.addObject("swaggerUrl","/swagger-ui.html?urls.primaryName=BCCBV1.0");
            modelAndView.addObject("documents",Arrays.asList(CCB()));





        }
        if(authentication.getAuthorities().stream().map(e->e.getAuthority()).filter(e->e.equals("ROLE_WIT")).count()>0){
            modelAndView.addObject("swaggerUrl","/swagger-ui.html?urls.primaryName=AWITV1.0");

            modelAndView.addObject("documents",Arrays.asList(个人账户基本信息查询(),个人贷款基本信息查询(),个人账户明细查询(),个人贷款明细查询()));

        }


        String logUrl  = linkTo(methodOn(IndexController.class).log( null,null,null)).toUri().getRawPath();
        modelAndView.addObject("logUrl",logUrl);



        String ca  = linkTo(methodOn(FileDealController.class).download_ca( "null")).toUri().getRawPath();
        modelAndView.addObject("caUrl",ca);
            return modelAndView;


        }


    @GetMapping( "/JG/log")
    @ResponseBody
    public Page<Map> log(Map query,
                              @PageableDefault(sort="createDate",direction= Sort.Direction.DESC) Pageable pageable,Authentication authentication)  {


        User principal =(User)authentication.getPrincipal();
        Page<QuickLog> loanHistories  = quickLogRepository.findByClientId(principal.getUsername(),pageable);

        Page<Map> page = loanHistories.map(new Function<QuickLog, Map>() {
            public Map apply(QuickLog collaborator) {
                ObjectMapper m = new ObjectMapper();
                Map<String,Object> map = m.convertValue(collaborator,Map.class);
                map.put("id", collaborator.getId());
                map.put("createDate", collaborator.getCreateDate());
                map.put("modifyDate",collaborator.getModifyDate());

                System.out.println("=============="+  collaborator.toString());

                String producerUrl  = linkTo(methodOn(IndexController.class).detail(collaborator.getIdLong(), null)).withSelfRel().getHref();
                map.put("url",producerUrl);
                return map;
            }
        });
        return page;
    }




    @GetMapping("/log_detail")
    public ModelAndView detail(@RequestParam("idLong") Long idLong, Authentication authentication) {


        Optional<QuickLog> quickLog = quickLogRepository.findByIdLong(idLong);


        ModelAndView modelAndView = new ModelAndView("/api/log_detail");
        modelAndView.addObject("principals",authentication.getPrincipal());



        modelAndView.addObject("quickLog",quickLog.get());
        makeAuthUser(modelAndView,authentication);
        return modelAndView;
    }








    @GetMapping("/dashboard")
    public ModelAndView dashboard(HttpServletRequest request, Authentication authentication) {



        ModelAndView modelAndView = new ModelAndView("/api/api_index");


        modelAndView.addObject("principals",authentication.getPrincipal());

        String authInfo  = linkTo(methodOn(IndexController.class).authInfo( null,null)).toUri().getRawPath();
        modelAndView.addObject("authInfoUrl",authInfo);
        String addAuthUrl  = linkTo(methodOn(IndexController.class).addAuth( null)).toUri().getRawPath();
        modelAndView.addObject("addAuthUrl",addAuthUrl);


        makeAuthUser(modelAndView,authentication);

        return modelAndView;


    }



    @RequestMapping(value = "/JG/authInfo", method = RequestMethod.GET)
    @ResponseBody
    public Page<Map> authInfo( @PageableDefault(sort="createDate",direction= Sort.Direction.DESC) Pageable pageable,Authentication authentication)  {



        User user = (User)authentication.getPrincipal();
        Page<AuthenticationInformation> loanHistories = authenticationService.findByClientId(user.getUsername(),pageable);

        ;

        Page<Map> page = loanHistories.map(new Function<AuthenticationInformation, Map>() {
            public Map apply(AuthenticationInformation collaborator) {

                ObjectMapper m = new ObjectMapper();
                Map<String, Object> map = m.convertValue(collaborator, Map.class);

                map.put("createDate",collaborator.getCreateDate());



                return map;
            }
        });


        return page;
    }



    @PostMapping("/JG/addAuth") // (1)
    ResponseEntity<?> addAuth(Authentication authentication) { // (2)

        User principal =(User)authentication.getPrincipal();
        AuthenticationInformation authenticationInformation = authenticationService.create(principal.getUsername());
        PerClientRateLimitInterceptor.refresh(authenticationInformationRepository);
        return ResponseEntity.ok(authenticationInformation); // (5)
    }





}
