package com.example.dm.apidata.cebV1;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;*/


//@ApiModel
@JsonInclude(JsonInclude.Include.NON_NULL)
////@Data
public class CebItem_basic {

    @ApiModelProperty(value="_1_std400cunm_申请人基本信息_姓名_String",name="_1_std400cunm",example="",position=0)
    @JsonProperty("_1_std400cunm")
    @JSONField(name="_1_std400cunm")
    private String  _1_std400cunm_申请人基本信息_姓名_String;

    @ApiModelProperty(value="_2_std400grid_申请人基本信息_个人编号_String",name="_2_std400grid",example="",position=0)
    @JsonProperty("_2_std400grid")
    @JSONField(name="_2_std400grid")
    private String  _2_std400grid_申请人基本信息_个人编号_String;

    @ApiModelProperty(value="_3_std400idtp_申请人基本信息_证件类型_String",name="_3_std400idtp",example="",position=0)
    @JsonProperty("_3_std400idtp")
    @JSONField(name="_3_std400idtp")
    private String  _3_std400idtp_申请人基本信息_证件类型_String;

    @ApiModelProperty(value="_4_std400idno_申请人基本信息_证件号码_String",name="_4_std400idno",example="",position=0)
    @JsonProperty("_4_std400idno")
    @JSONField(name="_4_std400idno")
    private String  _4_std400idno_申请人基本信息_证件号码_String;

    @ApiModelProperty(value="_5_std400sqam_申请人基本信息_税前工资总额_DEC",name="_5_std400sqam",example="",position=0)
    @JsonProperty("_5_std400sqam")
    @JSONField(name="_5_std400sqam")
    private Double  _5_std400sqam_申请人基本信息_税前工资总额_DEC;

    @ApiModelProperty(value="_6_std400gddh_申请人基本信息_住宅电话_String",name="_6_std400gddh",example="",position=0)
    @JsonProperty("_6_std400gddh")
    @JSONField(name="_6_std400gddh")
    private String  _6_std400gddh_申请人基本信息_住宅电话_String;

    @ApiModelProperty(value="_7_std400mobl_申请人基本信息_手机号_String",name="_7_std400mobl",example="",position=0)
    @JsonProperty("_7_std400mobl")
    @JSONField(name="_7_std400mobl")
    private String  _7_std400mobl_申请人基本信息_手机号_String;

    @ApiModelProperty(value="_8_std400addr_申请人基本信息_联系地址__家庭___String",name="_8_std400addr",example="",position=0)
    @JsonProperty("_8_std400addr")
    @JSONField(name="_8_std400addr")
    private String  _8_std400addr_申请人基本信息_联系地址__家庭___String;

    @ApiModelProperty(value="_9_stdcmpnm_申请人现缴存单位信息_单位名称_String",name="_9_stdcmpnm",example="",position=0)
    @JsonProperty("_9_stdcmpnm")
    @JSONField(name="_9_stdcmpnm")
    private String  _9_stdcmpnm_申请人现缴存单位信息_单位名称_String;

    @ApiModelProperty(value="_10_stdcmprgno_申请人现缴存单位信息_单位登记号_String",name="_10_stdcmprgno",example="",position=0)
    @JsonProperty("_10_stdcmprgno")
    @JSONField(name="_10_stdcmprgno")
    private String  _10_stdcmprgno_申请人现缴存单位信息_单位登记号_String;
    @ApiModelProperty(value="_11_stdcmpkhid_申请人现缴存单位信息_开户管理部编号_String",name="_11_stdcmpkhid",example="",position=0)
    @JsonProperty("_11_stdcmpkhid")
    @JSONField(name="_11_stdcmpkhid")
    private String  _11_stdcmpkhid_申请人现缴存单位信息_开户管理部编号_String;
    @ApiModelProperty(value="_12_stdcmpaddr_申请人现缴存单位信息_单位地址_String",name="_12_stdcmpaddr",example="",position=0)
    @JsonProperty("_12_stdcmpaddr")
    @JSONField(name="_12_stdcmpaddr")
    private String  _12_stdcmpaddr_申请人现缴存单位信息_单位地址_String;
    @ApiModelProperty(value="_13_stdcmpjczt_申请人现缴存单位信息_单位缴存状态_String",name="_13_stdcmpjczt",example="",position=0)
    @JsonProperty("_13_stdcmpjczt")
    @JSONField(name="_13_stdcmpjczt")
    private String  _13_stdcmpjczt_申请人现缴存单位信息_单位缴存状态_String;
    @ApiModelProperty(value="_14_stdcmphjfg_申请人现缴存单位信息_是否申请公积金缓缴_String",name="_14_stdcmphjfg",example="",position=0)
    @JsonProperty("_14_stdcmphjfg")
    @JSONField(name="_14_stdcmphjfg")
    private String  _14_stdcmphjfg_申请人现缴存单位信息_是否申请公积金缓缴_String;
    @ApiModelProperty(value="_15_stdcmphjdt_申请人现缴存单位信息_申请缓缴时间_String",name="_15_stdcmphjdt",example="",position=0)
    @JsonProperty("_15_stdcmphjdt")
    @JSONField(name="_15_stdcmphjdt")
    private String  _15_stdcmphjdt_申请人现缴存单位信息_申请缓缴时间_String;




    @JSONField(name="_e_1_std400wktm")
    @JsonProperty("_e_1_std400wktm")
    private String  _e_1_std400wktm_申请人基本信息_参加工作时间_String;
    @JSONField(name="_e_2_stdcmpprpt")
    @JsonProperty("_e_2_stdcmpprpt")
    private String  _e_2_stdcmpprpt_申请人现缴存单位信息_性质代码_String;
    @JSONField(name="_e_3_stdcmpacno")
    @JsonProperty("_e_3_stdcmpacno")
    private String  _e_3_stdcmpacno_申请人现缴存单位信息_单位账号_String;
    @JSONField(name="_e_4_stdcmpdbnm")
    @JsonProperty("_e_4_stdcmpdbnm")
    private String  _e_4_stdcmpdbnm_申请人现缴存单位信息_法定代表人或负责人_String;

              // 性质代码  "rgakind    A1 国家机关    B1 事业单位    C1 民办非企业单位    D1 社会团体    E1 国有    E2 集体    E3 股份合作企    E4 联营    E5 有限责任公司    E6 股份有限公司    E7 私营    E8 其它    F1 与港澳台商合资经营    F2 与港澳台商合作经营    F3 港澳台商独资    F4 港澳台商投资股份有限公司    G1 中外合资经营    G2 中外合作经营    G3 外商独资    G4 外商投资股份有限公司    H1 部队    I1 其他单位"

    @JSONField(name="_e_5_stdcmpkhbk")
    @JsonProperty("_e_5_stdcmpkhbk")
    private String  _e_5_stdcmpkhbk_申请人现缴存单位信息_单位开户银行及行号_缴存银行_String;

    @JSONField(name="_e_6_stdgjjrgdt")
    @JsonProperty("_e_6_stdgjjrgdt")
    private String  _e_6_stdgjjrgdt_个人公积金账户信息_开户日期_String;
    @JSONField(name="_e_7_stdgjjstdt")
    @JsonProperty("_e_7_stdgjjstdt")
    private String  _e_7_stdgjjstdt_个人公积金账户信息_初缴年月日_String;

    @JSONField(name="_e_8_stdcmprgtm")
    @JsonProperty("_e_8_stdcmprgtm")
    private String  _e_8_stdcmprgtm_申请人现缴存单位信息_初次登记时间_String;
    @JSONField(name="_e_9_stdcmpzzno")
    @JsonProperty("_e_9_stdcmpzzno")
    private String  _e_9_stdcmpzzno_申请人现缴存单位信息_组织机构代码_String;
    @JSONField(name="_e_10_stdcmpzyyno")

    @JsonProperty("_e_10_stdcmpzyyno")
    private String  _e_10_stdcmpzyyno_申请人现缴存单位信息_营业执照号码__工商注册号__String;
    @JSONField(name="_e_11_stdcmpfxrq")
    @JsonProperty("_e_11_stdcmpfxrq")
    private String  _e_11_stdcmpfxrq_申请人现缴存单位信息_发薪日期__缴交日__String;








    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String get_1_std400cunm_申请人基本信息_姓名_String() {
        return _1_std400cunm_申请人基本信息_姓名_String;
    }

    public void set_1_std400cunm_申请人基本信息_姓名_String(String _1_std400cunm_申请人基本信息_姓名_String) {
        this._1_std400cunm_申请人基本信息_姓名_String = _1_std400cunm_申请人基本信息_姓名_String;
    }

    public String get_2_std400grid_申请人基本信息_个人编号_String() {
        return _2_std400grid_申请人基本信息_个人编号_String;
    }

    public void set_2_std400grid_申请人基本信息_个人编号_String(String _2_std400grid_申请人基本信息_个人编号_String) {
        this._2_std400grid_申请人基本信息_个人编号_String = _2_std400grid_申请人基本信息_个人编号_String;
    }

    public String get_3_std400idtp_申请人基本信息_证件类型_String() {
        return _3_std400idtp_申请人基本信息_证件类型_String;
    }

    public void set_3_std400idtp_申请人基本信息_证件类型_String(String _3_std400idtp_申请人基本信息_证件类型_String) {
        this._3_std400idtp_申请人基本信息_证件类型_String = _3_std400idtp_申请人基本信息_证件类型_String;
    }

    public String get_4_std400idno_申请人基本信息_证件号码_String() {
        return _4_std400idno_申请人基本信息_证件号码_String;
    }

    public void set_4_std400idno_申请人基本信息_证件号码_String(String _4_std400idno_申请人基本信息_证件号码_String) {
        this._4_std400idno_申请人基本信息_证件号码_String = _4_std400idno_申请人基本信息_证件号码_String;
    }

    public Double get_5_std400sqam_申请人基本信息_税前工资总额_DEC() {
        return _5_std400sqam_申请人基本信息_税前工资总额_DEC;
    }

    public void set_5_std400sqam_申请人基本信息_税前工资总额_DEC(Double _5_std400sqam_申请人基本信息_税前工资总额_DEC) {
        this._5_std400sqam_申请人基本信息_税前工资总额_DEC = _5_std400sqam_申请人基本信息_税前工资总额_DEC;
    }

    public String get_6_std400gddh_申请人基本信息_住宅电话_String() {
        return _6_std400gddh_申请人基本信息_住宅电话_String;
    }

    public void set_6_std400gddh_申请人基本信息_住宅电话_String(String _6_std400gddh_申请人基本信息_住宅电话_String) {
        this._6_std400gddh_申请人基本信息_住宅电话_String = _6_std400gddh_申请人基本信息_住宅电话_String;
    }

    public String get_7_std400mobl_申请人基本信息_手机号_String() {
        return _7_std400mobl_申请人基本信息_手机号_String;
    }

    public void set_7_std400mobl_申请人基本信息_手机号_String(String _7_std400mobl_申请人基本信息_手机号_String) {
        this._7_std400mobl_申请人基本信息_手机号_String = _7_std400mobl_申请人基本信息_手机号_String;
    }

    public String get_8_std400addr_申请人基本信息_联系地址__家庭___String() {
        return _8_std400addr_申请人基本信息_联系地址__家庭___String;
    }

    public void set_8_std400addr_申请人基本信息_联系地址__家庭___String(String _8_std400addr_申请人基本信息_联系地址__家庭___String) {
        this._8_std400addr_申请人基本信息_联系地址__家庭___String = _8_std400addr_申请人基本信息_联系地址__家庭___String;
    }

    public String get_9_stdcmpnm_申请人现缴存单位信息_单位名称_String() {
        return _9_stdcmpnm_申请人现缴存单位信息_单位名称_String;
    }

    public void set_9_stdcmpnm_申请人现缴存单位信息_单位名称_String(String _9_stdcmpnm_申请人现缴存单位信息_单位名称_String) {
        this._9_stdcmpnm_申请人现缴存单位信息_单位名称_String = _9_stdcmpnm_申请人现缴存单位信息_单位名称_String;
    }

    public String get_10_stdcmprgno_申请人现缴存单位信息_单位登记号_String() {
        return _10_stdcmprgno_申请人现缴存单位信息_单位登记号_String;
    }

    public void set_10_stdcmprgno_申请人现缴存单位信息_单位登记号_String(String _10_stdcmprgno_申请人现缴存单位信息_单位登记号_String) {
        this._10_stdcmprgno_申请人现缴存单位信息_单位登记号_String = _10_stdcmprgno_申请人现缴存单位信息_单位登记号_String;
    }

    public String get_11_stdcmpkhid_申请人现缴存单位信息_开户管理部编号_String() {
        return _11_stdcmpkhid_申请人现缴存单位信息_开户管理部编号_String;
    }

    public void set_11_stdcmpkhid_申请人现缴存单位信息_开户管理部编号_String(String _11_stdcmpkhid_申请人现缴存单位信息_开户管理部编号_String) {
        this._11_stdcmpkhid_申请人现缴存单位信息_开户管理部编号_String = _11_stdcmpkhid_申请人现缴存单位信息_开户管理部编号_String;
    }

    public String get_12_stdcmpaddr_申请人现缴存单位信息_单位地址_String() {
        return _12_stdcmpaddr_申请人现缴存单位信息_单位地址_String;
    }

    public void set_12_stdcmpaddr_申请人现缴存单位信息_单位地址_String(String _12_stdcmpaddr_申请人现缴存单位信息_单位地址_String) {
        this._12_stdcmpaddr_申请人现缴存单位信息_单位地址_String = _12_stdcmpaddr_申请人现缴存单位信息_单位地址_String;
    }

    public String get_13_stdcmpjczt_申请人现缴存单位信息_单位缴存状态_String() {
        return _13_stdcmpjczt_申请人现缴存单位信息_单位缴存状态_String;
    }

    public void set_13_stdcmpjczt_申请人现缴存单位信息_单位缴存状态_String(String _13_stdcmpjczt_申请人现缴存单位信息_单位缴存状态_String) {
        this._13_stdcmpjczt_申请人现缴存单位信息_单位缴存状态_String = _13_stdcmpjczt_申请人现缴存单位信息_单位缴存状态_String;
    }

    public String get_14_stdcmphjfg_申请人现缴存单位信息_是否申请公积金缓缴_String() {
        return _14_stdcmphjfg_申请人现缴存单位信息_是否申请公积金缓缴_String;
    }

    public void set_14_stdcmphjfg_申请人现缴存单位信息_是否申请公积金缓缴_String(String _14_stdcmphjfg_申请人现缴存单位信息_是否申请公积金缓缴_String) {
        this._14_stdcmphjfg_申请人现缴存单位信息_是否申请公积金缓缴_String = _14_stdcmphjfg_申请人现缴存单位信息_是否申请公积金缓缴_String;
    }

    public String get_15_stdcmphjdt_申请人现缴存单位信息_申请缓缴时间_String() {
        return _15_stdcmphjdt_申请人现缴存单位信息_申请缓缴时间_String;
    }

    public void set_15_stdcmphjdt_申请人现缴存单位信息_申请缓缴时间_String(String _15_stdcmphjdt_申请人现缴存单位信息_申请缓缴时间_String) {
        this._15_stdcmphjdt_申请人现缴存单位信息_申请缓缴时间_String = _15_stdcmphjdt_申请人现缴存单位信息_申请缓缴时间_String;
    }

    public String get_e_1_std400wktm_申请人基本信息_参加工作时间_String() {
        return _e_1_std400wktm_申请人基本信息_参加工作时间_String;
    }

    public void set_e_1_std400wktm_申请人基本信息_参加工作时间_String(String _e_1_std400wktm_申请人基本信息_参加工作时间_String) {
        this._e_1_std400wktm_申请人基本信息_参加工作时间_String = _e_1_std400wktm_申请人基本信息_参加工作时间_String;
    }

    public String get_e_2_stdcmpprpt_申请人现缴存单位信息_性质代码_String() {
        return _e_2_stdcmpprpt_申请人现缴存单位信息_性质代码_String;
    }

    public void set_e_2_stdcmpprpt_申请人现缴存单位信息_性质代码_String(String _e_2_stdcmpprpt_申请人现缴存单位信息_性质代码_String) {
        this._e_2_stdcmpprpt_申请人现缴存单位信息_性质代码_String = _e_2_stdcmpprpt_申请人现缴存单位信息_性质代码_String;
    }

    public String get_e_3_stdcmpacno_申请人现缴存单位信息_单位账号_String() {
        return _e_3_stdcmpacno_申请人现缴存单位信息_单位账号_String;
    }

    public void set_e_3_stdcmpacno_申请人现缴存单位信息_单位账号_String(String _e_3_stdcmpacno_申请人现缴存单位信息_单位账号_String) {
        this._e_3_stdcmpacno_申请人现缴存单位信息_单位账号_String = _e_3_stdcmpacno_申请人现缴存单位信息_单位账号_String;
    }

    public String get_e_4_stdcmpdbnm_申请人现缴存单位信息_法定代表人或负责人_String() {
        return _e_4_stdcmpdbnm_申请人现缴存单位信息_法定代表人或负责人_String;
    }

    public void set_e_4_stdcmpdbnm_申请人现缴存单位信息_法定代表人或负责人_String(String _e_4_stdcmpdbnm_申请人现缴存单位信息_法定代表人或负责人_String) {
        this._e_4_stdcmpdbnm_申请人现缴存单位信息_法定代表人或负责人_String = _e_4_stdcmpdbnm_申请人现缴存单位信息_法定代表人或负责人_String;
    }

    public String get_e_5_stdcmpkhbk_申请人现缴存单位信息_单位开户银行及行号_缴存银行_String() {
        return _e_5_stdcmpkhbk_申请人现缴存单位信息_单位开户银行及行号_缴存银行_String;
    }

    public void set_e_5_stdcmpkhbk_申请人现缴存单位信息_单位开户银行及行号_缴存银行_String(String _e_5_stdcmpkhbk_申请人现缴存单位信息_单位开户银行及行号_缴存银行_String) {
        this._e_5_stdcmpkhbk_申请人现缴存单位信息_单位开户银行及行号_缴存银行_String = _e_5_stdcmpkhbk_申请人现缴存单位信息_单位开户银行及行号_缴存银行_String;
    }

    public String get_e_6_stdgjjrgdt_个人公积金账户信息_开户日期_String() {
        return _e_6_stdgjjrgdt_个人公积金账户信息_开户日期_String;
    }

    public void set_e_6_stdgjjrgdt_个人公积金账户信息_开户日期_String(String _e_6_stdgjjrgdt_个人公积金账户信息_开户日期_String) {
        this._e_6_stdgjjrgdt_个人公积金账户信息_开户日期_String = _e_6_stdgjjrgdt_个人公积金账户信息_开户日期_String;
    }

    public String get_e_7_stdgjjstdt_个人公积金账户信息_初缴年月日_String() {
        return _e_7_stdgjjstdt_个人公积金账户信息_初缴年月日_String;
    }

    public void set_e_7_stdgjjstdt_个人公积金账户信息_初缴年月日_String(String _e_7_stdgjjstdt_个人公积金账户信息_初缴年月日_String) {
        this._e_7_stdgjjstdt_个人公积金账户信息_初缴年月日_String = _e_7_stdgjjstdt_个人公积金账户信息_初缴年月日_String;
    }

    public String get_e_8_stdcmprgtm_申请人现缴存单位信息_初次登记时间_String() {
        return _e_8_stdcmprgtm_申请人现缴存单位信息_初次登记时间_String;
    }

    public void set_e_8_stdcmprgtm_申请人现缴存单位信息_初次登记时间_String(String _e_8_stdcmprgtm_申请人现缴存单位信息_初次登记时间_String) {
        this._e_8_stdcmprgtm_申请人现缴存单位信息_初次登记时间_String = _e_8_stdcmprgtm_申请人现缴存单位信息_初次登记时间_String;
    }

    public String get_e_9_stdcmpzzno_申请人现缴存单位信息_组织机构代码_String() {
        return _e_9_stdcmpzzno_申请人现缴存单位信息_组织机构代码_String;
    }

    public void set_e_9_stdcmpzzno_申请人现缴存单位信息_组织机构代码_String(String _e_9_stdcmpzzno_申请人现缴存单位信息_组织机构代码_String) {
        this._e_9_stdcmpzzno_申请人现缴存单位信息_组织机构代码_String = _e_9_stdcmpzzno_申请人现缴存单位信息_组织机构代码_String;
    }

    public String get_e_10_stdcmpzyyno_申请人现缴存单位信息_营业执照号码__工商注册号__String() {
        return _e_10_stdcmpzyyno_申请人现缴存单位信息_营业执照号码__工商注册号__String;
    }

    public void set_e_10_stdcmpzyyno_申请人现缴存单位信息_营业执照号码__工商注册号__String(String _e_10_stdcmpzyyno_申请人现缴存单位信息_营业执照号码__工商注册号__String) {
        this._e_10_stdcmpzyyno_申请人现缴存单位信息_营业执照号码__工商注册号__String = _e_10_stdcmpzyyno_申请人现缴存单位信息_营业执照号码__工商注册号__String;
    }

    public String get_e_11_stdcmpfxrq_申请人现缴存单位信息_发薪日期__缴交日__String() {
        return _e_11_stdcmpfxrq_申请人现缴存单位信息_发薪日期__缴交日__String;
    }

    public void set_e_11_stdcmpfxrq_申请人现缴存单位信息_发薪日期__缴交日__String(String _e_11_stdcmpfxrq_申请人现缴存单位信息_发薪日期__缴交日__String) {
        this._e_11_stdcmpfxrq_申请人现缴存单位信息_发薪日期__缴交日__String = _e_11_stdcmpfxrq_申请人现缴存单位信息_发薪日期__缴交日__String;
    }
}
