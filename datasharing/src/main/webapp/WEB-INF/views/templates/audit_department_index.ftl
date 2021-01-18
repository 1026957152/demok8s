

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>榆林住房公积金2020年离柜率提升项目调研分析</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
<#--
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
-->
    <link href="${rc.contextPath}/components/bootstrap-select/css/bootstrap-select.min.css" rel="stylesheet">

    <link href="${rc.contextPath}/components/bootstrap_table/bootstrap-table.min.css" rel="stylesheet">
<#--

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
-->

    <#--<script src="${rc.contextPath}/js/jquery/jquery.js" type="text/javascript"></script>
    <script src="${rc.contextPath}/components/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
-->
    <link href="${rc.contextPath}/components/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <script src="${rc.contextPath}/js/jquery/jquery.js" type="text/javascript"></script>
    <script src="${rc.contextPath}/components/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="${rc.contextPath}/components/bootstrap_table/bootstrap-table.min.js"></script>
    <script type="text/javascript" src="${rc.contextPath}/components/bootstrap_table/bootstrap-table-zh-CN.min.js"></script>
    <script type="text/javascript" src="${rc.contextPath}/components/bootstrap-select/js/bootstrap-select.min.js"></script>

<#--

    <link href="https://unpkg.com/bootstrap-table@1.15.5/dist/bootstrap-table.min.css" rel="stylesheet">

    <script src="https://unpkg.com/tableexport.jquery.plugin/tableExport.min.js"></script>
    <script src="https://unpkg.com/bootstrap-table@1.15.5/dist/bootstrap-table.min.js"></script>
    <script src="https://unpkg.com/bootstrap-table@1.15.5/dist/bootstrap-table-locale-all.min.js"></script>
    <script src="https://unpkg.com/bootstrap-table@1.15.5/dist/extensions/export/bootstrap-table-export.min.js"></script>

-->

    <#include "fragments/jshighchart.ftl">

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



    <div class="row">
        <div class="col-lg-12">
            <a href="${managementUrl}" class="btn-success btn-lg">managementUrl</a>
            <a href="${sigmaUrl}" class="btn-success btn-lg">sigmaUrl</a>
            <a href="${objectiveUrl}" class="btn-success btn-lg">电子稽核工作目标</a>

            <a href="${effectivenessUrl}" class="btn-success btn-lg">应用成效</a>
            <a href="${auditProcessUrl}" class="btn-success btn-lg">开始稽核</a>

        </div>
    </div>
    <button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#issuedModal">下发</button>
    <div class="fade modal" id="issuedModal">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h2 class="modal-title" id="myModalLabel">下发</h2>
                </div>
                <div class="modal-body">
                    <form  id="userForm" accept-charset="UTF-8" action="" method="POST" action="{addCompanyUserUrl}">
                        <textarea class="form-control counted" name="message" placeholder="Type in your message" rows="5" style="margin-bottom:10px;"></textarea>
               <#--         <h6 class="pull-right" id="counter">320 characters remaining</h6>-->

                        <div class="form-group">
                            <label class="col-md-3" class="control-label">Dokumenter:</label>
                            <div class="col-md-9">
                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="checkbox">
                                            <input type="checkbox" name="att" value="Original01.pdf" checked> Original01.pdf</input>
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="checkbox">
                                            <input type="checkbox" name="att" value="regnskab.xls"> regnskab.xls</input>
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="checkbox">
                                            <input type="checkbox" name="att" value="faktura02.tif"> introduction.docx</input>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <fieldset>

                            <input   class="control-form" id="employeeId" name="id"  >
                            <input type="hidden" name="{_csrf.parameterName}" value="{_csrf.token}"/>



                            <div class="form-group">
                                <label class="col-md-4 control-label" for="prependedtext">角色</label>
                                <div class="col-md-8">
                                    <select id="" class="selectpicker" name="userType" data-style="btn-primary">
                                        <#--                                     <#list userType as type>
                                                                                 <option value="${type.id}" >${type.id}${type.displayValue}</option>
                                                                             </#list>-->
                                    </select>
                                </div>

                            </div>



                        </fieldset>
                    </form>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
<#--
                    <button id="issuedModalBtn" ref="{issuedUrl}" type="button" class="btn btn-primary" data-dismiss="modal">确认</button>
-->
                    <button id="issuedModalBtn" ref="{issuedUrl}" type="button" class="btn btn-info" type="submit" data-dismiss="modal">Post New Message</button>

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

    <div class="clearfix" style="margin-bottom: 10px;"></div>
    <#include "fragments/index_rate.ftl">
    <#include "fragments/chart_pie_InssuredAndAccepted.ftl">

    <div class="clearfix" style="margin-bottom: 10px;"></div>
        <div class="row">
        <div class="col-lg-12">
            <ul class="nav nav-tabs" role="tablist">
                <li role="presentation" class=""><a href="#todoList" aria-controls="coalDeals" role="tab"
                                                    data-toggle="tab">代办业务</a></li>


                <li role="presentation" class=""><a href="#issuredList" aria-controls="coalDeals" role="tab"
                                                    data-toggle="tab">接受下发批次</a></li>

                <li role="presentation" class=""><a href="#接受" aria-controls="coalDeals" role="tab"
                                                          data-toggle="tab">接受</a></li>
                <li role="presentation" class="active"><a href="#提取项目s" aria-controls="coalDeals" role="tab"
                                                          data-toggle="tab">提取项目s</a></li>


                <#--
                            <li role="presentation" ><a href="#index" aria-controls="coalDeals" role="tab"
                                                        data-toggle="tab">统计指标编码</a></li>-->

            </ul>
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane " id="todoList">
                    <div class="row col-lg-12" style="padding-top: 10px";>

                        <div class="table-responsive">
                            <div id="todoList_toolbar" class=" " >

                                <button type="button" id="claimBtn" class="btn btn-success btn-lg" >认领</button>
                                <div class="fade modal" id="claimModal">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                                <h2 class="modal-title" id="myModalLabel">认领</h2>
                                            </div>
                                            <div class="modal-body">
                                                <form id="claimModalForm" class="form-horizontal" role="form" action="{addCompanyUserUrl}"
                                                      method="post">
                                                    <input type="hidden" name="{_csrf.parameterName}" value="{_csrf.token}"/>

                                                    <div class="form-group">
                                                        <label for="userName" class="col-lg-3 control-label">备注</label>

                                                        <div class="col-lg-6">
                                                            <input type="text" class="form-control id" id="note" name="id">
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
                                                <button id="claimModalFormBtn" ref="${claimUrl}" type="button" class="btn btn-primary" data-dismiss="modal">确认</button>
                                                <script type="text/javascript">

                                                    $("#claimModalFormBtn").click(function () {
                                                        alert("dddd"+JSON.stringify($('#claimModalForm').serialize()));
                                                        var req = $.ajax({

                                                            url: $(this).attr('ref'),
                                                            type: 'post',
                                                            data: $('#claimModalForm').serialize(),
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

                                <script type="text/javascript">


                                    $("#claimBtn").click(function() {
                                        var row =  $('#todo-table').bootstrapTable('getSelections');

                                        if (row != '') {
                                            $('#claimModal').modal();

                                            $('#claimModalForm .id').val(row[0].id);

                                        }
                                    });




                                </script>


                            </div>

                            <table class=" table-striped" id="todo-table" data-url="${todoListUrl}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
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
                                   data-toolbar="#todoList_toolbar">
                                <thead>
                                <tr>

                                    <th data-field="state" data-checkbox="true"></th>

                                    <th data-field="id">id</th>
                                    <th data-field="name">name</th>
                                    <th data-field="no">编号</th>
                                    <th data-field="owner">owner</th>

                                    <th data-field="assignee">assignee</th>


                                    <th data-field="description">description</th>

                                    <th data-field="createdDate" >createdDate</th>
                                    <th data-field="claimedDate">claimedDate</th>
                                    <th data-field="completedDate">completedDate</th>
                                    <th data-field="processDefinitionVersion">processDefinitionVersion</th>


                                    <th data-field=""  data-formatter="operationFormatter">操作</th>

                                </tr>
                                </thead>
                            </table>

                        </div>



                    </div>


                </div>

                <div role="tabpanel" class="tab-pane" id="issuredList">
                    <div class="row col-lg-12" style="padding-top: 10px";>

                        <div class="table-responsive">
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

                                <#list issuredList as category >
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



                    </div>


                </div>

                <div role="tabpanel" class="tab-pane" id="接受">
                    <div class="row col-lg-12" style="padding-top: 10px";>

                        <div class="table-responsive">
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



                    </div>


                </div>

                <div role="tabpanel" class="tab-pane active" id="提取项目s">
                    <div class="row col-lg-12" style="padding-top: 10px";>

                        <div class="table-responsive">
                            <div id="bussiness_toolbar" class=" " >


                                <a href="{bussinessUrl}" type="button" class="btn btn-primary"  >
                                    业务设置
                                </a>
                                <a href="{employeeUrl}" type="button" class="btn btn-primary" >员工管理</a>

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

                            <table class=" table-striped" id="bussiness-table" data-url="${auditPointUrl}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
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

                                    <th data-field="count">总数</th>


                                    <th data-field="Unissued">未下发数</th>

                                    <th data-field="Accepted" >接受</th>
                                    <th data-field="Issued">下发数</th>


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

    //  alert(JSON.stringify(params))
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
