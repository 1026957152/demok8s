package com.example.dm.apidata.ccbV1;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


//@ApiModel
@JsonInclude(JsonInclude.Include.NON_NULL)

public class CcbItem {

    @ApiModelProperty(value="__wtrxm_0_委托人名称_0",name="wtrxm",example="",position=0)
    @JsonProperty("wtrxm")
    @JSONField(name="wtrxm")
    private String 	__wtrxm_0_委托人名称_0;//

    @ApiModelProperty(value="__wtrjgh_1_委托人机构号_Y",name="wtrjgh",example="",position=1)
    @JsonProperty("wtrjgh")
    @JSONField(name="wtrjgh")
    private String 	__wtrjgh_1_委托人机构号_Y;//

    @ApiModelProperty(value="__khfdmc_2_客户法定名称_Y",name="khfdmc",position=2)
    @JsonProperty("khfdmc")
    @JSONField(name="khfdmc")
    private String 	__khfdmc_2_客户法定名称_Y;//	客户名称
    @ApiModelProperty(value="__zjlxdm_3_证件类型代码_Y",name="zjlxdm",position=3)
    @JsonProperty("zjlxdm")
    @JSONField(name="zjlxdm")
    private String 	__zjlxdm_3_证件类型代码_Y;//	身份证
    @ApiModelProperty(value="__zjhm_4_证件号码_Y",name="zjhm",position=4 ,example = "1 身份证 2 军官证 3 护照 9 其他 ")


    @JsonProperty("zjhm")
    @JSONField(name="zjhm")
    private String 	__zjhm_4_证件号码_Y;//	证件号码
    @ApiModelProperty(value="__gbgrzhzt_5_贯标个人账户状态_Y",name="gbgrzhzt",position=5,example = "0 正常 1 封存 9 销户 7 未知")
    @JsonProperty("gbgrzhzt")
    @JSONField(name="gbgrzhzt")
    private String 	__gbgrzhzt_5_贯标个人账户状态_Y;//	个人账户状态



    @ApiModelProperty(value="__gbgrzhye_6_贯标个人账户余额_Y",name="gbgrzhye",position=6)
    @JsonProperty("gbgrzhye")
    @JSONField(name="gbgrzhye")
    private String 	__gbgrzhye_6_贯标个人账户余额_Y;//	个人账户余额
    @ApiModelProperty(value="__gbgrjcbl_7_贯标个人缴存比例_Y",name="khfdmc",position=7)
    @JsonProperty("gbgrjcbl")
    @JSONField(name="gbgrjcbl")
    private String 	__gbgrjcbl_7_贯标个人缴存比例_Y;//	个人缴存比例
    @ApiModelProperty(value="__gbdwjcbl_8_贯标单位缴存比例_Y",name="khfdmc",position=8)
    @JsonProperty("gbdwjcbl")
    @JSONField(name="gbdwjcbl")
    private String 	__gbdwjcbl_8_贯标单位缴存比例_Y;//	单位缴存比例
    @ApiModelProperty(value="__gjjyjcze_9_公积金月缴存总额_Y",name="khfdmc",position=9)
    @JsonProperty("gjjyjcze")
    @JSONField(name="gjjyjcze")
    private String 	__gjjyjcze_9_公积金月缴存总额_Y;//	月缴存总额
    @ApiModelProperty(value="__gbgrjcjs_10_贯标个人缴存基数_Y",name="khfdmc",position=10)
    @JsonProperty("gbgrjcjs")
    @JSONField(name="gbgrjcjs")
    private String 	__gbgrjcjs_10_贯标个人缴存基数_Y;//	工资基数
    @ApiModelProperty(value="__bnye_11_本年余额_Y",name="khfdmc",position=11)
    @JsonProperty("bnye")
    @JSONField(name="bnye")
    private String 	__bnye_11_本年余额_Y;//	本年余额
    @ApiModelProperty(value="__lnjccs_12_历年汇缴次数_Y",name="khfdmc",position=12)
    @JsonProperty("lnjccs")
    @JSONField(name="lnjccs")
    private String 	__lnjccs_12_历年汇缴次数_Y;//	历年汇缴次数
    @ApiModelProperty(value="__lnbjcs_13_历年补缴次数_Y",name="khfdmc",position=13)
    @JsonProperty("lnbjcs")
    @JSONField(name="lnbjcs")
    private String 	__lnbjcs_13_历年补缴次数_Y;//	历年补缴次数
    @ApiModelProperty(value="__bnhjcs_14_本年汇缴次数_Y",name="khfdmc",position=14)
    @JsonProperty("bnhjcs")
    @JSONField(name="bnhjcs")
    private String 	__bnhjcs_14_本年汇缴次数_Y;//	本年汇缴次数
    @ApiModelProperty(value="__bnbjcs_15_本年补缴次数_Y",name="khfdmc",position=15)
    @JsonProperty("bnbjcs")
    @JSONField(name="bnbjcs")
    private String 	__bnbjcs_15_本年补缴次数_Y;//	本年补缴次数
    @ApiModelProperty(value="__lnzqcs_16_历年支取次数_Y",name="khfdmc",position=16)
    @JsonProperty("lnzqcs")
    @JSONField(name="lnzqcs")

    private String 	__lnzqcs_16_历年支取次数_Y;//	历年支取次数
    @ApiModelProperty(value="__bnzqcs_17_本年支取次数_Y",name="khfdmc",position=17)
    @JsonProperty("bnzqcs")
    @JSONField(name="bnzqcs")
    private String 	__bnzqcs_17_本年支取次数_Y;//	本年支取次数
    @ApiModelProperty(value="__gbjzny_18_贯标缴至年月_Y",name="khfdmc",position=18)
    @JsonProperty("gbjzny")
    @JSONField(name="gbjzny")
    private String 	__gbjzny_18_贯标缴至年月_Y;//	缴至年月
    @ApiModelProperty(value="__zhzqrq_19_最后支取日期_Y",name="khfdmc",position=19)
    @JsonProperty("zhzqrq")
    @JSONField(name="zhzqrq")
    private String 	__zhzqrq_19_最后支取日期_Y;//	末次支取日期
    @ApiModelProperty(value="__ywzl_20_业务种类_Y",name="khfdmc",position=20,example = " 01 基本公积金 02 补充公积金 03 住房补贴 04 二次补贴")
    @JsonProperty("ywzl")
    @JSONField(name="ywzl")
    private String 	__ywzl_20_业务种类_Y;//	"01 基本公积金
    /*            02 补充公积金
03 住房补贴
04 二次补贴"*/

    @ApiModelProperty(value="__gzdwxzdm_21_工作单位性质代码_Y",name="khfdmc",position=21, example = "a 国家机关  b 全额拨款事业单位 c 差额拨款事业单位 d 自收自支事业单位 e 参公管理事业单位 g 企业管理事业单位 h 民办非企业单位 i 国有企业 j 民营企业  k 外资企业  l 股份有限公司  m 城镇集体企业 n 城镇私营企业 z 其他 o 军队")
    @JsonProperty("gzdwxzdm")
    @JSONField(name="gzdwxzdm")
    private String 	__gzdwxzdm_21_工作单位性质代码_Y;//	性质代码



    @ApiModelProperty(value="__gbjtzz_22_贯标家庭住址_N",name="khfdmc",position=22)
    @JsonProperty("gbjtzz")
    @JSONField(name="gbjtzz")
    private String 	__gbjtzz_22_贯标家庭住址_N;//	家庭住址
    @ApiModelProperty(value="__gbsjhm_23_贯标手机号码_N",name="khfdmc",position=23)
    @JsonProperty("gbsjhm")
    @JSONField(name="gbsjhm")
    private String 	__gbsjhm_23_贯标手机号码_N;//	手机号码
    @ApiModelProperty(value="__gbgrzh_24_贯标个人账号_N",name="khfdmc",position=24)
    @JsonProperty("gbgrzh")
    @JSONField(name="gbgrzh")
    private String 	__gbgrzh_24_贯标个人账号_N;//	个人账户
    @ApiModelProperty(value="__gbgryjce_25_贯标个人月缴存额_O",name="khfdmc",position=25)
    @JsonProperty("gbgryjce")
    @JSONField(name="gbgryjce")
    private String 	__gbgryjce_25_贯标个人月缴存额_O;//	个人月缴存金额
    @ApiModelProperty(value="__gbdwyjce_26_贯标单位月缴存额_O",name="khfdmc",position=26)
    @JsonProperty("gbdwyjce")
    @JSONField(name="gbdwyjce")
    private String 	__gbdwyjce_26_贯标单位月缴存额_O;//	单位月缴存金额
    @ApiModelProperty(value="__fgjezhsnye_27_房改金融账户上年余额_O",name="khfdmc",position=27)
    @JsonProperty("fgjezhsnye")
    @JSONField(name="fgjezhsnye")
    private String 	__fgjezhsnye_27_房改金融账户上年余额_O;//	上年余额
    @ApiModelProperty(value="__bnhjje_28_本年汇缴金额_O",name="khfdmc",position=28)
    @JsonProperty("bnhjje")
    @JSONField(name="bnhjje")
    private String 	__bnhjje_28_本年汇缴金额_O;//	当年汇缴金额
    @ApiModelProperty(value="__bnbjje_29_本年补缴金额_O",name="khfdmc",position=29)
    @JsonProperty("bnbjje")
    @JSONField(name="bnbjje")
    private String 	__bnbjje_29_本年补缴金额_O;//	当年补缴金额
    @ApiModelProperty(value="__ljhjje_30_累计汇缴金额_O",name="khfdmc",position=30)
    @JsonProperty("ljhjje")
    @JSONField(name="ljhjje")
    private String 	__ljhjje_30_累计汇缴金额_O;//	累计汇缴金额
    @ApiModelProperty(value="__ljbjje_31_累计补缴金额_O",name="khfdmc",position=31)
    @JsonProperty("ljbjje")
    @JSONField(name="ljbjje")
    private String 	__ljbjje_31_累计补缴金额_O;//	累计补缴金额
    @ApiModelProperty(value="__bnzqje_32_本年支取金额_O",name="khfdmc",position=32)
    @JsonProperty("bnzqje")
    @JSONField(name="bnzqje")
    private String 	__bnzqje_32_本年支取金额_O;//	当年提取金额
    @ApiModelProperty(value="__ljzqje_33_累计支取金额_O",name="khfdmc",position=33)
    @JsonProperty("ljzqje")
    @JSONField(name="ljzqje")
    private String 	__ljzqje_33_累计支取金额_O;//	累计提取金额
    @ApiModelProperty(value="__ljzrje_34_累计转入金额_O",name="khfdmc",position=34)
    @JsonProperty("ljzrje")
    @JSONField(name="ljzrje")
    private String 	__ljzrje_34_累计转入金额_O;//	累计转入金额
    @ApiModelProperty(value="__ljzcje_35_累计转出金额_O",name="khfdmc",position=35)
    @JsonProperty("ljzcje")
    @JSONField(name="ljzcje")
    private String 	__ljzcje_35_累计转出金额_O;//	累计转出金额
    @ApiModelProperty(value="__bnzrje_36_本年转入金额_O",name="khfdmc",position=36)
    @JsonProperty("bnzrje")
    @JSONField(name="bnzrje")
    private String 	__bnzrje_36_本年转入金额_O;//	本年转入金额
    @ApiModelProperty(value="__bnzcje_37_本年转出金额_O",name="khfdmc",position=37)
    @JsonProperty("bnzcje")
    @JSONField(name="bnzcje")
    private String 	__bnzcje_37_本年转出金额_O;//	本年转出金额
    @ApiModelProperty(value="__ssbyjcwt_38_四十八月缴存位图_O",name="khfdmc",position=38)
    @JsonProperty("ssbyjcwt")
    @JSONField(name="ssbyjcwt")
    private String 	__ssbyjcwt_38_四十八月缴存位图_O;//	四十八月缴存位图
    @ApiModelProperty(value="__gbkhrq_39_贯标开户日期_O",name="khfdmc",position=39)
    @JsonProperty("gbkhrq")
    @JSONField(name="gbkhrq")
    private String 	__gbkhrq_39_贯标开户日期_O;//	开户日期
    @ApiModelProperty(value="__gbxhrq_40_贯标销户日期_O",name="khfdmc",position=40)
    @JsonProperty("gbxhrq")
    @JSONField(name="gbxhrq")
    private String 	__gbxhrq_40_贯标销户日期_O;//	销户日期
    @ApiModelProperty(value="__fgjrzhzhbdrq_41_房改金融账户最后变动日期_O",name="khfdmc",position=41)
    @JsonProperty("fgjrzhzhbdrq")
    @JSONField(name="fgjrzhzhbdrq")
    private String 	__fgjrzhzhbdrq_41_房改金融账户最后变动日期_O;//	最后动户日
    @ApiModelProperty(value="__zzlmkbz_42_制作联名卡标志_O",name="khfdmc",position=42)
    @JsonProperty("zzlmkbz")
    @JSONField(name="zzlmkbz")

    private String 	__zzlmkbz_42_制作联名卡标志_O;//	"联名卡制卡
    @ApiModelProperty(value="__lmkzkztdm_43_联名卡制卡状态代码_O",name="khfdmc",position=43,example = "0 否 1 是")
    @JsonProperty("lmkzkztdm")
    @JSONField(name="lmkzkztdm")
/*            0 否
1 是"*/
    private String 	__lmkzkztdm_43_联名卡制卡状态代码_O;//
    @ApiModelProperty(value="__fgjrkhjgbm_44_房改金融开户机构编号_O",name="khfdmc",position=44,example = "01 未制卡 02 已制卡 03 不制卡 04 待制卡 05 制卡中")
    @JsonProperty("fgjrkhjgbm")
    @JSONField(name="fgjrkhjgbm")
/*       "01 未制卡     02 已制卡
03 不制卡
04 待制卡
05 制卡中"*/
    private String 	__fgjrkhjgbm_44_房改金融开户机构编号_O;//
    @ApiModelProperty(value="__gbdwzh_45_贯标单位账号_O",name="khfdmc",position=45)
    @JsonProperty("gbdwzh")
    @JSONField(name="gbdwzh")
    private String 	__gbdwzh_45_贯标单位账号_O;//
    @ApiModelProperty(value="__gbdwmc_46_贯标单位名称_O",name="khfdmc",position=46)
    @JsonProperty("gbdwmc")
    @JSONField(name="gbdwmc")
    private String 	__gbdwmc_46_贯标单位名称_O;//

/*    正常 ("01", "正常",1,""),
    开户 ("02", "开户",2,""),
    缓缴 ("03", "缓缴",1,""),
    销户 ("04", "销户",1,""),
    其他 ("99", "其他",1,""),*/
    @ApiModelProperty(value="__gbdwzhzt_47_贯标单位账户状态_O",name="khfdmc",position=47,example = "01 正常 02 开户 03 缓缴 04 销户 99 其他")

    @JsonProperty("gbdwzhzt")
    @JSONField(name="gbdwzhzt")
    private String 	__gbdwzhzt_47_贯标单位账户状态_O;//
    @ApiModelProperty(value="__gbzzjgdm_48_贯标组织机构代码_O",name="gbzzjgdm",position=48)
    @JsonProperty("gbzzjgdm")
    @JSONField(name="gbzzjgdm")
    private String 	__gbzzjgdm_48_贯标组织机构代码_O;//





    @ApiModelProperty(value="_1_DWKHRQ_贯标单位开户日期_610576",name="_1_DWKHRQ",position=48)
    @JsonProperty("dwkhrq")
    @JSONField(name="dwkhrq")
    private String 	_1_DWKHRQ_贯标单位开户日期_610576;//


    @ApiModelProperty(value="_2_DWJCBLSX_贯标单位缴存比例上限_610719",name="_2_DWJCBLSX",position=48)
    @JsonProperty("dwjcblsx")
    @JSONField(name="dwjcblsx")
    private String 	_2_DWJCBLSX_贯标单位缴存比例上限_610719;//

    @ApiModelProperty(value="_3_DWJCBLXX_贯标单位缴存比例下限_610718",name="_3_DWJCBLXX",position=48)
    @JsonProperty("dwjcblxx")
    @JSONField(name="_3_DWJCBLXX")
    private String 	_3_DWJCBLXX_贯标单位缴存比例下限_610718;//

    @ApiModelProperty(value="_4_DWJCRS_贯标单位缴存人数_610601",name="_4_DWJCRS_",position=48)
    @JsonProperty("dwjcrs")
    @JSONField(name="dwjcrs")
    private String 	_4_DWJCRS_贯标单位缴存人数_610601;//

    @ApiModelProperty(value="_5_DWZHZTZJBGSJ_单位账户状态最近变更时间",name="_5_DWZHZTZJBGSJ",position=48)
    @JsonProperty("dwzhztzjbgsj")
    @JSONField(name="dwzhztzjbgsj")
    private String 	_5_DWZHZTZJBGSJ_单位账户状态最近变更时间;//

    @ApiModelProperty(value="_6_DWJZNY_单位缴至年月",name="_6_DWJZNY",position=48)
    @JsonProperty("dwjzny")
    @JSONField(name="dwjzny")
    private String 	_6_DWJZNY_单位缴至年月;//

    @ApiModelProperty(value="__shtyxydm_社会统一信用代码",name="gbzzjgdm",position=48)
    @JsonProperty("shtyxydm")
    @JSONField(name="shtyxydm")
    private String 	_7_shtyxydm_社会统一信用代码;//

    @ApiModelProperty(value="_8_shtyxydmly_社会统一信用代码来源",name="_8_shtyxydmly_社会统一信用代码来源",position=48)
    @JsonProperty("_8_shtyxydmly_社会统一信用代码来源")
    @JSONField(name="_8_shtyxydmly_社会统一信用代码来源")
    private String _8_shtyxydmly_社会统一信用代码来源;

    @ApiModelProperty(value="_9_dwsshy_单位所属行业",name="_9_dwsshy",position=48,example = "如果统一信用代码来源与 YLGJJ,则为以下：A:农、林、牧、渔业 ;B:采矿业 ;C:制造业;D:电力、热力、燃气及水生产和供应业;E:建筑业;F:交通运输、仓储和邮政业;G:信息传输、计算机服务和软件业;H:批发和零售业;I:住宿和餐饮业;i:金融业;K:房地产业;L:租赁和商务服务业;M:科学研究、技术服务和地质勘查业;N:水利、环境和公共设施管理业;O:居民服务和其他服务业;P:教育;R:文化、体育和娱乐业;S:公共管理和社会组织")
    @JsonProperty("dwsshy")
    @JSONField(name="dwsshy")
    private String _9_dwsshy_单位所属行业;



    public String get_8_shtyxydmly_社会统一信用代码来源() {
        return _8_shtyxydmly_社会统一信用代码来源;
    }

    public void set_8_shtyxydmly_社会统一信用代码来源(String _8_shtyxydmly_社会统一信用代码来源) {
        this._8_shtyxydmly_社会统一信用代码来源 = _8_shtyxydmly_社会统一信用代码来源;
    }

    public String get_9_dwsshy_单位所属行业() {
        return _9_dwsshy_单位所属行业;
    }

    public void set_9_dwsshy_单位所属行业(String _9_dwsshy_单位所属行业) {
        this._9_dwsshy_单位所属行业 = _9_dwsshy_单位所属行业;
    }

    public String get_7_shtyxydm_社会统一信用代码() {
        return _7_shtyxydm_社会统一信用代码;
    }

    public void set_7_shtyxydm_社会统一信用代码(String _7_shtyxydm_社会统一信用代码) {
        this._7_shtyxydm_社会统一信用代码 = _7_shtyxydm_社会统一信用代码;
    }

    public void set__wtrxm_0_委托人名称_0(String __wtrxm_0_委托人名称_0) {
        this.__wtrxm_0_委托人名称_0 = __wtrxm_0_委托人名称_0;
    }

    public String get__wtrjgh_1_委托人机构号_Y() {
        return __wtrjgh_1_委托人机构号_Y;
    }

    public void set__wtrjgh_1_委托人机构号_Y(String __wtrjgh_1_委托人机构号_Y) {
        this.__wtrjgh_1_委托人机构号_Y = __wtrjgh_1_委托人机构号_Y;
    }

    public String get__khfdmc_2_客户法定名称_Y() {
        return __khfdmc_2_客户法定名称_Y;
    }

    public void set__khfdmc_2_客户法定名称_Y(String __khfdmc_2_客户法定名称_Y) {
        this.__khfdmc_2_客户法定名称_Y = __khfdmc_2_客户法定名称_Y;
    }

    public String get__zjlxdm_3_证件类型代码_Y() {
        return __zjlxdm_3_证件类型代码_Y;
    }

    public void set__zjlxdm_3_证件类型代码_Y(String __zjlxdm_3_证件类型代码_Y) {
        this.__zjlxdm_3_证件类型代码_Y = __zjlxdm_3_证件类型代码_Y;
    }

    public String get__zjhm_4_证件号码_Y() {
        return __zjhm_4_证件号码_Y;
    }

    public void set__zjhm_4_证件号码_Y(String __zjhm_4_证件号码_Y) {
        this.__zjhm_4_证件号码_Y = __zjhm_4_证件号码_Y;
    }

    public String get__gbgrzhzt_5_贯标个人账户状态_Y() {
        return __gbgrzhzt_5_贯标个人账户状态_Y;
    }

    public void set__gbgrzhzt_5_贯标个人账户状态_Y(String __gbgrzhzt_5_贯标个人账户状态_Y) {
        this.__gbgrzhzt_5_贯标个人账户状态_Y = __gbgrzhzt_5_贯标个人账户状态_Y;
    }

    public String get__gbgrzhye_6_贯标个人账户余额_Y() {
        return __gbgrzhye_6_贯标个人账户余额_Y;
    }

    public void set__gbgrzhye_6_贯标个人账户余额_Y(String __gbgrzhye_6_贯标个人账户余额_Y) {
        this.__gbgrzhye_6_贯标个人账户余额_Y = __gbgrzhye_6_贯标个人账户余额_Y;
    }

    public String get__gbgrjcbl_7_贯标个人缴存比例_Y() {
        return __gbgrjcbl_7_贯标个人缴存比例_Y;
    }

    public void set__gbgrjcbl_7_贯标个人缴存比例_Y(String __gbgrjcbl_7_贯标个人缴存比例_Y) {
        this.__gbgrjcbl_7_贯标个人缴存比例_Y = __gbgrjcbl_7_贯标个人缴存比例_Y;
    }

    public String get__gbdwjcbl_8_贯标单位缴存比例_Y() {
        return __gbdwjcbl_8_贯标单位缴存比例_Y;
    }

    public void set__gbdwjcbl_8_贯标单位缴存比例_Y(String __gbdwjcbl_8_贯标单位缴存比例_Y) {
        this.__gbdwjcbl_8_贯标单位缴存比例_Y = __gbdwjcbl_8_贯标单位缴存比例_Y;
    }

    public String get__gjjyjcze_9_公积金月缴存总额_Y() {
        return __gjjyjcze_9_公积金月缴存总额_Y;
    }

    public void set__gjjyjcze_9_公积金月缴存总额_Y(String __gjjyjcze_9_公积金月缴存总额_Y) {
        this.__gjjyjcze_9_公积金月缴存总额_Y = __gjjyjcze_9_公积金月缴存总额_Y;
    }

    public String get__gbgrjcjs_10_贯标个人缴存基数_Y() {
        return __gbgrjcjs_10_贯标个人缴存基数_Y;
    }

    public void set__gbgrjcjs_10_贯标个人缴存基数_Y(String __gbgrjcjs_10_贯标个人缴存基数_Y) {
        this.__gbgrjcjs_10_贯标个人缴存基数_Y = __gbgrjcjs_10_贯标个人缴存基数_Y;
    }

    public String get__bnye_11_本年余额_Y() {
        return __bnye_11_本年余额_Y;
    }

    public void set__bnye_11_本年余额_Y(String __bnye_11_本年余额_Y) {
        this.__bnye_11_本年余额_Y = __bnye_11_本年余额_Y;
    }

    public String get__lnjccs_12_历年汇缴次数_Y() {
        return __lnjccs_12_历年汇缴次数_Y;
    }

    public void set__lnjccs_12_历年汇缴次数_Y(String __lnjccs_12_历年汇缴次数_Y) {
        this.__lnjccs_12_历年汇缴次数_Y = __lnjccs_12_历年汇缴次数_Y;
    }

    public String get__lnbjcs_13_历年补缴次数_Y() {
        return __lnbjcs_13_历年补缴次数_Y;
    }

    public void set__lnbjcs_13_历年补缴次数_Y(String __lnbjcs_13_历年补缴次数_Y) {
        this.__lnbjcs_13_历年补缴次数_Y = __lnbjcs_13_历年补缴次数_Y;
    }

    public String get__bnhjcs_14_本年汇缴次数_Y() {
        return __bnhjcs_14_本年汇缴次数_Y;
    }

    public void set__bnhjcs_14_本年汇缴次数_Y(String __bnhjcs_14_本年汇缴次数_Y) {
        this.__bnhjcs_14_本年汇缴次数_Y = __bnhjcs_14_本年汇缴次数_Y;
    }

    public String get__bnbjcs_15_本年补缴次数_Y() {
        return __bnbjcs_15_本年补缴次数_Y;
    }

    public void set__bnbjcs_15_本年补缴次数_Y(String __bnbjcs_15_本年补缴次数_Y) {
        this.__bnbjcs_15_本年补缴次数_Y = __bnbjcs_15_本年补缴次数_Y;
    }

    public String get__lnzqcs_16_历年支取次数_Y() {
        return __lnzqcs_16_历年支取次数_Y;
    }

    public void set__lnzqcs_16_历年支取次数_Y(String __lnzqcs_16_历年支取次数_Y) {
        this.__lnzqcs_16_历年支取次数_Y = __lnzqcs_16_历年支取次数_Y;
    }

    public String get__bnzqcs_17_本年支取次数_Y() {
        return __bnzqcs_17_本年支取次数_Y;
    }

    public void set__bnzqcs_17_本年支取次数_Y(String __bnzqcs_17_本年支取次数_Y) {
        this.__bnzqcs_17_本年支取次数_Y = __bnzqcs_17_本年支取次数_Y;
    }

    public String get__gbjzny_18_贯标缴至年月_Y() {
        return __gbjzny_18_贯标缴至年月_Y;
    }

    public void set__gbjzny_18_贯标缴至年月_Y(String __gbjzny_18_贯标缴至年月_Y) {
        this.__gbjzny_18_贯标缴至年月_Y = __gbjzny_18_贯标缴至年月_Y;
    }

    public String get__zhzqrq_19_最后支取日期_Y() {
        return __zhzqrq_19_最后支取日期_Y;
    }

    public void set__zhzqrq_19_最后支取日期_Y(String __zhzqrq_19_最后支取日期_Y) {
        this.__zhzqrq_19_最后支取日期_Y = __zhzqrq_19_最后支取日期_Y;
    }

    public String get__ywzl_20_业务种类_Y() {
        return __ywzl_20_业务种类_Y;
    }

    public void set__ywzl_20_业务种类_Y(String __ywzl_20_业务种类_Y) {
        this.__ywzl_20_业务种类_Y = __ywzl_20_业务种类_Y;
    }

    public String get__gzdwxzdm_21_工作单位性质代码_Y() {
        return __gzdwxzdm_21_工作单位性质代码_Y;
    }

    public void set__gzdwxzdm_21_工作单位性质代码_Y(String __gzdwxzdm_21_工作单位性质代码_Y) {
        this.__gzdwxzdm_21_工作单位性质代码_Y = __gzdwxzdm_21_工作单位性质代码_Y;
    }

    public String get__gbjtzz_22_贯标家庭住址_N() {
        return __gbjtzz_22_贯标家庭住址_N;
    }

    public void set__gbjtzz_22_贯标家庭住址_N(String __gbjtzz_22_贯标家庭住址_N) {
        this.__gbjtzz_22_贯标家庭住址_N = __gbjtzz_22_贯标家庭住址_N;
    }

    public String get__gbsjhm_23_贯标手机号码_N() {
        return __gbsjhm_23_贯标手机号码_N;
    }

    public void set__gbsjhm_23_贯标手机号码_N(String __gbsjhm_23_贯标手机号码_N) {
        this.__gbsjhm_23_贯标手机号码_N = __gbsjhm_23_贯标手机号码_N;
    }

    public String get__gbgrzh_24_贯标个人账号_N() {
        return __gbgrzh_24_贯标个人账号_N;
    }

    public void set__gbgrzh_24_贯标个人账号_N(String __gbgrzh_24_贯标个人账号_N) {
        this.__gbgrzh_24_贯标个人账号_N = __gbgrzh_24_贯标个人账号_N;
    }

    public String get__gbgryjce_25_贯标个人月缴存额_O() {
        return __gbgryjce_25_贯标个人月缴存额_O;
    }

    public void set__gbgryjce_25_贯标个人月缴存额_O(String __gbgryjce_25_贯标个人月缴存额_O) {
        this.__gbgryjce_25_贯标个人月缴存额_O = __gbgryjce_25_贯标个人月缴存额_O;
    }

    public String get__gbdwyjce_26_贯标单位月缴存额_O() {
        return __gbdwyjce_26_贯标单位月缴存额_O;
    }

    public void set__gbdwyjce_26_贯标单位月缴存额_O(String __gbdwyjce_26_贯标单位月缴存额_O) {
        this.__gbdwyjce_26_贯标单位月缴存额_O = __gbdwyjce_26_贯标单位月缴存额_O;
    }

    public String get__fgjezhsnye_27_房改金融账户上年余额_O() {
        return __fgjezhsnye_27_房改金融账户上年余额_O;
    }

    public void set__fgjezhsnye_27_房改金融账户上年余额_O(String __fgjezhsnye_27_房改金融账户上年余额_O) {
        this.__fgjezhsnye_27_房改金融账户上年余额_O = __fgjezhsnye_27_房改金融账户上年余额_O;
    }

    public String get__bnhjje_28_本年汇缴金额_O() {
        return __bnhjje_28_本年汇缴金额_O;
    }

    public void set__bnhjje_28_本年汇缴金额_O(String __bnhjje_28_本年汇缴金额_O) {
        this.__bnhjje_28_本年汇缴金额_O = __bnhjje_28_本年汇缴金额_O;
    }

    public String get__bnbjje_29_本年补缴金额_O() {
        return __bnbjje_29_本年补缴金额_O;
    }

    public void set__bnbjje_29_本年补缴金额_O(String __bnbjje_29_本年补缴金额_O) {
        this.__bnbjje_29_本年补缴金额_O = __bnbjje_29_本年补缴金额_O;
    }

    public String get__ljhjje_30_累计汇缴金额_O() {
        return __ljhjje_30_累计汇缴金额_O;
    }

    public void set__ljhjje_30_累计汇缴金额_O(String __ljhjje_30_累计汇缴金额_O) {
        this.__ljhjje_30_累计汇缴金额_O = __ljhjje_30_累计汇缴金额_O;
    }

    public String get__ljbjje_31_累计补缴金额_O() {
        return __ljbjje_31_累计补缴金额_O;
    }

    public void set__ljbjje_31_累计补缴金额_O(String __ljbjje_31_累计补缴金额_O) {
        this.__ljbjje_31_累计补缴金额_O = __ljbjje_31_累计补缴金额_O;
    }

    public String get__bnzqje_32_本年支取金额_O() {
        return __bnzqje_32_本年支取金额_O;
    }

    public void set__bnzqje_32_本年支取金额_O(String __bnzqje_32_本年支取金额_O) {
        this.__bnzqje_32_本年支取金额_O = __bnzqje_32_本年支取金额_O;
    }

    public String get__ljzqje_33_累计支取金额_O() {
        return __ljzqje_33_累计支取金额_O;
    }

    public void set__ljzqje_33_累计支取金额_O(String __ljzqje_33_累计支取金额_O) {
        this.__ljzqje_33_累计支取金额_O = __ljzqje_33_累计支取金额_O;
    }

    public String get__ljzrje_34_累计转入金额_O() {
        return __ljzrje_34_累计转入金额_O;
    }

    public void set__ljzrje_34_累计转入金额_O(String __ljzrje_34_累计转入金额_O) {
        this.__ljzrje_34_累计转入金额_O = __ljzrje_34_累计转入金额_O;
    }

    public String get__ljzcje_35_累计转出金额_O() {
        return __ljzcje_35_累计转出金额_O;
    }

    public void set__ljzcje_35_累计转出金额_O(String __ljzcje_35_累计转出金额_O) {
        this.__ljzcje_35_累计转出金额_O = __ljzcje_35_累计转出金额_O;
    }

    public String get__bnzrje_36_本年转入金额_O() {
        return __bnzrje_36_本年转入金额_O;
    }

    public void set__bnzrje_36_本年转入金额_O(String __bnzrje_36_本年转入金额_O) {
        this.__bnzrje_36_本年转入金额_O = __bnzrje_36_本年转入金额_O;
    }

    public String get__bnzcje_37_本年转出金额_O() {
        return __bnzcje_37_本年转出金额_O;
    }

    public void set__bnzcje_37_本年转出金额_O(String __bnzcje_37_本年转出金额_O) {
        this.__bnzcje_37_本年转出金额_O = __bnzcje_37_本年转出金额_O;
    }

    public String get__ssbyjcwt_38_四十八月缴存位图_O() {
        return __ssbyjcwt_38_四十八月缴存位图_O;
    }

    public void set__ssbyjcwt_38_四十八月缴存位图_O(String __ssbyjcwt_38_四十八月缴存位图_O) {
        this.__ssbyjcwt_38_四十八月缴存位图_O = __ssbyjcwt_38_四十八月缴存位图_O;
    }

    public String get__gbkhrq_39_贯标开户日期_O() {
        return __gbkhrq_39_贯标开户日期_O;
    }

    public void set__gbkhrq_39_贯标开户日期_O(String __gbkhrq_39_贯标开户日期_O) {
        this.__gbkhrq_39_贯标开户日期_O = __gbkhrq_39_贯标开户日期_O;
    }

    public String get__gbxhrq_40_贯标销户日期_O() {
        return __gbxhrq_40_贯标销户日期_O;
    }

    public void set__gbxhrq_40_贯标销户日期_O(String __gbxhrq_40_贯标销户日期_O) {
        this.__gbxhrq_40_贯标销户日期_O = __gbxhrq_40_贯标销户日期_O;
    }

    public String get__fgjrzhzhbdrq_41_房改金融账户最后变动日期_O() {
        return __fgjrzhzhbdrq_41_房改金融账户最后变动日期_O;
    }

    public void set__fgjrzhzhbdrq_41_房改金融账户最后变动日期_O(String __fgjrzhzhbdrq_41_房改金融账户最后变动日期_O) {
        this.__fgjrzhzhbdrq_41_房改金融账户最后变动日期_O = __fgjrzhzhbdrq_41_房改金融账户最后变动日期_O;
    }

    public String get__zzlmkbz_42_制作联名卡标志_O() {
        return __zzlmkbz_42_制作联名卡标志_O;
    }

    public void set__zzlmkbz_42_制作联名卡标志_O(String __zzlmkbz_42_制作联名卡标志_O) {
        this.__zzlmkbz_42_制作联名卡标志_O = __zzlmkbz_42_制作联名卡标志_O;
    }

    public String get__lmkzkztdm_43_联名卡制卡状态代码_O() {
        return __lmkzkztdm_43_联名卡制卡状态代码_O;
    }

    public void set__lmkzkztdm_43_联名卡制卡状态代码_O(String __lmkzkztdm_43_联名卡制卡状态代码_O) {
        this.__lmkzkztdm_43_联名卡制卡状态代码_O = __lmkzkztdm_43_联名卡制卡状态代码_O;
    }

    public String get__fgjrkhjgbm_44_房改金融开户机构编号_O() {
        return __fgjrkhjgbm_44_房改金融开户机构编号_O;
    }

    public void set__fgjrkhjgbm_44_房改金融开户机构编号_O(String __fgjrkhjgbm_44_房改金融开户机构编号_O) {
        this.__fgjrkhjgbm_44_房改金融开户机构编号_O = __fgjrkhjgbm_44_房改金融开户机构编号_O;
    }

    public String get__gbdwzh_45_贯标单位账号_O() {
        return __gbdwzh_45_贯标单位账号_O;
    }

    public void set__gbdwzh_45_贯标单位账号_O(String __gbdwzh_45_贯标单位账号_O) {
        this.__gbdwzh_45_贯标单位账号_O = __gbdwzh_45_贯标单位账号_O;
    }

    public String get__gbdwmc_46_贯标单位名称_O() {
        return __gbdwmc_46_贯标单位名称_O;
    }

    public void set__gbdwmc_46_贯标单位名称_O(String __gbdwmc_46_贯标单位名称_O) {
        this.__gbdwmc_46_贯标单位名称_O = __gbdwmc_46_贯标单位名称_O;
    }

    public String get__gbdwzhzt_47_贯标单位账户状态_O() {
        return __gbdwzhzt_47_贯标单位账户状态_O;
    }

    public void set__gbdwzhzt_47_贯标单位账户状态_O(String __gbdwzhzt_47_贯标单位账户状态_O) {
        this.__gbdwzhzt_47_贯标单位账户状态_O = __gbdwzhzt_47_贯标单位账户状态_O;
    }

    public String get__gbzzjgdm_48_贯标组织机构代码_O() {
        return __gbzzjgdm_48_贯标组织机构代码_O;
    }

    public void set__gbzzjgdm_48_贯标组织机构代码_O(String __gbzzjgdm_48_贯标组织机构代码_O) {
        this.__gbzzjgdm_48_贯标组织机构代码_O = __gbzzjgdm_48_贯标组织机构代码_O;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }


    public String get__wtrxm_0_委托人名称_0() {
        return __wtrxm_0_委托人名称_0;
    }


    public String get_1_DWKHRQ_贯标单位开户日期_610576() {
        return _1_DWKHRQ_贯标单位开户日期_610576;
    }

    public void set_1_DWKHRQ_贯标单位开户日期_610576(String _1_DWKHRQ_贯标单位开户日期_610576) {
        this._1_DWKHRQ_贯标单位开户日期_610576 = _1_DWKHRQ_贯标单位开户日期_610576;
    }

    public String get_2_DWJCBLSX_贯标单位缴存比例上限_610719() {
        return _2_DWJCBLSX_贯标单位缴存比例上限_610719;
    }

    public void set_2_DWJCBLSX_贯标单位缴存比例上限_610719(String _2_DWJCBLSX_贯标单位缴存比例上限_610719) {
        this._2_DWJCBLSX_贯标单位缴存比例上限_610719 = _2_DWJCBLSX_贯标单位缴存比例上限_610719;
    }

    public String get_3_DWJCBLXX_贯标单位缴存比例下限_610718() {
        return _3_DWJCBLXX_贯标单位缴存比例下限_610718;
    }

    public void set_3_DWJCBLXX_贯标单位缴存比例下限_610718(String _3_DWJCBLXX_贯标单位缴存比例下限_610718) {
        this._3_DWJCBLXX_贯标单位缴存比例下限_610718 = _3_DWJCBLXX_贯标单位缴存比例下限_610718;
    }

    public String get_4_DWJCRS_贯标单位缴存人数_610601() {
        return _4_DWJCRS_贯标单位缴存人数_610601;
    }

    public void set_4_DWJCRS_贯标单位缴存人数_610601(String _4_DWJCRS_贯标单位缴存人数_610601) {
        this._4_DWJCRS_贯标单位缴存人数_610601 = _4_DWJCRS_贯标单位缴存人数_610601;
    }

    public String get_5_DWZHZTZJBGSJ_单位账户状态最近变更时间() {
        return _5_DWZHZTZJBGSJ_单位账户状态最近变更时间;
    }

    public void set_5_DWZHZTZJBGSJ_单位账户状态最近变更时间(String _5_DWZHZTZJBGSJ_单位账户状态最近变更时间) {
        this._5_DWZHZTZJBGSJ_单位账户状态最近变更时间 = _5_DWZHZTZJBGSJ_单位账户状态最近变更时间;
    }

    public String get_6_DWJZNY_单位缴至年月() {
        return _6_DWJZNY_单位缴至年月;
    }

    public void set_6_DWJZNY_单位缴至年月(String _6_DWJZNY_单位缴至年月) {
        this._6_DWJZNY_单位缴至年月 = _6_DWJZNY_单位缴至年月;
    }


}
