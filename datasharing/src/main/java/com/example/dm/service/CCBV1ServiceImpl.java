package com.example.dm.service;


import com.alibaba.fastjson.JSON;
import com.example.dm.apidata.Query;
import com.example.dm.apidata.ccbV1.CcbItem;
import com.example.dm.apidata.ccbV1.Ccbdata;
import com.example.dm.domain.*;
import com.example.dm.enumT.*;
import com.example.dm.exception.MyBusinessException;
import com.example.dm.pojo.CCBExcel;
import com.example.dm.repository.*;


import com.example.dm.util.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by silence yuan on 2015/7/25.
 */

@Service
public class CCBV1ServiceImpl {
    private Logger logger = LoggerFactory.getLogger(CCBV1ServiceImpl.class);

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
    private Dp2302个人缴存登记簿Repository dp2302个人缴存登记簿Repository;


    @Autowired
    private Dp1106个人缴至信息Repository dp1106个人缴至信息Repository;

    @Autowired
    private Dw0202提取审批信息表Repository dw0202提取审批信息表Repository;


/*
    @Autowired
    private DW025_公积金提取审核登记表_Repository dW025_公积金提取审核登记表_Repository;

    @Autowired
    private DP007_个人分户账_Repository dp007_individual_sub_accountRepository;
    @Autowired
    private DP006_个人缴存信息表_Repository dp006_payment_repository;


    @Autowired
    private CD003_卡分户信息Repository cd003_卡分户信息Repository;


*/

/*    @Autowired
    private CM081_短信密码签订登记簿_Repository cm081__短信密码签订登记簿_repository;

    @Autowired
    private DP004_单位缴存信息表_Repository dp004_unit_payment_infoRepository;

    @Autowired
    private DP005_单位分户账_Repository dp005_workUnit_repository;*/

   // @Autowired
  //  private CM001_单位基本资料表Repository cm001Repository;
/*

    @Autowired
    private DP202_单位缴存变更登记簿_Repository dp202_单位缴存变更登记簿_repository;

*/

    @Autowired
    private LogServiceImpl logService;
    @Autowired
    private Ac2303联名卡状态登记簿Repository ac2303联名卡状态登记簿Repository;
    @Autowired
    private Ac0103客户与应用账户关联表Repository ac0103客户与应用账户关联表Repository;



    @Autowired
    private Map<String,CCBExcel> ccbSHTYXYDMMap;


/*    public ReturnResult product_querry(Query query) {
        try {

            ApiQuery[] datas = queryLoanee(query.getZjhm());
            return ReturnResult.情况1_返回成功(datas);
        } catch (MyBusinessException e) {
            e.getMessage();
            System.out.println("错误信息：" + e.getMessage());
            e.printStackTrace();
            if (e.getCode().equals(ErrorCodeEnum.入参格式错误)) {
                return ReturnResult.情况4_入参数格式错误(e.getMessage());
            }
            if (e.getCode().equals(ErrorCodeEnum.操作失败)) {
                return ReturnResult.情况5_操作失败();
            }
            if (e.getCode().equals(ErrorCodeEnum.查询为空)) {
                return ReturnResult.情况2_查询为空();
            }
            return ReturnResult.情况5_操作失败();
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnResult.情况5_操作失败(e.getMessage());
        }
    }*/

  String constant_yyy_mm= "yyyy-MM";
    String constant_yyy_mm_old= "yyyyMM";


    public Ccbdata queryLoanee(Object principal, HttpServletRequest request, Query wtrjgh, String certinum) throws MyBusinessException {


        String principal_s = (String)principal;
        Long no = logService.beginReq(principal_s.split(":"), request, JSON.toJSONString(wtrjgh));





        String  Zjhm证件号码 = wtrjgh.getZjhm().trim();
        String  Zjlx证件类型 =E_待_证据类型_证件类型.from(E_待_证据类型_证件类型_CCB.fromString(wtrjgh.getZjlx().trim())).getText();
        String  Xingming姓名 = wtrjgh.getXm().trim();


        List<Dp0104个人客户基本信息> dp0104个人客户基本信息s = dp0104个人客户基本信息Repository.findByZjhm证件号码AndZjlx证件类型(certinum,E_待_证据类型_证件类型.身份证.getText());



        List<CcbItem> datas= new ArrayList<>();
        if(dp0104个人客户基本信息s.size()== 0){
            throw new MyBusinessException(no,"找不到该缴存人", ErrorCodeEnum.查询为空);
        }
        if(dp0104个人客户基本信息s.stream().filter(e->
            e.getZjhm证件号码().trim().equals(Zjhm证件号码) &&
            e.getZjlx证件类型().trim().equals(Zjlx证件类型) &&
                    e.getXingming姓名().trim().equals(Xingming姓名)
                            //cm0020_个人客户基本信息.gete.getAccname_个人姓名().trim().equals(wtrjgh.getXm().trim())
        ).count()==0) {

            dp0104个人客户基本信息s.stream().forEach(e->
                    logger.debug("=================="+ e.toString())
                    );

            List<Cm0022个人客户证件信息> cm002s = cm0022个人客户证件信息Repository.findByCrednum证件号码AndPersoncredtype个人客户证件类型(Zjhm证件号码, Zjlx证件类型);

            String inerText = cm002s.stream().map(e->{
                        Cm0020_个人客户基本信息 cm0020_个人客户基本信息 = cm0020_个人客户基本信息Repository.findByCustid个人客户号(e.getCustid个人客户号());
                        return "证件号码:"+e.getCrednum证件号码()+"证件类型:"+e.getPersoncredtype个人客户证件类型()+"个人姓名:"+cm0020_个人客户基本信息.getName姓名();
                    }
                 //   String inerText = cm002s.stream().map(e->"证件号码:"+e.getCertinum证件号码()+"证件类型:"+e.getCertitype证件类型()+"个人姓名:"+e.getAccname_个人姓名()
            ).collect(Collectors.joining(";"));
            String reqText = "证件号码:"+wtrjgh.getZjhm()+"证件类型:"+wtrjgh.getZjlx()+"个人姓名:"+wtrjgh.getXm();
            throw new MyBusinessException(no,"根据请求数据 "+reqText+" 找到了缴存人，但系统中存在如下信息 "+inerText,ErrorCodeEnum.查询为空);
        };



        datas.addAll(dp0104个人客户基本信息s.stream().map(e->{
            CcbItem ccbItem  = null;
            try {
                ccbItem = queryLoanee(no,e);
            } catch (MyBusinessException myBusinessException) {
                myBusinessException.printStackTrace();
            }
            if(ccbItem != null){
                ccbItem.set__wtrxm_0_委托人名称_0(wtrjgh.getWtrxm());
                ccbItem.set__wtrjgh_1_委托人机构号_Y(wtrjgh.getWtrjgh());

                return ccbItem;
            }else{
                return null;//
            }
        }).filter(e->e!= null).collect(Collectors.toList()));






        System.out.println("============== 找到了，数据"+ datas.toString());
     //   List<CcbItem> ccbItems = datas.stream().filter(e->e.().equals(E_DP007_个人分户账_个人账户状态.ccb_from(E_DP007_个人分户账_个人账户状态.正常.getText())))
        List<CcbItem> ccbItems = datas.stream().filter(e->e.get__gbgrzhzt_5_贯标个人账户状态_Y().equals(E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB.正常.getText()))

                .sorted((o1,o2)->-YearMonth.parse(o1.get__gbjzny_18_贯标缴至年月_Y(),DateTimeFormatter.ofPattern(constant_yyy_mm_old)).compareTo(
                        YearMonth.parse(o2.get__gbjzny_18_贯标缴至年月_Y(),DateTimeFormatter.ofPattern(constant_yyy_mm_old))))
                .collect(Collectors.toList());
        logService.endReq(no,JSON.toJSONString(datas));
        if(ccbItems.size()> 1){


            Ccbdata ccbdata = new Ccbdata();
            ccbdata.setSeqNo(no+"");
            ccbdata.setTime(LocalDateTime.now());

            ccbdata.setData(Arrays.asList(ccbItems.get(0)));
            return ccbdata;



        }else{
            Ccbdata ccbdata = new Ccbdata();
            ccbdata.setSeqNo(no+"");
            ccbdata.setData(ccbItems);
            ccbdata.setTime(LocalDateTime.now());
            System.out.println("============== 没有找到数据啊啊啊 ，数据"+ ccbItems.toString());
            return ccbdata;

        }
    }




    class ReturnDate{
        CcbItem data;
        Date lastDate;

        public CcbItem getData() {
            return data;
        }

        public void setData(CcbItem data) {
            this.data = data;
        }

        public Date getLastDate() {
            return lastDate;
        }

        public void setLastDate(Date lastDate) {
            this.lastDate = lastDate;
        }
    }
    public CcbItem queryLoanee(Long reqId,  Dp0104个人客户基本信息 dp0104个人客户基本信息) throws MyBusinessException {



        //LocalDate start18月 = LocalDate.now().minusMonths(20).with(firstDayOfMonth());

/*
        Ac0103客户与应用账户关联表 ac0103客户与应用账户关联表 =
                cm0001企业客户基本信息表Repository.findByCustid个人客户号AndAccounttype账户类型(cm0020_个人客户基本信息.getCustid个人客户号(), NEW_账号类型_ACCOUNTTYPE._01_个人账号.getText());
*/




      Dp0107个人账户信息表 dp0107个人账户信息表 = dp0107个人账户信息表Repository.findByAccnum个人账号(dp0104个人客户基本信息.getAccnum个人账号());
     //   Optional<Cm0024个人客户地址信息> optionalCm0024个人客户地址信息 = cm0024个人客户地址信息Repository.findTop1ByCustid个人客户号AndTransdate业务发生日期Desc(dp0107个人账户信息表.getCustid个人客户号());

      //  Dp0104个人客户基本信息 dp006 = dp0104个人客户基本信息Repository.findByCustid个人客户号(cm002.getCustid个人客户号());
/*
        if(dp006 == null){
            throw new MyBusinessException(reqId,"没有找到缴存信息,客户号："+ cm0020_个人客户基本信息.getCustid个人客户号() + " 身份证号："+ cm0020_个人客户基本信息.getCertinum证件号码()
                    ,ErrorCodeEnum.操作失败);
        }
*/



       // DP007_个人分户账 dp007 = dp007_individual_sub_accountRepository.findByAccnum个人账号(dp006.getAccnum个人账号());
        if(dp0107个人账户信息表 == null){
            throw new MyBusinessException(reqId,"没有找到缴存信息,缴存帐号："+ dp0107个人账户信息表.getAccnum个人账号() + " 身份证号："+ dp0104个人客户基本信息.getZjhm证件号码()
                    ,ErrorCodeEnum.操作失败);

        }

        System.out.println("================================"+ dp0107个人账户信息表.toString());
        //if(!E_DP007_个人分户账_个人账户状态.fromString(dp007.getIndiaccstate_个人账户状态()).getText().equals(E_DP007_个人分户账_个人账户状态.正常.getText())){
        if(!dp0107个人账户信息表.getGrzhzt个人账户状态().equals(E_待_dp0107个人账户信息表_Grzhzt个人账户状态.正常.getText())){
        //if(!E_DP007_个人分户账_个人账户状态.fromString(dp007.getIndiaccstate_个人账户状态()).getText().equals(E_DP007_个人分户账_个人账户状态.正常.getText())){
            return null;
        }
        //data.set__gbgrzhzt_5_贯标个人账户状态_Y(E_DP007_个人分户账_个人账户状态.正常.getText());
        CcbItem data = new CcbItem();

        data.set__wtrjgh_1_委托人机构号_Y("??");

        data.set__khfdmc_2_客户法定名称_Y(dp0104个人客户基本信息.getXingming姓名().trim());


        data.set__zjlxdm_3_证件类型代码_Y(E_待_证据类型_证件类型_CCB.from(E_待_证据类型_证件类型.fromString(dp0104个人客户基本信息.getZjlx证件类型())).getText());
        data.set__zjhm_4_证件号码_Y(dp0104个人客户基本信息.getZjhm证件号码().trim());
/*        data.set__khfdmc_2_客户法定名称_Y(cm0020_个人客户基本信息.getAccname_个人姓名().trim());
        data.set__zjlxdm_3_证件类型代码_Y(cm0020_个人客户基本信息.getCertitype证件类型());
        data.set__zjhm_4_证件号码_Y(cm0020_个人客户基本信息.getCertinum证件号码().trim());*/


      //  data.set__gbgrzhzt_5_贯标个人账户状态_Y(E_DP007_个人分户账_个人账户状态.ccb_from(dp007.getIndiaccstate_个人账户状态()));
        //data.set__gbgrzhzt_5_贯标个人账户状态_Y(E_DP007_个人分户账_个人账户状态.正常.getText());
        data.set__gbgrzhzt_5_贯标个人账户状态_Y(E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB.from(E_待_dp0107个人账户信息表_Grzhzt个人账户状态.fromString(dp0107个人账户信息表.getGrzhzt个人账户状态())).getText()); //dp007.getIndiaccstate_个人账户状态()



        data.set__gbgrzhye_6_贯标个人账户余额_Y(dp0107个人账户信息表.getGrzhye个人账户余额()+""); //dp007.getBal_余额().toString()
        data.set__gbgrjcbl_7_贯标个人缴存比例_Y(dp0107个人账户信息表.getGrjcbl个人缴存比例()+"");//dp006.getIndiprop_个人缴存比例().toString()
        data.set__gbdwjcbl_8_贯标单位缴存比例_Y(dp0107个人账户信息表.getDwjcbl单位缴存比例()+""); //dp006.getUnitprop_单位比例().toString()
        //data.set__gjjyjcze_9_公积金月缴存总额_Y(dp006.getUnitpayamt_单位月汇缴金额().add(dp006.getUnitpayamt_单位月汇缴金额()).toString());
        data.set__gjjyjcze_9_公积金月缴存总额_Y(dp0107个人账户信息表.getGrjcbl个人缴存比例()+dp0107个人账户信息表.getGryjce个人月缴存额()+"");


        data.set__gbgrjcjs_10_贯标个人缴存基数_Y(dp0107个人账户信息表.getGrjcjs个人缴存基数()+"");  //dp006.getBasenum_缴存基数().toString()

        data.set__bnye_11_本年余额_Y(dp0107个人账户信息表.getGrzhye个人账户余额()+""); //dp007.getBal_余额().toString()


        List<Dp2302个人缴存登记簿> dp2302个人缴存登记簿s = dp2302个人缴存登记簿Repository
                .findByAccnum个人账号(dp0107个人账户信息表.getAccnum个人账号()).stream()
                //.filter(e->e.getTranstype_交易类型().equals(E_DP008_单位明细账_交易类型_transtype.正常.getText()))
                //.filter(e->e.getInaccstate_入账状态().equals(E_DP022_个人缴存登记簿_入账状态_inaccstate.E_1_入账.getText()))
                .filter(e->e.getTranstype交易类型().trim().equals(E_Dp2302个人缴存登记簿_单位明细账_交易类型_transtype.正常.getText()))
                .filter(e->e.getInaccountstatus入账状态().trim().equals(E_DP022_个人缴存登记簿_入账状态_inaccstate.E_1_入账.getText()))
                .sorted((o1,o2)->-YearMonth.parse(o1.getDpym缴存年月(),DateTimeFormatter.ofPattern(constant_yyy_mm)).compareTo(
                        YearMonth.parse(o2.getDpym缴存年月(),DateTimeFormatter.ofPattern(constant_yyy_mm))))
                .collect(Collectors.toList());
                ;


       List<String>aa =  dp2302个人缴存登记簿Repository.findByAccnum个人账号(dp0107个人账户信息表.getAccnum个人账号().trim()).stream()
                .sorted((o1,o2)->-YearMonth.parse(o1.getDpym缴存年月(),DateTimeFormatter.ofPattern(constant_yyy_mm)).compareTo(
                        YearMonth.parse(o2.getDpym缴存年月(),DateTimeFormatter.ofPattern(constant_yyy_mm))))
                .map(ee-> ee.getDpym缴存年月() +"|"+ ee.getTranstype交易类型() + "|"+ee.getInaccountstatus入账状态())
                .collect(Collectors.toList());

        System.out.println("观察观察"+ dp2302个人缴存登记簿Repository.findByAccnum个人账号(dp0107个人账户信息表.getAccnum个人账号().trim()).size());

                System.out.println("====dp2302个人缴存登记簿s====dp2302个人缴存登记簿s======="+ dp2302个人缴存登记簿s.toString());


        //getBegym开始年月()//  getBegym开始年月()
        data.set__lnjccs_12_历年汇缴次数_Y(dp2302个人缴存登记簿s
                .stream()
                .filter(e->YearMonth.parse(e.getDpym缴存年月(),DateTimeFormatter.ofPattern(constant_yyy_mm)).atEndOfMonth().isAfter(LocalDate.now().minusMonths(36)))
                .filter(e->{

                    e.getInaccountdate入账日期();
                    System.out.println(e.getDpym缴存年月()+ "历年汇缴次数 入账时间："+e.getInaccountdate入账日期());

             //     System.out.println("历年汇缴次数 入账时间："+e.getInaccdate入账日期());
                System.out.println("历年汇缴次数 入账时间今年开始时间："+LocalDate.now().with(TemporalAdjusters.firstDayOfYear()));


                    return e.getDptype缴存类型().trim().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_1_汇缴.getText());

                   // return e.getDptype_缴存类型().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_1_汇缴.getText());
                })
                .count()+"");




        data.set__lnbjcs_13_历年补缴次数_Y(dp2302个人缴存登记簿s
                .stream()   //getBegym开始年月()
                .filter(e->YearMonth.parse(e.getDpym缴存年月(),DateTimeFormatter.ofPattern(constant_yyy_mm)).atEndOfMonth().isAfter(LocalDate.now().minusMonths(36)))
                .filter(e-> Arrays.asList(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_2_正常全额补缴,
                        E_DP022_个人缴存登记簿_汇缴类型_dptype.E_3_正常差额补缴,
                        E_DP022_个人缴存登记簿_汇缴类型_dptype.E_4_不定额补缴)
                        .stream()
                        .map(ee->ee.getText())
                        .collect(Collectors.toList())
                        .contains(e.getDptype缴存类型().trim())) //getDptype_缴存类型()))
                .count()+"");




/*        YearMonth.parse(tuple2._2.getBegym_开始年月(),DateTimeFormatter.ofPattern("yyyyMM")).atDay(1);
        YearMonth.parse(tuple2._2.getEndym_截止年月(),DateTimeFormatter.ofPattern("yyyyMM"));
        Period next = Period.between(YearMonth.parse(tuple2._2.getBegym_开始年月(),DateTimeFormatter.ofPattern("yyyyMM")).atDay(1),
                YearMonth.parse(tuple2._2.getEndym_截止年月(),DateTimeFormatter.ofPattern("yyyyMM")).atDay(1));


        DateUtils.getYearAndMothen(localDate)
           */ //getBegym开始年月()

        data.set__bnhjcs_14_本年汇缴次数_Y(dp2302个人缴存登记簿s
                .stream()
                .filter(e->YearMonth.parse(e.getDpym缴存年月() ,DateTimeFormatter.ofPattern(constant_yyy_mm)).atEndOfMonth().isAfter(LocalDate.now().minusMonths(12)))
                .filter(e->e.getInaccountdate入账日期().toLocalDate().isAfter(LocalDate.now().minusMonths(12)))

                //.filter(e->e.getInaccdate入账日期().isAfter(LocalDate.now().minusMonths(12)))
                .filter(e->{
                    //System.out.println("本年汇缴次数 入账时间："+e.getInaccdate入账日期());
                  //  System.out.println("本年汇缴次数 入账时间今年开始时间："+LocalDate.now().with(TemporalAdjusters.firstDayOfYear()));
                  //  System.out.println("本年汇缴次数 getColpaytype_汇缴类型0："+e.getColpaytype_汇缴类型0());
                    return e.getDptype缴存类型().trim().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_1_汇缴.getText());

                  //  return e.getDptype_缴存类型().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_1_汇缴.getText());
                })
                .count()+"");


        data.set__bnbjcs_15_本年补缴次数_Y(dp2302个人缴存登记簿s
                .stream()
                .filter(e->YearMonth.parse(e.getDpym缴存年月(),DateTimeFormatter.ofPattern(constant_yyy_mm)).atEndOfMonth().isAfter(LocalDate.now().minusMonths(12)))
               // .filter(e->YearMonth.parse(e.getBegym开始年月(),DateTimeFormatter.ofPattern("yyyyMM")).atEndOfMonth().isAfter(LocalDate.now().minusMonths(12)))

              //  .filter(e->e.getInaccdate入账日期().isAfter(LocalDate.now().minusMonths(12)) )//.with(TemporalAdjusters.firstDayOfYear())))
                .filter(e-> Arrays.asList(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_2_正常全额补缴,
                        E_DP022_个人缴存登记簿_汇缴类型_dptype.E_3_正常差额补缴,
                        E_DP022_个人缴存登记簿_汇缴类型_dptype.E_4_不定额补缴)
                        .stream()
                        .map(ee->ee.getText())
                        .collect(Collectors.toList())
                    //    .contains(e.getDptype_缴存类型()))
                .contains(e.getDptype缴存类型().trim()))

                .count()+"");



        List<Dw0202提取审批信息表> dw025_公积金提取审核登记表s = dw0202提取审批信息表Repository
                .findByAccnum个人账号OrderByTransdate业务发生日期Desc(dp0107个人账户信息表.getAccnum个人账号())
                .stream().filter(e->e.getApprstatus审批状态().trim().equals(E_待_Dw0202提取审批信息表.E_6.getText())).collect(Collectors.toList());

        data.set__lnzqcs_16_历年支取次数_Y(dw025_公积金提取审核登记表s

                .stream()
                .filter(e->e.getTransdate业务发生日期().toLocalDate().isAfter(LocalDate.now().minusMonths(36)))
                     //   getTransdate交易日期().isAfter(LocalDate.now().minusMonths(36)))

                //      .filter(e->e.getTransdate交易日期().isAfter(LocalDate.now().minusMonths(12)))
              //  .filter(e->e.getColpaytype_汇缴类型0().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_1_汇缴.getText()))
                .count()+"");

        data.set__bnzqcs_17_本年支取次数_Y(dw025_公积金提取审核登记表s
                .stream()
                .filter(e->e.getTransdate业务发生日期().toLocalDate().isAfter(LocalDate.now().minusMonths(12)))

                //.filter(e->e.getTransdate交易日期().isAfter(LocalDate.now().minusMonths(12)))
              .count()+"");
        data.set__gbjzny_18_贯标缴至年月_Y(YearMonth.parse(dp0107个人账户信息表.getJzny缴至年月(),DateTimeFormatter.ofPattern(constant_yyy_mm)).format(DateTimeFormatter.ofPattern(constant_yyy_mm_old)));//dp004_单位缴存信息表.getLpaym_缴至年月().trim());

        if(!dw025_公积金提取审核登记表s.isEmpty()){
            data.set__zhzqrq_19_最后支取日期_Y(dw025_公积金提取审核登记表s.get(0).getTransdate业务发生日期().toString());//getTransdate交易日期().toString());

        }
        data.set__ywzl_20_业务种类_Y(B_业务种类._01_基本公积金.getText());

        Dp0106单位账户信息 dp0106单位账户信息 = dp0106单位账户信息Repository.findByUnitaccnum单位账号(dp0107个人账户信息表.getUnitaccnum单位账号());


        System.out.println("========================"+dp0107个人账户信息表.getDwzh单位账号外部()+"===================="+NEW_账号类型_ACCOUNTTYPE._1_单位账号.getText());
        Ac0103客户与应用账户关联表 ac0103客户与应用账户关联表 =
                ac0103客户与应用账户关联表Repository.findByExtaccnum外部账号AndAccounttype账户类型(dp0107个人账户信息表.getDwzh单位账号外部(), NEW_账号类型_ACCOUNTTYPE._1_单位账号.getText());


        Dp0102_单位客户基本信息表 dp0102_单位客户基本信息表 = dp0102_单位客户基本信息表Repository.findByUnitaccnum单位账号(dp0106单位账户信息.getUnitaccnum单位账号());
        Cm0001企业客户基本信息表 cm0001企业客户基本信息表 = cm0001企业客户基本信息表Repository.findByUnitcustid单位客户号(ac0103客户与应用账户关联表.getCustid个人客户号());
    //    Cm0003企业客户证件信息 cm0003企业客户证件信息 = cm0003企业客户证件信息Repository.findByUnitcustid单位客户号(cm0001企业客户基本信息表.getUnitcustid单位客户号());

       // data.set__gzdwxzdm_21_工作单位性质代码_Y(dp0102_单位客户基本信息表.getDwjjlx单位经济类型());//getUnitkind_单位性质());


        data.set__gzdwxzdm_21_工作单位性质代码_Y(E_CM001_单位基本资料表_单位性质_建设银行.from_CEB(E_待_DP0102_PaymentUnitTypeEnum_单位性质_定.fromString(dp0102_单位客户基本信息表.getUnitproperty单位性质())).getText());//getUnitkind_单位性质());
        //data.set_9_dwsshy_单位所属行业(E_CM001_单位基本资料表_单位性质.from_CCB(cm001_单位基本资料表.getUnitkind_单位性质()).getText());

       // data.set_9_dwsshy_单位所属行业(E_CM001_单位基本资料表_单位性质.from_CCB(cm0001企业客户基本信息表.getUnitbelongindustry单位所属行业()).getText());


/*
        if(optionalCm0024个人客户地址信息.isPresent()){

                Cm0024个人客户地址信息 cm0024个人客户地址信息 = optionalCm0024个人客户地址信息.get();
                data.set__gbjtzz_22_贯标家庭住址_N(
                        cm0024个人客户地址信息.getProvincename省份名称()+
                                cm0024个人客户地址信息.getCityname城市名称()+
                                cm0024个人客户地址信息.getRegionname区域名称()+ cm0024个人客户地址信息.getStreetname街道名称()
                +cm0024个人客户地址信息.getAddrdetail地址详情());

        }else{
            data.set__gbjtzz_22_贯标家庭住址_N("");
        }
*/

        data.set__gbjtzz_22_贯标家庭住址_N(StringUtils.isAllBlank(dp0104个人客户基本信息.getJtzz家庭住址())?"":dp0104个人客户基本信息.getJtzz家庭住址());
       // data.set__gbsjhm_23_贯标手机号码_N("??");
        data.set__gbgrzh_24_贯标个人账号_N(dp0107个人账户信息表.getGrzh个人账号外部().trim());//dp006.getAccnum个人账号());
        data.set__gbgryjce_25_贯标个人月缴存额_O(dp0107个人账户信息表.getGryjce个人月缴存额()+"");// dp006.getIndipayamt_个人月汇缴金额().toString());
        data.set__gbdwyjce_26_贯标单位月缴存额_O(dp0107个人账户信息表.getDwyjce单位月缴存额()+"");//dp006.getUnitpayamt_单位月汇缴金额().toString());


       // data.set__fgjezhsnye_27_房改金融账户上年余额_O("??");



/*        data.set__bnhjje_28_本年汇缴金额_O(dp022_个人缴存登记簿s
                .stream()
                .filter(e->e.getInaccdate入账日期().isAfter(LocalDate.now().minusMonths(12)))
                .filter(e->e.getColpaytype_汇缴类型0().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_1_汇缴.getText()))
                .mapToDouble(ee->ee.getPayamt_缴存金额().doubleValue()).sum()+"");*/
        data.set__bnhjje_28_本年汇缴金额_O(dp2302个人缴存登记簿s
                .stream()
                .filter(e->e.getInaccountdate入账日期().toLocalDate().isAfter(LocalDate.now().minusMonths(12)))
                .filter(e->e.getDptype缴存类型().trim().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_1_汇缴.getText()))
                .mapToDouble(ee->ee.getDpamt缴存金额()).sum()+"");


        data.set__bnbjje_29_本年补缴金额_O(dp2302个人缴存登记簿s
                .stream()
                .filter(e->e.getInaccountdate入账日期().toLocalDate().isAfter(LocalDate.now().minusMonths(12))) //getInaccdate入账日期().isAfter(LocalDate.now().minusMonths(12)))
                .filter(e-> Arrays.asList(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_2_正常全额补缴,
                        E_DP022_个人缴存登记簿_汇缴类型_dptype.E_3_正常差额补缴,
                        E_DP022_个人缴存登记簿_汇缴类型_dptype.E_4_不定额补缴)
                        .stream()
                        .map(ee->ee.getText())
                        .collect(Collectors.toList())
                      //  .contains(e.getColpaytype_汇缴类型0().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_2_正常全额补缴.getText())))
                .contains(e.getDptype缴存类型().trim().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_2_正常全额补缴.getText())))

                .mapToDouble(ee->ee.getDpamt缴存金额()).sum()+"");//getPayamt_缴存金额().doubleValue()).sum()+"");


        data.set__ljhjje_30_累计汇缴金额_O(dp2302个人缴存登记簿s
                .stream()
             //   .filter(e->e.getDptype_缴存类型().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_1_汇缴.getText()))
                .filter(e->e.getDptype缴存类型().trim().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_1_汇缴.getText()))
                .mapToDouble(ee->ee.getDpamt缴存金额()).sum()+"");

                //.mapToDouble(ee->ee.getPayamt_缴存金额().doubleValue()).sum()+"");


        data.set__ljbjje_31_累计补缴金额_O(dp2302个人缴存登记簿s
                .stream()
                .filter(e-> Arrays.asList(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_2_正常全额补缴,
                        E_DP022_个人缴存登记簿_汇缴类型_dptype.E_3_正常差额补缴,
                        E_DP022_个人缴存登记簿_汇缴类型_dptype.E_4_不定额补缴)
                        .stream()
                        .map(ee->ee.getText())
                        .collect(Collectors.toList())
                        .contains(e.getDptype缴存类型().trim().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_2_正常全额补缴.getText())))

              //  .contains(e.getDptype_缴存类型().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_2_正常全额补缴.getText())))
             //   .mapToDouble(ee->ee.getPayamt_缴存金额().doubleValue()).sum()+"");
                .mapToDouble(ee->ee.getDpamt缴存金额()).sum()+"");



        data.set__bnzqje_32_本年支取金额_O(dw025_公积金提取审核登记表s
                .stream()
               // .filter(e->e.getTransdate交易日期().isAfter(LocalDate.now().minusMonths(12)))
                .filter(e->e.getTransdate业务发生日期().toLocalDate().isAfter(LocalDate.now().minusMonths(12)))
                .mapToDouble(ee->ee.getDrawamt提取金额()).sum()+"");

                //.mapToDouble(ee->ee.getDrawamt_提取金额().doubleValue()).sum()+"");
        data.set__ljzqje_33_累计支取金额_O(dw025_公积金提取审核登记表s
                .stream()
                //.filter(e->e.getTransdate交易日期().isAfter(LocalDate.now().with(TemporalAdjusters.firstDayOfYear())))
                //  .filter(e->e.getColpaytype_汇缴类型0().equals(E_DP022_个人缴存登记簿_汇缴类型_dptype.E_1_汇缴.getText()))
               // .mapToDouble(ee->ee.getDrawamt_提取金额().doubleValue()).sum()+"");
                .mapToDouble(ee->ee.getDrawamt提取金额()).sum()+"");



       // data.set__ljzrje_34_累计转入金额_O("??");
       // data.set__ljzcje_35_累计转出金额_O("??");
       // data.set__bnzrje_36_本年转入金额_O("??");
        //data.set__bnzcje_37_本年转出金额_O("??");


        Dp1106个人缴至信息 dp1106个人缴至信息 = dp1106个人缴至信息Repository.findByAccnum个人账号(dp0107个人账户信息表.getAccnum个人账号());
        //Map<String,List<DP022_个人缴存登记簿>> map_ = dp022_个人缴存登记簿s.stream().collect(Collectors.groupingBy(e-> e.getBegym开始年月().trim()));
        Map<String,List<Dp2302个人缴存登记簿>> map_ = dp2302个人缴存登记簿s.stream().collect(Collectors.groupingBy(e-> e.getDpym缴存年月().trim()));
map_.entrySet().stream()
                        .sorted((o1,o2)->-YearMonth.parse(o1.getKey(),DateTimeFormatter.ofPattern(constant_yyy_mm)).compareTo(
                YearMonth.parse(o2.getKey(),DateTimeFormatter.ofPattern(constant_yyy_mm))))
                .collect(Collectors.toList()).

        forEach(eee->{
    System.out.println(" map_     "+eee.getKey()+"=="+ eee.getValue().stream().map(e->e.getInaccountdate入账日期().toLocalDate().toString()).collect(Collectors.joining(",")));
});

        System.out.println(" getContinuemap连续汇缴位图     "+dp1106个人缴至信息.getContinuemap连续汇缴位图());

        System.out.println(" getPersondpmap个人缴存位图     "+dp1106个人缴至信息.getPersondpmap个人缴存位图());
        String bits1 = IntStream.of(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47).mapToObj(e->{
            LocalDate localDate = LocalDate.now().minusMonths(e);
            List<Dp2302个人缴存登记簿> list_ =  map_.getOrDefault(DateUtils.getYearAndMothen(localDate,constant_yyy_mm),new ArrayList<>());



         //   list.stream().filter(ee->ee.getDptype_缴存类型().equals(E_DP021_单位缴存登记簿_缴存类型.))
            if(list_.size()>0){
                return "1";
            }else{
                return "0";
            }
        }).collect(Collectors.joining(""));

     //   BitSet bits1 = Scratch.fromString("111111111111111111111000001");

       // data.set__ssbyjcwt_38_四十八月缴存位图_O(Scratch.toString(bits1));
        data.set__ssbyjcwt_38_四十八月缴存位图_O(bits1);
        data.set__gbkhrq_39_贯标开户日期_O(dp0107个人账户信息表.getKhrq开户日期().toString());//.getOpnaccdate开户日期().toString());
        data.set__gbxhrq_40_贯标销户日期_O(dp0107个人账户信息表.getXhrq销户日期().toString());//getClsaccdate销户日期().toString());
        data.set__zzlmkbz_42_制作联名卡标志_O(B_制作联名卡标志._0_否.getText());
        data.set__lmkzkztdm_43_联名卡制卡状态代码_O(B_联名卡制卡状态代码._01_未制卡.getText());
       // data.set__fgjrzhzhbdrq_41_房改金融账户最后变动日期_O("??");



       // Ac2303联名卡状态登记簿 ac2303联名卡状态登记簿 = ac2303联名卡状态登记簿Repository.findAll();
/*
        Optional<CD003_卡分户信息> cd003_卡分户信息 = cd003_卡分户信息Repository.findByAccnum个人账号可为空(dp006.getAccnum个人账号());



        if(cd003_卡分户信息.isPresent()){

            data.set__zzlmkbz_42_制作联名卡标志_O(B_制作联名卡标志._1_是.getText());

            E_CD003_卡分户信息_ cd003_卡分户信息_ = E_CD003_卡分户信息_.fromString(cd003_卡分户信息.get().getCardstate_卡状态_不可为空());

            if(cd003_卡分户信息_ == E_CD003_卡分户信息_.已申请){
                data.set__lmkzkztdm_43_联名卡制卡状态代码_O(B_联名卡制卡状态代码._04_待制卡.getText());
            }else
            if(cd003_卡分户信息_ == E_CD003_卡分户信息_.正常){
                data.set__lmkzkztdm_43_联名卡制卡状态代码_O(B_联名卡制卡状态代码._02_已制卡.getText());
            }else{
                data.set__lmkzkztdm_43_联名卡制卡状态代码_O(B_联名卡制卡状态代码._03_不制卡.getText());

            }


        }else{
            data.set__zzlmkbz_42_制作联名卡标志_O(B_制作联名卡标志._0_否.getText());
            data.set__lmkzkztdm_43_联名卡制卡状态代码_O(B_联名卡制卡状态代码._01_未制卡.getText());
        }
*/


        /*            if(cd003_卡分户信息_ == E_CD003_卡分户信息_.正常){
                data.set__lmkzkztdm_43_联名卡制卡状态代码_O(B_联名卡制卡状态代码._05_制卡中.getText());
            }*/
/*
            if(cd003_卡分户信息_ == E_CD003_卡分户信息_.正常){
                data.set__lmkzkztdm_43_联名卡制卡状态代码_O(B_联名卡制卡状态代码._03_不制卡.getText());
            }
*/





        //data.set__fgjrkhjgbm_44_房改金融开户机构编号_O("??");
        data.set__gbdwzh_45_贯标单位账号_O(dp0106单位账户信息.getDwzh单位账号_外部().trim());//dp004_单位缴存信息表.getUnitaccnum单位账号()
        data.set__gbdwmc_46_贯标单位名称_O(dp0102_单位客户基本信息表.getDwmc单位名称()); //cm001_单位基本资料表.getUnitaccname单位名称()
        data.set__gbdwzhzt_47_贯标单位账户状态_O(E_待_DP0106_单位账户状态Enum_建行.from(E_待_dp0106_单位账户状态Enum_定.fromString(dp0106单位账户信息.getDwzhzt单位账户状态())).getText()); //dp005_work_unit_单位分户账.getUnitaccstate单位账户状态()
        data.set__gbzzjgdm_48_贯标组织机构代码_O(dp0102_单位客户基本信息表.getZzjgdm组织机构代码().trim());//.getUnitcrednum单位证件号码() );//cm001_单位基本资料表.getOrgcode组织机构代码().trim());


        data.set_1_DWKHRQ_贯标单位开户日期_610576(dp0102_单位客户基本信息表.getDwkhrq单位开户日期()+"") ;//dp005_work_unit_单位分户账.getOpnaccdate开户日期().toString());
        data.set_2_DWJCBLSX_贯标单位缴存比例上限_610719(dp0106单位账户信息.getDwjcbl单位缴存比例()+"") ;//dp004_单位缴存信息表.getIndinorprop_个人正常比例().trim());
        data.set_3_DWJCBLXX_贯标单位缴存比例下限_610718(dp0106单位账户信息.getDwjcbl单位缴存比例()+"") ;//dp004_单位缴存信息表.getIndinorprop_个人正常比例().trim());
        data.set_4_DWJCRS_贯标单位缴存人数_610601(dp0106单位账户信息.getDwjcrs单位缴存人数()+"");//dp004_单位缴存信息表.getNproppaynum_不可为空_正常比例汇缴人数().toString());

        CCBExcel cum = ccbSHTYXYDMMap.get(dp0106单位账户信息.getDwzh单位账号_外部().trim());//dp005_work_unit_单位分户账.getUnitaccnum单位账号().trim());
        if(cum != null && !cum.equals("信用代码不存在")){

                data.set_7_shtyxydm_社会统一信用代码(cum.getShtyxydm());
                        data.set_9_dwsshy_单位所属行业(cum.getType());
                data.set__gbzzjgdm_48_贯标组织机构代码_O("");
                data.set_8_shtyxydmly_社会统一信用代码来源("CCB");

        }else{
            try{
                data.set_9_dwsshy_单位所属行业(E_待_CM0001_单位所属行业.fromString(cm0001企业客户基本信息表.getUnitbelongindustry单位所属行业()).getText());

            }catch (Exception e){
                data.set_9_dwsshy_单位所属行业(E_待_CM0001_单位所属行业.Unknown.getDisplayText());

            }
            data.set_7_shtyxydm_社会统一信用代码(dp0102_单位客户基本信息表.getSocietycreditcode统一社会信用代码().trim());//cm001_单位基本资料表.getOrgcode组织机构代码().trim());
            data.set_8_shtyxydmly_社会统一信用代码来源("YLGJJ");

        }

       // data.set_5_DWZHZTZJBGSJ_单位账户状态最近变更时间(dp004_单位缴存信息表.get().trim());


        data.set_6_DWJZNY_单位缴至年月(YearMonth.parse(dp0106单位账户信息.getJzny缴至年月(),DateTimeFormatter.ofPattern(constant_yyy_mm)).format(DateTimeFormatter.ofPattern(constant_yyy_mm_old)));//dp004_单位缴存信息表.getLpaym_缴至年月().trim());

        List<Dp1301单位缴存信息变更登记簿> dp1301单位缴存信息变更登记簿s = dp1301单位缴存信息变更登记簿Repository.findByUnitaccnum单位账号(dp0106单位账户信息.getUnitaccnum单位账号());
       // List<DP202_单位缴存变更登记簿> dp202_单位缴存变更登记簿s = dp202_单位缴存变更登记簿_repository.findByUnitaccnum不可为空单位账号(dp004_单位缴存信息表.getUnitaccnum单位账号().trim());

        Optional<Dp1301单位缴存信息变更登记簿> optionalDP202_单位缴存变更登记簿 = dp1301单位缴存信息变更登记簿s
                .stream()
                .filter(e->e.getChgtype变更类型().trim().equals(NEW_待_Dp1301单位缴存信息变更登记簿_变更类型.E_2_启封.getText())||
                        e.getChgtype变更类型().trim().equals(NEW_待_Dp1301单位缴存信息变更登记簿_变更类型.E_3_封存.getText()) ||
                        e.getChgtype变更类型().trim().equals(NEW_待_Dp1301单位缴存信息变更登记簿_变更类型.E_8_基数变更.getText())||
                        e.getChgtype变更类型().trim().equals(NEW_待_Dp1301单位缴存信息变更登记簿_变更类型.E_9_比例变更.getText())

                        //    || e.getChgtype变更类型().trim().equals(NEW_待_Dp1301单位缴存信息变更登记簿_变更类型.E_5_正常状态销户.getText())
                )
                .sorted(Comparator.comparingLong(e->e.getTransdate业务发生日期().toLocalDate().toEpochDay())).findFirst();

        if(optionalDP202_单位缴存变更登记簿.isPresent()){
            data.set_5_DWZHZTZJBGSJ_单位账户状态最近变更时间(optionalDP202_单位缴存变更登记簿.get().getTransdate业务发生日期().toString());
        }else{
            data.set_5_DWZHZTZJBGSJ_单位账户状态最近变更时间("2999-12-31");

        }
      //  data.set_5_DWZHZTZJBGSJ_单位账户状态最近变更时间(dp0102_单位客户基本信息表.getLastUpdateTime最后更新时间戳().toLocalDate().toString());
        //    List<DP021_单位缴存登记簿> dp021_单位缴存登记簿_s = dp021_单位缴存登记薄Repository.findByUnitaccnum单位账号(dp004_单位缴存信息表.getUnitaccnum单位账号());

/*

        String bits1 = IntStream.of(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47).mapToObj(e->{
            LocalDate localDate = LocalDate.now().minusMonths(e);
            List<DP022_个人缴存登记簿> list_ =  map_.getOrDefault(DateUtils.getYearAndMothen(localDate),new ArrayList<>());
            //   list.stream().filter(ee->ee.getDptype_缴存类型().equals(E_DP021_单位缴存登记簿_缴存类型.))
            if(list_.size()>0){
                return "1";
            }else{
                return "0";
            }
        }).collect(Collectors.joining(""));

*/



/*
        List<CM081_sms_短信密码签订登记簿> cm081_sms_短信密码签订登记簿s = cm081_sms_短信密码签订登记簿_repository.findByPubaccnum通用帐号0(dp006.getAccnum个人账号());
        Optional<CM081_sms_短信密码签订登记簿> cm081_sms_短信密码签订登记簿_optional = cm081_sms_短信密码签订登记簿s.stream().filter(e->e.getType业务类型0().equals("1")).findFirst();

        if(cm081_sms_短信密码签订登记簿_optional.isPresent()){
            data.setZzdh(cm081_sms_短信密码签订登记簿_optional.get().getPhone手机号1());
        }else{
            data.setZzdh(cm002.getPhone_电话());

        }
*/




        return data;

    }



}
