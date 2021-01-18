package com.example.dm.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class DataItem{

	@JSONField(name="cert_no")
	private String certNo;

	@JSONField(name="spouse_cert_num")
	private String spouseCertNum;

	@JSONField(name="sex")
	private String sex;

	@JSONField(name="op_name")
	private String opName;

	@JSONField(name="dept_name")
	private String deptName;

	@JSONField(name="old_dept_name")
	private String oldDeptName;

	@JSONField(name="cert_num")
	private String certNum;

	@JSONField(name="old_cert_no")
	private String oldCertNo;

	@JSONField(name="op_date")
	private String opDate;

	@JSONField(name="spouse_name")
	private String spouseName;

	@JSONField(name="name")
	private String name;

	@JSONField(name="old_op_date")
	private String oldOpDate;

	@JSONField(name="op_type")
	private String opType;

	@JSONField(name="spouse_sex")
	private String spouseSex;

	public void setCertNo(String certNo){
		this.certNo = certNo;
	}

	public String getCertNo(){
		return certNo;
	}

	public void setSpouseCertNum(String spouseCertNum){
		this.spouseCertNum = spouseCertNum;
	}

	public String getSpouseCertNum(){
		return spouseCertNum;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public String getSex(){
		return sex;
	}

	public void setOpName(String opName){
		this.opName = opName;
	}

	public String getOpName(){
		return opName;
	}

	public void setDeptName(String deptName){
		this.deptName = deptName;
	}

	public String getDeptName(){
		return deptName;
	}

	public void setOldDeptName(String oldDeptName){
		this.oldDeptName = oldDeptName;
	}

	public String getOldDeptName(){
		return oldDeptName;
	}

	public void setCertNum(String certNum){
		this.certNum = certNum;
	}

	public String getCertNum(){
		return certNum;
	}

	public void setOldCertNo(String oldCertNo){
		this.oldCertNo = oldCertNo;
	}

	public String getOldCertNo(){
		return oldCertNo;
	}

	public void setOpDate(String opDate){
		this.opDate = opDate;
	}

	public String getOpDate(){
		return opDate;
	}

	public void setSpouseName(String spouseName){
		this.spouseName = spouseName;
	}

	public String getSpouseName(){
		return spouseName;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setOldOpDate(String oldOpDate){
		this.oldOpDate = oldOpDate;
	}

	public String getOldOpDate(){
		return oldOpDate;
	}

	public void setOpType(String opType){
		this.opType = opType;
	}

	public String getOpType(){
		return opType;
	}

	public void setSpouseSex(String spouseSex){
		this.spouseSex = spouseSex;
	}

	public String getSpouseSex(){
		return spouseSex;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"cert_no = '" + certNo + '\'' + 
			",spouse_cert_num = '" + spouseCertNum + '\'' + 
			",sex = '" + sex + '\'' + 
			",op_name = '" + opName + '\'' + 
			",dept_name = '" + deptName + '\'' + 
			",old_dept_name = '" + oldDeptName + '\'' + 
			",cert_num = '" + certNum + '\'' + 
			",old_cert_no = '" + oldCertNo + '\'' + 
			",op_date = '" + opDate + '\'' + 
			",spouse_name = '" + spouseName + '\'' + 
			",name = '" + name + '\'' + 
			",old_op_date = '" + oldOpDate + '\'' + 
			",op_type = '" + opType + '\'' + 
			",spouse_sex = '" + spouseSex + '\'' + 
			"}";
		}
}