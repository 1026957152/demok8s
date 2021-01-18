package com.example.dm.apidata.cebV1;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
////import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;*/


//@ApiModel
@JsonInclude(JsonInclude.Include.NON_NULL)
////@Data
public class CebItem {


    @ApiModelProperty(value="_1_15_qz_ifsgjj_info_公积金基本信息文件",name="_1_15_qz_ifsgjj_info",example="",position=0)
    @JsonProperty("_1_15_qz_ifsgjj_info")
    @JSONField(name="_1_15_qz_ifsgjj_info")
    private List<CebItem_basic> _1_15_qz_ifsgjj_info;

    @ApiModelProperty(value="_16_28_qz_ifsgjj_jiaocun_公积金账户缴存信息文件",name="_16_28_qz_ifsgjj_jiaocun",example="",position=0)
    @JsonProperty("_16_28_qz_ifsgjj_jiaocun")
    @JSONField(name="_16_28_qz_ifsgjj_jiaocun")
    private List<CebItem_jiaocun> _16_28_qz_ifsgjj_jiaocun;


    @ApiModelProperty(value="_29_41_qz_ifsgjj_tiqu_提取信息文件",name="_15_stdcmphjdt",example="",position=0)
    @JsonProperty("_29_41_qz_ifsgjj_tiqu")
    @JSONField(name="_29_41_qz_ifsgjj_tiqu")
    private List<CebItem_tiqu> _29_41_qz_ifsgjj_tiqu;
    @ApiModelProperty(value="_42_62_qz_ifsgjj_daikuan_未结清个人公积金贷款信息文件",name="_42_62_qz_ifsgjj_daikuan",example="",position=0)
    @JsonProperty("_42_62_qz_ifsgjj_daikuan")
    @JSONField(name="_42_62_qz_ifsgjj_daikuan")
    private List<CebItem_daikuan> _42_62_qz_ifsgjj_daikuan;





    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public List<CebItem_tiqu> get_29_41_qz_ifsgjj_tiqu() {
        return _29_41_qz_ifsgjj_tiqu;
    }

    public void set_29_41_qz_ifsgjj_tiqu(List<CebItem_tiqu> _29_41_qz_ifsgjj_tiqu) {
        this._29_41_qz_ifsgjj_tiqu = _29_41_qz_ifsgjj_tiqu;
    }

    public List<CebItem_daikuan> get_42_62_qz_ifsgjj_daikuan() {
        return _42_62_qz_ifsgjj_daikuan;
    }

    public void set_42_62_qz_ifsgjj_daikuan(List<CebItem_daikuan> _42_62_qz_ifsgjj_daikuan) {
        this._42_62_qz_ifsgjj_daikuan = _42_62_qz_ifsgjj_daikuan;
    }


    public List<CebItem_jiaocun> get_16_28_qz_ifsgjj_jiaocun() {
        return _16_28_qz_ifsgjj_jiaocun;
    }

    public void set_16_28_qz_ifsgjj_jiaocun(List<CebItem_jiaocun> _16_28_qz_ifsgjj_jiaocun) {
        this._16_28_qz_ifsgjj_jiaocun = _16_28_qz_ifsgjj_jiaocun;
    }

    public List<CebItem_basic> get_1_15_qz_ifsgjj_info() {
        return _1_15_qz_ifsgjj_info;
    }

    public void set_1_15_qz_ifsgjj_info(List<CebItem_basic> _1_15_qz_ifsgjj_info) {
        this._1_15_qz_ifsgjj_info = _1_15_qz_ifsgjj_info;
    }
}
