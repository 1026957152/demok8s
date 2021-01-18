package com.example.dm.web.output;

import com.fasterxml.jackson.annotation.JsonInclude;
//import lombok.Data;

import java.util.List;

//.@ApiModel

//@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReturnResultOutput<T> {



    List<T> data;



    Integer totalcount;
   // List<T> result;
    /*    private String ret;
        private String msg;*/
   // private Boolean success;




    // Integer totalnum;
   // Integer totalpage;

    public Integer getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(Integer totalcount) {
        this.totalcount = totalcount;
    }


    public static ReturnResultOutput 情况1_返回成功(Object[] data) {
        ReturnResultOutput returnResult = new ReturnResultOutput();
/*        returnResult.setData(data);
        returnResult.setRet("0");
        returnResult.setMsg("返回成功");*/

        return returnResult;
    }



    public static ReturnResultOutput 情况2_查询为空() {
        ReturnResultOutput returnResult = new ReturnResultOutput();

/*        returnResult.setRet("1");
        returnResult.setMsg("查询为空");*/

        return returnResult;
    }

    public static ReturnResultOutput 情况3_您没有权限访问(String message) {
        ReturnResultOutput returnResult = new ReturnResultOutput();

/*        returnResult.setRet("2");
        returnResult.setMsg("您没有权限访问："+message);*/

        return returnResult;
    }

    public static ReturnResultOutput 情况4_入参数格式错误(String msg) {
        ReturnResultOutput returnResult = new ReturnResultOutput();

/*        returnResult.setRet("3");
        returnResult.setMsg("入参数格式错误:"+msg);*/

        return returnResult;
    }

    public static ReturnResultOutput 情况5_操作失败() {
        ReturnResultOutput returnResult = new ReturnResultOutput();

/*        returnResult.setRet("99");
        returnResult.setMsg("操作失败");*/

        return returnResult;
    }
    public static ReturnResultOutput 情况5_操作失败(String e) {
        ReturnResultOutput returnResult = new ReturnResultOutput();

/*        returnResult.setRet("99");
        returnResult.setMsg("操作失败:"+e);*/

        return returnResult;
    }


}
