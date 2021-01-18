package com.example.dm.apidata.witV3;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;*/


//@ApiModel
public class WitItem {





    @JsonProperty("pageSize")
    @JSONField(name="pageSize")
   // @NotNull
    Integer pageSize; //pageSize	分页每页显示条数	Int		10

    @JsonProperty("pageNumber")
    @JSONField(name="pageNumber")
   // @NotNull
    Integer pageNumber; //pageNumber	分页显示页面	int		1


   // @NotBlank
   //@ApiParam(name = "totalcount", value = "List of URIs of secured assets on the Secure Download Server", allowMultiple = true,
    //       required = true)
    @JsonProperty("totalcount")
    @JSONField(name="totalcount")
    Long totalcount;




















/* @ApiParam(name = "pagenum", value = "List of URIs of secured assets on the Secure Download Server", allowMultiple = true,
         required = true)*/

    @JsonProperty("pagenum")
    @JSONField(name="pagenum")
    Long pagenum;
/* @ApiParam(name = "pagerows", value = "List of URIs of secured assets on the Secure Download Server", allowMultiple = true,
         required = true)*/
    @JsonProperty("pagerows")
    @JSONField(name="pagerows")
    Long pagerows;

    @JsonProperty("startdate")
    @JSONField(name="startdate")
    Long startdate;

    @JsonProperty("enddate")
    @JSONField(name="enddate")
    Long enddate;
    @JsonProperty("ispaging")
    @JSONField(name="ispaging")
    Long ispaging;


 public Long getTotalcount() {
  return totalcount;
 }

 public void setTotalcount(Long totalcount) {
  this.totalcount = totalcount;
 }

 public Long getPagenum() {
  return pagenum;
 }

 public void setPagenum(Long pagenum) {
  this.pagenum = pagenum;
 }

 public Long getPagerows() {
  return pagerows;
 }

 public void setPagerows(Long pagerows) {
  this.pagerows = pagerows;
 }


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
