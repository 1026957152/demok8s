package com.coalvalue.employee.domain;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by silence on 2016-07-11.
 */
public class OperationResult<T> {



    public boolean Success ;
    public T resultObject ;
    public String errorMessage ;

    private String resultMessage;
    private String action;

    public static Map okMap() {
        Map map = new HashMap();
        map.put("status",true);

        return map;

    }

    public static Map feignOk(Object maps) {
        Map map = new HashMap();
        map.put("status",true);
        map.put("content",maps);
        return map;
    }

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


    public static OperationResult ok(Object employee) {
        OperationResult operationResult =  new OperationResult();
        operationResult.setSuccess(true);
        operationResult.setResultObject(employee);
        return operationResult;
    }

    public static Map returnOkMap() {

        Map map = new HashMap();
        map.put("status",true);
        map.put("","message");
        return map;
    }

    public static Map errorMap(String errorMessage) {
        Map map = new HashMap();
        map.put("status",false);
        map.put("message",errorMessage);
        return map;

    }

    public static OperationResult error(String error) {
        OperationResult operationResult =  new OperationResult();
        operationResult.setSuccess(false);
        operationResult.setErrorMessage(error);
        return operationResult;
    }

    public static Map okMap(String url) {
        Map map = new HashMap();
        map.put("status",true);
        map.put("","message");
        map.put("url",url);
        return map;
    }

}
