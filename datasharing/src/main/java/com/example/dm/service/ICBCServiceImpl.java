package com.example.dm.service;




import com.example.dm.apidata.icbc.Data;
import com.example.dm.apidata.icbc.Query;
import com.example.dm.apidata.icbc.ReturnResult;
import com.example.dm.domain.*;
import com.example.dm.enumT.*;
import com.example.dm.exception.MyBusinessException;
import com.example.dm.repository.*;
import com.example.dm.util.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.ylgjj.loan.domain.*;
//import org.ylgjj.loan.enumT.*;
//import org.ylgjj.loan.exception.MyBusinessException;
//import org.ylgjj.loan.repository.*;
//import org.ylgjj.loan.util.DateUtils;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.time.temporal.TemporalAdjusters.*;

/**
 * Created by silence yuan on 2015/7/25.
 */

@Service("customerService")
public class ICBCServiceImpl implements ICBCService {
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
    private Dp1106个人缴至信息Repository dp1106个人缴至信息Repository;
    @Autowired
    private Dp0101单位账户辅助信息Repository dp0101单位账户辅助信息Repository;


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
    private Ln0306个人住房贷款逾期登记信息Repository ln0306个人住房贷款逾期登记信息Repository;


    @Autowired
    private Dp2302个人缴存登记簿Repository dp2302个人缴存登记簿Repository;
    @Autowired
    private Ln0303共同借款人信息Repository ln0303共同借款人信息Repository;
    @Autowired
    private Ln3301贷款还款计划Repository ln3301贷款还款计划Repository;


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
    private Ln2108借款人信息Repository ln2108借款人信息Repository;

    @Autowired
    private Ln0301_个人住房贷款借款合同信息Repository ln0301_个人住房贷款借款合同信息Repository;

    @Autowired
    private Ln3101贷款账户辅助信息Repository ln3101贷款账户辅助信息Repository;
    @Autowired
    private Ac0103客户与应用账户关联表Repository ac0103客户与应用账户关联表Repository;


    @Autowired
    private Ln3102贷款账户业务次数信息Repository ln3102贷款账户业务次数信息Repository;

    @Autowired
    private Cm0009企业客户联系信息Repository cm0009企业客户联系信息Repository;






    LocalDate today =  LocalDateTime.now().toLocalDate();

    Integer count = 1;

    Integer limit = 5000000;
    @Override
    public ReturnResult queryLoanee(Query query) {

        LocalDateTime now = LocalDateTime.now();



        DayOfWeek dayOfWeek = now.getDayOfWeek();
        if(!(dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY)){

            LocalDateTime todayAt8 = now.toLocalDate().atTime(8, 0);
            LocalDateTime todayAt12 = now.toLocalDate().atTime(12, 0);
            LocalDateTime todayAt14 = now.toLocalDate().atTime(22, 0);
            LocalDateTime todayAt18 = now.toLocalDate().atTime(23, 0);
            if((now.isAfter(todayAt8) && now.isBefore(todayAt12)) || now.isAfter(todayAt14) && now.isBefore(todayAt18)) {
                if(count >limit){
                    return ReturnResult.情况5_操作失败("今日调用 次数超过"+limit+"次的限制");

                }
            }

        }



        System.out.println("---------------- count "+count);
        System.out.println("---------------- count "+today.toString());


        if(today.isEqual(now.toLocalDate())){

            count++;
        }else{
            today = now.toLocalDate();
            count=0;
        }

        return product_querry(query);





    }

    public ReturnResult product_querry(Query query){
        try{

            Data[] datas = queryLoanee(query.getZjhm());
            return ReturnResult.情况1_返回成功(datas);
        }catch (MyBusinessException e){
            e.getMessage();
            System.out.println("错误信息："+e.getMessage());
            e.printStackTrace();
            if(e.getCode().equals(ErrorCodeEnum.入参格式错误)){
                return ReturnResult.情况4_入参数格式错误(e.getMessage());
            }
            if(e.getCode().equals(ErrorCodeEnum.操作失败)){
                return ReturnResult.情况5_操作失败();
            }
            if(e.getCode().equals(ErrorCodeEnum.查询为空)){
                return ReturnResult.情况2_查询为空();
            }
            return ReturnResult.情况5_操作失败();
        }catch (Exception e){
            e.printStackTrace();
            return ReturnResult.情况5_操作失败(e.getMessage());
        }
    }

   // @PostConstruct
    public void queryLoanee() {
        try{
            Data[] date = queryLoanee("612724198409210339  ");
            System.out.println("-------------- " + date.toString());
        }catch (Exception e){
            e.getMessage();
        }

    }


    public Data[] queryLoanee(String certinum) throws MyBusinessException {
        List<Cm0022个人客户证件信息> cm0022个人客户证件信息s =cm0022个人客户证件信息Repository.findByCrednum证件号码AndPersoncredtype个人客户证件类型(certinum, E_待_证据类型_证件类型.身份证.getText());

        if(cm0022个人客户证件信息s.size()== 0){
            throw new MyBusinessException("找不到该缴存人",ErrorCodeEnum.查询为空);
        }


        List<Data> datas= new ArrayList<>();
        for(Cm0022个人客户证件信息 cm002_个人基本资料表: cm0022个人客户证件信息s){

            Cm0020_个人客户基本信息 cm0020_个人客户基本信息 = cm0020_个人客户基本信息Repository.findByCustid个人客户号(cm002_个人基本资料表.getCustid个人客户号());


                Data data  = queryLoanee(cm0020_个人客户基本信息,cm002_个人基本资料表);
                datas.add(data);










        }


        List<Data> data___s = datas.stream().filter(e->
            e.getGrzhzt().equals(个人账户状态_PersonalAccountStatusEnum_银行.正常.getText())).collect(Collectors.toList());

        List<Data> datas_return= new ArrayList<>();
        if(data___s.size()==1){

            datas_return.add(data___s.get(0));

        }if(data___s.size()>1){


            Data temp = null;
            Integer i = 0;

            for(Data d : data___s){
                if(i==0){
                    temp = d;
                }
                DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate ldt = LocalDate.parse(d.getZhycjcrq(),df);


                LocalDate tempLocalDate = LocalDate.parse(d.getZhycjcrq(),df);

                if(ldt.isAfter(tempLocalDate)){
                    temp = d;
                }



            }

            datas_return.add(temp);

        }




/*        if(data != null){

            if(data.getGrzhzt()==个人账户状态_PersonalAccountStatusEnum_银行.正常.getText()){
                datas.add(data);
            }

        }*/


        return datas_return.toArray(new Data[datas_return.size()]);


    }


    class ReturnDate{
        Data data;
        Date lastDate;

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        public Date getLastDate() {
            return lastDate;
        }

        public void setLastDate(Date lastDate) {
            this.lastDate = lastDate;
        }
    }
    public Data queryLoanee(Cm0020_个人客户基本信息 cm0020_个人客户基本信息,Cm0022个人客户证件信息 cm0022个人客户证件信息) throws MyBusinessException {



        LocalDate start18月 = LocalDate.now().minusMonths(20).with(firstDayOfMonth());
        Ac0103客户与应用账户关联表 ac0103客户与应用账户关联表 =
                ac0103客户与应用账户关联表Repository.findByCustid个人客户号AndAccounttype账户类型(cm0020_个人客户基本信息.getCustid个人客户号(), NEW_账号类型_ACCOUNTTYPE._3_个人账号.getText());



        Dp0107个人账户信息表 dp0107个人账户信息表 = dp0107个人账户信息表Repository.findByAccnum个人账号(ac0103客户与应用账户关联表.getCustaccnum客户账号());

        Dp0104个人客户基本信息 dp0104个人客户基本信息 = dp0104个人客户基本信息Repository.findByAccnum个人账号(dp0107个人账户信息表.getAccnum个人账号());
/*
        Cm0023个人客户联系信息 cm0023个人客户联系信息 = null;//
        Cm0024个人客户地址信息 cm0024个人客户地址信息 = null;//*/



      //  DP006_Payment_个人缴存信息表 dp006_payment_个人缴存信息表 = dp006_payment_repository.findByCustid个人客户号(cm002.getCustid_个人客户号());
/*        if(dp006_payment_个人缴存信息表 == null){
            throw new MyBusinessException("没有找到缴存信息,客户号："+ cm002.getCustid_个人客户号() + " 身份证号："+ cm002.getCertinum()
                    ,ErrorCodeEnum.操作失败);

        }*/


     //  DP007_individual_sub_account_个人分户账 dp007_individual_sub_account_个人分户账 = dp007_individual_sub_accountRepository.findByAccnum个人账号(dp006_payment_个人缴存信息表.getAccnum个人账号());
        if(dp0107个人账户信息表 == null){
            throw new MyBusinessException("没有找到缴存信息,缴存帐号："+ dp0107个人账户信息表.getAccnum个人账号() + " 身份证号："+ dp0104个人客户基本信息.getZjhm证件号码()
                    ,ErrorCodeEnum.操作失败);

        }



        Dp0102_单位客户基本信息表 dp0102_单位客户基本信息表 = dp0102_单位客户基本信息表Repository.findByUnitaccnum单位账号(dp0107个人账户信息表.getUnitaccnum单位账号());

        Dp0106单位账户信息 dp0106单位账户信息 = dp0106单位账户信息Repository.findByUnitaccnum单位账号(dp0107个人账户信息表.getUnitaccnum单位账号());


        Ac0103客户与应用账户关联表 ac0103客户与应用账户关联表_for_unit =
                ac0103客户与应用账户关联表Repository.findByExtaccnum外部账号AndAccounttype账户类型(dp0107个人账户信息表.getUnitaccnum单位账号(), NEW_账号类型_ACCOUNTTYPE._1_单位账号.getText());

        Cm0001企业客户基本信息表 cm0001企业客户基本信息表 = cm0001企业客户基本信息表Repository.findByUnitcustid单位客户号(ac0103客户与应用账户关联表_for_unit.getCustid个人客户号());
        Cm0003企业客户证件信息 cm0003企业客户证件信息 = cm0003企业客户证件信息Repository.findByUnitcustid单位客户号(cm0001企业客户基本信息表.getUnitcustid单位客户号());

        List<Dp1103单位缴存比例信息> dp1103单位缴存比例信息List = dp1103单位缴存比例信息户关联表Repository.findByUnitaccnum单位账号(dp0106单位账户信息.getUnitaccnum单位账号());
        Optional<Dp1103单位缴存比例信息> optionalDp1103单位缴存比例信息 = dp1103单位缴存比例信息List.stream().findAny();


/*        DP004_unit_payment_info_单位缴存信息表 dp004_unit_payment_info_单位缴存信息表 = dp004_unit_payment_infoRepository.findByUnitaccnum单位账号(dp007_individual_sub_account_个人分户账.getUnitaccnum_单位账号());
        if(dp004_unit_payment_info_单位缴存信息表 == null){
            throw new MyBusinessException("找不到单位信息"+ dp007_individual_sub_account_个人分户账.getUnitaccnum_单位账号(),ErrorCodeEnum.操作失败);
        }*/

        Data data = new Data();


        //String xmjp;//姓名简拼
        data.setXmjp(cm0020_个人客户基本信息.getNamefullpinyin姓名全拼().toString());//cm002.getNamefullpinyin姓名全拼());

        //String xb;//性别
        data.setXb(cm0020_个人客户基本信息.getSex性别());//cm002.getSex性别());//getSex_性别());

        //String grzh; //个人帐号/公积金帐号
        data.setGrzh(dp0107个人账户信息表.getAccnum个人账号());

        //String grbh; //个人编号
        data.setGrbh(cm0020_个人客户基本信息.getCustid个人客户号());//cm002.getCustid个人客户号());


        //String zjhlx; // 证件类型

       // data.setZjhlx(证件类型.from(dp007_individual_sub_account_个人分户账.getCertitype_证件类型()).getText());

        data.setZjhlx(E_待_证据类型_证件类型.fromString(cm0022个人客户证件信息.getPersoncredtype个人客户证件类型()).getText());



        //String csrq; // 出生日期
        data.setCsrq(cm0020_个人客户基本信息.getBirthdate出生日期().toString());//cm002.getBirthday_出生日期());

        //String cjgzsj; // 参加工作时间
        data.setCjgzsj(DateUtils.getDate(LocalDate.MIN));//dp007_individual_sub_account_个人分户账.getOpnaccdate_开户日期()));

        //String grzhzt; //个人账户状态
        data.setGrzhzt(E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB.from(E_待_dp0107个人账户信息表_Grzhzt个人账户状态.fromString(dp0107个人账户信息表.getGrzhzt个人账户状态())).getText());


        //BigDecimal sqgzze; //税前工资总额
        data.setSqgzze(BigDecimal.valueOf(dp0107个人账户信息表.getGrjcjs个人缴存基数()));//dp006_payment_个人缴存信息表.getBasenum_缴存基数());

        //BigDecimal gjjye; //公积金余额
        data.setGjjye(BigDecimal.valueOf(dp0107个人账户信息表.getGrzhye个人账户余额()));//dp007_individual_sub_account_个人分户账.getBal_余额());




        //String zzdh; //住宅电话;
        data.setSjh(dp0104个人客户基本信息.getSjhm手机号码());//.getHandset_手机());

        //String sjh; //手机号;

/*        List<CM081_sms_短信密码签订登记簿> cm081_sms_短信密码签订登记簿s = cm081_sms_短信密码签订登记簿_repository.findByPubaccnum通用帐号0(dp006_payment_个人缴存信息表.getAccnum个人账号());
        Optional<CM081_sms_短信密码签订登记簿> cm081_sms_短信密码签订登记簿_optional = cm081_sms_短信密码签订登记簿s.stream().filter(e->e.getType业务类型0().equals("1")).findFirst();

        if(cm081_sms_短信密码签订登记簿_optional.isPresent()){
            data.setZzdh(cm081_sms_短信密码签订登记簿_optional.get().getPhone手机号1());
        }else{
            data.setZzdh(cm002.getPhone_电话());

        }*/
        data.setZzdh(dp0104个人客户基本信息.getGddhhm固定电话号码());








        data.setJtdz(dp0104个人客户基本信息.getJtzz家庭住址());//cm002.getFamaddr_家庭住址());



     //   DP005_work_unit_单位分户账 dp005_work_unit_单位分户账 = dp005_workUnit_repository.findByUnitaccnum单位账号(dp007_individual_sub_account_个人分户账.getUnitaccnum_单位账号());

        //String dwmc; //单位名称;
       // data.setDwmc(dp005_work_unit_单位分户账.getUnitaccname_单位名称());
        data.setDwmc(dp0102_单位客户基本信息表.getDwmc单位名称());

        //String dwdjh; //单位登记号（单位帐号）
        data.setDwdjh(dp0102_单位客户基本信息表.getUnitaccnum单位账号());

        //String khglbbh; //开户管理部编号
        data.setKhglbbh(ac0103客户与应用账户关联表_for_unit.getCreateinst建立机构());//dp005_work_unit_单位分户账.getAccinstcode_账户机构());



     //   CM001_单位基本资料表 cm001_单位基本资料表 = cm001Repository.findByUnitcustid单位客户号(dp004_unit_payment_info_单位缴存信息表.getUnitcustid_单位客户号());



        // String zzjgdm; //单位组织机构代码
        data.setZzjgdm(dp0102_单位客户基本信息表.getZzjgdm组织机构代码());//cm001_单位基本资料表.getOrgcode_组织机构代码());

        //String yyzz; //营业执照号
      //  data.setYyzz(cm001_单位基本资料表.getLicensenum_营业执照号码());
        data.setYyzz(dp0102_单位客户基本信息表.getZzjgdm组织机构代码());


        //String xzbm ; // 单位性质编码
     //   data.setXzbm(PaymentUnitTypeEnum_单位性质.from(cm001_单位基本资料表.getUnitkind_单位性质()).getText());
        data.setXzbm(E_待_DP0102_PaymentUnitTypeEnum_单位性质_工行.from(E_待_DP0102_PaymentUnitTypeEnum_单位性质_定.fromString(dp0102_单位客户基本信息表.getUnitproperty单位性质())).getText());

        //String dwdz; // 单位地址
       // data.setDwdz(cm001_单位基本资料表.getUnitaddr_单位地址());
        data.setDwdz(dp0102_单位客户基本信息表.getDwdz单位地址());




        data.setDwjezt(E_待_DP0106_单位账户状态Enum_工行.from(E_待_dp0106_单位账户状态Enum_定.fromString(dp0106单位账户信息.getDwzhzt单位账户状态())).getText());





        Dp0101单位账户辅助信息 dp0101单位账户辅助信息 = dp0101单位账户辅助信息Repository.findByUnitaccnum单位账号(dp0106单位账户信息.getUnitaccnum单位账号());

        // String dwjczjy; // 单位缴存资金来源
        data.setDwjczjy(dp0101单位账户辅助信息.getFundsourceflag资金来源标志());//dp004_unit_payment_info_单位缴存信息表.getFundsouflag_资金来源标志());


        List<Cm0009企业客户联系信息> cm0009企业客户联系信息s = cm0009企业客户联系信息Repository.findByUnitcustid单位客户号(cm0001企业客户基本信息表.getUnitcustid单位客户号());
        // String dwlxfs; // 单位联系方式
        if(cm0009企业客户联系信息s.size()>0){
            data.setDwlxfs(cm0009企业客户联系信息s.stream().findAny().get().getContmethinfo联系方式内容());//cm001_单位基本资料表.getUnitlinkphone_联系电话());

        }else{
            data.setDwlxfs("");//cm001_单位基本资料表.getUnitlinkphone_联系电话());

        }
        //dp0102_单位客户基本信息表.setJbrgddhhm经办人固定电话号码();




        // String fxr; // 发薪日
        data.setFxr(StringUtils.isBlank(cm0001企业客户基本信息表.getUnitpayday单位发薪日())?"":cm0001企业客户基本信息表.getUnitpayday单位发薪日());//.get.get tcm001_单位基本资料表.getSalday_发薪日())?"01":cm001_单位基本资料表.getSalday_发薪日());
        data.setFxr(StringUtils.isBlank(cm0001企业客户基本信息表.getUnitpayday单位发薪日())?"01":cm0001企业客户基本信息表.getUnitpayday单位发薪日());


        //String dwkhrq ; // 单位开户日期（单位登记日期）
        data.setDwkhrq(DateUtils.getDate(dp0102_单位客户基本信息表.getDwkhrq单位开户日期()));

        //String dwfdrdbr; // 单位法定代表人
        data.setDwfdrdbr(dp0102_单位客户基本信息表.getDwfrdbxm单位法人代表姓名());

        //String dwfdrzjlx; // 单位法定人代表证件类型
        data.setDwfdrzjlx(StringUtils.isNotBlank(dp0102_单位客户基本信息表.getDwfrdbzjlx单位法人代表证件类型())? E_待_证据类型_证件类型.fromString(dp0102_单位客户基本信息表.getDwfrdbzjlx单位法人代表证件类型()).getText():"");

        //String dwfdrzjhm; // 单位法定人代表证件号码
        data.setDwfdrzjhm(dp0102_单位客户基本信息表.getDwfrdbzjhm单位法人代表证件号码());















        Dp1106个人缴至信息 dp1106个人缴至信息 = dp1106个人缴至信息Repository.findByAccnum个人账号(dp0107个人账户信息表.getAccnum个人账号());

        // String cjnyr; // 初缴年月
        data.setCjnyr(dp1106个人缴至信息.getStartdpym起始汇缴年月());//dp004_unit_payment_info_单位缴存信息表.getBegpayym_起始汇缴年月());


        //String jznyr; // 缴至年月
       // data.setJznyr(dp004_unit_payment_info_单位缴存信息表.getLpaym_缴至年月());
        data.setJznyr(dp0106单位账户信息.getJzny缴至年月());








       // List<DP021_单位缴存登记簿>  dp021_单位缴存登记簿s_ = dp021_单位缴存登记薄Repository.findByUnitaccnum单位账号(dp004_unit_payment_info_单位缴存信息表.getUnitaccnum单位账号());





       // List<String> 近12个自然月单位缴存额_list =init(18,"0.00");

        List<String> 当月缴存单位名称_list = init(18,"");

/*

        for(int idx = 0; idx < 18;idx++) {



            Integer index = idx+1;
            LocalDate initial_ = LocalDate.now().minusMonths(index);
            LocalDate start_ = initial_.with(firstDayOfMonth());
            LocalDate end_ = initial_.with(lastDayOfMonth());



            List<DP021_单位缴存登记簿> dP022_个人缴存登记簿Optional = dp021_单位缴存登记簿s.stream()
                    .filter(
                            e ->{
                                if(StringUtils.isBlank(e.getBegym_开始年月())){
                                    return false;
                                }
                                LocalDateTime getInaccdate入账日期0 = DateUtils.yyyyMM(e.getBegym_开始年月());
                                return  (getInaccdate入账日期0.isAfter(start_.atStartOfDay()) || getInaccdate入账日期0.equals(start_.atStartOfDay()))
                                        && (getInaccdate入账日期0.isBefore(end_.atStartOfDay()) || getInaccdate入账日期0.equals(end_.atStartOfDay()));


                            }

                    ).collect(Collectors.toList());

            if (dP022_个人缴存登记簿Optional.size()>0) {
             //   Double  value = dP022_个人缴存登记簿Optional.stream().mapToDouble(e->e.getUpaytotamt_应缴总额().doubleValue()).sum();

                Double  value = dP022_个人缴存登记簿Optional.stream().mapToDouble(e->e.getCmpayamt_本月汇缴金额().doubleValue()).sum();
                近12个自然月单位缴存额_list.add(BigDecimal.valueOf(value)
                        .setScale(2, BigDecimal.ROUND_HALF_UP).toString());


                //  CM001_单位基本资料表 cm001_单位基本资料表1 = cm001Repository.findByUnitcustid单位客户号(dp004_unit_payment_info_单位缴存信息表.getUnitcustid_单位客户号());
                当月缴存单位名称_list.add(dp005_work_unit_单位分户账.getUnitaccname_单位名称());

            } else {
              //  近12个自然月单位缴存额_list.add(null);
                当月缴存单位名称_list.add(null);

            }




        }



*/





        List<Dp2302个人缴存登记簿> dp2302个人缴存登记簿s = dp2302个人缴存登记簿Repository.findByAccnum个人账号(dp0107个人账户信息表.getAccnum个人账号());

     //   List<DP022_个人缴存登记簿> dp022_个人缴存登记簿s = dp022_个人缴存登记薄Repository.findByAccnum个人账号(dp006_payment_个人缴存信息表.getAccnum个人账号());

        // String lccs; // 累计缴存次数
        data.setJccs(dp2302个人缴存登记簿s.size());




        dp2302个人缴存登记簿s.stream().findAny().get().getInaccountdate入账日期();
      //  DP022_个人缴存登记簿 最近一次缴存日期s = dp022_个人缴存登记薄Repository.findTop1ByAccnum个人账号OrderByRegdate登记日期Desc(dp006_payment_个人缴存信息表.getAccnum个人账号());
        //String zhycjcrq ; // 最近一次缴存日期
    //    data.setZhycjcrq(最近一次缴存日期s.getRegdate登记日期().toString());

        data.setZhycjcrq(dp2302个人缴存登记簿s.stream().findAny().get().getInaccountdate入账日期().toString());




        // TODO String dqgjjnd ; // 当前公积金年度 //
        //data.setDqgjjnd(最近一次缴存日期.());

        List<Dw0202提取审批信息表> dw0202提取审批信息表s = dw0202提取审批信息表Repository
                .findByAccnum个人账号(dp0107个人账户信息表.getAccnum个人账号())
                .stream().filter(e->e.getApprstatus审批状态()
                        .equals(E_待_Dw0202_提取审批.E_4_封存.getText())).collect(Collectors.toList());
/*        List<DW025_withdraw_verify_公积金提取审核登记表> dw025_withdraw_verify_公积金提取审核登记表s = dW025_withdraw_verify_公积金提取审核登记表_Repository.findTop19ByAccnum个人账号OrderByTransdate交易日期Desc(dp006_payment_个人缴存信息表.getAccnum个人账号())
                .stream().filter(e->e.getApprstate_审批状态().equals("4")).collect(Collectors.toList());*/


        //String tqljje ; // 累积提取额
        Double 累积提取额 = dw0202提取审批信息表s.stream().mapToDouble(e->e.getDrawamt提取金额()).sum();
        data.setTqljje(BigDecimal.valueOf(累积提取额).setScale(2,BigDecimal.ROUND_HALF_UP));

        List<String> 近18个自然月单位缴存额_list =init(18,"0.00");

      //  List<String> 当月缴存单位名称_list = init(18,"");


        List<String> 近18个月单位缴存比例_list = init(18,"0.00");
        List<String> 近18个自然月个人缴存额_list = init(18,"0.00");

        List<String> 近18个月个人缴存比例_list = init(18,"0.00");

        List<String> 近12个月自然月提取原因_list = init(18,"");
        List<String> 近12个月自然月提取时间_list = init(18,"");
        List<String> 近12个月自然月提取方式_list =init(18,"");
        List<String> 近12个月自然月提取金额_list = init(18,"0.00");

        for(int idx = 0; idx < 18;idx++){



            Integer index = idx+1;

            LocalDate initial = LocalDate.now().minusMonths(index);
            LocalDate start = initial.with(firstDayOfMonth());
            LocalDate end = initial.with(lastDayOfMonth());


                    List<Dp2302个人缴存登记簿> dp2302个人缴存登记簿s1 = dp2302个人缴存登记簿s.stream()
                    .filter(
                            e ->{
                                DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                                        .appendPattern("yyyyMMdd")
                                        .parseDefaulting(ChronoField.DAY_OF_MONTH, 0)

                                        .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
                                        .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
                                        .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
                                        .toFormatter();
                             //   System.out.println("____________"+e.getBegym开始年月());
                                LocalDateTime getBegym_开始年月 = LocalDateTime.from(formatter.parse(e.getDpym缴存年月()+"01"));
                                return (getBegym_开始年月.isAfter(start.atStartOfDay()) || getBegym_开始年月.equals(start.atStartOfDay()))
                                        && (getBegym_开始年月.isBefore(end.atStartOfDay()) || getBegym_开始年月.equals(end.atStartOfDay()));
                            }



                    ).collect(Collectors.toList());



                    List<Dp2302个人缴存登记簿> dp2302个人缴存登记簿s2 = dp2302个人缴存登记簿Repository.findByAccnum个人账号(dp0107个人账户信息表.getAccnum个人账号());

                    if(dp2302个人缴存登记簿s2.size()>0){
                        List<String> temps_getUnitprop_单位比例 = dp2302个人缴存登记簿s2.stream().map(e->Double.valueOf(e.getUnitdpratio单位缴存比例()).toString()).collect(Collectors.toList());

                        近18个月单位缴存比例_list.add(temps_getUnitprop_单位比例.get(0));


                        List<String> temps_getIndiprop_个人缴存比例 = dp2302个人缴存登记簿s2.stream().map(e->Double.valueOf(e.getPersondpratio个人缴存比例()).toString()).collect(Collectors.toList());

                        近18个月个人缴存比例_list.add(temps_getIndiprop_个人缴存比例.get(0));



                        List<String> temps = dp2302个人缴存登记簿s2.stream().map(e->Double.valueOf(e.getDpamt缴存金额()).toString()).collect(Collectors.toList());

                        近18个自然月个人缴存额_list.add(temps.get(0));

                        List<String> temps_getUnitpayamt_单位月汇缴金额0 = dp2302个人缴存登记簿s2.stream().map(e->Double.valueOf(e.getUnitdpamt单位月缴存额()).toString()).collect(Collectors.toList());

                        近18个自然月单位缴存额_list.add(temps_getUnitpayamt_单位月汇缴金额0.get(0));

                        当月缴存单位名称_list.add(dp0102_单位客户基本信息表.getDwmc单位名称());

                    }else{
                        近18个月单位缴存比例_list.add(null);
                        近18个月个人缴存比例_list.add(null);
                        近18个自然月个人缴存额_list.add(null);
                        近18个自然月单位缴存额_list.add(null);
                        当月缴存单位名称_list.add(null);
                    }







            Optional<Dw0202提取审批信息表> dw025_withdraw_verify_公积金提取审核登记表Optional = dw0202提取审批信息表s.stream()
                    .filter(e->e.getTransdate业务发生日期().toLocalDate().isAfter(start)
                            && e.getTransdate业务发生日期().toLocalDate().isBefore(end)).findAny();

            if(dw025_withdraw_verify_公积金提取审核登记表Optional.isPresent()){
                近12个月自然月提取原因_list.add(dw025_withdraw_verify_公积金提取审核登记表Optional.get().getDrawreason提取原因());
                近12个月自然月提取时间_list.add(DateUtils.getDate(dw025_withdraw_verify_公积金提取审核登记表Optional.get().getTransdate业务发生日期()));


/*                DW145_提取结算登记簿 dw145_提取结算登记簿 = dw145_提取结算登记薄_repository.findByApprnum审批号0(dw025_withdraw_verify_公积金提取审核登记表Optional.get().getApprnum_审批号());
                if(dw145_提取结算登记簿!= null){
                    近12个月自然月提取方式_list.add(dw145_提取结算登记簿.getSettlemode结算方式1());

                }else{
                    近12个月自然月提取方式_list.add(dw025_withdraw_verify_公积金提取审核登记表Optional.get().getStmode结算方式());
                }*/

                近12个月自然月提取方式_list.add(dw025_withdraw_verify_公积金提取审核登记表Optional.get().getStmode结算方式());

                近12个月自然月提取金额_list.add(Double.valueOf(dw025_withdraw_verify_公积金提取审核登记表Optional.get().getDrawamt提取金额()).toString());

            }else{
                近12个月自然月提取原因_list.add(null);
                近12个月自然月提取时间_list.add(null);
                近12个月自然月提取金额_list.add(null);
            }

            if(dw025_withdraw_verify_公积金提取审核登记表Optional.isPresent()){
            }else{

            }




/*
                    .sorted(Comparator.comparing(DW025_withdraw_verify_公积金提取审核登记表::getTransdate_交易日期).reversed())
                    .map(e->e.getTransdate_交易日期().toInstant(),e);*/

        }

        //String lxjcdwmc  当月缴存单位名称；
        data.setLxjcdwmc(fmt(当月缴存单位名称_list," "));



        //String lxdwjce ; // 近12个自然月单位缴存额
        data.setLxdwjce(fmt(近18个自然月单位缴存额_list,"0.00"));

        // String lxgrjce ; // 近12个自然月个人缴存额
        data.setLxgrjce(fmt(近18个自然月个人缴存额_list,"0.00"));

        // String lxtqyy ; // 近12个月自然月提取原因
        data.setDwjcbl(fmt(近18个月单位缴存比例_list,"0.00"));

        // String lxtqyy ; // 近12个月自然月提取原因
        data.setGrjcbl(fmt(近18个月个人缴存比例_list,"0.00"));


        // String lxtqyy ; // 近12个月自然月提取原因
        data.setLxtqyy(fmt(近12个月自然月提取原因_list,""));



        // String lxtqsj ; // 近12个月自然月提取时间
        data.setLxtqsj(fmt(近12个月自然月提取时间_list,""));




        //String lxtqfs ; // 近12个月自然月提取方式
        data.setLxtqfs( fmt(近12个月自然月提取方式_list,""));

        //String lxtqje ; // 近12个月自然月提取金额
        data.setLxtqje( fmt(近12个月自然月提取金额_list,""));







        List<Ln2108借款人信息> ln2108借款人信息s = ln2108借款人信息Repository.findByContractcode合同代码(dp0107个人账户信息表.getAccnum个人账号());
      //  List<LN008_borrower_info_借款人信息> ln008_borrower_info_借款人信息s = lN008_借款人类型Repository.findByAccnum1账号(dp006_payment_个人缴存信息表.getAccnum个人账号());


        List<Ln2108借款人信息> ln008_borrower_info_借款人信息_借款人_s =  ln2108借款人信息s.stream().filter(e->e.getBorrowertype借款人类型()
                .equals(E_待_Ln2108_LoaneeTypeEnum.借款人.getText())).collect(Collectors.toList());
        if(ln008_borrower_info_借款人信息_借款人_s.size()!= 0){

            Ln2108借款人信息 ln008_borrower_info_借款人信息_借款人 = ln008_borrower_info_借款人信息_借款人_s.get(0);

//
          //  LN003_contract_info_合同信息 ln003_contract_info_合同信息 = ln003_contract_info_repository.findByLoancontrcode合同代码(ln008_borrower_info_借款人信息_借款人.getLoancontrcode_合同代码());

            Ln0301_个人住房贷款借款合同信息 ln0301_个人住房贷款借款合同信息 = ln0301_个人住房贷款借款合同信息Repository.findByContractcode合同代码(ln008_borrower_info_借款人信息_借款人.getContractcode合同代码());
            //公积金贷款编号
            data.setDkbh(ln0301_个人住房贷款借款合同信息.getJkhtbh_借款合同编号());//ln003_contract_info_合同信息.getLoancontrnum_借款合同号());

            //公积金贷款金额
            data.setDkje(BigDecimal.valueOf(ln0301_个人住房贷款借款合同信息.getHtdkje合同贷款金额()));//ln003_contract_info_合同信息.getLoanamt_贷款金额());

            //公积金贷款期限
            data.setDkqx(Long.valueOf(ln0301_个人住房贷款借款合同信息.getDkqs贷款期数()).toString());//ln003_contract_info_合同信息.getLoanterm_贷款期限().toString());

            //String 公积金贷款还款方式  输出	3.2.4贷款还款方式
            data.setDkhkfs(E_待_ln3101_还款方式Enum_工行.from(E_待_ln0301_还款方式Enum.fromString(ln0301_个人住房贷款借款合同信息.getDkhkfs贷款还款方式())).getText());//ln003_contract_info_合同信息.getRepaymode_还款方式()).getText());


            Ln3101贷款账户辅助信息 ln3101贷款账户辅助信息 = ln3101贷款账户辅助信息Repository.findByContractcode合同代码(ln008_borrower_info_借款人信息_借款人.getContractcode合同代码());

          //  LN005_lone_sub_account_贷款分户信息 ln005_lone_sub_account_贷款分户信息 = lN005_lone_sub_accountRepository.findByloancontrcode合同代码(ln008_borrower_info_借款人信息_借款人.getLoancontrcode_合同代码());

            //decimal 公积金贷款月还款额	decimal(12,2)	输出


            Ln3301贷款还款计划 ln3301贷款还款计划 = ln3301贷款还款计划Repository.findByContractcode合同代码OrderByCurrentterm当期期次Desc(ln0301_个人住房贷款借款合同信息.getContractcode合同代码());
            data.setDkyhke(BigDecimal.valueOf(ln3301贷款还款计划.getPlanprincipal应还本金()+ln3301贷款还款计划.getPlaninterest应还利息()));//ln005_lone_sub_account_贷款分户信息.getMonthrepayamt_贷款月还款额_本金_().setScale(2,BigDecimal.ROUND_HALF_UP));

            //公积金贷款起始日期	date	输出	格式：yyyy-mm-dd
            data.setDkqsrq(DateUtils.getDate(ln0301_个人住房贷款借款合同信息.getJkhtqdrq借款合同签订日期()));//ln003_contract_info_合同信息.getLoandate_放款日期()));

            //公积金贷款到期日期	date	输出	格式：yyyy-mm-dd
            data.setDkdqrq(DateUtils.getDate(ln0301_个人住房贷款借款合同信息.getYddqrq约定到期日期()));//ln003_contract_info_合同信息.getEnddate_到期日期()));

            //公积金贷款结清日期	date	输出	格式：yyyy-mm-dd
            data.setDkjqrq(DateUtils.getDate(ln3101贷款账户辅助信息.getLncldate贷款结清日期()));//ln003_contract_info_合同信息.getCleardate_结清日期()));




            //BigDecimal 	公积金贷款余额	decimal(12,2)	输出
            data.setDkye(BigDecimal.valueOf(ln3101贷款账户辅助信息.getInitialbal当期期初余额()));//ln005_lone_sub_account_贷款分户信息.getCurbal_当前余额());


            List<Ln0303共同借款人信息> ln0303共同借款人信息s = ln0303共同借款人信息Repository.findByContractcode合同代码(ln0301_个人住房贷款借款合同信息.getContractcode合同代码());

/*
            List<Ln0303共同借款人信息> ln008_borrower_info_借款人信息_共同借款人_s  =
                    ln0303共同借款人信息s.stream().filter(e-> e.get().equals(LoaneeTypeEnum.共同借款人.getText())).collect(Collectors.toList());
*/

            if(ln0303共同借款人信息s.size() != 0){
                Ln0303共同借款人信息 e= ln0303共同借款人信息s.get(0);

                Cm0020_个人客户基本信息 cm0020_个人客户基本信息1 = cm0020_个人客户基本信息Repository.findByCustid个人客户号(e.getCustid个人客户号());
                //String gtdkrxm;//	共同贷款人姓名
                data.setGtdkrxm(e.getGtjkrxm共同借款人姓名());//e.getAccname_0_个人姓名());




                Ac0103客户与应用账户关联表 ac0103客户与应用账户关联表1 = ac0103客户与应用账户关联表Repository.findByCustid个人客户号AndAccounttype账户类型(cm0020_个人客户基本信息.getCustid个人客户号(), NEW_账号类型_ACCOUNTTYPE._3_个人账号.getText());

                //String gtdkrsfzh;//	共同贷款人身份证号
                data.setGtdkrsfzh(e.getGtjkrzjhm共同借款人证件号码());//cm0022个人客户证件信息1.getCrednum证件号码());//e.getCertinum_0_证件号码());

                //String gtdkrsfjlgjj; 共同贷款人是否建立公积金   输出	1是，0否
                if(ac0103客户与应用账户关联表1!= null){//getAccnum1账号())){
                    data.setGtdkrsfjlgjj("1");
                }else{
                    data.setGtdkrsfjlgjj("0");
                }


            }else{
                data.setGtdkrxm("");
                data.setGtdkrsfzh("");
                data.setGtdkrsfjlgjj("");
            }









            data.setDkzt(E_待LN003_合同信息_贷款账户状态_工行.from(E_待LN003_合同信息_贷款账户状态.fromString(ln3101贷款账户辅助信息.getLnstatus贷款状态())).getText());




            Ln3102贷款账户业务次数信息 ln3102贷款账户业务次数信息 = ln3102贷款账户业务次数信息Repository.findByContractcode合同代码(ln0301_个人住房贷款借款合同信息.getContractcode合同代码());
           // List<Ln0306个人住房贷款逾期登记信息> ln0306个人住房贷款逾期登记信息s = ln0306个人住房贷款逾期登记信息Repository.findByContractcode合同代码(ln0301_个人住房贷款借款合同信息.getContractcode_合同代码());

            //String dklsyqcs;//	公积金贷款历史逾期次数
          //  data.setDklsyqcs(ln003_contract_info_合同信息.getTolowecnt_累计欠还次数());
            data.setDklsyqcs(Long.valueOf(ln3102贷款账户业务次数信息.getAcmloverduecount累计逾期期数()).intValue());




/*

            List<LN006_RepaymentPlan_贷款分期还款计划> ln006_repaymentPlans = ln006_repaymentPlanRepository.findByLoancontrcode0合同代码AndBegdate0开始日期After(ln003_contract_info_合同信息.getLoancontrcode合同代码(),start18月);
            //TODO data.setDkzt(ln003_contract_info_合同信息.getOwecnt_欠还次数());


            List<LN006_RepaymentPlan_贷款分期还款计划> ln006_repaymentPlans1 =  ln006_repaymentPlans.stream().filter(e->e.getCurseqstate本期状态().equals(CurrentSequencePaymentStatusEnum.逾期.getText())
                    || e.getCurseqstate本期状态().equals(CurrentSequencePaymentStatusEnum.逾期归还.getText())).collect(Collectors.toList());
*/


/*            Ln0306个人住房贷款逾期登记信息 pre_LN006_RepaymentPlan = null;
            Integer 最大连续逾期次数 = 0;
            Integer 连续逾期次数 = 0;
            for(Ln0306个人住房贷款逾期登记信息 e:ln0306个人住房贷款逾期登记信息s){
                if(pre_LN006_RepaymentPlan != null){

                    if(Math.abs(pre_LN006_RepaymentPlan.getHkqc还款期次()-e.getHkqc还款期次()) ==1){
                        连续逾期次数++;
                    }else{
                        if(最大连续逾期次数 < 连续逾期次数){
                            最大连续逾期次数 = 连续逾期次数;
                        }
                        连续逾期次数 = 0;
                    }
                }

                pre_LN006_RepaymentPlan  = e;

            };*/

            // String zdlxyqcs;//	最大连续逾期次数	char	输出
            data.setZdlxyqcs(Long.valueOf(ln3102贷款账户业务次数信息.getContinuecount最大连续逾期期数()).toString());

         //   LN0014_Trading_house_贷款房屋信息 ln0014_trading_house_贷款房屋信息 = ln0014_tradingHouse_贷款房屋信息Repository.findByLoancontrcode0合同代码(ln003_contract_info_合同信息.getLoancontrcode合同代码());
         //   if(ln0014_trading_house_贷款房屋信息!= null){

                //String grgfdz;//	个人购房地址	char	输出  ln014
                data.setGrgfdz(ln0301_个人住房贷款借款合同信息.getFwzl房屋坐落());//ln0014_trading_house_贷款房屋信息.getHouseaddr_1_房屋坐落());

                //BigDecimal fwgmjszj;//	房屋购买计税价格	decimal(12,2)	输出  房屋够吗价格 LN014
                data.setFwgmjszj(BigDecimal.valueOf(ln0301_个人住房贷款借款合同信息.getFwzj房屋总价()));//ln0014_trading_house_贷款房屋信息.getBuyhouseamt_0_购房房款总额_成交价());
        //    }

        }

        ReturnDate returnDate = new ReturnDate();
        returnDate.setData(data);

       // returnDate.setLastDate();

        return data;

    }

    private String fmt(List<String> strings,String defaultString){


        strings =  strings.stream().map(e-> {
            if(e ==null){
                return defaultString;
            }
            return e;
        }).collect(Collectors.toList());
        return StringUtils.join(strings.stream()
                .map(e->e).toArray(),"|");


        //String lxtqfs ; // 近12个月自然月提取方式
    }

    private List<String> init(Integer size,String defaultString){
        List<String> stringss =  new ArrayList<>();
/*
        for(int i= 0;i<size;i++){
            stringss.add(defaultString);


        }*/
        return stringss;


    }
}
