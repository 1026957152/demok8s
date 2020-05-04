package com.coalvalue.employee.domain;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by silence on 2016-07-11.
 */
public class NoFeign<T> {



    public boolean Success ;
    public T resultObject ;
    public String errorMessage ;
    public boolean error;

    private String resultMessage;
    private String action;
    private String no;

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean success) {
        Success = success;
    }

    public T getResultObject() {
        return resultObject;
    }

    public void setResultObject(T resultObject) {
        this.resultObject = resultObject;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }



    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public Map ok(String 注册成功__, String redirect) {


        Map hashMap = new HashMap();
        hashMap.put("status", true);
        hashMap.put("message", 注册成功__);
        hashMap.put("url", redirect);
        return hashMap;
    }


    public static NoFeign ok(Map employee) throws Exception {
        if(employee == null){
            throw new Exception("feign 服务异常");
        }
        NoFeign operationResult =  new NoFeign();
        operationResult.setNo((String)employee.get("content"));

        return operationResult;
    }

    public static Map returnOkMap() {

        Map map = new HashMap();
        map.put("status",true);
        map.put("","message");
        return map;
    }

    public static Map returnErrorMap(String errorMessage) {
        Map map = new HashMap();
        map.put("status",false);
        map.put("message",errorMessage);
        return map;

    }

    public static NoFeign error(String error) {
        NoFeign operationResult =  new NoFeign();
        operationResult.setSuccess(false);
        operationResult.setErrorMessage(error);
        return operationResult;
    }

    public static Map returnOkMap(String url) {
        Map map = new HashMap();
        map.put("status",true);
        map.put("","message");
        map.put("url",url);
        return map;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String no() {
        return no;
    }
}
