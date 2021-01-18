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
public class CebItem_tiqu {

    @ApiModelProperty(value="_29_std400cunm_申请人基本信息_姓名_String",name="_29_std400cunm",example="",position=0)
    @JsonProperty("_29_std400cunm")
    @JSONField(name="_29_std400cunm")
    private String _29_std400cunm_申请人基本信息_姓名_String;
    @ApiModelProperty(value="_30_stdperid_申请人基本信息_个人编号_String",name="_30_stdperid",example="",position=0)
    @JsonProperty("_30_stdperid")
    @JSONField(name="_30_stdperid")
    private String _30_stdperid_申请人基本信息_个人编号_String;
    @ApiModelProperty(value="_31_std400idtp_申请人基本信息_证件类型_String",name="_31_std400idtp",example="",position=0)
    @JsonProperty("_31_std400idtp")
    @JSONField(name="_31_std400idtp")
    private String _31_std400idtp_申请人基本信息_证件类型_String;
    @ApiModelProperty(value="_32_std400idno_申请人基本信息_证件号码_String",name="_32_std400idno",example="",position=0)
    @JsonProperty("_32_std400idno")
    @JSONField(name="_32_std400idno")
    private String _32_std400idno_申请人基本信息_证件号码_String;
    @ApiModelProperty(value="_33_stdgjjacno_个人公积金提取信息_公积金账号_String",name="_33_stdgjjacno",example="",position=0)
    @JsonProperty("_33_stdgjjacno")
    @JSONField(name="_33_stdgjjacno")
    private String _33_stdgjjacno_个人公积金提取信息_公积金账号_String;
    @ApiModelProperty(value="_34_stdgjjwdrn_个人公积金提取信息_提取原因_String",name="_34_stdgjjwdrn",example="",position=0)
    @JsonProperty("_34_stdgjjwdrn")
    @JSONField(name="_34_stdgjjwdrn")

            private String  _34_stdgjjwdrn_个人公积金提取信息_提取原因_String;
    @ApiModelProperty(value="_35_stdgjjwddt_个人公积金提取信息_提取时间_String",name="_35_stdgjjwddt",example="",position=0)
    @JsonProperty("_35_stdgjjwddt")
    @JSONField(name="_35_stdgjjwddt")
            private String  _35_stdgjjwddt_个人公积金提取信息_提取时间_String;
    @ApiModelProperty(value="_36_stdgjjwdtp_个人公积金提取信息_提取方式_String",name="_36_stdgjjwdtp",example="",position=0)
    @JsonProperty("_36_stdgjjwdtp")
    @JSONField(name="_36_stdgjjwdtp")
            private String  _36_stdgjjwdtp_个人公积金提取信息_提取方式_String;
    @ApiModelProperty(value="_37_stdgjjhdze_个人公积金提取信息_核定提取总额_DEC",name="_37_stdgjjhdze",example="",position=0)
    @JsonProperty("_37_stdgjjhdze")
    @JSONField(name="_37_stdgjjhdze")
            private Double  _37_stdgjjhdze_个人公积金提取信息_核定提取总额_DEC;
    @ApiModelProperty(value="_38_stdgjjwdam_个人公积金提取信息_提取金额_String",name="_38_stdgjjwdam",example="",position=0)
    @JsonProperty("_38_stdgjjwdam")
    @JSONField(name="_38_stdgjjwdam")


            private String  _38_stdgjjwdam_个人公积金提取信息_提取金额_String;
    @ApiModelProperty(value="_39_stdgjjtwdnm_个人公积金提取信息_共同提取人姓名_String",name="_39_stdgjjtwdnm",example="",position=0)
    @JsonProperty("_39_stdgjjtwdnm")
    @JSONField(name="_39_stdgjjtwdnm")
            private String  _39_stdgjjtwdnm_个人公积金提取信息_共同提取人姓名_String;
    @ApiModelProperty(value="_40_stdgjjtwdno_个人公积金提取信息_共同提取人身份证号_String",name="_40_stdgjjtwdno",example="",position=0)
    @JsonProperty("_40_stdgjjtwdno")
    @JSONField(name="_40_stdgjjtwdno")
            private String  _40_stdgjjtwdno_个人公积金提取信息_共同提取人身份证号_String;
    @ApiModelProperty(value="_41_stdgjjtwdbd_个人公积金提取信息_共同提取人是否建立公积金_String",name="_41_stdgjjtwdbd",example="",position=0)
    @JsonProperty("_41_stdgjjtwdbd")
    @JSONField(name="_41_stdgjjtwdbd")
            private String  _41_stdgjjtwdbd_个人公积金提取信息_共同提取人是否建立公积金_String;


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }


    public void set_30_stdperid_申请人基本信息_个人编号_String(String stdperid_申请人基本信息_个人编号_string) {
        this._30_stdperid_申请人基本信息_个人编号_String = stdperid_申请人基本信息_个人编号_string;
    }

    public String get_30_stdperid_申请人基本信息_个人编号_String() {
        return _30_stdperid_申请人基本信息_个人编号_String;
    }

    public void set_29_std400cunm_申请人基本信息_姓名_String(String std400cunm_申请人基本信息_姓名_string) {

        this._29_std400cunm_申请人基本信息_姓名_String = std400cunm_申请人基本信息_姓名_string;
    }

    public String get_29_std400cunm_申请人基本信息_姓名_String() {
        return _29_std400cunm_申请人基本信息_姓名_String;
    }

    public void set_31_std400idtp_申请人基本信息_证件类型_String(String std400idtp_申请人基本信息_证件类型_string) {

        this._31_std400idtp_申请人基本信息_证件类型_String = std400idtp_申请人基本信息_证件类型_string;
    }

    public String get_31_std400idtp_申请人基本信息_证件类型_String() {
        return _31_std400idtp_申请人基本信息_证件类型_String;
    }

    public void set_32_std400idno_申请人基本信息_证件号码_String(String std400idno_申请人基本信息_证件号码_string) {
        this._32_std400idno_申请人基本信息_证件号码_String = std400idno_申请人基本信息_证件号码_string;
    }

    public String get_32_std400idno_申请人基本信息_证件号码_String() {
        return _32_std400idno_申请人基本信息_证件号码_String;
    }

    public void set_33_stdgjjacno_个人公积金提取信息_公积金账号_String(String stdgjjacno_个人公积金提取信息_公积金账号_string) {
        this._33_stdgjjacno_个人公积金提取信息_公积金账号_String = stdgjjacno_个人公积金提取信息_公积金账号_string;
    }

    public String get_33_stdgjjacno_个人公积金提取信息_公积金账号_String() {
        return _33_stdgjjacno_个人公积金提取信息_公积金账号_String;
    }


    public String get_34_stdgjjwdrn_个人公积金提取信息_提取原因_String() {
        return _34_stdgjjwdrn_个人公积金提取信息_提取原因_String;
    }

    public void set_34_stdgjjwdrn_个人公积金提取信息_提取原因_String(String _34_stdgjjwdrn_个人公积金提取信息_提取原因_String) {
        this._34_stdgjjwdrn_个人公积金提取信息_提取原因_String = _34_stdgjjwdrn_个人公积金提取信息_提取原因_String;
    }

    public String get_35_stdgjjwddt_个人公积金提取信息_提取时间_String() {
        return _35_stdgjjwddt_个人公积金提取信息_提取时间_String;
    }

    public void set_35_stdgjjwddt_个人公积金提取信息_提取时间_String(String _35_stdgjjwddt_个人公积金提取信息_提取时间_String) {
        this._35_stdgjjwddt_个人公积金提取信息_提取时间_String = _35_stdgjjwddt_个人公积金提取信息_提取时间_String;
    }

    public String get_36_stdgjjwdtp_个人公积金提取信息_提取方式_String() {
        return _36_stdgjjwdtp_个人公积金提取信息_提取方式_String;
    }

    public void set_36_stdgjjwdtp_个人公积金提取信息_提取方式_String(String _36_stdgjjwdtp_个人公积金提取信息_提取方式_String) {
        this._36_stdgjjwdtp_个人公积金提取信息_提取方式_String = _36_stdgjjwdtp_个人公积金提取信息_提取方式_String;
    }

    public Double get_37_stdgjjhdze_个人公积金提取信息_核定提取总额_DEC() {
        return _37_stdgjjhdze_个人公积金提取信息_核定提取总额_DEC;
    }

    public void set_37_stdgjjhdze_个人公积金提取信息_核定提取总额_DEC(Double _37_stdgjjhdze_个人公积金提取信息_核定提取总额_DEC) {
        this._37_stdgjjhdze_个人公积金提取信息_核定提取总额_DEC = _37_stdgjjhdze_个人公积金提取信息_核定提取总额_DEC;
    }

    public String get_38_stdgjjwdam_个人公积金提取信息_提取金额_String() {
        return _38_stdgjjwdam_个人公积金提取信息_提取金额_String;
    }

    public void set_38_stdgjjwdam_个人公积金提取信息_提取金额_String(String _38_stdgjjwdam_个人公积金提取信息_提取金额_String) {
        this._38_stdgjjwdam_个人公积金提取信息_提取金额_String = _38_stdgjjwdam_个人公积金提取信息_提取金额_String;
    }

    public String get_39_stdgjjtwdnm_个人公积金提取信息_共同提取人姓名_String() {
        return _39_stdgjjtwdnm_个人公积金提取信息_共同提取人姓名_String;
    }

    public void set_39_stdgjjtwdnm_个人公积金提取信息_共同提取人姓名_String(String _39_stdgjjtwdnm_个人公积金提取信息_共同提取人姓名_String) {
        this._39_stdgjjtwdnm_个人公积金提取信息_共同提取人姓名_String = _39_stdgjjtwdnm_个人公积金提取信息_共同提取人姓名_String;
    }

    public String get_40_stdgjjtwdno_个人公积金提取信息_共同提取人身份证号_String() {
        return _40_stdgjjtwdno_个人公积金提取信息_共同提取人身份证号_String;
    }

    public void set_40_stdgjjtwdno_个人公积金提取信息_共同提取人身份证号_String(String _40_stdgjjtwdno_个人公积金提取信息_共同提取人身份证号_String) {
        this._40_stdgjjtwdno_个人公积金提取信息_共同提取人身份证号_String = _40_stdgjjtwdno_个人公积金提取信息_共同提取人身份证号_String;
    }

    public String get_41_stdgjjtwdbd_个人公积金提取信息_共同提取人是否建立公积金_String() {
        return _41_stdgjjtwdbd_个人公积金提取信息_共同提取人是否建立公积金_String;
    }

    public void set_41_stdgjjtwdbd_个人公积金提取信息_共同提取人是否建立公积金_String(String _41_stdgjjtwdbd_个人公积金提取信息_共同提取人是否建立公积金_String) {
        this._41_stdgjjtwdbd_个人公积金提取信息_共同提取人是否建立公积金_String = _41_stdgjjtwdbd_个人公积金提取信息_共同提取人是否建立公积金_String;
    }
}
