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

            <span class="navbar-brand" ><b></b> 榆林住房公积金省监{version}</span>

            <img href="https://pic2.zhimg.com/v2-ef20d7f7425386d9c485ae50d394c4b9_b.webp"/>
        </div>

        </nav>
    <img class="ztext-gif" role="presentation" src="https://pic2.zhimg.com/v2-ef20d7f7425386d9c485ae50d394c4b9_b.webp" data-thumbnail="https://pic2.zhimg.com/v2-ef20d7f7425386d9c485ae50d394c4b9_b.jpg" data-size="normal">
    <img href="https://pic2.zhimg.com/v2-ef20d7f7425386d9c485ae50d394c4b9_b.webp"/>


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
                    <button id="issuedModalBtn" ref="${startUrl}" type="button" class="btn btn-primary" data-dismiss="modal">确认</button>

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

    <button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#stopModal">下发</button>
    <div class="fade modal" id="stopModal">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h2 class="modal-title" id="myModalLabel">下发</h2>
                </div>
                <div class="modal-body">

                    <form id="stopModalForm" class="form-horizontal" role="form" action="{addCompanyUserUrl}"
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
                    <button id="stopModalBtn" ref="${stopUrl}" type="button" class="btn btn-primary" data-dismiss="modal">确认</button>

                    <script type="text/javascript">

                        $("#stopModalBtn").click(function () {
                            alert("dddd"+JSON.stringify($('#stopModalForm').serialize()));
                            var req = $.ajax({

                                url: $(this).attr('ref'),
                                type: 'post',
                                data: $('#stopModalForm').serialize(),
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
    <div class=" col-lg-6">
        <div class="well">
            <table class="table">
                <caption>operation_statistics</caption>
                <thead>
                <tr>
                    <th>名称</th>
                    <th>数量</th>
                </tr>
                </thead>
                <tbody>
                <#list 个人借贷账户 as category >
                    <tr>
                        <td>${category.name!''}</td>
                        <td>${category.desc!''}</td>

                    </tr>

                </#list>



                </tbody>
            </table>
        </div>
    </div>
    <div class=" col-lg-6">
        <div class="well">
            <table class="table">
                <caption>operation_statistics</caption>
                <thead>
                <tr>
                    <th>名称</th>
                    <th>数量</th>
                </tr>
                </thead>
                <tbody>

                <#list fileJobs as category >
                    <tr>
                        <td>${category!''}</td>
                        <td>${category!''}</td>
                    </tr>
                </#list>



                </tbody>
            </table>
        </div>
    </div>
    <div class=" col-lg-6">
        <div class="well">
            <table class="table">
                <caption>operation_statistics</caption>
                <thead>
                <tr>
                    <th>名称</th>
                    <th>数量</th>
                    <th>状态</th>
                </tr>
                </thead>
                <tbody>

                <#list runningJobInstances as category >
                    <tr>
                        <td>${category.jobInstance.jobName!''}</td>
                        <td>${category.jobInstance!''}</td>
                        <td>${category.status!''}</td>
                        <td>${category.exitStatus!''}</td>
                        <td>${category.jobParameters!''}</td>

                    </tr>
                </#list>



                </tbody>
            </table>
        </div>
    </div>

    <div class="col-lg-12">
        <div role="tabpanel">
            <ul class="nav nav-tabs" role="tablist">


                <li role="presentation" class="active"><a href="#custid_个人客户号" aria-controls="coalDeals" role="tab"
                                                          data-toggle="tab">明细数据</a></li>
                <li role="presentation" class=""><a href="#categories" aria-controls="categories" role="tab"
                                                    data-toggle="tab">分类</a></li>
            </ul>
            <div class="tab-content" style="padding-top: 10px">
                <div role="tabpanel" class="tab-pane active" id="custid_个人客户号">
                    <div class="table-responsive">
                        <div id="bussiness_toolbar" class=" " >

                            <div class="btn-group">
                                <button id="classifyBtn" type="button" class="btn btn-default">分类</button>

                            </div>
                            <div class="fade modal" id="classifyModal">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                            <h2 class="modal-title" id="myModalLabel">分类</h2>
                                        </div>
                                        <div class="modal-body">

                                            <form id="classifyModalForm" class="form-horizontal" role="form" action="{addCompanyUserUrl}"
                                                  method="post">
                                                <input type="hidden" name="{_csrf.parameterName}" value="{_csrf.token}"/>
                                                <input type="hidden" class="no" name="no" value=""/>

                                                <div class="form-group">
                                                    <label for="userName" class="col-lg-3 control-label ">备注</label>

                                                    <div class="col-lg-6">
                                                        <input type="text" class="form-control remark" id="note" name="name">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-lg-3 control-label" for="prependedtext">类型</label>
                                                    <div class="col-lg-6">
                                                        <select id="" class="selectpicker" name="category" data-style="btn-primary">
<#--                                                            <#list subCategories as productStatus>

                                                                <option value="${productStatus.no}">${productStatus.name}</option>

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
                                            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                                            <button id="classifyModalBtn" ref="{classifyUrl}" type="button" class="btn btn-primary" data-dismiss="modal">确认</button>

                                            <script type="text/javascript">

                                                $("#classifyModalBtn").click(function () {
                                                    alert("dddd"+JSON.stringify($('#classifyModalForm').serialize()));
                                                    var req = $.ajax({

                                                        url: $(this).attr('ref'),
                                                        type: 'post',
                                                        data: $('#classifyModalForm').serialize(),
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
                                                            $('#doubt-table').bootstrapTable('refresh');
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

                                $("#classifyBtn").click(function() {

                                    var row =  $('#doubt-table').bootstrapTable('getSelections');

                                    if (row != '') {

                                        alert(row[0].no);
                                        $('#classifyModal').modal();
                                        $('#classifyModal .no').val(row[0].no);

                                    }
                                });





                            </script>


                        </div>

                        <table class=" table-striped" id="doubt-table" data-url="${logUrl}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
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
                                <th data-field="classifyId">关键信息</th>

                                <th data-field="stringValue">描述</th>



                                <th data-field="status" >状态</th>
                                <th data-field="issued" >下发状态</th>
                                <th data-field="classifyStatus" >分类状态</th>

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
                <div role="tabpanel" class="tab-pane" id="categories">

                    <div class="row col-lg-12" style="padding-top: 10px";>

                        <div class="table-responsive">
                            <div id="category_toolbar" class=" " >

                                <button type="button" class="btn btn-success " data-toggle="modal" data-target="#addCategoryModal">添加分类</button>

                                <div class="fade modal" id="addCategoryModal">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                                <h2 class="modal-title" id="myModalLabel">添加分类</h2>
                                            </div>
                                            <div class="modal-body">

                                                <form id="addCategoryModalForm" class="form-horizontal" role="form" action="{addCompanyUserUrl}"
                                                      method="post">
                                                    <input type="hidden" name="{_csrf.parameterName}" value="{_csrf.token}"/>

                                                    <div class="form-group">
                                                        <label for="名称" class="col-lg-3 control-label">名称</label>

                                                        <div class="col-lg-6">
                                                            <input type="text" class="form-control" id="name" name="name">
                                                        </div>
                                                    </div>

                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label" for="prependedtext">角色</label>
                                                        <div class="col-lg-6">
                                                            <select id="" class="selectpicker" name="category" data-style="btn-primary">
<#--                                                                <#list categories as productStatus>

                                                                    <option value="${productStatus.no}">${productStatus.name}</option>

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
                                                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                                                <button id="addCategoryModalFormBtn" ref="{addCategoryUrl}" type="button" class="btn btn-primary" data-dismiss="modal">确认</button>

                                                <script type="text/javascript">

                                                    $("#addCategoryModalFormBtn").click(function () {
                                                        alert("dddd"+JSON.stringify($('#addCategoryModalForm').serialize()));
                                                        var req = $.ajax({

                                                            url: $(this).attr('ref'),
                                                            type: 'post',
                                                            data: $('#addCategoryModalForm').serialize(),
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
                                                                $('#category-table').bootstrapTable('refresh');
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


                                    $("#setPrimaryBtn").click(function() {
                                        var row =  $('#bussiness-table').bootstrapTable('getSelections');

                                        if (row != '') {
                                            $('#addCategoryModal').modal();

                                            $('#bussinessId').val(row[0].id);

                                        }
                                    });




                                </script>


                            </div>

                            <table class=" table-striped" id="category-table" data-url="${logUrl}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
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
                                    <th data-field="name">名称</th>

                                    <th data-field="type">总类型</th>

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



[#include "../star.html"/]
评分:
<input id="score" value="0" type="number" class="rating" min=0 max=5 step=0.5 data-size="sm">
<input type="submit" value="评分" class="search_btn" name="submit" οnclick="gradeScored()">

<script type="text/javascript">
    jQuery(document).ready(function () {
        $(".rating-kv").rating();
    });
    function gradeScored(){
        var score = $("#score").val();
        //alert(score);
        $.post("{base}/test/gradeScore.jspx",{id:id,score:score},
            function(data){
                alert("评分成功");
            },
            "html");
    }
</script>
</body>
</html>
