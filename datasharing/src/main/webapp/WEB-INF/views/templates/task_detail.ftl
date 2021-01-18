

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
            <td> ${currentTask.id}</td>
        </tr>
        <tr>
            <td>编号</td>
            <td>  ${currentTask.no!''}</td>
        </tr>
        <tr>

            <td>描述</td>
            <td> ${currentTask.stringValue!''}</td>
        </tr>
        <tr>

            <td>描述</td>
            <td> ${currentTask.checkFingerprint!''}</td>
        </tr>
        <tr>

            <td>描述</td>
            <td> ${currentTask.status!''}</td>
        </tr>
        <tr>

            <td>详细信息(运维工程师）</td>
            <td> ${keyInfoUrl}</td>
        </tr>
        </tbody>
    </table>

    <#if doubtfulPoint??>
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
                <td> ${doubtfulPoint}</td>
            </tr>
            <tr>
                <td>编号</td>
                <td>  ${doubtfulPoint}</td>
            </tr>

            </tbody>
        </table>
    </#if>

    <div id="bussiness_toolbar" class=" " >

        <div class="btn-group">
            <button id="classifyBtn" type="button" class="btn btn-default"  data-toggle="modal" data-target="#completeModal">完成</button>

            <button id="classifyBtn" type="button" class="btn btn-default">合规申请</button>
            <button id="directEnquiryBtn" type="button" class="btn btn-primary " data-toggle="modal" data-target="#classifyWhiteModal">
                <i class="fa fa-certificate">白名单申请</i>
            </button>
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
<#--                                        <#list subCategories as productStatus>

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
        <div class="fade modal" id="classifyWhiteModal">
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
                                        <#--                                        <#list subCategories as productStatus>

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
        <div class="fade modal" id="completeModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h2 class="modal-title" id="myModalLabel">分类</h2>
                    </div>
                    <div class="modal-body">

                        <form id="completeModalForm" class="form-horizontal" role="form" action="{addCompanyUserUrl}"
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
                                        <#--                                        <#list subCategories as productStatus>

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
                        <button id="completeModalBtn" ref="${completeUrl}" type="button" class="btn btn-primary" data-dismiss="modal">确认</button>

                        <script type="text/javascript">

                            $("#completeModalBtn").click(function () {
                                alert("dddd"+JSON.stringify($('#completeModalForm').serialize()));
                                var req = $.ajax({

                                    url: $(this).attr('ref'),
                                    type: 'post',
                                    data: $('#completeModalForm').serialize(),
                                    type: 'post',

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


                    $('#classifyModal').modal();
               //     $('#classifyModal .no').val(row[0].no);

            });





        </script>


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
