

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>榆林住房公积金2020年离柜率提升项目调研分析</title>
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

            <span class="navbar-brand" ><b></b> 榆林住房公积金省监管平台接入  ${version}</span>

        </div>

        </nav>


    <div class="col-l">
    </div>
    <div class="well">
        <a href="${auditUrl}" class="btn-success btn-lg">稽核系统</a>


    </div>
    <div role="tabpanel">
        <ul class="nav nav-tabs" role="tablist">


            <li role="presentation" class="active"><a href="#indexes" aria-controls="coalDeals" role="tab"
                                       data-toggle="tab">统计指标编码</a></li>




            <li role="presentation" class=""><a href="#提取项目s" aria-controls="coalDeals" role="tab"
                                                      data-toggle="tab">提取项目s</a></li>


            <li role="presentation" class=""><a href="#贷款" aria-controls="coalDeals" role="tab"
                                                data-toggle="tab">贷款</a></li>

            <li role="presentation" class=""><a href="#归集" aria-controls="coalDeals" role="tab"
                                                data-toggle="tab">归集</a></li>




            <li role="presentation"><a href="#idea" aria-controls="idea" role="tab"
                                       data-toggle="tab">设计思路</a></li>
            <li role="presentation" ><a href="#index" aria-controls="coalDeals" role="tab"
                                        data-toggle="tab">统计指标编码</a></li>

        </ul>
        <div class="tab-content">

            <div role="tabpanel" class="tab-pane active" id="indexes">
                <div class="row col-lg-12" style="">
                    <section class="">
                        <table class="table table-striped">
                            <caption>基本的表格布局</caption>
                            <thead>
                            <tr>
                                <th>名称</th>

                                <th>是否完成</th>
                                <th>编号</th>
                                <th>建立日志</th>
                                <th>更新日志</th>
                                <th>城市</th>
                            </tr>
                            </thead>
                            <tbody>

                            <#list statisticalIndexCodeEnums as category >
                                <tr>
                                    <td>${category.数据类}</td>


                                    <td>${category.相关信息管理部门}</td>
                                    <td>${category.证照名称__数据项!''}</td>
                                    <td>${category.数据信息明细_数据字段!''}</td>
                                    <td>${category.用途!''}</td>
                                    <td><a href="${category.url!''}">json返回</a></td>
                                </tr>

                            </#list>

                            </tbody>
                        </table>

                    </section>

                </div>
            </div>
            <div role="tabpanel" class="tab-pane" id="提取项目s">
                <div class="row col-lg-12" style="">
                    <section class="">
                        <table class="table table-striped">
                            <caption>基本的表格布局</caption>
                            <thead>
                            <tr>
                                <th>名称</th>

                                <th>是否完成</th>

                                <th>城市</th>
                            </tr>
                            </thead>
                            <tbody>

                            <#list 提取项目s as category >
                                <tr>
                                    <td>${category.名称!''}</td>




                                    <td>
                                        <#list category.elements as element >
                                        ${element.名称!''}
                                            <br>
                                        </#list>
                                    </td>


                                    <td><a href="${category.url!''}">json返回</a></td>
                                </tr>

                            </#list>

                            </tbody>
                        </table>

                    </section>

                </div>
            </div>



            <div role="tabpanel" class="tab-pane" id="idea">
                <div class="row col-lg-12" style="padding-top: 10px;">


                    <section class="">
                        <table  class="table table-striped table-bordered">
                            <thead>
                            <tr>
                                <th>名称</th>
                                <th>内容</th>

                            </tr>
                            </thead>
                            <tbody>

                                <tr>
                                    <td>设计思路</td>
                                    <td>
                                        根据状态表（table)和流水表(stream)推导出任意时刻的状态,进而进行当时的信息统计
                                    </td>

                                </tr>
                                <tr>
                                    <td>设计的库表</td>
                                    <td>


                                        <#list ideas as api >
                                            <table class="table">
<#--
                                                <caption>根据状态表（table)和流水表(stream)推导出任意时刻的状态,进而进行当时的信息统计</caption>
-->
                                                <thead>
                                                <tr>
                                                    <th>服务编号</th>
                                                    <th>服务名称</th>

                                                </tr>
                                                </thead>
                                                <tbody>
                                                <#assign  keys=api?keys/>
                                                <#list  keys as key>
                                                    <tr>
                                                        <td>流水表:${key}</td>

                                                        <td>

                                                            <table class="table">
                                                                <thead>
                                                                <tr>
                                                                    <th>表名称</th>
                                                                    <th></th>

                                                                </tr>
                                                                </thead>
                                                                <tbody>
                                                                <#list  api[key] as flow>
                                                                    <tr>


                                                                        <td>${flow}</td>

                                                                        <td>
                                                                        </td>

                                                                    </tr>
                                                                </#list>
                                                                </tbody>
                                                            </table>


                                                        </td>

                                                    </tr>

                                                </#list>


                                                </tbody>
                                            </table>
                                        </#list>

                                    </td>

                                </tr>
                                <tr>
                                    <td>设计思路</td>
                                    <td>

<#--                                        <#list metadatas as metadata >


                                            ${metadata.table_name}
                                            ${metadata.columnName}

                                        </#list>-->

                                    </td>

                                </tr>

                            </tbody>
                        </table>





                    </section>

                </div>
            </div>
            <div role="tabpanel" class="tab-pane" id="贷款">
                <div class="row col-lg-12" style="">
                    <section class="">

                        <a href="${loan_detailUrl}">贷款详情</a>
                        ${贷款条件}

                        <hr>
                        ${申请人应提供以下资料}

                        <table class="table table-striped">
                            <caption>基本的表格布局</caption>
                            <thead>
                            <tr>
                                <th>名称</th>

                                <th>是否完成</th>

                                <th>城市</th>
                            </tr>
                            </thead>
                            <tbody>

                            <#list 提取项目s as category >
                                <tr>
                                    <td>${category.名称!''}</td>




                                    <td>
                                        <#list category.elements as element >
                                            ${element.名称!''}
                                            <br>
                                        </#list>
                                    </td>


                                    <td><a href="${category.url!''}">json返回</a></td>
                                </tr>

                            </#list>

                            </tbody>
                        </table>

                    </section>

                </div>
            </div>


<#--
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


                    <table class=" table-striped" id="bussiness-table" data-url="${analysisUrl}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
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

                            <th data-field="targetNo">编号</th>
                            <th data-field="name">名称</th>
                            <th data-field="period">周期</th>



                            <th data-field="status" >状态</th>
                            <th data-field="description" >描述</th>
                            <th data-field="analysedBeginDate" >已分析开始时间</th>
                            <th data-field="analysedEndDate" >已分析结束时间</th>


                            <th data-field="" >存量or增量</th>
                            <th data-field="createDate" >建立时间</th>
                            <th data-field="updateTime" >更新时间</th>


                            <th data-field=""  data-formatter="operationFormatter">操作</th>

                        </tr>
                        </thead>
                    </table>



                </div>
            </div>-->



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
