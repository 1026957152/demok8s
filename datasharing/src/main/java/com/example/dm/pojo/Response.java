package com.example.dm.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@JSONField(name="ret")
	private String ret;

	@JSONField(name="msg")
	private String msg;

	@JSONField(name="data")
	private List<DataItem> data;

	public void setRet(String ret){
		this.ret = ret;
	}

	public String getRet(){
		return ret;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"ret = '" + ret + '\'' + 
			",msg = '" + msg + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}