package com.example.dm.apidata.cebV1;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
////import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;*/


//@ApiModel
@JsonInclude(JsonInclude.Include.NON_NULL)
////@Data
public class CebItem_daikuan {

    @ApiModelProperty(value="_42_std400cunm_申请人基本信息_姓名_String",name="_42_std400cunm",example="",position=0)
    @JsonProperty("_42_std400cunm")
    @JSONField(name="_42_std400cunm")
            private String  _42_std400cunm_申请人基本信息_姓名_String;
    @ApiModelProperty(value="_43_stdperid_申请人基本信息_个人编号_String",name="_43_stdperid",example="",position=0)
    @JsonProperty("_43_stdperid")
    @JSONField(name="_43_stdperid")
            private String  _43_stdperid_申请人基本信息_个人编号_String;
    @ApiModelProperty(value="_44_std400idtp_申请人基本信息_证件类型_String",name="_44_std400idtp",example="",position=0)
    @JsonProperty("_44_std400idtp")
    @JSONField(name="_44_std400idtp")
            private String  _44_std400idtp_申请人基本信息_证件类型_String;
    @ApiModelProperty(value="_45_std400idno_申请人基本信息_证件号码_String",name="_45_std400idno",example="",position=0)
    @JsonProperty("_45_std400idno")
    @JSONField(name="_45_std400idno")
            private String  _45_std400idno_申请人基本信息_证件号码_String;
    @ApiModelProperty(value="_46_stdgjjdkid_个人公积金贷款信息_公积金账号_String",name="_46_stdgjjdkid",example="",position=0)
    @JsonProperty("_46_stdgjjdkid")
    @JSONField(name="_46_stdgjjdkid")
            private String  _46_stdgjjdkid_个人公积金贷款信息_公积金账号_String;
    @ApiModelProperty(value="_47_stdgjjdkbh_个人公积金贷款信息_公积金贷款编号_String",name="_47_stdgjjdkbh",example="",position=0)
    @JsonProperty("_47_stdgjjdkbh")
    @JSONField(name="_47_stdgjjdkbh")
            private String  _47_stdgjjdkbh_个人公积金贷款信息_公积金贷款编号_String;
    @ApiModelProperty(value="_48_stdgjjdkam_个人公积金贷款信息_公积金贷款金额_DEC",name="_48_stdgjjdkam",example="",position=0)
    @JsonProperty("_48_stdgjjdkam")
    @JSONField(name="_48_stdgjjdkam")
            private Double  _48_stdgjjdkam_个人公积金贷款信息_公积金贷款金额_DEC;
    @ApiModelProperty(value="_49_stdgjjdkpd_个人公积金贷款信息_公积金贷款期限_String",name="_49_stdgjjdkpd",example="",position=0)
    @JsonProperty("_49_stdgjjdkpd")
    @JSONField(name="_49_stdgjjdkpd")
            private String  _49_stdgjjdkpd_个人公积金贷款信息_公积金贷款期限_String;
    @ApiModelProperty(value="_50_stdgjjppam_个人公积金贷款信息_公积金贷款月还款额_DEC",name="_50_stdgjjppam",example="",position=0)
    @JsonProperty("_50_stdgjjppam")
    @JSONField(name="_50_stdgjjppam")
            private Double  _50_stdgjjppam_个人公积金贷款信息_公积金贷款月还款额_DEC;
    @ApiModelProperty(value="_51_stdgjjdkdt_个人公积金贷款信息_公积金贷款起始日期_String",name="_51_stdgjjdkdt",example="",position=0)
    @JsonProperty("_51_stdgjjdkdt")
    @JSONField(name="_51_stdgjjdkdt")
            private String  _51_stdgjjdkdt_个人公积金贷款信息_公积金贷款起始日期_String;
    @ApiModelProperty(value="_52_stdgjjmudt_个人公积金贷款信息_公积金贷款到期日期_String",name="_52_stdgjjmudt",example="",position=0)
    @JsonProperty("_52_stdgjjmudt")
    @JSONField(name="_52_stdgjjmudt")
            private String  _52_stdgjjmudt_个人公积金贷款信息_公积金贷款到期日期_String;
    @ApiModelProperty(value="_53_stdgjjjqdt_个人公积金贷款信息_公积金贷款结清日期_String",name="_53_stdgjjjqdt",example="",position=0)
    @JsonProperty("_53_stdgjjjqdt")
    @JSONField(name="_53_stdgjjjqdt")
            private String  _53_stdgjjjqdt_个人公积金贷款信息_公积金贷款结清日期_String;
    @ApiModelProperty(value="_54_stdgjjdkye_个人公积金贷款信息_公积金贷款余额_DEC",name="_54_stdgjjdkye",example="",position=0)
    @JsonProperty("_54_stdgjjdkye")
    @JSONField(name="_54_stdgjjdkye")
            private Double  _54_stdgjjdkye_个人公积金贷款信息_公积金贷款余额_DEC;
    @ApiModelProperty(value="_55_stdgjjtdknm_个人公积金贷款信息_共同贷款人姓名_String",name="_55_stdgjjtdknm",example="",position=0)
    @JsonProperty("_55_stdgjjtdknm")
    @JSONField(name="_55_stdgjjtdknm")
            private String  _55_stdgjjtdknm_个人公积金贷款信息_共同贷款人姓名_String;
    @ApiModelProperty(value="_56_stdgjjtdkno_个人公积金贷款信息_共同贷款人身份证号_String",name="_56_stdgjjtdkno",example="",position=0)
    @JsonProperty("_56_stdgjjtdkno")
    @JSONField(name="_56_stdgjjtdkno")
            private String  _56_stdgjjtdkno_个人公积金贷款信息_共同贷款人身份证号_String;
    @ApiModelProperty(value="_57_stdgjjtdkbd_个人公积金贷款信息_共同贷款人是否建立公积金_String",name="_57_stdgjjtdkbd",example="",position=0)
    @JsonProperty("_57_stdgjjtdkbd")
    @JSONField(name="_57_stdgjjtdkbd")
            private String  _57_stdgjjtdkbd_个人公积金贷款信息_共同贷款人是否建立公积金_String;
    @ApiModelProperty(value="_58_stdgjjdkaddr_个人公积金贷款信息_联系地址__家庭___String",name="_58_stdgjjdkaddr",example="",position=0)
    @JsonProperty("_58_stdgjjdkaddr")
    @JSONField(name="_58_stdgjjdkaddr")
            private String  _58_stdgjjdkaddr_个人公积金贷款信息_联系地址__家庭___String;
    @ApiModelProperty(value="_59_stdgjjdkzt_个人公积金贷款信息_贷款状态_String",name="_59_stdgjjdkzt",example="",position=0)
    @JsonProperty("_59_stdgjjdkzt")
    @JSONField(name="_59_stdgjjdkzt")
            private String  _59_stdgjjdkzt_个人公积金贷款信息_贷款状态_String;
    @ApiModelProperty(value="_60_stdgjjdqzt_个人公积金贷款信息_当期还款状态_String",name="_60_stdgjjdqzt",example="",position=0)
    @JsonProperty("_60_stdgjjdqzt")
    @JSONField(name="_60_stdgjjdqzt")
            private String  _60_stdgjjdqzt_个人公积金贷款信息_当期还款状态_String;
    @ApiModelProperty(value="_61_stdgjjyqcs_个人公积金贷款信息_公积金贷款历史发生逾期次数_Int",name="_61_stdgjjyqcs",example="",position=0)
    @JsonProperty("_61_stdgjjyqcs")
    @JSONField(name="_61_stdgjjyqcs")
            private Integer  _61_stdgjjyqcs_个人公积金贷款信息_公积金贷款历史发生逾期次数_Int;
    @ApiModelProperty(value="_62_stdgjjmyqcs_个人公积金贷款信息_最大连续的逾期期数_近24个月__Int",name="_62_stdgjjmyqcs",example="",position=0)
    @JsonProperty("_62_stdgjjmyqcs")
    @JSONField(name="_62_stdgjjmyqcs")
            private Integer  _62_stdgjjmyqcs_个人公积金贷款信息_最大连续的逾期期数_近24个月__Int;



    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String get_42_std400cunm_申请人基本信息_姓名_String() {
        return _42_std400cunm_申请人基本信息_姓名_String;
    }

    public void set_42_std400cunm_申请人基本信息_姓名_String(String _42_std400cunm_申请人基本信息_姓名_String) {
        this._42_std400cunm_申请人基本信息_姓名_String = _42_std400cunm_申请人基本信息_姓名_String;
    }

    public String get_43_stdperid_申请人基本信息_个人编号_String() {
        return _43_stdperid_申请人基本信息_个人编号_String;
    }

    public void set_43_stdperid_申请人基本信息_个人编号_String(String _43_stdperid_申请人基本信息_个人编号_String) {
        this._43_stdperid_申请人基本信息_个人编号_String = _43_stdperid_申请人基本信息_个人编号_String;
    }

    public String get_44_std400idtp_申请人基本信息_证件类型_String() {
        return _44_std400idtp_申请人基本信息_证件类型_String;
    }

    public void set_44_std400idtp_申请人基本信息_证件类型_String(String _44_std400idtp_申请人基本信息_证件类型_String) {
        this._44_std400idtp_申请人基本信息_证件类型_String = _44_std400idtp_申请人基本信息_证件类型_String;
    }

    public String get_45_std400idno_申请人基本信息_证件号码_String() {
        return _45_std400idno_申请人基本信息_证件号码_String;
    }

    public void set_45_std400idno_申请人基本信息_证件号码_String(String _45_std400idno_申请人基本信息_证件号码_String) {
        this._45_std400idno_申请人基本信息_证件号码_String = _45_std400idno_申请人基本信息_证件号码_String;
    }

    public String get_46_stdgjjdkid_个人公积金贷款信息_公积金账号_String() {
        return _46_stdgjjdkid_个人公积金贷款信息_公积金账号_String;
    }

    public void set_46_stdgjjdkid_个人公积金贷款信息_公积金账号_String(String _46_stdgjjdkid_个人公积金贷款信息_公积金账号_String) {
        this._46_stdgjjdkid_个人公积金贷款信息_公积金账号_String = _46_stdgjjdkid_个人公积金贷款信息_公积金账号_String;
    }

    public String get_47_stdgjjdkbh_个人公积金贷款信息_公积金贷款编号_String() {
        return _47_stdgjjdkbh_个人公积金贷款信息_公积金贷款编号_String;
    }

    public void set_47_stdgjjdkbh_个人公积金贷款信息_公积金贷款编号_String(String _47_stdgjjdkbh_个人公积金贷款信息_公积金贷款编号_String) {
        this._47_stdgjjdkbh_个人公积金贷款信息_公积金贷款编号_String = _47_stdgjjdkbh_个人公积金贷款信息_公积金贷款编号_String;
    }

    public Double get_48_stdgjjdkam_个人公积金贷款信息_公积金贷款金额_DEC() {
        return _48_stdgjjdkam_个人公积金贷款信息_公积金贷款金额_DEC;
    }

    public void set_48_stdgjjdkam_个人公积金贷款信息_公积金贷款金额_DEC(Double _48_stdgjjdkam_个人公积金贷款信息_公积金贷款金额_DEC) {
        this._48_stdgjjdkam_个人公积金贷款信息_公积金贷款金额_DEC = _48_stdgjjdkam_个人公积金贷款信息_公积金贷款金额_DEC;
    }

    public String get_49_stdgjjdkpd_个人公积金贷款信息_公积金贷款期限_String() {
        return _49_stdgjjdkpd_个人公积金贷款信息_公积金贷款期限_String;
    }

    public void set_49_stdgjjdkpd_个人公积金贷款信息_公积金贷款期限_String(String _49_stdgjjdkpd_个人公积金贷款信息_公积金贷款期限_String) {
        this._49_stdgjjdkpd_个人公积金贷款信息_公积金贷款期限_String = _49_stdgjjdkpd_个人公积金贷款信息_公积金贷款期限_String;
    }

    public Double get_50_stdgjjppam_个人公积金贷款信息_公积金贷款月还款额_DEC() {
        return _50_stdgjjppam_个人公积金贷款信息_公积金贷款月还款额_DEC;
    }

    public void set_50_stdgjjppam_个人公积金贷款信息_公积金贷款月还款额_DEC(Double _50_stdgjjppam_个人公积金贷款信息_公积金贷款月还款额_DEC) {
        this._50_stdgjjppam_个人公积金贷款信息_公积金贷款月还款额_DEC = _50_stdgjjppam_个人公积金贷款信息_公积金贷款月还款额_DEC;
    }

    public String get_51_stdgjjdkdt_个人公积金贷款信息_公积金贷款起始日期_String() {
        return _51_stdgjjdkdt_个人公积金贷款信息_公积金贷款起始日期_String;
    }

    public void set_51_stdgjjdkdt_个人公积金贷款信息_公积金贷款起始日期_String(String _51_stdgjjdkdt_个人公积金贷款信息_公积金贷款起始日期_String) {
        this._51_stdgjjdkdt_个人公积金贷款信息_公积金贷款起始日期_String = _51_stdgjjdkdt_个人公积金贷款信息_公积金贷款起始日期_String;
    }

    public String get_52_stdgjjmudt_个人公积金贷款信息_公积金贷款到期日期_String() {
        return _52_stdgjjmudt_个人公积金贷款信息_公积金贷款到期日期_String;
    }

    public void set_52_stdgjjmudt_个人公积金贷款信息_公积金贷款到期日期_String(String _52_stdgjjmudt_个人公积金贷款信息_公积金贷款到期日期_String) {
        this._52_stdgjjmudt_个人公积金贷款信息_公积金贷款到期日期_String = _52_stdgjjmudt_个人公积金贷款信息_公积金贷款到期日期_String;
    }

    public String get_53_stdgjjjqdt_个人公积金贷款信息_公积金贷款结清日期_String() {
        return _53_stdgjjjqdt_个人公积金贷款信息_公积金贷款结清日期_String;
    }

    public void set_53_stdgjjjqdt_个人公积金贷款信息_公积金贷款结清日期_String(String _53_stdgjjjqdt_个人公积金贷款信息_公积金贷款结清日期_String) {
        this._53_stdgjjjqdt_个人公积金贷款信息_公积金贷款结清日期_String = _53_stdgjjjqdt_个人公积金贷款信息_公积金贷款结清日期_String;
    }

    public Double get_54_stdgjjdkye_个人公积金贷款信息_公积金贷款余额_DEC() {
        return _54_stdgjjdkye_个人公积金贷款信息_公积金贷款余额_DEC;
    }

    public void set_54_stdgjjdkye_个人公积金贷款信息_公积金贷款余额_DEC(Double _54_stdgjjdkye_个人公积金贷款信息_公积金贷款余额_DEC) {
        this._54_stdgjjdkye_个人公积金贷款信息_公积金贷款余额_DEC = _54_stdgjjdkye_个人公积金贷款信息_公积金贷款余额_DEC;
    }

    public String get_55_stdgjjtdknm_个人公积金贷款信息_共同贷款人姓名_String() {
        return _55_stdgjjtdknm_个人公积金贷款信息_共同贷款人姓名_String;
    }

    public void set_55_stdgjjtdknm_个人公积金贷款信息_共同贷款人姓名_String(String _55_stdgjjtdknm_个人公积金贷款信息_共同贷款人姓名_String) {
        this._55_stdgjjtdknm_个人公积金贷款信息_共同贷款人姓名_String = _55_stdgjjtdknm_个人公积金贷款信息_共同贷款人姓名_String;
    }

    public String get_56_stdgjjtdkno_个人公积金贷款信息_共同贷款人身份证号_String() {
        return _56_stdgjjtdkno_个人公积金贷款信息_共同贷款人身份证号_String;
    }

    public void set_56_stdgjjtdkno_个人公积金贷款信息_共同贷款人身份证号_String(String _56_stdgjjtdkno_个人公积金贷款信息_共同贷款人身份证号_String) {
        this._56_stdgjjtdkno_个人公积金贷款信息_共同贷款人身份证号_String = _56_stdgjjtdkno_个人公积金贷款信息_共同贷款人身份证号_String;
    }

    public String get_57_stdgjjtdkbd_个人公积金贷款信息_共同贷款人是否建立公积金_String() {
        return _57_stdgjjtdkbd_个人公积金贷款信息_共同贷款人是否建立公积金_String;
    }

    public void set_57_stdgjjtdkbd_个人公积金贷款信息_共同贷款人是否建立公积金_String(String _57_stdgjjtdkbd_个人公积金贷款信息_共同贷款人是否建立公积金_String) {
        this._57_stdgjjtdkbd_个人公积金贷款信息_共同贷款人是否建立公积金_String = _57_stdgjjtdkbd_个人公积金贷款信息_共同贷款人是否建立公积金_String;
    }

    public String get_58_stdgjjdkaddr_个人公积金贷款信息_联系地址__家庭___String() {
        return _58_stdgjjdkaddr_个人公积金贷款信息_联系地址__家庭___String;
    }

    public void set_58_stdgjjdkaddr_个人公积金贷款信息_联系地址__家庭___String(String _58_stdgjjdkaddr_个人公积金贷款信息_联系地址__家庭___String) {
        this._58_stdgjjdkaddr_个人公积金贷款信息_联系地址__家庭___String = _58_stdgjjdkaddr_个人公积金贷款信息_联系地址__家庭___String;
    }

    public String get_59_stdgjjdkzt_个人公积金贷款信息_贷款状态_String() {
        return _59_stdgjjdkzt_个人公积金贷款信息_贷款状态_String;
    }

    public void set_59_stdgjjdkzt_个人公积金贷款信息_贷款状态_String(String _59_stdgjjdkzt_个人公积金贷款信息_贷款状态_String) {
        this._59_stdgjjdkzt_个人公积金贷款信息_贷款状态_String = _59_stdgjjdkzt_个人公积金贷款信息_贷款状态_String;
    }

    public String get_60_stdgjjdqzt_个人公积金贷款信息_当期还款状态_String() {
        return _60_stdgjjdqzt_个人公积金贷款信息_当期还款状态_String;
    }

    public void set_60_stdgjjdqzt_个人公积金贷款信息_当期还款状态_String(String _60_stdgjjdqzt_个人公积金贷款信息_当期还款状态_String) {
        this._60_stdgjjdqzt_个人公积金贷款信息_当期还款状态_String = _60_stdgjjdqzt_个人公积金贷款信息_当期还款状态_String;
    }

    public Integer get_61_stdgjjyqcs_个人公积金贷款信息_公积金贷款历史发生逾期次数_Int() {
        return _61_stdgjjyqcs_个人公积金贷款信息_公积金贷款历史发生逾期次数_Int;
    }

    public void set_61_stdgjjyqcs_个人公积金贷款信息_公积金贷款历史发生逾期次数_Int(Integer _61_stdgjjyqcs_个人公积金贷款信息_公积金贷款历史发生逾期次数_Int) {
        this._61_stdgjjyqcs_个人公积金贷款信息_公积金贷款历史发生逾期次数_Int = _61_stdgjjyqcs_个人公积金贷款信息_公积金贷款历史发生逾期次数_Int;
    }

    public Integer get_62_stdgjjmyqcs_个人公积金贷款信息_最大连续的逾期期数_近24个月__Int() {
        return _62_stdgjjmyqcs_个人公积金贷款信息_最大连续的逾期期数_近24个月__Int;
    }

    public void set_62_stdgjjmyqcs_个人公积金贷款信息_最大连续的逾期期数_近24个月__Int(Integer _62_stdgjjmyqcs_个人公积金贷款信息_最大连续的逾期期数_近24个月__Int) {
        this._62_stdgjjmyqcs_个人公积金贷款信息_最大连续的逾期期数_近24个月__Int = _62_stdgjjmyqcs_个人公积金贷款信息_最大连续的逾期期数_近24个月__Int;
    }
}
