package com.example.dm.service;

/*import com.alibaba.fastjson.JSON;
import com.gjj.api.apidata.*;
import com.gjj.api.apidata.cebV1.*;
import com.gjj.api.domain.*;
import com.gjj.api.enumT.*;
import com.gjj.api.exception.MyBusinessException;
import com.gjj.api.repository.*;
import com.gjj.api.util.DateUtils;*/
import com.alibaba.fastjson.JSON;
import com.example.dm.apidata.Query;
import com.example.dm.apidata.cebV1.*;
import com.example.dm.domain.*;
import com.example.dm.enumT.*;
import com.example.dm.exception.MyBusinessException;
import com.example.dm.repository.*;
import com.example.dm.util.DateUtils;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;

/**
 * Created by silence yuan on 2015/7/25.
 */

@Service
public class CEBV1ServiceImpl {

    @Autowired
    private Cm0022个人客户证件信息Repository cm0022个人客户证件信息Repository;
    // Cm0020_个人客户基本信息Repository
    //  CM002_个人基本资料表Repository

    @Autowired
    private Dp0104个人客户基本信息Repository dp0104个人客户基本信息Repository;
    @Autowired
    private Cm0001企业客户基本信息表Repository cm0001企业客户基本信息表Repository;
    @Autowired
    private Dp0107个人账户信息表Repository dp0107个人账户信息表Repository;
    @Autowired
    private Dp0106单位账户信息Repository dp0106单位账户信息Repository;
    @Autowired
    private Dp0102_单位客户基本信息表Repository dp0102_单位客户基本信息表Repository;

    @Autowired
    private Cm0003企业客户证件信息Repository cm0003企业客户证件信息Repository;

    @Autowired
    private Dp1301单位缴存信息变更登记簿Repository dp1301单位缴存信息变更登记簿Repository;
    @Autowired
    private Dp1103单位缴存比例信息户关联表Repository dp1103单位缴存比例信息户关联表Repository;
    @Autowired
    private Cm0024个人客户地址信息Repository cm0024个人客户地址信息Repository;
    @Autowired
    private Cm0020_个人客户基本信息Repository cm0020_个人客户基本信息Repository;

    @Autowired
    private Cm0023个人客户联系信息Repository cm0023个人客户联系信息Repository;


    @Autowired
    private Dp2302个人缴存登记簿Repository dp2302个人缴存登记簿Repository;


    @Autowired
    private Cm0011企业客户银行账户信息Repository cm0011企业客户银行账户信息Repository;

    @Autowired
    private Dw0202提取审批信息表Repository dw0202提取审批信息表Repository;
    @Autowired
    private Cm0004企业客户地址信息Repository cm0004企业客户地址信息Repository;
    @Autowired
    private Dp1303单位缓缴登记簿Repository dp1303单位缓缴登记簿Repository;
    @Autowired
    private Dp2301单位缴存登记簿Repository dp2301单位缴存登记簿Repository;
    @Autowired
    private Ac0103客户与应用账户关联表Repository ac0103客户与应用账户关联表Repository;

    @Autowired
    private Dp0101单位账户辅助信息Repository dp0101单位账户辅助信息Repository;
    @Autowired
    private Dp1106个人缴至信息Repository dp1106个人缴至信息Repository;

    @Autowired
    private Ln0301_个人住房贷款借款合同信息Repository ln0301_个人住房贷款借款合同信息Repository;

    @Autowired
    private Ln2108借款人信息Repository ln2108借款人信息Repository;
    @Autowired
    private Ln0304个人住房贷款账户信息Repository ln0304个人住房贷款账户信息Repository;

    @Autowired
    private Ln0303共同借款人信息Repository ln0303共同借款人信息Repository;
    @Autowired
    private Ln0306个人住房贷款逾期登记信息Repository ln0306个人住房贷款逾期登记信息Repository;

    @Autowired
    private Ln3301贷款还款计划Repository ln3301贷款还款计划Repository;




    @Autowired
    private LogServiceImpl logService;





    public Cebdata queryLoanee(Object principal, HttpServletRequest request, Query wtrjgh, String certinum) throws MyBusinessException {


        String principal_s = (String)principal;
        Long no = logService.beginReq(principal_s.split(":"), request, JSON.toJSONString(wtrjgh));

        //Cm0022个人客户证件信息 cm0022个人客户证件信息 = cm0022个人客户证件信息Repository.findByCrednum证件号码AndPersoncredtype个人客户证件类型();


        List<Dp0104个人客户基本信息> cm002s =dp0104个人客户基本信息Repository.findByZjhm证件号码AndZjlx证件类型(certinum,E_待_证据类型_证件类型.身份证.getText());
        if(cm002s.size()== 0){
            throw new MyBusinessException(no,"找不到该缴存人",ErrorCodeEnum.查询为空);
        }

        if(cm002s.stream().filter(e->
            e.getZjhm证件号码().trim().equals(wtrjgh.getZjhm().trim()) &&
            e.getZjlx证件类型().trim().equals(wtrjgh.getZjlx().trim()) &&
            e.getXingming姓名().trim().equals(wtrjgh.getXm().trim())
        ).count()==0) {

            String inerText = cm002s.stream().map(e->"证件号码:"+e.getZjhm证件号码()+"证件类型:"+e.getZjlx证件类型()+"个人姓名:"+e.getXingming姓名()
            ).collect(Collectors.joining(";"));
            String reqText = "证件号码:"+wtrjgh.getZjhm()+"证件类型:"+wtrjgh.getZjlx()+"个人姓名:"+wtrjgh.getXm();
            throw new MyBusinessException(no,"根据请求数据 "+reqText+" 找到了缴存人，但系统中存在如下信息 "+inerText,ErrorCodeEnum.查询为空);
        };







        CebItem data = new CebItem();

        List<Tuple3<Cm0020_个人客户基本信息,Dp0104个人客户基本信息,Dp0107个人账户信息表>> tuple3s = new ArrayList<>();
        for(Dp0104个人客户基本信息 dp0104个人客户基本信息 : cm002s) {


            Ac0103客户与应用账户关联表 ac0103客户与应用账户关联表 =
                    ac0103客户与应用账户关联表Repository.findByExtaccnum外部账号AndAccounttype账户类型(dp0104个人客户基本信息.getAccnum个人账号(), NEW_账号类型_ACCOUNTTYPE._3_个人账号.getText());

            LocalDate start18月 = LocalDate.now().minusMonths(20).with(firstDayOfMonth());

            Cm0020_个人客户基本信息 cm0020_个人客户基本信息 = cm0020_个人客户基本信息Repository.findByCustid个人客户号(ac0103客户与应用账户关联表.getCustid个人客户号());
            if (cm0020_个人客户基本信息 == null) {
                throw new MyBusinessException(no, "没有找到缴存信息,客户号：" + cm0020_个人客户基本信息.getCustid个人客户号() + " 身份证号：" + dp0104个人客户基本信息.getZjhm证件号码()
                        , ErrorCodeEnum.操作失败);

            }


            Dp0107个人账户信息表 dp0107个人账户信息表 = dp0107个人账户信息表Repository.findByAccnum个人账号(dp0104个人客户基本信息.getAccnum个人账号());

         //   DP006_个人缴存信息表 dp006 = dp006_payment_repository.findByCustid个人客户号(cm002.getCustid个人客户号());


         //   DP007_个人分户账 dp007 = dp007_individual_sub_accountRepository.findByAccnum个人账号(dp0107个人账户信息表.getAccnum个人账号());
            if (dp0107个人账户信息表 == null) {
                throw new MyBusinessException(no, "没有找到缴存信息,缴存帐号：" + dp0107个人账户信息表.getAccnum个人账号() + " 身份证号：" + dp0104个人客户基本信息.getZjhm证件号码()
                        , ErrorCodeEnum.操作失败);

            }
            tuple3s.add(Tuple.of(cm0020_个人客户基本信息,dp0104个人客户基本信息,dp0107个人账户信息表));

        }


            data.set_1_15_qz_ifsgjj_info(queryLoanee_info(no,tuple3s));
        data.set_16_28_qz_ifsgjj_jiaocun(queryLoanee_jiaocun(no,tuple3s));
        data.set_29_41_qz_ifsgjj_tiqu(queryLoanee_withdrow(no,tuple3s));
        data.set_42_62_qz_ifsgjj_daikuan(queryLoanee__loan(no,certinum));



        logService.endReq(no, JSON.toJSONString(data));
        Cebdata ccbdata = new Cebdata();
        ccbdata.setSeqNo(no+"");
        ccbdata.setData(data);
        return ccbdata;//Cebdata.builder().data(data).seqNo(no+"").build();


    }




    List<Tuple2<Cm0020_个人客户基本信息,Dp0107个人账户信息表>> tuple3s = new ArrayList<>();


    public List<CebItem_basic> queryLoanee_info(Long reqId, List<Tuple3<Cm0020_个人客户基本信息,Dp0104个人客户基本信息,Dp0107个人账户信息表>> cm002s) throws MyBusinessException {
        //logger.debug("贷款查询" + tuple3.get());

        List<CebItem_basic> cebItem_basics = new ArrayList<>();


        for(Tuple3<Cm0020_个人客户基本信息,Dp0104个人客户基本信息,Dp0107个人账户信息表> tuple3 : cm002s){


            Cm0020_个人客户基本信息 cm0020_个人客户基本信息 = tuple3._1;
            Dp0104个人客户基本信息 dp0104个人客户基本信息 = tuple3._2;
            Dp0107个人账户信息表 dp0107个人账户信息表 = tuple3._3;
         //   DP007_个人分户账 dp007 = tuple3._3;

            List<Cm0023个人客户联系信息> cm0023个人客户联系信息s = cm0023个人客户联系信息Repository.findByCustid个人客户号(cm0020_个人客户基本信息.getCustid个人客户号());

            cm0023个人客户联系信息s.isEmpty();


            CebItem_basic cebItem_basic = new CebItem_basic();





            cebItem_basic.set_1_std400cunm_申请人基本信息_姓名_String(cm0020_个人客户基本信息.getName姓名());//cm002.getAccname_个人姓名().trim());
            cebItem_basic.set_2_std400grid_申请人基本信息_个人编号_String(cm0020_个人客户基本信息.getCustid个人客户号());//cm002.getCustid个人客户号());
            cebItem_basic.set_3_std400idtp_申请人基本信息_证件类型_String(dp0104个人客户基本信息.getZjlx证件类型());//cm002.getCertitype证件类型());
            cebItem_basic.set_4_std400idno_申请人基本信息_证件号码_String(dp0104个人客户基本信息.getZjhm证件号码());//cm002.getCertinum证件号码().trim());


            cebItem_basic.set_5_std400sqam_申请人基本信息_税前工资总额_DEC(-1d);
            dp0107个人账户信息表.getGryjce个人月缴存额();
            List<Cm0023个人客户联系信息> cm0023个人客户联系信息s1 = cm0023个人客户联系信息Repository.findAll();


            Optional<Cm0023个人客户联系信息> cm0023个人客户联系信息Optional = cm0023个人客户联系信息s
                    .stream()
                    .filter(e->e.getContmethtype联系方式类型().equals("01"))
                    .filter(e->e.getCustrelativeinfotype个人客户联系信息类型().equals("01"))
                    .findAny();
            if(cm0023个人客户联系信息Optional.isPresent()){
                cebItem_basic.set_6_std400gddh_申请人基本信息_住宅电话_String(cm0023个人客户联系信息Optional.get().getContmethinfo联系方式内容().toString());
                cebItem_basic.set_7_std400mobl_申请人基本信息_手机号_String(cm0023个人客户联系信息Optional.get().getContmethinfo联系方式内容().toString());
            }else{

            }



/*            List<Cm0024个人客户地址信息> cm0024个人客户地址信息List = cm0024个人客户地址信息Repository.findByCustid个人客户号(cm0020_个人客户基本信息.getCustid个人客户号());

            Optional<Cm0024个人客户地址信息> cm0024个人客户地址信息Optional = cm0024个人客户地址信息List
                    .stream()
                    .filter(e->e.getContmethtype联系方式类型().equals("01"))
                    .filter(e->e.getCustrelativeinfotype个人客户联系信息类型().equals("01"))
                    .findAny();

            if(cm0024个人客户地址信息Optional.isPresent()){

            }*/
            cebItem_basic.set_8_std400addr_申请人基本信息_联系地址__家庭___String(dp0104个人客户基本信息.getJtzz家庭住址());



            Ac0103客户与应用账户关联表 ac0103客户与应用账户关联表 =
                    ac0103客户与应用账户关联表Repository.findByExtaccnum外部账号AndAccounttype账户类型(dp0107个人账户信息表.getUnitaccnum单位账号(), NEW_账号类型_ACCOUNTTYPE._1_单位账号.getText());


            Cm0001企业客户基本信息表 cm0001企业客户基本信息表 = cm0001企业客户基本信息表Repository.findByUnitcustid单位客户号(ac0103客户与应用账户关联表.getCustid个人客户号());
            Cm0003企业客户证件信息 cm0003企业客户证件信息 = cm0003企业客户证件信息Repository.findByUnitcustid单位客户号(cm0001企业客户基本信息表.getUnitcustid单位客户号());
            Dp0106单位账户信息 dp0106单位账户信息 = dp0106单位账户信息Repository.findByUnitaccnum单位账号(dp0107个人账户信息表.getUnitaccnum单位账号());

            List<Dp1103单位缴存比例信息> dp1103单位缴存比例信息List = dp1103单位缴存比例信息户关联表Repository.findByUnitaccnum单位账号(dp0106单位账户信息.getUnitaccnum单位账号());
            Dp0102_单位客户基本信息表 dp0102_单位客户基本信息表 = dp0102_单位客户基本信息表Repository.findByUnitaccnum单位账号(dp0107个人账户信息表.getUnitaccnum单位账号());
            Optional<Dp1103单位缴存比例信息> optionalDp1103单位缴存比例信息 = dp1103单位缴存比例信息List.stream().findAny();



            Dp0101单位账户辅助信息 dp0101单位账户辅助信息 = dp0101单位账户辅助信息Repository.findByUnitaccnum单位账号(dp0106单位账户信息.getUnitaccnum单位账号());


            Dp1106个人缴至信息 dp1106个人缴至信息 = dp1106个人缴至信息Repository.findByAccnum个人账号(dp0107个人账户信息表.getAccnum个人账号());


        //    Optional<DP004_单位缴存信息表> dp004_单位缴存信息表_ = dp004_unit_payment_infoRepository.findByUnitaccnum单位账号(dp007.getUnitaccnum_单位账号());
            if(cm0001企业客户基本信息表!= null){
                throw new MyBusinessException(reqId,"找不到单位信息"+ cm0003企业客户证件信息.getUnitcustid单位客户号(),ErrorCodeEnum.操作失败);
            }


          //  DP004_单位缴存信息表 dp004_单位缴存信息表 = dp004_单位缴存信息表_.get();
           // DP005_单位分户账 dp005_work_unit_单位分户账 = dp005_workUnit_repository.findByUnitaccnum单位账号(dp007.getUnitaccnum_单位账号());







            if(dp0106单位账户信息.getDwzhzt单位账户状态().equals(NEW_账号类型_ACCOUNTTYPE._3_个人账号.getText())){
                break;
            }
            if(dp0107个人账户信息表.getGrzhzt个人账户状态().equals(NEW_账号类型_ACCOUNTTYPE._3_个人账号.getText())){
                break;
            }
/*

              List<DP005_单位分户账> dp005_work_unit_单位分户账s = dp005_workUnit_repository.findByUnitaccnum单位账号(dp007.getUnitaccnum_单位账号());

            DP005_单位分户账 dp005_work_unit_单位分户账= dp005_work_unit_单位分户账s
                    .stream()
                    .filter(e->!e.getUnitacctype单位账户类型().equals(E_DP005_单位分户账_单位账户类型.预缴户.getText()))
                    .findAny().get();

  if(!dp005_work_unit_单位分户账.getUnitaccstate单位账户状态().equals(E_DP005_单位分户账_单位账户状态.正常.getText())){
                break;
            }
            if(!dp007.getIndiaccstate_个人账户状态().equals(E_DP007_个人分户账_个人账户状态.正常.getText())){
                break;
            }*/



          //  CM001_单位基本资料表 cm001_单位基本资料表 = cm001Repository.findByUnitcustid单位客户号(dp004_单位缴存信息表.getUnitcustid_单位客户号());



            cebItem_basic.set_9_stdcmpnm_申请人现缴存单位信息_单位名称_String(cm0001企业客户基本信息表.getUnitname单位名称()) ;//getcm001_单位基本资料表.getUnitaccname单位名称());
            cebItem_basic.set_10_stdcmprgno_申请人现缴存单位信息_单位登记号_String(cm0001企业客户基本信息表.getUnitcustid单位客户号()) ;//cm001_单位基本资料表.getUnitcustid单位客户号().toString());

            cebItem_basic.set_11_stdcmpkhid_申请人现缴存单位信息_开户管理部编号_String(cm0001企业客户基本信息表.getCitycode城市代码());//dp005_work_unit_单位分户账.getAccinstcode_账户机构().toString());

          //  List<DP022_个人缴存登记簿> dp022_个人缴存登记簿s = dp022_个人缴存登记薄Repository.findByAccnum个人账号(dp006.getAccnum个人账号());

            List<Cm0004企业客户地址信息> cm0004企业客户地址信息List =  cm0004企业客户地址信息Repository.findByUnitcustid单位客户号(cm0001企业客户基本信息表.getUnitcustid单位客户号());

            Optional<Cm0004企业客户地址信息> optionalCm0004企业客户地址信息 = cm0004企业客户地址信息List.stream().findAny();
            if(optionalCm0004企业客户地址信息.isPresent()){
                cebItem_basic.set_12_stdcmpaddr_申请人现缴存单位信息_单位地址_String(optionalCm0004企业客户地址信息.get().getAddrdetail地址详情());//(cm001_单位基本资料表.getUnitaddr_单位地址());

            }


            List<Dp1303单位缓缴登记簿> list = dp1303单位缓缴登记簿Repository.findByUnitaccnum单位账号(dp0106单位账户信息.getUnitaccnum单位账号());
            cebItem_basic.set_14_stdcmphjfg_申请人现缴存单位信息_是否申请公积金缓缴_String(list.size()> 0? "":"");
            Optional<Dp1303单位缓缴登记簿> dp030_单位缓缴登记簿_optional = list.stream().findFirst();
            if(dp030_单位缓缴登记簿_optional.isPresent()){
                cebItem_basic.set_15_stdcmphjdt_申请人现缴存单位信息_申请缓缴时间_String(dp030_单位缓缴登记簿_optional.get().getTransdate业务发生日期().toString());
            }


            cebItem_basic.set_e_1_std400wktm_申请人基本信息_参加工作时间_String(DateUtils.getyyyyMMdd(LocalDate.MIN));

            ;
            List<Cm0011企业客户银行账户信息>  cm0011企业客户银行账户信息s = cm0011企业客户银行账户信息Repository.findByUnitcustid单位客户号(cm0001企业客户基本信息表.getUnitcustid单位客户号());
            cebItem_basic.set_e_2_stdcmpprpt_申请人现缴存单位信息_性质代码_String("E_CM001_单位基本资料表_单位性质_建行.from_CEB(cm0001企业客户基本信息表.getUniteconomytype单位经济类型()).getText()");//.getUnitkind_单位性质()).getText());


            cebItem_basic.set_e_3_stdcmpacno_申请人现缴存单位信息_单位账号_String(dp0106单位账户信息.getUnitaccnum单位账号());
            cebItem_basic.set_e_4_stdcmpdbnm_申请人现缴存单位信息_法定代表人或负责人_String(cm0001企业客户基本信息表.getUnitlegalpername单位法人代表姓名());

            Optional<Cm0011企业客户银行账户信息> cm0011企业客户银行账户信息 = cm0011企业客户银行账户信息s.stream().findAny();
            if(cm0011企业客户银行账户信息.isPresent()){
                //cebItem_basic.set_e_5_stdcmpkhbk_申请人现缴存单位信息_单位开户银行及行号_缴存银行_String(dp005_work_unit_单位分户账.getAccbankcode_不可为空_账户银行());
                cebItem_basic.set_e_5_stdcmpkhbk_申请人现缴存单位信息_单位开户银行及行号_缴存银行_String(cm0011企业客户银行账户信息.get().getBankname银行名称());

            }


            cebItem_basic.set_e_6_stdgjjrgdt_个人公积金账户信息_开户日期_String(DateUtils.getyyyyMMdd(dp0102_单位客户基本信息表.getDwkhrq单位开户日期()));//'.getOpnaccdate开户日期()));



            cebItem_basic.set_e_7_stdgjjstdt_个人公积金账户信息_初缴年月日_String(

                    DateUtils.getyyyyMMdd(YearMonth.parse(dp1106个人缴至信息.getStartdpym起始汇缴年月(),DateTimeFormatter.ofPattern("yyyyMM")).atDay(1)).toString());



            cebItem_basic.set_e_8_stdcmprgtm_申请人现缴存单位信息_初次登记时间_String(DateUtils.getyyyyMMdd(dp0102_单位客户基本信息表.getDwkhrq单位开户日期()));

            cebItem_basic.set_e_9_stdcmpzzno_申请人现缴存单位信息_组织机构代码_String(cm0003企业客户证件信息.getUnitcrednum单位证件号码());//cm001_单位基本资料表.getOrgcode组织机构代码().trim());
            cebItem_basic.set_e_10_stdcmpzyyno_申请人现缴存单位信息_营业执照号码__工商注册号__String(cm0003企业客户证件信息.getUnitcrednum单位证件号码());//cm001_单位基本资料表.getLicensenum_营业执照号码().trim());





            cebItem_basic.set_e_11_stdcmpfxrq_申请人现缴存单位信息_发薪日期__缴交日__String(cm0001企业客户基本信息表.getUnitpayday单位发薪日());//cm001_单位基本资料表.getSalday_发薪日().trim());

            cebItem_basics.add(cebItem_basic);


        }




        return cebItem_basics;

    }

    public List<CebItem_jiaocun> queryLoanee_jiaocun(Long reqId, List<Tuple3<Cm0020_个人客户基本信息,Dp0104个人客户基本信息,Dp0107个人账户信息表>> cm002s) throws MyBusinessException {


 List<CebItem_jiaocun> cebItem_jiaocuns = new ArrayList<>();


        for(Tuple3<Cm0020_个人客户基本信息,Dp0104个人客户基本信息,Dp0107个人账户信息表> tuple3 : cm002s){

            Cm0020_个人客户基本信息 cm0020_个人客户基本信息 = tuple3._1;
            Dp0104个人客户基本信息 dp0104个人客户基本信息 = tuple3._2;
            Dp0107个人账户信息表 dp0107个人账户信息表 = tuple3._3;


            if(!dp0107个人账户信息表.getGrzhzt个人账户状态().equals(E_待_dp0107个人账户信息表_Grzhzt个人账户状态.正常.getText())){
                break;
            }
                    CebItem_jiaocun cebItem_basic = new CebItem_jiaocun();
            Dp0106单位账户信息 dp0106单位账户信息Optional = dp0106单位账户信息Repository.findByUnitaccnum单位账号(dp0107个人账户信息表.getUnitaccnum单位账号());



            Ac0103客户与应用账户关联表 ac0103客户与应用账户关联表 =
                    ac0103客户与应用账户关联表Repository.findByExtaccnum外部账号AndAccounttype账户类型(dp0107个人账户信息表.getUnitaccnum单位账号(), NEW_账号类型_ACCOUNTTYPE._1_单位账号.getText());
            Cm0001企业客户基本信息表 cm0001企业客户基本信息表 = cm0001企业客户基本信息表Repository.findByUnitcustid单位客户号(ac0103客户与应用账户关联表.getCustid个人客户号());
            Cm0003企业客户证件信息 cm0003企业客户证件信息 = cm0003企业客户证件信息Repository.findByUnitcustid单位客户号(cm0001企业客户基本信息表.getUnitcustid单位客户号());
            Dp0106单位账户信息 dp0106单位账户信息 = dp0106单位账户信息Repository.findByUnitaccnum单位账号(dp0107个人账户信息表.getUnitaccnum单位账号());



            //  Optional<DP004_单位缴存信息表> dp004_单位缴存信息表_ = dp0106单位账户信息Repository.findByUnitaccnum单位账号(dp007.getUnitaccnum_单位账号());
                    if(dp0106单位账户信息Optional == null){
                        throw new MyBusinessException(reqId,"找不到单位信息"+ dp0106单位账户信息.getUnitaccnum单位账号(),ErrorCodeEnum.操作失败);
                    }
               //     DP004_单位缴存信息表 dp004_单位缴存信息表 = dp004_单位缴存信息表_.get();
                  //  DP005_单位分户账 dp005_work_unit_单位分户账 = dp005_workUnit_repository.findByUnitaccnum单位账号(dp007.getUnitaccnum_单位账号());

          //  List<DP005_单位分户账> dp005_work_unit_单位分户账s = dp005_workUnit_repository.findByUnitaccnum单位账号(dp007.getUnitaccnum_单位账号());
          //  DP005_单位分户账 dp005_work_unit_单位分户账 = dp005_work_unit_单位分户账s.stream().filter(e->e.getUnitacctype单位账户类型().equals(E_DP005_单位分户账_单位账户类型.普通.getText())).findFirst().get();

       //     CM001_单位基本资料表 cm001_单位基本资料表 = cm001Repository.findByUnitcustid单位客户号(dp004_单位缴存信息表.getUnitcustid_单位客户号());


                  //  List<DP022_个人缴存登记簿> dp022_个人缴存登记簿s = dp022_个人缴存登记薄Repository.findByAccnum个人账号(dp006.getAccnum个人账号());

           // List<DP021_单位缴存登记簿> dp021_单位缴存登记簿s = dp021_单位缴存登记薄Repository.findByUnitaccnum单位账号(dp004_单位缴存信息表_.get().getUnitaccnum单位账号());



                    List<Dp2301单位缴存登记簿> dp2301单位缴存登记簿s = dp2301单位缴存登记簿Repository.findByUnitaccnum单位账号(dp0107个人账户信息表.getUnitaccnum单位账号());
            List<Dp2302个人缴存登记簿> dp022_个人缴存登记簿s = dp2302个人缴存登记簿Repository
                    .findByAccnum个人账号(dp0107个人账户信息表.getAccnum个人账号().trim()).stream()
                    //.filter(e->e.getTranstype_交易类型().equals(E_DP008_单位明细账_交易类型_transtype.正常.getText()))
                    //.filter(e->e.getInaccstate_入账状态().equals(E_DP022_个人缴存登记簿_入账状态_inaccstate.E_1_入账.getText()))
                    .filter(e->e.getTranstype交易类型().equals(E_Dp2302个人缴存登记簿_单位明细账_交易类型_transtype.正常.getText()))
                    .filter(e->e.getInaccountstatus入账状态().equals(E_DP022_个人缴存登记簿_入账状态_inaccstate.E_1_入账.getText()))
                    .collect(Collectors.toList());



/*
        dp022_个人缴存登记簿s
                .stream()
                .filter(e->e.getInaccdate入账日期().isAfter(LocalDate.now().with(TemporalAdjusters.firstDayOfYear())))
                .filter(e->e.getColpaytype_汇缴类型0().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_1_汇缴.getText()))
                .mapToDouble(ee->ee.getPayamt_缴存金额().doubleValue()).sum()+"");*/


/*
            Long count = dp022_个人缴存登记簿s
                    .stream()
                    //   .filter(e->e.getInaccdate入账日期().isAfter(LocalDate.now().with(TemporalAdjusters.firstDayOfYear())))
                    .filter(e-> Arrays.asList(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_2_正常全额补缴,
                            E_DP022_个人缴存登记簿_汇缴类型_dptype.E_3_正常差额补缴,
                            E_DP022_个人缴存登记簿_汇缴类型_dptype.E_4_不定额补缴)
                            .stream()
                            .map(ee->ee.getText())
                            .collect(Collectors.toList())
                            .contains(e.getColpaytype_汇缴类型0()))
                    .count();

                    Double aaa_bb = dp022_个人缴存登记簿s
                            .stream()
                            .filter(e->e.getInaccdate入账日期().isAfter(LocalDate.now().with(TemporalAdjusters.firstDayOfYear())))
                            .filter(e-> Arrays.asList(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_2_正常全额补缴,
                                    E_DP022_个人缴存登记簿_汇缴类型_dptype.E_3_正常差额补缴,
                                    E_DP022_个人缴存登记簿_汇缴类型_dptype.E_4_不定额补缴)
                                    .stream()
                                    .map(ee->ee.getText())
                                    .collect(Collectors.toList())
                                    .contains(e.getColpaytype_汇缴类型0().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_2_正常全额补缴.getText())))
                            .mapToDouble(ee->ee.getPayamt_缴存金额().doubleValue()).sum();*/

/*            Double aaa_bb = dp022_个人缴存登记簿s
                    .stream()
                    .filter(e->e.getInaccdate入账日期().isAfter(LocalDate.now().with(TemporalAdjusters.firstDayOfYear())))
                    .filter(e-> Arrays.asList(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_2_正常全额补缴,
                            E_DP022_个人缴存登记簿_汇缴类型_dptype.E_3_正常差额补缴,
                            E_DP022_个人缴存登记簿_汇缴类型_dptype.E_4_不定额补缴)
                            .stream()
                            .map(ee->ee.getText())
                            .collect(Collectors.toList())
                            .contains(e.getColpaytype_汇缴类型0().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_2_正常全额补缴.getText())))
                    .mapToDouble(ee->ee.getPayamt_缴存金额().doubleValue()).sum();*/


/*

        data.set_16_std400cunm_申请人基本信息_姓名_String("");
        data.set_17_stdperid_申请人基本信息_个人编号_String("");
        data.set_18_std400idtp_申请人基本信息_证件类型_String("");
        data.set_19_std400idno_申请人基本信息_证件号码_String("");*/

            cebItem_basic.set_20_stdgjjacno_个人公积金账户信息_公积金账号_String(dp0107个人账户信息表.getAccnum个人账号());



            List<Dp2302个人缴存登记簿> dp022_个人缴存登记簿s1_list_all =

                    dp022_个人缴存登记簿s
                            .stream()
                            .filter(e->{
                        try{
                            YearMonth.parse(e.getDpym缴存年月(), DateTimeFormatter.ofPattern("yyyyMM"));

                            return true;
                        }catch (Exception eeex){

                            // eeex.printStackTrace();
                            return false;
                        }


                    }).filter(e->e.getInaccountstatus入账状态().equals(E_待_Dp2301_单位缴存登记簿_入账状态.E_1_入账.getText()))
                            .sorted((o1,o2)->-YearMonth.parse(o1.getDpym缴存年月(), DateTimeFormatter.ofPattern("yyyyMM")).compareTo(
                                    YearMonth.parse(o2.getDpym缴存年月(),DateTimeFormatter.ofPattern("yyyyMM"))))

                            .collect(Collectors.toList());





            Map<String,List<Dp2302个人缴存登记簿>> dp022_个人缴存登记簿s1_map = dp022_个人缴存登记簿s1_list_all
                    .stream().filter(e->YearMonth.parse(e.getDpym缴存年月(), DateTimeFormatter.ofPattern("yyyyMM")).isAfter(YearMonth.from(LocalDate.now().minusMonths(13))))

                    .collect(Collectors.groupingBy(e->e.getDpym缴存年月()));













            List<String> strings = IntStream.rangeClosed(1,12)
                    .mapToObj(e->YearMonth.from(LocalDate.now().minusMonths(e)).format(DateTimeFormatter.ofPattern("yyyyMM"))).collect(Collectors.toList());


            String 当月缴存状态_String = strings.stream().map(e->{
                List<Dp2302个人缴存登记簿> list = dp022_个人缴存登记簿s1_map.get(e);
                if(list!= null && list.size()>0) {
                    return "1";

                }else{
                    return "0";
                }
            }).collect(Collectors.joining("|"));
                    cebItem_basic.set_21_stdglljcst_个人公积金账户信息_当月缴存状态_String(当月缴存状态_String);

                    if(dp022_个人缴存登记簿s1_list_all.size()>0){
                        cebItem_basic.set_22_stdgjjltdt_个人公积金账户信息_最近一次缴交日期_String(dp022_个人缴存登记簿s1_list_all.get(0).getDpym缴存年月());

                    }else{
                        cebItem_basic.set_22_stdgjjltdt_个人公积金账户信息_最近一次缴交日期_String(LocalDate.MIN.toString());

                    }

                    cebItem_basic.set_23_stdgjjcdqnd_个人公积金账户信息_累计缴存次数_Int(dp022_个人缴存登记簿s1_list_all.size());
                    cebItem_basic.set_24_stdgjjacbl_个人公积金账户信息_当前余额_DEC(dp0107个人账户信息表.getGrzhye个人账户余额());



            String 近12个自然月个人缴存额_DE = strings.stream().map(e->{
                List<Dp2302个人缴存登记簿> list = dp022_个人缴存登记簿s1_map.get(e);
                if(list!= null && list.size()>0) {
                    return Double.valueOf(list.get(0).getDpamt缴存金额()).toString();//getIndipayamt_个人月汇缴金额()+"";

                }else{
                    return "0";
                }
            }).collect(Collectors.joining("|"));
                    cebItem_basic.set_25_stdgjjgram_个人公积金账户信息_近12个自然月个人缴存额_DEC(近12个自然月个人缴存额_DE);

            String 近12个自然月个人缴存比例_DEC = strings.stream().map(e->{
                List<Dp2302个人缴存登记簿> list = dp022_个人缴存登记簿s1_map.get(e);
                if(list!= null && list.size()>0) {
                    return Double.valueOf(list.get(0).getPersondpratio个人缴存比例()).toString();//getIndiprop_个人缴存比例()+"";

                }else{
                    return "0";
                }
            }).collect(Collectors.joining("|"));


                    cebItem_basic.set_26_stdgjjgrsc_个人公积金账户信息_近12个自然月个人缴存比例_DEC(近12个自然月个人缴存比例_DEC);



















            List<Dp2301单位缴存登记簿> dp021_单位缴存登记簿_list =

                    dp2301单位缴存登记簿s
                            .stream().filter(e->{
                        try{
                            YearMonth.parse(e.getEndym截止年月(), DateTimeFormatter.ofPattern("yyyyMM"));

                            return true;
                        }catch (Exception eeex){

                            // eeex.printStackTrace();
                            return false;
                        }


                    }).filter(e->e.getInaccountstatus入账状态().equals(E_待_Dp2301_单位缴存登记簿_入账状态.E_1_入账.getText())).collect(Collectors.toList());


/*
            Map<String,List<DP021_单位缴存登记簿>> dp021_单位缴存登记簿_map_12 =

                    dp021_单位缴存登记簿_list.stream()

                            .filter(e->YearMonth.parse(e.getEndym_截止年月(), DateTimeFormatter.ofPattern("yyyyMM")).isAfter(YearMonth.from(LocalDate.now().minusMonths(13))))
                            .sorted((o1,o2)->-YearMonth.parse(o1.getEndym_截止年月(), DateTimeFormatter.ofPattern("yyyyMM")).compareTo(
                                    YearMonth.parse(o2.getEndym_截止年月(),DateTimeFormatter.ofPattern("yyyyMM"))))
                            .collect(Collectors.groupingBy(e->e.getEndym_截止年月()));
*/


            String 近12个自然月单位缴存比例_DEC = strings.stream().map(e->{
                List<Dp2302个人缴存登记簿> list = dp022_个人缴存登记簿s1_map.get(e);
                if(list!= null && list.size()>0) {
                    return Double.valueOf(list.get(0).getUnitdpratio单位缴存比例()).toString();

                }else{
                    return "0";
                }
            }).collect(Collectors.joining("|"));

            String 近12个自然月单位缴存额_DEC = strings.stream().map(e->{
                List<Dp2302个人缴存登记簿> list = dp022_个人缴存登记簿s1_map.get(e);
                if(list!= null && list.size()>0) {
                    return Double.valueOf(list.get(0).getUnitdpamt单位月缴存额()).toString();//getUnitpayamt_单位月汇缴金额0().toString();

                }else{
                    return "0";
                }
            }).collect(Collectors.joining("|"));


                    cebItem_basic.set_27_stdgjjdwam_个人公积金账户信息_近12个自然月单位缴存额_DEC(近12个自然月单位缴存额_DEC);
                    cebItem_basic.set_28_stdgjjdwsc_个人公积金账户信息_近12个自然月单位缴存比例_DEC(近12个自然月单位缴存比例_DEC);


                    //  data.set_1_28_qz_ifsgjj_jiaocun(cebItem_basic);



                    ;
                    cebItem_jiaocuns.add(cebItem_basic);
                }




        return cebItem_jiaocuns;

    }

    public List<CebItem_tiqu> queryLoanee_withdrow(Long reqId, List<Tuple3<Cm0020_个人客户基本信息,Dp0104个人客户基本信息,Dp0107个人账户信息表>> cm002s) throws MyBusinessException {

     //   public List<CebItem_tiqu> queryLoanee_withdrow(Long reqId, List<Tuple3<CM002_个人基本资料表,DP006_个人缴存信息表,DP007_个人分户账>>  cm002s) throws MyBusinessException {



        List<CebItem_tiqu> cebItem_basics = new ArrayList<>();



        for(Tuple3<Cm0020_个人客户基本信息,Dp0104个人客户基本信息,Dp0107个人账户信息表> tuple3 : cm002s){

            Cm0020_个人客户基本信息 cm0020_个人客户基本信息 = tuple3._1;
            Dp0104个人客户基本信息 dp0104个人客户基本信息 = tuple3._2;
            Dp0107个人账户信息表 dp0107个人账户信息表 = tuple3._3;






/*
            Optional<DP004_单位缴存信息表> dp004_单位缴存信息表_ = dp004_unit_payment_infoRepository.findByUnitaccnum单位账号(dp0107个人账户信息表.getUnitaccnum_单位账号());
            if(!dp004_单位缴存信息表_.isPresent()){
                throw new MyBusinessException(reqId,"找不到单位信息"+ dp0107个人账户信息表.getUnitaccnum_单位账号(),ErrorCodeEnum.操作失败);
            }
*/


         //   DP004_单位缴存信息表 dp004_单位缴存信息表 = dp004_单位缴存信息表_.get();
         //   DP005_单位分户账 dp005_work_unit_单位分户账 = dp005_workUnit_repository.findByUnitaccnum单位账号(dp007.getUnitaccnum_单位账号());


        //    List<DP005_单位分户账> dp005_work_unit_单位分户账s = dp005_workUnit_repository.findByUnitaccnum单位账号(dp007.getUnitaccnum_单位账号());
       //     DP005_单位分户账 dp005_work_unit_单位分户账 = dp005_work_unit_单位分户账s.stream().filter(e->e.getUnitacctype单位账户类型().equals(E_DP005_单位分户账_单位账户类型.普通.getText())).findFirst().get();


        //    CM001_单位基本资料表 cm001_单位基本资料表 = cm001Repository.findByUnitcustid单位客户号(dp004_单位缴存信息表.getUnitcustid_单位客户号());




            //  data.set_1_28_qz_ifsgjj_jiaocun(cebItem_basic);


            List<Dw0202提取审批信息表> dw025_公积金提取审核登记表s = dw0202提取审批信息表Repository
                    .findByAccnum个人账号OrderByTransdate业务发生日期Desc(dp0104个人客户基本信息.getAccnum个人账号())
                    .stream().filter(e->e.getApprstatus审批状态().equals(E_待_Dw0202__提取审批信息表_Apprstatus审批状态.E_4_已审批.getText())).collect(Collectors.toList());




            cebItem_basics.addAll( dw025_公积金提取审核登记表s.stream().map(e->{
                CebItem_tiqu cebItem_tiqu = new CebItem_tiqu();
                cebItem_tiqu.set_29_std400cunm_申请人基本信息_姓名_String(cm0020_个人客户基本信息.getName姓名());
                cebItem_tiqu.set_30_stdperid_申请人基本信息_个人编号_String(cm0020_个人客户基本信息.getCustid个人客户号());
                cebItem_tiqu.set_31_std400idtp_申请人基本信息_证件类型_String(dp0104个人客户基本信息.getZjlx证件类型());
                cebItem_tiqu.set_32_std400idno_申请人基本信息_证件号码_String(dp0104个人客户基本信息.getZjhm证件号码());
                cebItem_tiqu.set_33_stdgjjacno_个人公积金提取信息_公积金账号_String(dp0104个人客户基本信息.getAccnum个人账号());


                cebItem_tiqu.set_34_stdgjjwdrn_个人公积金提取信息_提取原因_String("枚举:"+ E_待_DW0202_公积金提取审核登记表_提取原因_WithdrawReasonEnum.fromString(e.getDrawreason提取原因()).getDisplayText());


/*

                Map<String,List<DP021_单位缴存登记簿>> dp021_单位缴存登记簿_map =

                        dw025_公积金提取审核登记表s
                                .stream()
                                .sorted(ee->e.getTransdate交易日期())
                                .collect(Collectors.groupingBy(e->e.getEndym_截止年月()));
*/


/*
                List<String> strings = IntStream.rangeClosed(1,12)
                        .mapToObj(e->YearMonth.from(LocalDate.now().minusMonths(e)).format(DateTimeFormatter.ofPattern("yyyyMM"))).collect(Collectors.toList());
*/



                cebItem_tiqu.set_35_stdgjjwddt_个人公积金提取信息_提取时间_String(e.getTransdate业务发生日期().toString());
                cebItem_tiqu.set_36_stdgjjwdtp_个人公积金提取信息_提取方式_String("没有相关信息");
                cebItem_tiqu.set_38_stdgjjwdam_个人公积金提取信息_提取金额_String(Double.valueOf(e.getDrawamt提取金额()).toString());




                cebItem_tiqu.set_39_stdgjjtwdnm_个人公积金提取信息_共同提取人姓名_String("没有相关信息");
                cebItem_tiqu.set_40_stdgjjtwdno_个人公积金提取信息_共同提取人身份证号_String("没有相关信息");
                cebItem_tiqu.set_41_stdgjjtwdbd_个人公积金提取信息_共同提取人是否建立公积金_String("没有相关信息");

                return cebItem_tiqu;
            }).collect(Collectors.toList()));

        }

        return cebItem_basics;

    }
    public List<CebItem_daikuan> queryLoanee__loan(Long reqId, String certnum) throws MyBusinessException {



        List<Ln2108借款人信息> ln008_借款人信息s = ln2108借款人信息Repository.findByContractcode合同代码(certnum);


        return ln008_借款人信息s.stream().map(e->{

            Ln0301_个人住房贷款借款合同信息 ln003= ln0301_个人住房贷款借款合同信息Repository.findByContractcode合同代码(e.getContractcode合同代码());

  /*          if(!ln003.get().equals(E_LN003_合同信息_合同状态.放款.getText())){
                return null;
            }*/
/*            LN005_贷款分户信息 ln005_贷款分户信息 =
                    ln005_贷款分户信息_repository.findByloancontrcode合同代码(ln003.getContractcode合同代码())
                            .stream()
                            .filter(bb->bb.getLoanacctype_贷款分户类型().equals(E_LN005_贷款分户信息_贷款分户类型.E_01_正常贷款.getText()))
                            .findFirst().get();*/





           // List<LN008_借款人信息> ln008_借款人信息s_ = ln008_借款人类型Repository.findByloancontrcode合同代码(ln003.getContractcode合同代码());


            Dp0104个人客户基本信息 dp0104个人客户基本信息 = dp0104个人客户基本信息Repository.findByAccnum个人账号(e.getAccnum个人账号());
            CebItem_daikuan cebItem_daikuan = new CebItem_daikuan();
            cebItem_daikuan.set_42_std400cunm_申请人基本信息_姓名_String(dp0104个人客户基本信息.getXingming姓名());
            cebItem_daikuan.set_43_stdperid_申请人基本信息_个人编号_String(e.getCustid个人客户号());
            cebItem_daikuan.set_44_std400idtp_申请人基本信息_证件类型_String(dp0104个人客户基本信息.getZjlx证件类型());
            cebItem_daikuan.set_45_std400idno_申请人基本信息_证件号码_String(dp0104个人客户基本信息.getZjhm证件号码());
            cebItem_daikuan.set_46_stdgjjdkid_个人公积金贷款信息_公积金账号_String(dp0104个人客户基本信息.getAccnum个人账号());

            List<Ln0306个人住房贷款逾期登记信息> ln006_贷款分期还款计划s = ln0306个人住房贷款逾期登记信息Repository.findByContractcode合同代码(ln003.getContractcode合同代码());

            Optional<Ln3301贷款还款计划> ln3301贷款还款计划 = ln3301贷款还款计划Repository.findTop1ByContractcode合同代码OrderByCurrentterm当期期次Desc(ln003.getContractcode合同代码());


          //  List<Ln0306个人住房贷款逾期登记信息> sortDesList = ln006_贷款分期还款计划s.stream().sorted(Comparator.comparing(LN006_贷款分期还款计划::getBegdate0开始日期).reversed()).collect(Collectors.toList());


            Ln0304个人住房贷款账户信息 ln0304个人住房贷款账户信息 = ln0304个人住房贷款账户信息Repository.findByContractcode合同代码(ln003.getContractcode合同代码());

            cebItem_daikuan.set_47_stdgjjdkbh_个人公积金贷款信息_公积金贷款编号_String(e.getContractcode合同代码());
            cebItem_daikuan.set_48_stdgjjdkam_个人公积金贷款信息_公积金贷款金额_DEC(ln0304个人住房贷款账户信息.getDkffe贷款发放额());
            cebItem_daikuan.set_49_stdgjjdkpd_个人公积金贷款信息_公积金贷款期限_String(Long.valueOf(ln0304个人住房贷款账户信息.getDkqs贷款期数()).toString());
            cebItem_daikuan.set_50_stdgjjppam_个人公积金贷款信息_公积金贷款月还款额_DEC(ln0304个人住房贷款账户信息.getDqjhhkje当期计划还款金额());
            cebItem_daikuan.set_51_stdgjjdkdt_个人公积金贷款信息_公积金贷款起始日期_String(ln0304个人住房贷款账户信息.getDkffrq贷款发放日期().toString());
            cebItem_daikuan.set_52_stdgjjmudt_个人公积金贷款信息_公积金贷款到期日期_String(ln003.getYddqrq约定到期日期().toString());
            cebItem_daikuan.set_53_stdgjjjqdt_个人公积金贷款信息_公积金贷款结清日期_String(ln0304个人住房贷款账户信息.getDkjqrq贷款结清日期().toString());
            cebItem_daikuan.set_54_stdgjjdkye_个人公积金贷款信息_公积金贷款余额_DEC(ln0304个人住房贷款账户信息.getDkye贷款余额());


            List<Ln0303共同借款人信息> ln0303共同借款人信息s = ln0303共同借款人信息Repository.findByContractcode合同代码(ln0304个人住房贷款账户信息.getContractcode合同代码());
        //    Optional<LN008_借款人信息> ln008_借款人信息_option = ln008_借款人信息s_.stream().filter(ee->e.getAccnum1账号().equals(ee.getAccnum1账号())).filter(ee->ee.getLoaneetype_借款人类型().equals(E_LN008_借款人信息_借款人类型.共同借款人.getText())).findFirst();
            if(ln0303共同借款人信息s.stream().findAny().isPresent()){
                Ln0303共同借款人信息 ln008_借款人信息 =  ln0303共同借款人信息s.stream().findAny().get();
                cebItem_daikuan.set_55_stdgjjtdknm_个人公积金贷款信息_共同贷款人姓名_String(ln008_借款人信息.getGtjkrxm共同借款人姓名());
                cebItem_daikuan.set_56_stdgjjtdkno_个人公积金贷款信息_共同贷款人身份证号_String(E_DP007_个人分户账_证件类型.fromString(ln008_借款人信息.getGtjkrzjlx共同借款人证件类型()).getDisplayText());

                Ac0103客户与应用账户关联表 ac0103客户与应用账户关联表 =
                        ac0103客户与应用账户关联表Repository.findByCustid个人客户号AndAccounttype账户类型(ln008_借款人信息.getCustid个人客户号(), NEW_账号类型_ACCOUNTTYPE._3_个人账号.getText());


                cebItem_daikuan.set_57_stdgjjtdkbd_个人公积金贷款信息_共同贷款人是否建立公积金_String(ac0103客户与应用账户关联表 != null?"":"");


            }

            cebItem_daikuan.set_58_stdgjjdkaddr_个人公积金贷款信息_联系地址__家庭___String("找不到??");
            cebItem_daikuan.set_59_stdgjjdkzt_个人公积金贷款信息_贷款状态_String(E_待LN003_合同信息_贷款账户状态.fromString(ln0304个人住房贷款账户信息.getDkzt贷款状态()).getDisplayText());
            cebItem_daikuan.set_61_stdgjjyqcs_个人公积金贷款信息_公积金贷款历史发生逾期次数_Int(Long.valueOf(ln0304个人住房贷款账户信息.getLjyqqs累计逾期期数()).intValue());


            List<Ln0306个人住房贷款逾期登记信息> ln006_repaymentPlans1 = ln006_贷款分期还款计划s.stream()
                    .filter(ee->ee.getCreatetime创建时间().isAfter(LocalDateTime.now().minusYears(2)))
                 //   .filter(ee->ee.getCurseqstate本期状态().equals(E_LN006_贷款分期还款计划_curseqStatusEnum.逾期.getText()))
                 //   .filter(ee->ee.getCurseqstate本期状态().equals(E_LN006_贷款分期还款计划_curseqStatusEnum.逾期归还.getText()))
                    .collect(Collectors.toList());


            Ln0306个人住房贷款逾期登记信息 pre_LN006_RepaymentPlan = null;
            Integer 最大连续逾期次数 = 0;
            Integer 连续逾期次数 = 0;
            for(Ln0306个人住房贷款逾期登记信息 eee:ln006_repaymentPlans1){
                if(pre_LN006_RepaymentPlan != null){

                    if(Math.abs(pre_LN006_RepaymentPlan.getYqqc逾期期次()-eee.getHkqc还款期次()) ==1){
                        连续逾期次数++;
                    }else{
                        if(最大连续逾期次数 < 连续逾期次数){
                            最大连续逾期次数 = 连续逾期次数;
                        }
                        连续逾期次数 = 0;
                    }
                }

                pre_LN006_RepaymentPlan  = eee;

            }

            if(ln3301贷款还款计划.isPresent()){
                cebItem_daikuan.set_60_stdgjjdqzt_个人公积金贷款信息_当期还款状态_String(ln3301贷款还款计划.get().getPlandate计划还款日期()+ln3301贷款还款计划.get().getTermstatus期次状态()
                     /*   + E_LN006_贷款分期还款计划_curseqStatusEnum.fromString().getDisplayText()*/);

            }

            cebItem_daikuan.set_62_stdgjjmyqcs_个人公积金贷款信息_最大连续的逾期期数_近24个月__Int(最大连续逾期次数.intValue());

            return cebItem_daikuan;

        }).filter(e->e!= null).collect(Collectors.toList());



    }



}
