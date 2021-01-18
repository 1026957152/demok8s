

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>榆林住房公积金2020年离柜率提升项目需求分析</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
<#--
    <link href="${rc.contextPath}/components/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${rc.contextPath}/components/bootstrap-select/css/bootstrap-select.min.css" rel="stylesheet">

    <link href="${rc.contextPath}/components/bootstrap_table/bootstrap-table.min.css" rel="stylesheet">


    <script src="${rc.contextPath}/js/jquery/jquery.js" type="text/javascript"></script>
    <script src="${rc.contextPath}/components/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>

    <script type="text/javascript" src="${rc.contextPath}/components/bootstrap_table/bootstrap-table.min.js"></script>
    <script type="text/javascript" src="${rc.contextPath}/components/bootstrap_table/bootstrap-table-zh-CN.min.js"></script>
    <script type="text/javascript" src="${rc.contextPath}/components/bootstrap-select/js/bootstrap-select.min.js"></script>
-->


    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    <script type="text/javascript">
        function logout(params) {
            alert("aaaa");
            var req = {
                method: 'DELETE',
                url: "oauth/token"
            };
            $http(req).then(
                    function(data){
                        $cookies.remove("access_token");
                        window.location.href="login";
                    },function(){
                        console.log("error");
                    }
            );
        }
    </script>

</head>
<body>
<div class="container-fluid" style="margin-bottom:60px; margin-top:20px">
    <#include "fragments/navbar.ftl">




    <table class="table">
        <caption></caption>
        <thead>
        <tr>
            <th>名称</th>
            <th>城市</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>名称</td>
            <td> ${doubtfulPoint.identifier}</td>
        </tr>
        <tr>
            <td>编号</td>
            <td>  ${doubtfulPoint.no}</td>
        </tr>
        <tr>

            <td>描述</td>
            <td> ${doubtfulPoint.stringValue}</td>
        </tr>
        <tr>

            <td>描述</td>
            <td> ${doubtfulPoint.checkFingerprint}</td>
        </tr>
        <tr>

            <td>描述</td>
            <td> ${doubtfulPoint.status}</td>
        </tr>

        </tbody>
    </table>



            <div class="well">

                <div class="row">
                    <div class="col">
                        <table class="table table-striped">
                            <caption>单位基本信息</caption>
                            <thead>
                            <tr>
                                <th>名称</th>



                                <th>城市</th>
                            </tr>
                            </thead>
                            <tbody>

                            <#assign  cm001=dp005dp004cm001.value2/>

                            <tr>
                                <td>unitcustid单位客户号</td>
                                <td>${cm001.unitcustid单位客户号!''}</td>
                            </tr>
                            <tr>
                                <td>unitaccname_单位名称</td>
                                <td>${cm001.unitaccname_单位名称!''}</td>
                            </tr>
                            <tr>
                                <td>orgcode_组织机构代码</td>
                                <td>${cm001.orgcode_组织机构代码!''}</td>
                            </tr>
                            <tr>
                                <td>licensenum_营业执照号码</td>
                                <td>${cm001.licensenum_营业执照号码!''}</td>
                            </tr>

                            <tr>
                                <td>unitkind_单位性质</td>
                                <td>${cm001.unitkind_单位性质!''}</td>
                            </tr>
                            <tr>
                                <td>unitaddr_单位地址</td>
                                <td>${cm001.unitaddr_单位地址!''}</td>
                            </tr>
                            <tr>
                                <td>leglaccname_单位法人代表</td>
                                <td>${cm001.leglaccname_单位法人代表!''}</td>
                            </tr>
                            <tr>
                                <td>leglcertitype_法人代表证件类型1</td>
                                <td>${cm001.leglcertitype_法人代表证件类型1!''}</td>
                            </tr>

                            <tr>
                                <td>leglcertinum_法人代表证件号码0</td>
                                <td>${cm001.leglcertinum_法人代表证件号码0!''}</td>
                            </tr>
                            <tr>
                                <td>unitlinkman_单位联系人</td>
                                <td>${cm001.unitlinkman_单位联系人!''}</td>
                            </tr>
                            <tr>
                                <td>unitlinkphone_联系电话</td>
                                <td>${cm001.unitlinkphone_联系电话!''}</td>
                            </tr>
                            <tr>
                                <td>agentinstcode_经办机构</td>
                                <td>${cm001.agentinstcode_经办机构!''}</td>
                            </tr>
                            <tr>
                                <td>salday_发薪日</td>
                                <td>${cm001.salday_发薪日!''}</td>
                            </tr>



                            </tbody>


                        </table>
                    </div>
                    <div class="col">
                        <table class="table table-striped">
                            <caption>单位分帐户</caption>
                            <thead>
                            <tr>
                                <th>名称</th>



                                <th>城市</th>
                            </tr>
                            </thead>
                            <tbody>

                            <#assign  dp005=dp005dp004cm001.value0/>
                            <tr>
                                <td>unitaccnum单位账号</td>
                                <td>${dp005.unitaccnum单位账号!''}</td>
                            </tr>
                            <tr>
                                <td>unitaccnum单位账号</td>
                                <td>${dp005.unitaccnum单位账号!''}</td>
                            </tr>
                            <tr>
                                <td>unitcustid_单位客户号</td>
                                <td>${dp005.unitcustid_单位客户号!''}</td>
                            </tr>
                            <tr>
                                <td>unitaccname_单位名称</td>
                                <td>${dp005.unitaccname_单位名称!''}</td>
                            </tr>
                            <tr>
                                <td>subcode</td>
                                <td>${dp005.subcode!''}</td>
                            </tr>
                            <tr>
                                <td>exttranslvl</td>
                                <td>${dp005.exttranslvl!''}</td>
                            </tr>
                            <tr>
                                <td>unitaccstate_单位账户状态</td>
                                <td>${dp005.unitaccstate_单位账户状态!''}</td>
                            </tr>
                            <tr>
                                <td>frzflag_冻结标志</td>
                                <td>${dp005.frzflag_冻结标志!''}</td>
                            </tr>
                            <tr>
                                <td>unitacctype_单位账户类型 // // 1－普通4－自由5－军转6－托管7－执法8－久悬未取 9－预缴户</td>
                                <td>${dp005.unitacctype_单位账户类型!''}</td>
                            </tr>
                            <tr>
                                <td>lastbal_上日余额 </td>
                                <td>${dp005.lastbal_上日余额!''}</td>
                            </tr>
                            <tr>
                                <td>frzamt_冻结金额 </td>
                                <td>${dp005.frzamt_冻结金额!''}</td>
                            </tr>
                            <tr>
                                <td>stpayamt </td>
                                <td>${dp005.stpayamt!''}</td>
                            </tr>
                            <tr>
                                <td>bal_余额 </td>
                                <td>${dp005.bal_余额!''}</td>
                            </tr>
                            <tr>
                                <td>lasttransdate_上笔发生日期</td>
                                <td>${dp005.lasttransdate_上笔发生日期!''}</td>
                            </tr>
                            <tr>
                                <td>begintdate_起息日期</td>
                                <td>${dp005.begintdate_起息日期!''}</td>
                            </tr>

                            <tr>
                                <td>opnaccdate开户日期</td>
                                <td>${dp005.opnaccdate开户日期!''}</td>
                            </tr>

                            <tr>
                                <td>clsaccdate销户日期</td>
                                <td>${dp005.clsaccdate销户日期!''}</td>
                            </tr>

                            <tr>
                                <td>intaccu</td>
                                <td>${dp005.intaccu!''}</td>
                            </tr>
                            <tr>
                                <td>calintflag</td>
                                <td>${dp005.calintflag!''}</td>
                            </tr>

                            <tr>
                                <td>accinstcode_账户机构</td>
                                <td>${dp005.accinstcode_账户机构!''}</td>
                            </tr>


                            </tbody>


                        </table>
                    </div>
                    <div class="col">
                        <table class="table table-striped">
                            <caption>单位缴存信息</caption>
                            <thead>
                            <tr>
                                <th>名称</th>



                                <th>城市</th>
                            </tr>
                            </thead>
                            <tbody>
                            <#assign  dp004=dp005dp004cm001.value1/>

                            <tr>
                                <td>unitaccnum单位账号</td>
                                <td>${dp004.unitaccnum单位账号!''}</td>
                            </tr>
                            <tr>
                                <td>unitcustid_单位客户号</td>
                                <td>${dp004.unitcustid_单位客户号!''}</td>
                            </tr>
                            <tr>
                                <td>fundsouflag_资金来源标志</td>
                                <td>${dp004.fundsouflag_资金来源标志!''}</td>
                            </tr>
                            <tr>
                                <td>begpayym_起始汇缴年月</td>
                                <td>${dp004.begpayym_起始汇缴年月!''}</td>
                            </tr>
                            <tr>
                                <td>lpaym_缴至年月</td>
                                <td>${dp004.lpaym_缴至年月!''}</td>
                            </tr>

                            <tr>
                                <td>basenum_缴存基数</td>
                                <td>${dp004.basenum_缴存基数!''}</td>
                            </tr>
                            <tr>
                                <td>indinorprop_个人正常比例</td>
                                <td>${dp004.indinorprop_个人正常比例!''}</td>
                            </tr>
                            <tr>
                                <td>indihigprop_个人高比例</td>
                                <td>${dp004.indihigprop_个人高比例!''}</td>
                            </tr>
                            <tr>
                                <td>indispeprop_个人特殊比例</td>
                                <td>${dp004.indispeprop_个人特殊比例!''}</td>
                            </tr>
                            <tr>
                                <td>unitnorprop_单位正常比例</td>
                                <td>${dp004.unitnorprop_单位正常比例!''}</td>
                            </tr>

                            <tr>
                                <td>unithigprop_单位高比例</td>
                                <td>${dp004.unithigprop_单位高比例!''}</td>
                            </tr>
                            <tr>
                                <td>unitspeprop_单位特殊比例</td>
                                <td>${dp004.unitspeprop_单位特殊比例!''}</td>
                            </tr>




                            </tbody>


                        </table>
                    </div>
                </div>





            </div>




    <div class="well">

        <div class="row">
            <div class="col">
                <table class="table table-striped">


                    <caption>个人缴存信息 dp007</caption>

                    <#assign  dp007=dp007dp006cm002.value0/>

                    <thead>
                    <tr>
                        <th>名称</th>



                        <th>城市</th>
                    </tr>
                    </thead>
                    <tbody>


                    <tr>
                        <td>accnum个人账号</td>
                        <td>${dp007.accnum个人账号!''}</td>
                    </tr>
                    <tr>
                        <td>unitaccnum_单位账号</td>
                        <td>${dp007.unitaccnum_单位账号!''}</td>
                    </tr>
                    <tr>
                        <td>custid_个人客户号</td>
                        <td>${dp007.custid_个人客户号!''}</td>
                    </tr>
                    <tr>
                        <td>accname_姓名</td>
                        <td>${dp007.accname_姓名!''}</td>
                    </tr>

                    <tr>
                        <td>certitype_证件类型</td>
                        <td>${dp007.certitype_证件类型!''}</td>
                    </tr>

                    <tr>
                        <td>certinum_证件号码</td>
                        <td>${dp007.certinum_证件号码!''}</td>
                    </tr>

                    <tr>
                        <td>indiacctype_个人账户类型</td>
                        <td>${dp007.indiacctype_个人账户类型!''}</td>
                    </tr>
                    <tr>
                        <td>indiaccstate_个人账户状态</td>
                        <td>${dp007.indiaccstate_个人账户状态!''}</td>
                    </tr>
                    <tr>
                        <td>frzflag_冻结标志</td>
                        <td>${dp007.frzflag_冻结标志!''}</td>
                    </tr>
                    <tr>
                        <td>opnaccdate开户日期</td>
                        <td>${dp007.opnaccdate开户日期!''}</td>
                    </tr>
                    <tr>
                        <td>clsaccdate销户日期</td>
                        <td>${dp007.clsaccdate销户日期!''}</td>
                    </tr>
                    <tr>
                        <td>lasttransdate_上笔发生日期</td>
                        <td>${dp007.lasttransdate_上笔发生日期!''}</td>
                    </tr>
                    <tr>
                        <td>begintdate_起息日期</td>
                        <td>${dp007.begintdate_起息日期!''}</td>
                    </tr>
                    <tr>
                        <td>trustdate_托管日期</td>
                        <td>${dp007.trustdate_托管日期!''}</td>
                    </tr>


                    <tr>
                        <td>lastbal_上日余额</td>
                        <td>${dp007.lastbal_上日余额!''}</td>
                    </tr>

                    <tr>
                        <td>frzamt</td>
                        <td>${dp007.frzamt!''}</td>
                    </tr>
                    <tr>
                        <td>stpayamt</td>
                        <td>${dp007.stpayamt!''}</td>
                    </tr>

                    <tr>
                        <td>keepbal</td>
                        <td>${dp007.keepbal!''}</td>
                    </tr>

                    <tr>
                        <td>bal_余额</td>
                        <td>${dp007.bal_余额!''}</td>
                    </tr>
                    <tr>
                        <td>accinstcode</td>
                        <td>${dp007.accinstcode!''}</td>
                    </tr>


                    </tbody>
                </table>
            </div>
            <div class="col">
                <table class="table table-striped">


                    <caption>个人缴存信息 dp006</caption>

                    <#assign  dp006=dp007dp006cm002.value1/>

                    <thead>
                    <tr>
                        <th>名称</th>



                        <th>城市</th>
                    </tr>
                    </thead>
                    <tbody>


                    <tr>
                        <td>accnum个人账号</td>
                        <td>${dp006.accnum个人账号!''}</td>
                    </tr>
                    <tr>
                        <td>accnum个人账号</td>
                        <td>${dp006.accnum个人账号!''}</td>
                    </tr>
                    <tr>
                        <td>attworkdate_参加工作时间</td>
                        <td>${dp006.attworkdate_参加工作时间!''}</td>
                    </tr>
                    <tr>
                        <td>lpaym_缴至年月</td>
                        <td>${dp006.lpaym_缴至年月!''}</td>
                    </tr>
                    <tr>
                        <td>basenum_缴存基数</td>
                        <td>${dp006.basenum_缴存基数!''}</td>
                    </tr>
                    <tr>
                        <td>proptype</td>
                        <td>${dp006.proptype!''}</td>
                    </tr>
                    <tr>
                        <td>fundsouflag_资金来源标志</td>
                        <td>${dp006.fundsouflag_资金来源标志!''}</td>
                    </tr>
                    <tr>
                        <td>unitprop_单位比例</td>
                        <td>${dp006.unitprop_单位比例!''}</td>
                    </tr>
                    <tr>
                        <td>unitastprop_单位辅助比例</td>
                        <td>${dp006.unitastprop_单位辅助比例!''}</td>
                    </tr>
                    <tr>
                        <td>indiprop_个人缴存比例</td>
                        <td>${dp006.indiprop_个人缴存比例!''}</td>
                    </tr>
                    <tr>
                        <td>unitpayamt_单位月汇缴金额</td>
                        <td>${dp006.unitpayamt_单位月汇缴金额!''}</td>
                    </tr>
                    <tr>
                        <td>indipayamt_个人月汇缴金额</td>
                        <td>${dp006.indipayamt_个人月汇缴金额!''}</td>
                    </tr>
                    <tr>
                        <td>indipaysum</td>
                        <td>${dp006.indipaysum!''}</td>
                    </tr>
                    <tr>
                        <td>indipaymap</td>
                        <td>${dp006.indipaymap!''}</td>
                    </tr>

                    <tr>
                        <td>byearbal</td>
                        <td>${dp006.byearbal!''}</td>
                    </tr>
                    <tr>
                        <td>ydrawamt_年提取额</td>
                        <td>${dp006.ydrawamt_年提取额!''}</td>
                    </tr>



                    </tbody>
                </table>
            </div>
            <div class="col">
                <table class="table table-striped">


                    <caption>个人基本信息 cm002</caption>

                    <#assign  cm002=dp007dp006cm002.value2/>

                    <thead>
                    <tr>
                        <th>名称</th>



                        <th>城市</th>
                    </tr>
                    </thead>
                    <tbody>


                    <tr>
                        <td>custid个人客户号</td>
                        <td>${cm002.custid个人客户号!''}</td>
                    </tr>


                    <tr>
                        <td>accname_个人姓名</td>
                        <td>${cm002.accname_个人姓名!''}</td>
                    </tr>
                    <tr>
                        <td>sex_性别</td>
                        <td>${cm002.sex_性别!''}</td>
                    </tr>
                    <tr>
                        <td>inmspell_个人姓名全拼</td>
                        <td>${cm002.inmspell_个人姓名全拼!''}</td>
                    </tr>
                    <tr>
                        <td>zip</td>
                        <td>${cm002.zip!''}</td>
                    </tr>
                    <tr>
                        <td>marstatus_婚姻状况</td>
                        <td>${cm002.marstatus_婚姻状况!''}</td>
                    </tr>
                    <tr>
                        <td>famaddr_家庭住址</td>
                        <td>${cm002.famaddr_家庭住址!''}</td>
                    </tr>
                    <tr>
                        <td>birthday_出生日期</td>
                        <td>${cm002.birthday_出生日期!''}</td>
                    </tr>
                    <tr>
                        <td>certinum</td>
                        <td>${cm002.certinum!''}</td>
                    </tr>
                    <tr>
                        <td>agentinstcode_经办机构</td>
                        <td>${cm002.agentinstcode_经办机构!''}</td>
                    </tr>
                    <tr>
                        <td>opnaccdate_开户日期</td>
                        <td>${cm002.opnaccdate_开户日期!''}</td>
                    </tr>
                    <tr>
                        <td>validflag</td>
                        <td>${cm002.validflag!''}</td>
                    </tr>
                    <tr>
                        <td>handset_手机</td>
                        <td>${cm002.handset_手机!''}</td>
                    </tr>
                    <tr>
                        <td>phone_电话</td>
                        <td>${cm002.phone_电话!''}</td>
                    </tr>
                    <tr>
                        <td>email</td>
                        <td>${cm002.email!''}</td>
                    </tr>
                    <tr>
                        <td>msn</td>
                        <td>${cm002.msn!''}</td>
                    </tr>
                    <tr>
                        <td>qq</td>
                        <td>${cm002.qq!''}</td>
                    </tr>
                    <tr>
                        <td>attworkdate</td>
                        <td>${cm002.attworkdate!''}</td>
                    </tr>
                    <tr>
                        <td>unitaccname</td>
                        <td>${cm002.unitaccname!''}</td>
                    </tr>
                    <tr>
                        <td>belongtodept</td>
                        <td>${cm002.belongtodept!''}</td>
                    </tr>
                    <tr>
                        <td>workid</td>
                        <td>${cm002.workid!''}</td>
                    </tr>
                    <tr>
                        <td>workid</td>
                        <td>${cm002.workid!''}</td>
                    </tr>


                    </tbody>
                </table>
            </div>
            </div>




        <hr>
        明细数据
        <#assign  dp204s=dp204sdp022sdp009sdp032s.value0/>

        <#assign  dp022s=dp204sdp022sdp009sdp032s.value1/>
        <#assign  dp009s=dp204sdp022sdp009sdp032s.value2/>
        <#assign  dp032s=dp204sdp022sdp009sdp032s.value3/>
        <div role="tabpanel">

            <ul class="nav nav-tabs" role="tablist">


                <li role="presentation" class="active"><a href="#dp204s" aria-controls="coalDeals" role="tab"
                                                          data-toggle="tab">DP204_个人缴存变更登记簿</a></li>
                <li role="presentation" class=""><a href="#dp022s" aria-controls="coalDeals" role="tab"
                                                          data-toggle="tab">DP022_个人缴存登记簿</a></li>
                <li role="presentation" class=""><a href="#dp009s" aria-controls="coalDeals" role="tab"
                                                          data-toggle="tab">DP009_个人明细账</a></li>
                <li role="presentation" class=""><a href="#dp032s" aria-controls="coalDeals" role="tab"
                                                          data-toggle="tab">Dp032_个人转移登记簿</a></li>

            </ul>
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="dp204s">
                    <div class="row col-lg-12" style="">
                        <section class="">

                            <div class="table-responsive">

                                <div role="tabpanel" class="tab-pane" id="index">
                                    <div class="row col-lg-12" style="padding-top: 10px";>

                                        <table class=" table-striped" id="bussiness-table" data-url="{url}" >
                                            <thead>
                                            <#list dp204s as dp204>
                                                <tr>
                                                    <th data-field="state" data-checkbox="true"></th>

                                                    <th data-field="targetNo">风险点</th>
                                                    <th data-field="managementNo">管理部</th>


                                                    <th data-field="no">编号</th>
                                                    <th data-field="stringValue">描述</th>



                                                    <th data-field="status" >状态</th>
                                                    <th data-field="description" >描述</th>

                                                    <th data-field="createDate" >建立时间</th>
                                                    <th data-field="modifyDate" >更新时间</th>


                                                    <th data-field=""  data-formatter="operationFormatter">操作</th>

                                                </tr>


                                            </#list>

                                            </thead>
                                        </table>



                                    </div>
                                </div>

                            </div>
                        </section>

                    </div>
                </div>
                <div role="tabpanel" class="tab-pane " id="dp022s">
                    <div class="row col-lg-12" style="">
                        <section class="">

                            <div class="table-responsive">

                                <div role="tabpanel" class="tab-pane" id="index">
                                    <div class="row col-lg-12" style="padding-top: 10px";>

                                        <table class=" table-striped" id="bussiness-table" data-url="{url}" >
                                            <thead>
                                            <#list dp022s as dp022>
                                                <tr>
                                                    <th data-field="state" data-checkbox="true"></th>

                                                    <th data-field="targetNo">风险点</th>
                                                    <th data-field="managementNo">管理部</th>


                                                    <th data-field="no">编号</th>
                                                    <th data-field="stringValue">描述</th>



                                                    <th data-field="status" >状态</th>
                                                    <th data-field="description" >描述</th>

                                                    <th data-field="createDate" >建立时间</th>
                                                    <th data-field="modifyDate" >更新时间</th>


                                                    <th data-field=""  data-formatter="operationFormatter">操作</th>

                                                </tr>


                                            </#list>

                                            </thead>
                                        </table>



                                    </div>
                                </div>

                            </div>
                        </section>

                    </div>
                </div>
                <div role="tabpanel" class="tab-pane " id="dp009s">
                    <div class="row col-lg-12" style="">
                        <section class="">

                            <div class="table-responsive">

                                <div role="tabpanel" class="tab-pane" id="index">
                                    <div class="row col-lg-12" style="padding-top: 10px";>

                                        <table class=" table-striped" id="bussiness-table" data-url="{url}" >
                                            <thead>
                                            <#list dp009s as dp009>
                                                <tr>
                                                    <th data-field="state" data-checkbox="true"></th>

                                                    <th data-field="targetNo">风险点</th>
                                                    <th data-field="managementNo">管理部</th>


                                                    <th data-field="no">编号</th>
                                                    <th data-field="stringValue">描述</th>



                                                    <th data-field="status" >状态</th>
                                                    <th data-field="description" >描述</th>

                                                    <th data-field="createDate" >建立时间</th>
                                                    <th data-field="modifyDate" >更新时间</th>


                                                    <th data-field=""  data-formatter="operationFormatter">操作</th>

                                                </tr>


                                            </#list>

                                            </thead>
                                        </table>



                                    </div>
                                </div>

                            </div>
                        </section>

                    </div>
                </div>
                <div role="tabpanel" class="tab-pane " id="dp032s">
                    <div class="row col-lg-12" style="">
                        <section class="">

                            <div class="table-responsive">

                                <div role="tabpanel" class="tab-pane" id="index">
                                    <div class="row col-lg-12" style="padding-top: 10px";>

                                        <table class=" table-striped" id="bussiness-table" data-url="{url}" >
                                            <thead>
                                            <#list dp032s as dp032>
                                                <tr>
                                                    <th data-field="state" data-checkbox="true"></th>

                                                    <th data-field="targetNo">风险点</th>
                                                    <th data-field="managementNo">管理部</th>


                                                    <th data-field="no">编号</th>
                                                    <th data-field="stringValue">描述</th>



                                                    <th data-field="status" >状态</th>
                                                    <th data-field="description" >描述</th>

                                                    <th data-field="createDate" >建立时间</th>
                                                    <th data-field="modifyDate" >更新时间</th>


                                                    <th data-field=""  data-formatter="operationFormatter">操作</th>

                                                </tr>


                                            </#list>

                                            </thead>
                                        </table>



                                    </div>
                                </div>

                            </div>
                        </section>

                    </div>
                </div>

            </div>

        </div>



    </div>


    <div class="well">
    <#list ln003s as ln003_tow>

        <#assign  ln003=ln003_tow.value0/>
        <table class="table table-striped">
            <caption>贷款信息</caption>
            <thead>
            <tr>
                <th>名称</th>
                <th>城市</th>
            </tr>
            </thead>
            <tbody>
            <#assign  ln008=ln003_tow.value0/>
            <tr>
                <td>loancontrcode合同代码</td>
                <td>${ln008.loancontrcode合同代码!''}</td>
            </tr>
            <tr>
                <td>seqnum_序号</td>
                <td>${ln008.seqnum_序号!''}</td>
            </tr>
            <tr>
                <td>chgnum</td>
                <td>${ln008.chgnum!''}</td>
            </tr>
            <tr>
                <td>handset</td>
                <td>${ln008.handset!''}</td>
            </tr>



            <tr>
                <td>loanrelation_0_借款人关系</td>
                <td>${ln008.loanrelation_0_借款人关系!''}</td>
            </tr>
            <tr>
                <td>loanopchgtype_0_借款人变更类型</td>
                <td>${ln008.loanopchgtype_0_借款人变更类型!''}</td>
            </tr>


            <tr>
                <td>chgreasontype_0_变更原因</td>
                <td>${ln008.chgreasontype_0_变更原因!''}</td>
            </tr>

            <tr>
                <td>loanrelation_0_借款人关系</td>
                <td>${ln008.loanrelation_0_借款人关系!''}</td>
            </tr>
            <tr>
                <td>custid_0_个人客户号</td>
                <td>${ln008.custid_0_个人客户号!''}</td>
            </tr>

            <tr>
                <td>accname_0_个人姓名</td>
                <td>${ln008.accname_0_个人姓名!''}</td>
            </tr>

            <tr>
                <td>certitype_0_证件类型</td>
                <td>${ln008.certitype_0_证件类型!''}</td>
            </tr>

            <tr>
                <td>certinum_0_证件号码</td>
                <td>${ln008.certinum_0_证件号码!''}</td>
            </tr>
            <tr>
                <td>sex_1_性别</td>
                <td>${ln008.sex_1_性别!''}</td>
            </tr>
            <tr>
                <td>birthday_1_出生日期</td>
                <td>${ln008.birthday_1_出生日期!''}</td>
            </tr>
            <tr>
                <td>age_1_年龄</td>
                <td>${ln008.age_1_年龄!''}</td>
            </tr>
            <tr>
                <td>marstatus_0_婚姻状况</td>
                <td>${ln008.marstatus_0_婚姻状况!''}</td>
            </tr>
            <tr>
                <td>unitaccname_1_单位名称</td>
                <td>${ln008.unitaccname_1_单位名称!''}</td>
            </tr>
            <tr>
                <td>unitkind_1_单位性质</td>
                <td>${ln008.unitkind_1_单位性质!''}</td>
            </tr>
            <tr>
                <td>unitaccnum_1_单位账号</td>
                <td>${ln008.unitaccnum_1_单位账号!''}</td>
            </tr>

            <tr>
                <td>accnum1账号</td>
                <td>${ln008.accnum1账号!''}</td>
            </tr>
            <tr>
                <td>basenum_0_缴存基数</td>
                <td>${ln008.basenum_0_缴存基数!''}</td>
            </tr>
            <tr>
                <td>totalprop_0_缴交总比例</td>
                <td>${ln008.totalprop_0_缴交总比例!''}</td>
            </tr>
            <tr>
                <td>indiacctype_1_个人账户类型</td>
                <td>${ln008.indiacctype_1_个人账户类型!''}</td>
            </tr>
            <tr>
                <td>bal_0_账户余额</td>
                <td>${ln008.bal_0_账户余额!''}</td>
            </tr>
            <tr>
                <td>indiaccstate_1_个人账户状态</td>
                <td>${ln008.indiaccstate_1_个人账户状态!''}</td>
            </tr>
            <tr>
                <td>linkmanphone_1_联系人电话</td>
                <td>${ln008.linkmanphone_1_联系人电话!''}</td>
            </tr>
            <tr>
                <td>linkman_1_联系人</td>
                <td>${ln008.linkman_1_联系人!''}</td>
            </tr>
            <tr>
                <td>linkmancertitype_1_联系人证件类型</td>
                <td>${ln008.linkmancertitype_1_联系人证件类型!''}</td>
            </tr>
            <tr>
                <td>linkmancertinum</td>
                <td>${ln008.linkmancertinum!''}</td>
            </tr>
            <tr>
                <td>lastdrawdate_1_上次提取日期</td>
                <td>${ln008.lastdrawdate_1_上次提取日期!''}</td>
            </tr>
            <tr>
                <td>transdate_0_交易日期</td>
                <td>${ln008.transdate_0_交易日期!''}</td>
            </tr>
            <tr>
                <td>transdate_0_交易日期</td>
                <td>${ln008.transdate_0_交易日期!''}</td>
            </tr>

            <#assign  ln003=ln003_tow.value1/>
            <tr>
                <td>loancontrcode合同代码</td>
                <td>${ln003.loancontrcode合同代码!''}</td>
            </tr>
            <tr>
                <td>loancontrnum_借款合同号</td>
                <td>${ln003.loancontrnum_借款合同号!''}</td>
            </tr>
            <tr>
                <td>loanaccnum_贷款账号</td>
                <td>${ln003.loanaccnum_贷款账号!''}</td>
            </tr>
            <tr>
                <td>loanconchgnum_合同变更序号</td>
                <td>${ln003.loanconchgnum_合同变更序号!''}</td>
            </tr>
            <tr>
                <td>seqnum_序号</td>
                <td>${ln003.seqnum_序号!''}</td>
            </tr>

            <tr>
                <td>loanuse_贷款用途</td>
                <td>${ln003.loanuse_贷款用途!''}</td>
            </tr>
            <tr>
                <td>guarmode_担保方式</td>
                <td>${ln003.guarmode_担保方式!''}</td>
            </tr>
            <tr>
                <td>apprnum_审批号</td>
                <td>${ln003.apprnum_审批号!''}</td>
            </tr>
            <tr>
                <td>apploanamt_贷款申请金额</td>
                <td>${ln003.apploanamt_贷款申请金额!''}</td>
            </tr>
            <tr>
                <td>apploanterm_贷款申请年限</td>
                <td>${ln003.apploanterm_贷款申请年限!''}</td>
            </tr>
            <tr>
                <td>lastloanbal_转公贷原贷款余额</td>
                <td>${ln003.lastloanbal_转公贷原贷款余额!''}</td>
            </tr>
            <tr>
                <td>loanpercent_贷款成数</td>
                <td>${ln003.loanpercent_贷款成数!''}</td>
            </tr>
            <tr>
                <td>loanamt_贷款金额</td>
                <td>${ln003.loanamt_贷款金额!''}</td>
            </tr>
            <tr>
                <td>loanterm_贷款期限</td>
                <td>${ln003.loanterm_贷款期限!''}</td>
            </tr>
            <tr>
                <td>remainterm_剩余期数</td>
                <td>${ln003.remainterm_剩余期数!''}</td>
            </tr>
            <tr>
                <td>loandate放款日期</td>
                <td>${ln003.loandate放款日期!''}</td>
            </tr>
            <tr>
                <td>loancontrstate_合同状态</td>
                <td>${ln003.loancontrstate_合同状态!''}</td>
            </tr>
            <tr>
                <td>instcode_机构代码</td>
                <td>${ln003.instcode_机构代码!''}</td>
            </tr>
            <tr>
                <td>clearstate不可为空结清标志</td>
                <td>${ln003.clearstate不可为空结清标志!''}</td>
            </tr>
            <tr>
                <td>owecnt欠还次数</td>
                <td>${ln003.owecnt欠还次数!''}</td>
            </tr>
            <tr>
                <td>tolowecnt_累计欠还次数</td>
                <td>${ln003.tolowecnt_累计欠还次数!''}</td>
            </tr>
            <tr>
                <td>suretynum_担保人数</td>
                <td>${ln003.suretynum_担保人数!''}</td>
            </tr>
            <tr>
                <td>loaneenum_借款人人数</td>
                <td>${ln003.loaneenum_借款人人数!''}</td>
            </tr>
            <tr>
                <td>agentbankcode_经办银行</td>
                <td>${ln003.agentbankcode_经办银行!''}</td>
            </tr>
            <tr>
                <td>othplacflag不可为空_异地标志</td>
                <td>${ln003.othplacflag不可为空_异地标志!''}</td>
            </tr>

            <tr>
                <td>enddate_到期日期</td>
                <td>${ln003.enddate_到期日期!''}</td>
            </tr>

            <tr>
                <td>cleardate_结清日期</td>
                <td>${ln003.cleardate_结清日期!''}</td>
            </tr>
            <tr>
                <td>repaymode_还款方式</td>
                <td>${ln003.repaymode_还款方式!''}</td>
            </tr>
            <tr>
                <td>repayday_还款日</td>
                <td>${ln003.repayday_还款日!''}</td>
            </tr>
            <tr>
                <td>loanstate不可为空贷款账户状态</td>
                <td>${ln003.loanstate不可为空贷款账户状态!''}</td>
            </tr>

            </tbody>
        </table>
    </#list>

    </div>

    <div class="well">
        <#list ln011ln003s as ln011ln003>
            <#assign  ln008=ln011ln003.value0/>

            <#assign  ln003=ln011ln003.value0/>
            <table class="table table-striped">
                <caption>担保贷款贷款信息</caption>
                <thead>
                <tr>
                    <th>名称</th>
                    <th>城市</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>loancontrcode不可为空合同代码</td>
                    <td>${ln008.loancontrcode不可为空合同代码!''}</td>
                </tr>

                <tr>
                    <td>seqnum_不可为空_序号</td>
                    <td>${ln008.seqnum_不可为空_序号!''}</td>
                </tr>
                <tr>
                    <td>chgnum_不可为空_变更序号</td>
                    <td>${ln008.chgnum_不可为空_变更序号!''}</td>
                </tr>

                <tr>
                    <td>changetype_不可为空_变更类型//_"1-增加保证人,
                        /*            2-减少保证人,
                        3-变更保证人,
                        4-变更保证人信息"*/</td>
                    <td>${ln008.changetype_不可为空_变更类型!''}</td>
                </tr>
                <tr>
                    <td>chgreasontype_不可为空_变更原因;//_"0-无,
                        /*            1-借款人变更,
                        2-担保公司倒闭,
                        9-其他"*/</td>
                    <td>${ln008.chgreasontype_不可为空_变更原因!''}</td>
                </tr>

                <tr>
                    <td>suretyshiptype_不可为空_保证担保类型//_"0-阶段性担保,
                        //   1-全程担保"</td>
                    <td>${ln008.suretyshiptype_不可为空_保证担保类型!''}</td>
                </tr>
                <tr>
                    <td>suretytype_不可为空_保证人类型//_"0-担保公司,
                        /*            1-开发商,
                        2-公积金缴存单位,
                        3-公积金缴存职工"*/</td>
                    <td>${ln008.suretytype_不可为空_保证人类型!''}</td>
                </tr>



                <tr>
                    <td>guarconstrnum_可为空_担保合同编号</td>
                    <td>${ln008.guarconstrnum_可为空_担保合同编号!''}</td>
                </tr>

                <tr>
                    <td>guarcorpcode_可为空_担保公司</td>
                    <td>${ln008.guarcorpcode_可为空_担保公司!''}</td>
                </tr>
                <tr>
                    <td>transacttype_可为空_办理类型//_"1-代理,
                        //     2-自行办理"</td>
                    <td>${ln008.transacttype_可为空_办理类型!''}</td>
                </tr>
                <tr>
                    <td>agentcomptype_可为空_代理公司类型;//_"1-委托银行,
                        /*            2-开发商,
                        3-担保公司,
                        4-保险公司,
                        5-评估公司,
                        6-组合银行,
                        7-阶段性担保公司,
                        8-代理公司"*/</td>
                    <td>${ln008.agentcomptype_可为空_代理公司类型!''}</td>
                </tr>
                <tr>
                    <td>agentcompcode_可为空_代理公司</td>
                    <td>${ln008.agentcompcode_可为空_代理公司!''}</td>
                </tr>
                <tr>
                    <td>suretyname_可为空_保证人姓名</td>
                    <td>${ln008.suretyname_可为空_保证人姓名!''}</td>
                </tr>
                <tr>
                    <td>certitype_可为空_证件类型//_"1-身份证,
                        // 2-军官证,
                        //    3-护照,
                        //    9-其他"</td>
                    <td>${ln008.certitype_可为空_证件类型!''}</td>
                </tr>
                <tr>
                    <td>certinum_可为空_证件号码</td>
                    <td>${ln008.certinum_可为空_证件号码!''}</td>
                </tr>
                <tr>
                    <td>sex_可为空_性别_"1-男,
                        //   2-女"</td>
                    <td>${ln008.sex_可为空_性别!''}</td>
                </tr>
                <tr>
                    <td>age_可为空_年龄</td>
                    <td>${ln008.age_可为空_年龄!''}</td>
                </tr>
                <tr>
                    <td>unitaccname_可为空_单位名称</td>
                    <td>${ln008.unitaccname_可为空_单位名称!''}</td>
                </tr>
                <tr>
                    <td>unitkind_可为空_单位性质</td>
                    <td>${ln008.unitkind_可为空_单位性质!''}</td>
                </tr>
                <tr>
                    <td>handset_可为空_手机</td>
                    <td>${ln008.handset_可为空_手机!''}</td>
                </tr>
                <tr>
                    <td>famlinkphone_可为空_宅电</td>
                    <td>${ln008.famlinkphone_可为空_宅电!''}</td>
                </tr>
                <tr>
                    <td>unitlinkphone_可为空_单位联系电话</td>
                    <td>${ln008.unitlinkphone_可为空_单位联系电话!''}</td>
                </tr>
                <tr>
                    <td>linkaddr_可为空_联系住址</td>
                    <td>${ln008.linkaddr_可为空_联系住址!''}</td>
                </tr>
                <tr>
                    <td>email_可为空_电子邮箱</td>
                    <td>${ln008.email_可为空_电子邮箱!''}</td>
                </tr>
                <tr>
                    <td>custid可为空个人客户号</td>
                    <td>${ln008.custid可为空个人客户号!''}</td>
                </tr>
                <tr>
                    <td>unitaccnum_可为空_单位账号</td>
                    <td>${ln008.unitaccnum_可为空_单位账号!''}</td>
                </tr>
                <tr>
                    <td>opnaccdate_可为空_开户日期</td>
                    <td>${ln008.opnaccdate_可为空_开户日期!''}</td>
                </tr>
                <tr>
                    <td>lpaym_可为空_缴至年月</td>
                    <td>${ln008.lpaym_可为空_缴至年月!''}</td>
                </tr>
                <tr>
                    <td>birthday_可为空_出生日期</td>
                    <td>${ln008.birthday_可为空_出生日期!''}</td>
                </tr>
                <tr>
                    <td>marstatus_可为空_婚姻情况</td>
                    <td>${ln008.marstatus_可为空_婚姻情况!''}</td>
                </tr>
                <tr>
                    <td>accnum可为空账号</td>
                    <td>${ln008.accnum可为空账号!''}</td>
                </tr>
                <tr>
                    <td>bal_可为空_账户余额</td>
                    <td>${ln008.bal_可为空_账户余额!''}</td>
                </tr>
                <tr>
                    <td>indiaccstate_可为空_个人账户状态</td>
                    <td>${ln008.indiaccstate_可为空_个人账户状态!''}</td>
                </tr>
                <tr>
                    <td>hostsernum_不可为空_主机流水号</td>
                    <td>${ln008.hostsernum_不可为空_主机流水号!''}</td>
                </tr>
                <tr>
                    <td>transdate_不可为空_交易日期</td>
                    <td>${ln008.transdate_不可为空_交易日期!''}</td>
                </tr>
                <tr>
                    <td>validflag_不可为空_有效标志</td>
                    <td>${ln008.validflag_不可为空_有效标志!''}</td>
                </tr>
                <tr>
                    <td>freeuse1_可为空_备用字符</td>
                    <td>${ln008.freeuse1_可为空_备用字符!''}</td>
                </tr>
                <tr>
                    <td>freeuse2_可为空_备用金额</td>
                    <td>${ln008.freeuse2_可为空_备用金额!''}</td>
                </tr>
                <tr>
                    <td>freeuse3_可为空_备用日期</td>
                    <td>${ln008.freeuse3_可为空_备用日期!''}</td>
                </tr>
                <tr>
                    <td>freeuse4_可为空_备用数值</td>
                    <td>${ln008.freeuse4_可为空_备用数值!''}</td>
                </tr>






                <#assign  ln003=ln003_tow.value1/>
                <tr>
                    <td>loancontrcode合同代码</td>
                    <td>${ln003.loancontrcode合同代码!''}</td>
                </tr>
                <tr>
                    <td>loancontrnum_借款合同号</td>
                    <td>${ln003.loancontrnum_借款合同号!''}</td>
                </tr>
                <tr>
                    <td>loanaccnum_贷款账号</td>
                    <td>${ln003.loanaccnum_贷款账号!''}</td>
                </tr>
                <tr>
                    <td>loanconchgnum_合同变更序号</td>
                    <td>${ln003.loanconchgnum_合同变更序号!''}</td>
                </tr>
                <tr>
                    <td>seqnum_序号</td>
                    <td>${ln003.seqnum_序号!''}</td>
                </tr>

                <tr>
                    <td>loanuse_贷款用途</td>
                    <td>${ln003.loanuse_贷款用途!''}</td>
                </tr>
                <tr>
                    <td>guarmode_担保方式</td>
                    <td>${ln003.guarmode_担保方式!''}</td>
                </tr>
                <tr>
                    <td>apprnum_审批号</td>
                    <td>${ln003.apprnum_审批号!''}</td>
                </tr>
                <tr>
                    <td>apploanamt_贷款申请金额</td>
                    <td>${ln003.apploanamt_贷款申请金额!''}</td>
                </tr>
                <tr>
                    <td>apploanterm_贷款申请年限</td>
                    <td>${ln003.apploanterm_贷款申请年限!''}</td>
                </tr>
                <tr>
                    <td>lastloanbal_转公贷原贷款余额</td>
                    <td>${ln003.lastloanbal_转公贷原贷款余额!''}</td>
                </tr>
                <tr>
                    <td>loanpercent_贷款成数</td>
                    <td>${ln003.loanpercent_贷款成数!''}</td>
                </tr>
                <tr>
                    <td>loanamt_贷款金额</td>
                    <td>${ln003.loanamt_贷款金额!''}</td>
                </tr>
                <tr>
                    <td>loanterm_贷款期限</td>
                    <td>${ln003.loanterm_贷款期限!''}</td>
                </tr>
                <tr>
                    <td>remainterm_剩余期数</td>
                    <td>${ln003.remainterm_剩余期数!''}</td>
                </tr>
                <tr>
                    <td>loandate放款日期</td>
                    <td>${ln003.loandate放款日期!''}</td>
                </tr>
                <tr>
                    <td>loancontrstate_合同状态</td>
                    <td>${ln003.loancontrstate_合同状态!''}</td>
                </tr>
                <tr>
                    <td>instcode_机构代码</td>
                    <td>${ln003.instcode_机构代码!''}</td>
                </tr>
                <tr>
                    <td>clearstate不可为空结清标志</td>
                    <td>${ln003.clearstate不可为空结清标志!''}</td>
                </tr>
                <tr>
                    <td>owecnt欠还次数</td>
                    <td>${ln003.owecnt欠还次数!''}</td>
                </tr>
                <tr>
                    <td>tolowecnt_累计欠还次数</td>
                    <td>${ln003.tolowecnt_累计欠还次数!''}</td>
                </tr>
                <tr>
                    <td>suretynum_担保人数</td>
                    <td>${ln003.suretynum_担保人数!''}</td>
                </tr>
                <tr>
                    <td>loaneenum_借款人人数</td>
                    <td>${ln003.loaneenum_借款人人数!''}</td>
                </tr>
                <tr>
                    <td>agentbankcode_经办银行</td>
                    <td>${ln003.agentbankcode_经办银行!''}</td>
                </tr>
                <tr>
                    <td>othplacflag不可为空_异地标志</td>
                    <td>${ln003.othplacflag不可为空_异地标志!''}</td>
                </tr>

                <tr>
                    <td>enddate_到期日期</td>
                    <td>${ln003.enddate_到期日期!''}</td>
                </tr>

                <tr>
                    <td>cleardate_结清日期</td>
                    <td>${ln003.cleardate_结清日期!''}</td>
                </tr>
                <tr>
                    <td>repaymode_还款方式</td>
                    <td>${ln003.repaymode_还款方式!''}</td>
                </tr>
                <tr>
                    <td>repayday_还款日</td>
                    <td>${ln003.repayday_还款日!''}</td>
                </tr>
                <tr>
                    <td>loanstate不可为空贷款账户状态</td>
                    <td>${ln003.loanstate不可为空贷款账户状态!''}</td>
                </tr>

                </tbody>
            </table>
        </#list>
    </div>

    <div role="tabpanel">
        <ul class="nav nav-tabs" role="tablist">


            <li role="presentation" class="active"><a href="#dp009_graphic缴存.cm002_个人基本资料表.custid_个人客户号}" aria-controls="coalDeals" role="tab"
                                                      data-toggle="tab">DP009_个人明细账</a></li>

        </ul>
        <div class="tab-content">
            <div role="tabpanel" class="tab-pane active" id="dp009_graphic缴存.cm002_个人基本资料表.custid_个人客户号}">
                <div class="row col-lg-12" style="">
                    <section class="">

                        <div class="table-responsive">

                            <div role="tabpanel" class="tab-pane" id="index">
                                <div class="row col-lg-12" style="padding-top: 10px";>
                                    <div id="bussiness_toolbar" class=" " >


                                        <a href="{bussinessUrl}" type="button" class="btn btn-primary"  >
                                            业务设置
                                        </a>
                                        <a href="{employeeUrl}" type="button" class="btn btn-primary" >员工管理</a>
                                        &lt;#&ndash;&ndash;&gt;


                                        <div class="btn-group">
                                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                其他 <span class="caret"></span>
                                            </button>
                                            <ul class="dropdown-menu">
                                                <li>
                                                    <a id="addBtn" href="#" type="button" class=""  data-toggle="modal" data-target="#terminateModal">
                                                        终止雇佣关系
                                                    </a>


                                                </li>
                                                <li><a href="#">Another action</a></li>
                                                <li><a href="#">Something else here</a></li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="#">Separated link</a></li>
                                            </ul>
                                        </div>
                                        <script type="text/javascript">


                                            $("#setPrimaryBtn").click(function() {
                                                var row =  $('#bussiness-table').bootstrapTable('getSelections');

                                                if (row != '') {
                                                    $('#setPrimaryModal').modal();

                                                    $('#bussinessId').val(row[0].id);

                                                }
                                            });




                                        </script>


                                    </div>


                                    <table class=" table-striped" id="bussiness-table" data-url="{url}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
                                           data-content-type="application/x-www-form-urlencoded; charset=UTF-8"
                                           data-query-params-type="unlimit"
                                           data-query-params="queryParams"
                                           data-response-handler="handleResponse"
                                           data-pagination="true"
                                           data-side-pagination="server"
                                           data-page-number="1"
                                           data-page-list="[10]"
                                           data-page-size="10"
                                           data-click-to-select="true"
                                           data-single-select="true"
                                           data-search="true"
                                           data-show-refresh="true"
                                           data-toolbar="#bussiness_toolbar">
                                        <thead>
                                        <tr>

                                            <th data-field="state" data-checkbox="true"></th>

                                            <th data-field="targetNo">风险点</th>
                                            <th data-field="managementNo">管理部</th>


                                            <th data-field="no">编号</th>
                                            <th data-field="stringValue">描述</th>



                                            <th data-field="status" >状态</th>
                                            <th data-field="description" >描述</th>

                                            <th data-field="createDate" >建立时间</th>
                                            <th data-field="modifyDate" >更新时间</th>


                                            <th data-field=""  data-formatter="operationFormatter">操作</th>

                                        </tr>
                                        </thead>
                                    </table>



                                </div>
                            </div>

                        </div>
                    </section>

                </div>
            </div>

        </div>

    </div>
</div>
<script type="text/javascript">

    function queryParams(params) {
        params.page = params.pageNumber - 1;
        params.size = params.pageSize;

        var sender = $.trim($("#search_param").val());

        if (sender) {
            params.q = sender;
        }

        var feature = $.trim($("#object-selectpicker").val());

        if (feature) {
            params.objectId = feature;
        }

        //  alert(JSON.stringify(sender))
        return params;
    }


    function handleResponse(original) {
        var res = {};
        res.rows = original.content;
        res.total = original.totalElements;
        // alert(JSON.stringify(original));
        return res;
    }

    function operationFormatter(value, row, index) {


        return   '<strong><a href="'+ row.url + '">操作</a></strong>';



    }




</script>
</body>
</html>
