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
public class CebItem_jiaocun {


    @ApiModelProperty(value="_16_std400cunm_申请人基本信息_姓名_String",name="_16_std400cunm",example="",position=0)
    @JsonProperty("_16_std400cunm")
    @JSONField(name="_16_std400cunm")
    private String  _16_std400cunm_申请人基本信息_姓名_String;
    @ApiModelProperty(value="_17_stdperid_申请人基本信息_个人编号_String",name="_17_stdperid",example="",position=0)
    @JsonProperty("_17_stdperid")
    @JSONField(name="_17_stdperid")
    private String  _17_stdperid_申请人基本信息_个人编号_String;
    @ApiModelProperty(value="_18_std400idtp_申请人基本信息_证件类型_String",name="_18_std400idtp",example="",position=0)
    @JsonProperty("_18_std400idtp")
    @JSONField(name="_18_std400idtp")
    private String  _18_std400idtp_申请人基本信息_证件类型_String;
    @ApiModelProperty(value="_19_std400idno_申请人基本信息_证件号码_String",name="_19_std400idno",example="",position=0)
    @JsonProperty("_19_std400idno")
    @JSONField(name="_19_std400idno")
    private String  _19_std400idno_申请人基本信息_证件号码_String;
    @ApiModelProperty(value="_20_stdgjjacno_个人公积金账户信息_公积金账号_String",name="_20_stdgjjacno",example="",position=0)
    @JsonProperty("_20_stdgjjacno")
    @JSONField(name="_20_stdgjjacno")
    private String  _20_stdgjjacno_个人公积金账户信息_公积金账号_String;
    @ApiModelProperty(value="_21_stdglljcst_个人公积金账户信息_当月缴存状态_String",name="_21_stdglljcst",example="",position=0)
    @JsonProperty("_21_stdglljcst")
    @JSONField(name="_21_stdglljcst")
    private String  _21_stdglljcst_个人公积金账户信息_当月缴存状态_String;
    @ApiModelProperty(value="_22_stdgjjltdt_个人公积金账户信息_最近一次缴交日期_String",name="_22_stdgjjltdt",example="",position=0)
    @JsonProperty("_22_stdgjjltdt")
    @JSONField(name="_22_stdgjjltdt")
    private String  _22_stdgjjltdt_个人公积金账户信息_最近一次缴交日期_String;
    @ApiModelProperty(value="_23_stdgjjcdqnd_个人公积金账户信息_累计缴存次数_Int",name="_23_stdgjjcdqnd",example="",position=0)
    @JsonProperty("_23_stdgjjcdqnd")
    @JSONField(name="_23_stdgjjcdqnd")
    private Integer  _23_stdgjjcdqnd_个人公积金账户信息_累计缴存次数_Int;
    @ApiModelProperty(value="_24_stdgjjacbl_个人公积金账户信息_当前余额_DEC",name="_24_stdgjjacbl",example="",position=0)
    @JsonProperty("_24_stdgjjacbl")
    @JSONField(name="_24_stdgjjacbl")
    private Double  _24_stdgjjacbl_个人公积金账户信息_当前余额_DEC;
    @ApiModelProperty(value="_25_stdgjjgram_个人公积金账户信息_近12个自然月个人缴存额_DEC",name="_25_stdgjjgram",example="",position=0)
    @JsonProperty("_25_stdgjjgram")
    @JSONField(name="_25_stdgjjgram")
    private String  _25_stdgjjgram_个人公积金账户信息_近12个自然月个人缴存额_DEC;
    @ApiModelProperty(value="_26_stdgjjgrsc_个人公积金账户信息_近12个自然月个人缴存比例_DEC",name="_42_std400cunm",example="",position=0)
    @JsonProperty("_26_stdgjjgrsc")
    @JSONField(name="_26_stdgjjgrsc")
    private String  _26_stdgjjgrsc_个人公积金账户信息_近12个自然月个人缴存比例_DEC;
    @ApiModelProperty(value="_27_stdgjjdwam_个人公积金账户信息_近12个自然月单位缴存额_DEC",name="_27_stdgjjdwam",example="",position=0)
    @JsonProperty("_27_stdgjjdwam")
    @JSONField(name="_27_stdgjjdwam")
    private String  _27_stdgjjdwam_个人公积金账户信息_近12个自然月单位缴存额_DEC;
    @ApiModelProperty(value="_28_stdgjjdwsc_个人公积金账户信息_近12个自然月单位缴存比例_DEC",name="_28_stdgjjdwsc",example="",position=0)
    @JsonProperty("_28_stdgjjdwsc")
    @JSONField(name="_28_stdgjjdwsc")
    private String  _28_stdgjjdwsc_个人公积金账户信息_近12个自然月单位缴存比例_DEC;







    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String get_16_std400cunm_申请人基本信息_姓名_String() {
        return _16_std400cunm_申请人基本信息_姓名_String;
    }

    public void set_16_std400cunm_申请人基本信息_姓名_String(String _16_std400cunm_申请人基本信息_姓名_String) {
        this._16_std400cunm_申请人基本信息_姓名_String = _16_std400cunm_申请人基本信息_姓名_String;
    }

    public String get_17_stdperid_申请人基本信息_个人编号_String() {
        return _17_stdperid_申请人基本信息_个人编号_String;
    }

    public void set_17_stdperid_申请人基本信息_个人编号_String(String _17_stdperid_申请人基本信息_个人编号_String) {
        this._17_stdperid_申请人基本信息_个人编号_String = _17_stdperid_申请人基本信息_个人编号_String;
    }

    public String get_18_std400idtp_申请人基本信息_证件类型_String() {
        return _18_std400idtp_申请人基本信息_证件类型_String;
    }

    public void set_18_std400idtp_申请人基本信息_证件类型_String(String _18_std400idtp_申请人基本信息_证件类型_String) {
        this._18_std400idtp_申请人基本信息_证件类型_String = _18_std400idtp_申请人基本信息_证件类型_String;
    }

    public String get_19_std400idno_申请人基本信息_证件号码_String() {
        return _19_std400idno_申请人基本信息_证件号码_String;
    }

    public void set_19_std400idno_申请人基本信息_证件号码_String(String _19_std400idno_申请人基本信息_证件号码_String) {
        this._19_std400idno_申请人基本信息_证件号码_String = _19_std400idno_申请人基本信息_证件号码_String;
    }

    public String get_20_stdgjjacno_个人公积金账户信息_公积金账号_String() {
        return _20_stdgjjacno_个人公积金账户信息_公积金账号_String;
    }

    public void set_20_stdgjjacno_个人公积金账户信息_公积金账号_String(String _20_stdgjjacno_个人公积金账户信息_公积金账号_String) {
        this._20_stdgjjacno_个人公积金账户信息_公积金账号_String = _20_stdgjjacno_个人公积金账户信息_公积金账号_String;
    }

    public String get_21_stdglljcst_个人公积金账户信息_当月缴存状态_String() {
        return _21_stdglljcst_个人公积金账户信息_当月缴存状态_String;
    }

    public void set_21_stdglljcst_个人公积金账户信息_当月缴存状态_String(String _21_stdglljcst_个人公积金账户信息_当月缴存状态_String) {
        this._21_stdglljcst_个人公积金账户信息_当月缴存状态_String = _21_stdglljcst_个人公积金账户信息_当月缴存状态_String;
    }

    public String get_22_stdgjjltdt_个人公积金账户信息_最近一次缴交日期_String() {
        return _22_stdgjjltdt_个人公积金账户信息_最近一次缴交日期_String;
    }

    public void set_22_stdgjjltdt_个人公积金账户信息_最近一次缴交日期_String(String _22_stdgjjltdt_个人公积金账户信息_最近一次缴交日期_String) {
        this._22_stdgjjltdt_个人公积金账户信息_最近一次缴交日期_String = _22_stdgjjltdt_个人公积金账户信息_最近一次缴交日期_String;
    }

    public Integer get_23_stdgjjcdqnd_个人公积金账户信息_累计缴存次数_Int() {
        return _23_stdgjjcdqnd_个人公积金账户信息_累计缴存次数_Int;
    }

    public void set_23_stdgjjcdqnd_个人公积金账户信息_累计缴存次数_Int(Integer _23_stdgjjcdqnd_个人公积金账户信息_累计缴存次数_Int) {
        this._23_stdgjjcdqnd_个人公积金账户信息_累计缴存次数_Int = _23_stdgjjcdqnd_个人公积金账户信息_累计缴存次数_Int;
    }

    public Double get_24_stdgjjacbl_个人公积金账户信息_当前余额_DEC() {
        return _24_stdgjjacbl_个人公积金账户信息_当前余额_DEC;
    }

    public void set_24_stdgjjacbl_个人公积金账户信息_当前余额_DEC(Double _24_stdgjjacbl_个人公积金账户信息_当前余额_DEC) {
        this._24_stdgjjacbl_个人公积金账户信息_当前余额_DEC = _24_stdgjjacbl_个人公积金账户信息_当前余额_DEC;
    }

    public String get_25_stdgjjgram_个人公积金账户信息_近12个自然月个人缴存额_DEC() {
        return _25_stdgjjgram_个人公积金账户信息_近12个自然月个人缴存额_DEC;
    }

    public void set_25_stdgjjgram_个人公积金账户信息_近12个自然月个人缴存额_DEC(String _25_stdgjjgram_个人公积金账户信息_近12个自然月个人缴存额_DEC) {
        this._25_stdgjjgram_个人公积金账户信息_近12个自然月个人缴存额_DEC = _25_stdgjjgram_个人公积金账户信息_近12个自然月个人缴存额_DEC;
    }

    public String get_26_stdgjjgrsc_个人公积金账户信息_近12个自然月个人缴存比例_DEC() {
        return _26_stdgjjgrsc_个人公积金账户信息_近12个自然月个人缴存比例_DEC;
    }

    public void set_26_stdgjjgrsc_个人公积金账户信息_近12个自然月个人缴存比例_DEC(String _26_stdgjjgrsc_个人公积金账户信息_近12个自然月个人缴存比例_DEC) {
        this._26_stdgjjgrsc_个人公积金账户信息_近12个自然月个人缴存比例_DEC = _26_stdgjjgrsc_个人公积金账户信息_近12个自然月个人缴存比例_DEC;
    }

    public String get_27_stdgjjdwam_个人公积金账户信息_近12个自然月单位缴存额_DEC() {
        return _27_stdgjjdwam_个人公积金账户信息_近12个自然月单位缴存额_DEC;
    }

    public void set_27_stdgjjdwam_个人公积金账户信息_近12个自然月单位缴存额_DEC(String _27_stdgjjdwam_个人公积金账户信息_近12个自然月单位缴存额_DEC) {
        this._27_stdgjjdwam_个人公积金账户信息_近12个自然月单位缴存额_DEC = _27_stdgjjdwam_个人公积金账户信息_近12个自然月单位缴存额_DEC;
    }

    public String get_28_stdgjjdwsc_个人公积金账户信息_近12个自然月单位缴存比例_DEC() {
        return _28_stdgjjdwsc_个人公积金账户信息_近12个自然月单位缴存比例_DEC;
    }

    public void set_28_stdgjjdwsc_个人公积金账户信息_近12个自然月单位缴存比例_DEC(String _28_stdgjjdwsc_个人公积金账户信息_近12个自然月单位缴存比例_DEC) {
        this._28_stdgjjdwsc_个人公积金账户信息_近12个自然月单位缴存比例_DEC = _28_stdgjjdwsc_个人公积金账户信息_近12个自然月单位缴存比例_DEC;
    }
}
