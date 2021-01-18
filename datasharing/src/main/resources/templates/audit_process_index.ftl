

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

    <#include "fragments/navbar.ftl">


    <div class=" col-lg-6">
        <div class="well">
            <table class="table">
                <caption>统计信息</caption>
                <thead>
                <tr>
                    <th></th>
                    <th></th>
                </tr>
                </thead>
                <tbody>

                                    <tr>
                                        <td>姓名</td>
                                        <td>${authUser.name!''}</td>

                                    </tr>

                                    <tr>
                                        <td>科室</td>
                                        <td>${authUser.departmentName!''}</td>
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
<#--
                <#list statistic as category >
                    <tr>
                        <td>${category.name!''}</td>
                        <td>${category.count!''}</td>

                    </tr>

                </#list>
-->



                </tbody>
            </table>
        </div>
    </div>

    <#include "fragments/index_rate.ftl">

    <#include "fragments/jshighchart.ftl">

    <#include "fragments/chart_pie_InssuredAndAccepted.ftl">
    <div class="row">

        <button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#createEmployeeModal">开始稽核</button>

        <button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#issuedModal">下发</button>
        <div class="fade modal" id="issuedModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h2 class="modal-title" id="myModalLabel">下发</h2>
                    </div>
                    <div class="modal-body">

                        <form id="userForm" class="form-horizontal" role="form" action="{addCompanyUserUrl}"
                              method="post">
                            <input type="hidden" name="{_csrf.parameterName}" value="{_csrf.token}"/>

                            <div class="form-group">
                                <label for="userName" class="col-lg-3 control-label">备注</label>

                                <div class="col-lg-6">
                                    <input type="text" class="form-control" id="note" name="note">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-lg-3 control-label" for="prependedtext">角色</label>
                                <div class="col-lg-6">
                                    <select id="" class="selectpicker" name="userType" data-style="btn-primary">
                                    </select>
                                </div>

                            </div>


                            <div class="form-group">
                                <label class="col-lg-3 control-label" for="prependedtext"></label>
                                <div class="col-lg-6">                                         <div class="checkbox">
                                        <label>
                                            <input type="checkbox" name="createInvitedCode" value="createInvitedCode">建立邀请码
                                        </label>
                                    </div>
                                </div>

                            </div>




                        </form>


                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button id="issuedModalBtn" ref="${issuedUrl}" type="button" class="btn btn-primary" data-dismiss="modal">确认</button>

                        <script type="text/javascript">

                            $("#issuedModalBtn").click(function () {
                                alert("dddd"+JSON.stringify($('#userForm').serialize()));
                                var req = $.ajax({

                                    url: $(this).attr('ref'),
                                    type: 'post',
                                    data: $('#userForm').serialize(),
                                    type: 'post',
                                    /*    data: {
                                            familyName: $("#family_name").val(),
                                            givenName: $("#given_name").val(),

                                            userName: $("#userName").val(),
                                            emailAddress: $("#emailAddress").val(),
                                            pwd: $("#pwd").val(),
                                            userRole: $("input[name='userRole']:checked").val(),
                                            ispublic:$("input[name='ispublic']:checked").val()
                                        }*/
                                });
                                req.done(function (data) {
                                    if (data.status) {
                                        $('#role-table').bootstrapTable('refresh');
                                    }else{
                                        alert("");

                                    }
                                });
                            });

                        </script>
                    </div>
                </div>
            </div>
        </div>

        <div class="fade modal" id="createEmployeeModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h2 class="modal-title" id="myModalLabel">开始稽核</h2>
                    </div>
                    <div class="modal-body">

                        <form id="userForm" class="form-horizontal" role="form" action="{addCompanyUserUrl}"
                              method="post">
                            <input type="hidden" name="{_csrf.parameterName}" value="{_csrf.token}"/>

                            <div class="form-group">
                                <label for="userName" class="col-lg-3 control-label">备注</label>

                                <div class="col-lg-6">
                                    <input type="text" class="form-control" id="note" name="note">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-lg-3 control-label" for="prependedtext">角色</label>
                                <div class="col-lg-6">
                                    <select id="" class="selectpicker" name="userType" data-style="btn-primary">
<#--                                    <#list userType as type>

                                        <option value="${type.id}" >${type.id}${type.displayValue}</option>


                                    </#list>-->


                                    </select>
                                </div>

                            </div>


                            <div class="form-group">
                                <label class="col-lg-3 control-label" for="prependedtext"></label>
                                <div class="col-lg-6">                                         <div class="checkbox">
                                        <label>
                                            <input type="checkbox" name="createInvitedCode" value="createInvitedCode">建立邀请码
                                        </label>
                                    </div>
                                </div>

                            </div>




                        </form>


                    </div>
                    <div class="modal-footer">
                        <div class="form-group ">
                            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                            <button id="userModalSave" ref="{addCompanyUserUrl}" type="button" class="btn btn-primary" data-dismiss="modal">保存</button>

                            <script type="text/javascript">

                                $("#userModalSave").click(function () {
                                    alert("dddd"+JSON.stringify($('#userForm').serialize()));
                                    var req = $.ajax({

                                        url: $(this).attr('ref'),
                                        type: 'post',
                                        data: $('#userForm').serialize(),
                                        type: 'post',
                                        /*    data: {
                                                familyName: $("#family_name").val(),
                                                givenName: $("#given_name").val(),

                                                userName: $("#userName").val(),
                                                emailAddress: $("#emailAddress").val(),
                                                pwd: $("#pwd").val(),
                                                userRole: $("input[name='userRole']:checked").val(),
                                                ispublic:$("input[name='ispublic']:checked").val()
                                            }*/
                                    });
                                    req.done(function (data) {
                                        if (data.status) {
                                            $('#role-table').bootstrapTable('refresh');
                                        }else{
                                            alert("");

                                        }
                                    });
                                });

                            </script>
                        </div>

                    </div>
                </div>
            </div>
        </div>

        <button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#acceptModal">接收</button>
        <div class="fade modal" id="acceptModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h2 class="modal-title" id="myModalLabel">接收</h2>
                    </div>
                    <div class="modal-body">
                        <form id="acceptForm" class="form-horizontal" role="form" action="{addCompanyUserUrl}"
                              method="post">
                            <input type="hidden" name="{_csrf.parameterName}" value="{_csrf.token}"/>

                            <div class="form-group">
                                <label for="userName" class="col-lg-3 control-label">备注</label>

                                <div class="col-lg-6">
                                    <input type="text" class="form-control" id="note" name="note">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-lg-3 control-label" for="prependedtext">角色</label>
                                <div class="col-lg-6">
                                    <select id="" class="selectpicker" name="userType" data-style="btn-primary">
                                    </select>
                                </div>

                            </div>


                            <div class="form-group">
                                <label class="col-lg-3 control-label" for="prependedtext"></label>
                                <div class="col-lg-6">                                         <div class="checkbox">
                                        <label>
                                            <input type="checkbox" name="createInvitedCode" value="createInvitedCode">建立邀请码
                                        </label>
                                    </div>
                                </div>

                            </div>




                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button id="acceptModalBtn" ref="${acceptUrl}" type="button" class="btn btn-primary" data-dismiss="modal">确认</button>
                        <script type="text/javascript">

                            $("#acceptModalBtn").click(function () {
                                alert("dddd"+JSON.stringify($('#acceptForm').serialize()));
                                var req = $.ajax({

                                    url: $(this).attr('ref'),
                                    type: 'post',
                                    data: $('#acceptForm').serialize(),
                                    type: 'post',
                                    /*    data: {
                                            familyName: $("#family_name").val(),
                                            givenName: $("#given_name").val(),

                                            userName: $("#userName").val(),
                                            emailAddress: $("#emailAddress").val(),
                                            pwd: $("#pwd").val(),
                                            userRole: $("input[name='userRole']:checked").val(),
                                            ispublic:$("input[name='ispublic']:checked").val()
                                        }*/
                                });
                                req.done(function (data) {
                                    if (data.status) {
                                        $('#role-table').bootstrapTable('refresh');
                                    }else{
                                        alert("");

                                    }
                                });
                            });

                        </script>
                    </div>
                </div>
            </div>
        </div>


        <div class="col-lg-12">
            <div role="tabpanel">
                <ul class="nav nav-tabs" role="tablist">




                    <li role="presentation" class="active"><a href="#提取项目s" aria-controls="coalDeals" role="tab"
                                                              data-toggle="tab">稽核点</a></li>
                    <li role="presentation" class=""><a href="#statistic_by_management" aria-controls="coalDeals" role="tab"
                                                        data-toggle="tab">下发批次</a></li>



                </ul>
                <div class="tab-content">

                    <div role="tabpanel" class="tab-pane active" id="提取项目s">
                        <table class="table table-striped">
                            <caption></caption>
                            <thead>
                            <tr>
                                <th>编号</th>

                                <th>名称</th>

                                <th>总数</th>
                                <th>已经整改</th>
                                <th>白名单</th>

                                <th>未整改</th>
                                <th>新增</th>


                                <th>最后一次稽核</th>

                                <th>未发布</th>
                                <th>发布</th>
                                <th>接受</th>


                                <th>确认合规</th>
                                <th>待检查</th>
                                <th>风险类</th>

                                <th>详情</th>


                            </tr>
                            </thead>
                            <tbody>

                            <#list item as category >
                                <tr>
                                    <td>${category.no}</td>
                                    <td>${category.name!''}</td>
                                    <td>${category.count!''} </td>
                                    <td>${category.rectified!''}</td>
                                    <td>${category.whitelist!''}</td>
                                    <td>${category.unrectified!''}</td>
                                    <td>${category.augmenter!''}</td>

                                    <td>${category.lastTime!''}</td>

                                    <td>${category.Unissued!''}</td>
                                    <td>${category.Issued!''}</td>
                                    <td>${category.Accepted!''}</td>


                                    <td>${category.A!''}</td>
                                    <td>${category.B!''}</td>
                                    <td>${category.C!''}</td>

                                    <td><a href="${category.url!''}">json返回</a></td>


                                </tr>

                            </#list>

                            </tbody>
                        </table>

                    </div>
                    <div role="tabpanel" class="tab-pane " id="statistic_by_management">


                        <table class=" table-striped" id="category-table" data-url="${inssuredListUrl}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
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
                               data-toolbar="#category_toolbar">
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
