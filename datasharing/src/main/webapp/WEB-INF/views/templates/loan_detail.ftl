

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>榆林住房公积金2020年离柜率提升项目需求分析</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <link href="${rc.contextPath}/components/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${rc.contextPath}/components/bootstrap-select/css/bootstrap-select.min.css" rel="stylesheet">

    <link href="${rc.contextPath}/components/bootstrap_table/bootstrap-table.min.css" rel="stylesheet">


    <script src="${rc.contextPath}/js/jquery/jquery.js" type="text/javascript"></script>
    <script src="${rc.contextPath}/components/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>

    <script type="text/javascript" src="${rc.contextPath}/components/bootstrap_table/bootstrap-table.min.js"></script>
    <script type="text/javascript" src="${rc.contextPath}/components/bootstrap_table/bootstrap-table-zh-CN.min.js"></script>
    <script type="text/javascript" src="${rc.contextPath}/components/bootstrap-select/js/bootstrap-select.min.js"></script>
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
<div class="container" style="margin-bottom:60px; margin-top:20px">


    <nav class="navbar navbar-default" role="navigation">

        <div class="navbar-header">
            <button type="button " class="navbar-toggle btn-primary" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

            <span class="navbar-brand" ><b></b> 榆林住房公积金省监管平台接入  </span>

        </div>
        </nav>

        <div role="tabpanel">
            <ul class="nav nav-tabs" role="tablist">


                <#list graphic缴存s as graphic缴存>

                <li role="presentation" class=""><a href="#_${graphic缴存.cm002_个人基本资料表.custid_个人客户号}" aria-controls="coalDeals" role="tab"
                                                          data-toggle="tab">${graphic缴存.cm002_个人基本资料表.custid_个人客户号}</a></li>
                </#list>


            </ul>
            <div class="tab-content" style="padding:20px">
                <#list graphic缴存s as graphic缴存>
                <div role="tabpanel" class="tab-pane " id="_${graphic缴存.cm002_个人基本资料表.custid_个人客户号}">
                    <div class="row col-lg-12" style="">
                        <section class="">
                            <div class="well">
                                <#if graphic缴存??>
                                    <span class="" ><b>accnum个人账号</b>  ${graphic缴存.dp006_个人缴存信息表.accnum个人账号}</span>

                                    <table class="table">
                                        <caption>基本的表格布局</caption>
                                        <thead>
                                        <tr>
                                            <th>名称</th>
                                            <th>城市</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>accnum个人账号</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.accnum个人账号}</td>
                                        </tr>
                                        <tr>
                                            <td>custid个人客户号</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.custid个人客户号}</td>
                                        </tr>
                                        <tr>



                                            <td>attworkdate_参加工作时间</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.attworkdate_参加工作时间}</td>
                                        </tr>
                                        <tr>
                                            <td>lpaym_缴至年月</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.lpaym_缴至年月}</td>
                                        </tr>
                                        <tr>
                                            <td>begpayym</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.begpayym}</td>
                                        </tr>
                                        <tr>
                                            <td>basenum_缴存基数</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.basenum_缴存基数}</td>
                                        </tr>







                                        <tr>
                                            <td>fundsouflag_资金来源标志</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.fundsouflag_资金来源标志}</td>
                                        </tr>
                                        <tr>
                                            <td>unitprop_单位比例</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.unitprop_单位比例}</td>
                                        </tr>
                                        <tr>
                                            <td>unitastprop_单位辅助比例</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.unitastprop_单位辅助比例}</td>
                                        </tr>
                                        <tr>
                                            <td>indiprop_个人缴存比例</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.indiprop_个人缴存比例}</td>
                                        </tr>
                                        <tr>
                                            <td>unitpayamt_单位月汇缴金额</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.unitpayamt_单位月汇缴金额}</td>
                                        </tr>
                                        <tr>
                                            <td>indipayamt_个人月汇缴金额</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.indipayamt_个人月汇缴金额}</td>
                                        </tr>
                                        <tr>
                                            <td>unitapayamt</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.unitapayamt}</td>
                                        </tr>


                                        <tr>
                                            <td>indipaysum</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.indipaysum}</td>
                                        </tr>
                                        <tr>
                                            <td>indipaymap</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.indipaymap}</td>
                                        </tr>
                                        <tr>
                                            <td>indibpaymap</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.indibpaymap}</td>
                                        </tr>
                                        <tr>
                                            <td>byearbal</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.byearbal}</td>
                                        </tr>

                                        <tr>
                                            <td>ydrawamt_年提取额</td>
                                            <td> ${graphic缴存.dp006_个人缴存信息表.ydrawamt_年提取额}</td>
                                        </tr>

                                        </tbody>
                                    </table>

                                    <table class="table">
                                        <caption>基本的表格布局</caption>
                                        <thead>
                                        <tr>
                                            <th>名称</th>
                                            <th>城市</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>accnum个人账号</td>
                                            <td> ${graphic缴存.dp007_个人分户账.accnum个人账号!''}</td>
                                        </tr>
                                        <tr>
                                            <td>custid个人客户号</td>
                                            <td> ${graphic缴存.dp007_个人分户账.unitaccnum_单位账号}</td>
                                        </tr>
                                        <tr>



                                            <td>custid_个人客户号</td>
                                            <td> ${graphic缴存.dp007_个人分户账.custid_个人客户号}</td>
                                        </tr>
                                        <tr>
                                            <td>accname_姓名</td>
                                            <td> ${graphic缴存.dp007_个人分户账.accname_姓名}</td>
                                        </tr>
                                        <tr>
                                            <td>certitype_证件类型</td>
                                            <td> ${graphic缴存.dp007_个人分户账.certitype_证件类型}</td>
                                        </tr>
                                        <tr>
                                            <td>certinum_证件号码</td>
                                            <td> ${graphic缴存.dp007_个人分户账.certinum_证件号码}</td>
                                        </tr>

                                        <tr>
                                            <td>indiacctype_个人账户类型</td>
                                            <td> ${graphic缴存.dp007_个人分户账.indiacctype_个人账户类型}</td>
                                        </tr>
                                        <tr>
                                            <td>indiaccstate_个人账户状态</td>
                                            <td> ${graphic缴存.dp007_个人分户账.indiaccstate_个人账户状态}</td>
                                        </tr>



                                        <tr>
                                            <td>frzflag_冻结标志</td>
                                            <td> ${graphic缴存.dp007_个人分户账.frzflag_冻结标志}</td>
                                        </tr>
                                        <tr>
                                            <td>opnaccdate开户日期</td>
                                            <td> ${graphic缴存.dp007_个人分户账.opnaccdate开户日期}</td>
                                        </tr>
                                        <tr>
                                            <td>clsaccdate销户日期</td>
                                            <td> ${graphic缴存.dp007_个人分户账.clsaccdate销户日期}</td>
                                        </tr>
                                        <tr>
                                            <td>lasttransdate_上笔发生日期</td>
                                            <td> ${graphic缴存.dp007_个人分户账.lasttransdate_上笔发生日期}</td>
                                        </tr>
                                        <tr>
                                            <td>lastdrawdate_上笔提取日期</td>
                                            <td> ${graphic缴存.dp007_个人分户账.lastdrawdate_上笔提取日期}</td>
                                        </tr>


                                        <tr>
                                            <td>begintdate_起息日期</td>
                                            <td> ${graphic缴存.dp007_个人分户账.begintdate_起息日期}</td>
                                        </tr>
                                        <tr>
                                            <td>trustdate_托管日期</td>
                                            <td> ${graphic缴存.dp007_个人分户账.trustdate_托管日期}</td>
                                        </tr>
                                        <tr>
                                            <td>lastbal_上日余额</td>
                                            <td> ${graphic缴存.dp007_个人分户账.lastbal_上日余额}</td>
                                        </tr>
                                        <tr>
                                            <td>frzamt</td>
                                            <td> ${graphic缴存.dp007_个人分户账.frzamt}</td>
                                        </tr>

                                        <tr>
                                            <td>stpayamt</td>
                                            <td> ${graphic缴存.dp007_个人分户账.stpayamt}</td>
                                        </tr>
                                        <tr>
                                            <td>keepbal</td>
                                            <td> ${graphic缴存.dp007_个人分户账.keepbal}</td>
                                        </tr>
                                        <tr>
                                            <td>bal_余额</td>
                                            <td> ${graphic缴存.dp007_个人分户账.bal_余额}</td>
                                        </tr>
                                        <tr>
                                            <td>accinstcode</td>
                                            <td> ${graphic缴存.dp007_个人分户账.accinstcode}</td>
                                        </tr>


                                        </tbody>
                                    </table>



                                    <table class="table">
                                        <caption>cm002_个人基本资料表</caption>
                                        <thead>
                                        <tr>
                                            <th>名称</th>
                                            <th>城市</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>custid_个人客户号</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.custid_个人客户号!''}</td>
                                        </tr>
                                        <tr>
                                            <td>accname_个人姓名</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.accname_个人姓名!''}</td>
                                        </tr>
                                        <tr>



                                            <td>sex_性别</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.sex_性别!''}</td>
                                        </tr>

                                        <tr>
                                            <td>inmspell_个人姓名全拼</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.inmspell_个人姓名全拼!''}</td>
                                        </tr>
                                        <tr>
                                            <td>zip</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.zip!''}</td>
                                        </tr>

                                        <tr>
                                            <td>marstatus_婚姻状况</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.marstatus_婚姻状况!''}</td>
                                        </tr>
                                        <tr>
                                            <td>famaddr_家庭住址</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.famaddr_家庭住址!''}</td>
                                        </tr>



                                        <tr>
                                            <td>birthday_出生日期</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.birthday_出生日期!''}</td>
                                        </tr>
                                        <tr>
                                            <td>certinum</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.certinum!''}</td>
                                        </tr>
                                        <tr>
                                            <td>agentinstcode_经办机构</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.agentinstcode_经办机构!''}</td>
                                        </tr>
                                        <tr>
                                            <td>opnaccdate_开户日期</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.opnaccdate_开户日期!''}</td>
                                        </tr>
                                        <tr>
                                            <td>validflag</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.validflag!''}</td>
                                        </tr>


                                        <tr>
                                            <td>handset_手机</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.handset_手机!''}</td>
                                        </tr>
                                        <tr>
                                            <td>phone_电话</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.phone_电话!''}</td>
                                        </tr>
                                        <tr>
                                            <td>email</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.email!''}</td>
                                        </tr>
                                        <tr>
                                            <td>attworkdate</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.attworkdate!''}</td>
                                        </tr>

                                        <tr>
                                            <td>unitaccname</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.unitaccname!''}</td>
                                        </tr>
                                        <tr>
                                            <td>belongtodept</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.belongtodept!''}</td>
                                        </tr>
                                        <tr>
                                            <td>workid</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.workid!''}</td>
                                        </tr>
                                        <tr>
                                            <td>qq</td>
                                            <td> ${graphic缴存.cm002_个人基本资料表.qq!''}</td>
                                        </tr>


                                        </tbody>
                                    </table>

                                    <div role="tabpanel">
                                        <ul class="nav nav-tabs" role="tablist">


                                            <li role="presentation" class="active"><a href="#dp009_${graphic缴存.cm002_个人基本资料表.custid_个人客户号}" aria-controls="coalDeals" role="tab"
                                                                                      data-toggle="tab">DP009_个人明细账</a></li>
                                            <li role="presentation" class=""><a href="#dp204_${graphic缴存.cm002_个人基本资料表.custid_个人客户号}" aria-controls="coalDeals" role="tab"
                                                                                data-toggle="tab">Dp204_个人缴存变更登记簿</a></li>
                                            <li role="presentation" class=""><a href="#dp022_${graphic缴存.cm002_个人基本资料表.custid_个人客户号}" aria-controls="coalDeals" role="tab"
                                                                                data-toggle="tab">dp022_个人缴存登记簿</a></li>
                                            <li role="presentation" class=""><a href="#dp093_${graphic缴存.cm002_个人基本资料表.custid_个人客户号}" aria-controls="coalDeals" role="tab"
                                                                                data-toggle="tab">Dp093_冻结解冻登记簿</a></li>
                                            <li role="presentation" class=""><a href="#dp034_${graphic缴存.cm002_个人基本资料表.custid_个人客户号}" aria-controls="coalDeals" role="tab"
                                                                                data-toggle="tab">Dp034_公积金开销户登记簿</a></li>
                                        </ul>
                                        <div class="tab-content">
                                            <div role="tabpanel" class="tab-pane active" id="dp009_${graphic缴存.cm002_个人基本资料表.custid_个人客户号}">
                                                <div class="row col-lg-12" style="">
                                                    <section class="">

                                                        <div class="table-responsive">
                                                            <table class="table table-striped table-bordered">
                                                                <caption>cm002_个人基本资料表</caption>
                                                                <thead>
                                                                <tr>
                                                                    <th>seqno_不可为空_序号</th>
                                                                    <th>transdate不可为空交易日期</th>

                                                                    <th>accnum不可为空个人账号</th>
                                                                    <th>unitaccnum_不可为空_单位账号</th>
                                                                    <th>mergoaccnum_可为空_并出个人账号</th>
                                                                    <th>custid_不可为空_个人客户号</th>
                                                                    <th>accname_不可为空_姓名</th>
                                                                    <th>subcode_可为空_科目控制字</th>
                                                                    <th>entrytranscode_可为空_分录交易码</th>
                                                                    <th>begym_可为空_开始年月</th>
                                                                    <th>endym_可为空_截止年月</th>
                                                                    <th>//_1-借,2-贷_0:; dcflag_不可为空_借贷标志</th>
                                                                    <th>amt_不可为空_发生额</th>
                                                                    <th>keepamt_可为空_存量发生额</th>
                                                                    <th>increamt_可为空_增量发生额</th>
                                                                    <th>basenum_不可为空_缴存基数</th>
                                                                    <th>unitprop_不可为空_单位比例</th>
                                                                    <th>unitastprop_单位辅助比例</th>
                                                                    <th>indiprop_不可为空_个人缴存比例</th>

                                                                    <th>bal_不可为空_余额</th>
                                                                    <th>summarycode_不可为空_摘要代码</th>

                                                                    <th>//提取原因、缴存类型等_1//remark_可为空_备注</th>
                                                                    <th>transtype_同dp008不可为空_交易类型</th>


                                                                    <th>vounum_可为空_业务凭证号</th>
                                                                    <th>timestamp_不可为空_时间戳</th>



                                                                    <th>hostsernum_不可为空_主机流水号</th>
                                                                    <th>corrdate_不可为空_冲正日期</th>
                                                                    <th>corrsernum_不可为空_冲正流水号</th>
                                                                    <th>allexchgflag_不可为空_通兑标志</th>
                                                                    <th>transchannel_不可为空_交易渠道</th>
                                                                    <th>agentinstcode_不可为空_经办机构</th>


                                                                    <th>accinstcode_不可为空_账户机构</th>
                                                                    <th>agentbankcode_不可为空_经办银行</th>
                                                                    <th>agentbankcode_不可为空_经办银行</th>
                                                                    <th>agentop_不可为空_经办柜员</th>
                                                                    <th>seqno_不可为空_序号</th>
                                                                    <th>agentinstcode_不可为空_经办机构</th>

                                                                </tr>
                                                                </thead>
                                                                <tbody>

                                                                <#list graphic缴存.dp009_个人明细账s as element>

                                                                    <tr>



                                                                        <td> ${element.seqno_不可为空_序号!''}</td>






                                                                        <td> ${element.transdate不可为空交易日期!''}</td>
                                                                        <td> ${element.accnum不可为空个人账号!''}</td>
                                                                        <td> ${element.unitaccnum_不可为空_单位账号!''}</td>
                                                                        <td> ${element.mergoaccnum_可为空_并出个人账号!''}</td>

                                                                        <td> ${element.custid_不可为空_个人客户号!''}</td>
                                                                        <td> ${element.accname_不可为空_姓名!''}</td>


                                                                        <td> ${element.subcode_可为空_科目控制字!''}</td>
                                                                        <td> ${element.entrytranscode_可为空_分录交易码!''}</td>
                                                                        <td> ${element.begym_可为空_开始年月!''}</td>
                                                                        <td> ${element.endym_可为空_截止年月!''}</td>

                                                                        <td>//_1-借,2-贷_0:; ${element.dcflag_不可为空_借贷标志!''}</td>
                                                                        <td> ${element.amt_不可为空_发生额!''}</td>



                                                                        <td> ${element.keepamt_可为空_存量发生额!''}</td>
                                                                        <td> ${element.increamt_可为空_增量发生额!''}</td>



                                                                        <td> ${element.basenum_不可为空_缴存基数!''}</td>
                                                                        <td> ${element.unitprop_不可为空_单位比例!''}</td>
                                                                        <td> ${element.unitastprop_单位辅助比例!''}</td>
                                                                        <td> ${element.indiprop_不可为空_个人缴存比例!''}</td>
                                                                        <td> ${element.bal_不可为空_余额!''}</td>
                                                                        <td> ${element.summarycode_不可为空_摘要代码!''}</td>

                                                                        <td> //提取原因、缴存类型等_1: ${element.remark_可为空_备注!''}</td>
                                                                        <td> ${element.transtype_同dp008不可为空_交易类型!''}</td>
                                                                        <td> ${element.vounum_可为空_业务凭证号!''}</td>
                                                                        <td> ${element.timestamp_不可为空_时间戳!''}</td>


                                                                        <td> ${element.hostsernum_不可为空_主机流水号!''}</td>
                                                                        <td> ${element.corrdate_不可为空_冲正日期!''}</td>

                                                                        <td> //0-通兑,1-非通兑_0: ${element.corrsernum_不可为空_冲正流水号!''}</td>
                                                                        <td> ${element.corrsernum_不可为空_冲正流水号!''}</td>


                                                                        <td> //0-通兑,1-非通兑_0: ${element.allexchgflag_不可为空_通兑标志!''}</td>
                                                                        <td> ${element.transchannel_不可为空_交易渠道!''}</td>

                                                                        <td>${element.agentinstcode_不可为空_经办机构!''}</td>
                                                                        <td> ${element.accinstcode_不可为空_账户机构!''}</td>


                                                                        <td>${element.agentbankcode_不可为空_经办银行!''}</td>
                                                                        <td> ${element.agentbankcode_不可为空_经办银行!''}</td>

                                                                        <td>${element.agentop_不可为空_经办柜员!''}</td>
                                                                        <td> ${element.accbankcode_不可为空_账户银行!''}</td>
                                                                    </tr>




                                                                </#list>



                                                                </tbody>
                                                            </table>

                                                        </div>
                                                    </section>

                                                </div>
                                            </div>
                                            <div role="tabpanel" class="tab-pane active" id="dp204_${graphic缴存.cm002_个人基本资料表.custid_个人客户号}">
                                                <div class="row col-lg-12" style="">
                                                    <section class="">

                                                        <div class="table-responsive">
                                                            <#if  graphic缴存.dp034_公积金开销户登记簿Map[0]??>
                                                                <table class="table table-striped table-bordered">
                                                                    <caption>dp034_公积金开销户登记簿</caption>
                                                                    <thead>
                                                                    <tr>

                                                                        <#assign item = graphic缴存.dp034_公积金开销户登记簿Map[0]>
                                                                        <#list item?keys as itemKey>
                                                                            <th> ${itemKey}</th>
                                                                        </#list>



                                                                    </tr>
                                                                    </thead>
                                                                    <tbody>

                                                                    <#list graphic缴存.dp034_公积金开销户登记簿Map as element>

                                                                        <tr>
                                                                            <#list element?keys as itemKey>
                                                                                <td> ${element[itemKey]}</td>
                                                                            </#list>


                                                                        </tr>




                                                                    </#list>



                                                                    </tbody>
                                                                </table>
                                                            </#if>
                                                        </div>
                                                    </section>

                                                </div>
                                            </div>
                                            <div role="tabpanel" class="tab-pane active" id="dp022_${graphic缴存.cm002_个人基本资料表.custid_个人客户号}">
                                                <div class="row col-lg-12" style="">
                                                    <section class="">

                                                        <div class="table-responsive">
                                                            <table class="table table-striped table-bordered">
                                                                <caption>dp022_个人缴存登记簿s</caption>
                                                                <thead>
                                                                <tr>
                                                                    <#assign item = graphic缴存.dp022_个人缴存登记簿Map[0]>
                                                                    <#list item?keys as itemKey>
                                                                        <th> ${itemKey}</th>
                                                                    </#list>

                                                                    <#--                                    <#list graphic缴存.dp022_个人缴存登记簿Map?keys as itemKey>
                                                                                                        <th>${graphic缴存.dp022_个人缴存登记簿Map[itemKey]}</th>

                                                                                                        </#list>-->

                                                                </tr>
                                                                </thead>
                                                                <tbody>

                                                                <#list graphic缴存.dp022_个人缴存登记簿Map as element>

                                                                    <tr>
                                                                        <#list element?keys as itemKey>
                                                                            <td> ${element[itemKey]}</td>
                                                                        </#list>
                                                                        <#--     <#assign key_list = element?keys/>
                                                                             <#assign value_list = element?values/>
                                                                             <#list key_list as key>

                                                                                 <#assign seq_index = key_list?seq_index_of(key) />
                                                                                 <#assign key_value = value_list[seq_index]/>

                                                                                 //Use the ${key} ${key_value}

                                                                             </#list>-->


                                                                        <#--      <#list element?keys as key>
                                                                                <td> ${key}: ${element[key]}</td>
                                                      &lt;#&ndash;                            <#list element.get(key).keySet()  as t>
                                                                                      ${element.get(key).get(t)}
                                                                                  </#list>&ndash;&gt;
                                                                              </#list>-->



                                                                    </tr>



                                                                </#list>



                                                                </tbody>
                                                            </table>

                                                        </div>
                                                    </section>

                                                </div>
                                            </div>
                                            <div role="tabpanel" class="tab-pane active" id="dp093_${graphic缴存.cm002_个人基本资料表.custid_个人客户号}">
                                                <div class="row col-lg-12" style="">
                                                    <section class="">

                                                        <div class="table-responsive">
                                                            <table class="table table-striped table-bordered">
                                                                <caption>dp022_个人缴存登记簿s</caption>
                                                                <thead>
                                                                <tr>
                                                                    <#assign item = graphic缴存.dp022_个人缴存登记簿Map[0]>
                                                                    <#list item?keys as itemKey>
                                                                        <th> ${itemKey}</th>
                                                                    </#list>

                                                                    <#--                                    <#list graphic缴存.dp022_个人缴存登记簿Map?keys as itemKey>
                                                                                                        <th>${graphic缴存.dp022_个人缴存登记簿Map[itemKey]}</th>

                                                                                                        </#list>-->

                                                                </tr>
                                                                </thead>
                                                                <tbody>

                                                                <#list graphic缴存.dp022_个人缴存登记簿Map as element>

                                                                    <tr>
                                                                        <#list element?keys as itemKey>
                                                                            <td> ${element[itemKey]}</td>
                                                                        </#list>


                                                                    </tr>



                                                                </#list>



                                                                </tbody>
                                                            </table>

                                                        </div>
                                                    </section>

                                                </div>
                                            </div>
                                            <div role="tabpanel" class="tab-pane active" id="dp034_${graphic缴存.cm002_个人基本资料表.custid_个人客户号}">
                                                <div class="row col-lg-12" style="">
                                                    <section class="">

                                                        <div class="table-responsive">
                                                            <table class="table table-striped table-bordered">
                                                                <caption>dp022_个人缴存登记簿s</caption>
                                                                <thead>
                                                                <tr>
                                                                    <#assign item = graphic缴存.dp022_个人缴存登记簿Map[0]>
                                                                    <#list item?keys as itemKey>
                                                                        <th> ${itemKey}</th>
                                                                    </#list>

                                                                    <#--                                    <#list graphic缴存.dp022_个人缴存登记簿Map?keys as itemKey>
                                                                                                        <th>${graphic缴存.dp022_个人缴存登记簿Map[itemKey]}</th>

                                                                                                        </#list>-->

                                                                </tr>
                                                                </thead>
                                                                <tbody>

                                                                <#list graphic缴存.dp022_个人缴存登记簿Map as element>

                                                                    <tr>
                                                                        <#list element?keys as itemKey>
                                                                            <td> ${element[itemKey]}}</td>
                                                                        </#list>


                                                                    </tr>



                                                                </#list>



                                                                </tbody>
                                                            </table>

                                                        </div>
                                                    </section>

                                                </div>
                                            </div>
                                        </div>

                                    </div>



                                <#else>
                                    <span class="" ><b></b> 查不到给人的信息啊啊啊。</span>


                                </#if>
                            </div>
                        </section>

                    </div>
                </div>

                </#list>


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
