

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


    <div class="col-lg-6">
        <div class="well">
            <table class="table">
                <caption>风险信息</caption>
                <thead>
                <tr>
                    <th>名称</th>
                    <th>城市</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>名称</td>
                    <td> ${itemAdd.name}</td>
                </tr>
                <tr>
                    <td>编号</td>
                    <td>  ${itemAdd.no}</td>
                </tr>
                <tr>

                    <td>描述</td>
                    <td> ${itemAdd.desc}</td>
                </tr>


                </tbody>
            </table>

        </div>

    </div>
    <div class=" col-lg-6">
        <div class="well">
    <table class="table">
        <caption>统计信息</caption>
        <thead>
        <tr>
            <th>名称</th>
            <th>数量</th>
        </tr>
        </thead>
        <tbody>
        <#list statistic as category >
            <tr>
                <td>${category.name!''}</td>
                <td>${category.count!''}</td>

            </tr>

        </#list>



        </tbody>
    </table>
        </div>
    </div>


    <div class="row">
        <div class="col-lg-12">
            <div role="tabpanel">
                <ul class="nav nav-tabs" role="tablist">


                    <li role="presentation" class="active"><a href="#dp009_graphic缴存.cm002_个人基本资料表.custid_个人客户号}" aria-controls="coalDeals" role="tab"
                                                              data-toggle="tab">明细数据</a></li>
                    <li role="presentation" class="active"><a href="#list" aria-controls="coalDeals" role="tab"
                                                              data-toggle="tab">详情链表</a></li>
                </ul>
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="dp009_graphic缴存.cm002_个人基本资料表.custid_个人客户号}">

                        <div class="row col-lg-12" style="padding-top: 10px";>

                            <div class="table-responsive">
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

                                <table class=" table-striped" id="bussiness-table" data-url="${url}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
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
                                        <th data-field="keyInfo">关键信息</th>

                                        <th data-field="stringValue">描述</th>



                                        <th data-field="status" >状态</th>
                                        <th data-field="issued" >下发状态</th>

                                        <th data-field="description" >描述</th>

                                        <th data-field="createDate" >建立时间</th>
                                        <th data-field="modifyDate" >更新时间</th>
                                        <th data-field="identifier">编号</th>


                                        <th data-field=""  data-formatter="operationFormatter">操作</th>

                                    </tr>
                                    </thead>
                                </table>

                            </div>



                        </div>

                    </div>
                    <div role="tabpanel" class="tab-pane active" id="list">

                        <div class="row col-lg-12" style="padding-top: 10px";>

                            <div class="table-responsive">
                                <div id="bussiness_toolbar" class=" " >


                                    <a href="{bussinessUrl}" type="button" class="btn btn-primary"  >
                                        业务设置
                                    </a>
                                    <a href="{employeeUrl}" type="button" class="btn btn-primary" >员工管理</a>
                                    &lt;#&ndash;&ndash;&gt;


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

                                <table class=" table-striped" id="bussiness-table" data-url="${url}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
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
                                        <th data-field="keyInfo">关键信息</th>

                                        <th data-field="stringValue">描述</th>



                                        <th data-field="status" >状态</th>
                                        <th data-field="issued" >下发状态</th>

                                        <th data-field="description" >描述</th>

                                        <th data-field="createDate" >建立时间</th>
                                        <th data-field="modifyDate" >更新时间</th>
                                        <th data-field="identifier">编号</th>


                                        <th data-field=""  data-formatter="operationFormatter">操作</th>

                                    </tr>
                                    </thead>
                                </table>

                            </div>



                        </div>

                    </div>

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
