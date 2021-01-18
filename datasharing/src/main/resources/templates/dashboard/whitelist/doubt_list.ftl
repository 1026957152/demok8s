

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

    <div class="row">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<#--
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
-->

    <div class="alert alert-success" role="alert">
        <h4 class="alert-heading">Well done!</h4>
        <p>Aww yeah, you successfully read this important alert message. This example text is going to run a bit longer so that you can see how spacing within an alert works with this kind of content.</p>
        <hr>
        <p class="mb-0">Whenever you need to, be sure to use margin utilities to keep things nice and tidy.</p>
    </div>
    <div class="modal modal-warning fade in" id="modal-warning">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span></button>
                    <h5 class="modal-title">Delete User</h5>
                </div>
                <div class="modal-body">
                    <h3>Are you sure want to delete this user?</h3>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">Close</button>
                    <a type="button" class="btn btn-danger"><i class="fa fa-check"></i>&nbsp;Yes</a>
                </div>
            </div>
        </div>
    </div>
    <a data-toggle="modal" data-target="#modal-warning" <#--th:attr="data-target='#modal-warning'+{user.id }"-->><span class="glyphicon glyphicon-trash"></span></a>
    <div class=" col-lg-6">
        <div class="well">
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
            <td>名称</td>
            <td> {itemAdd.name}</td>
        </tr>
        <tr>
            <td>编号</td>
            <td>  {itemAdd.no}</td>
        </tr>
        <tr>

            <td>描述</td>
            <td> {itemAdd.desc}</td>
        </tr>


        </tbody>
    </table>
        </div>
    </div>

    <div class=" col-lg-6">
        <div class="well">
            <table class="table">
                <caption>本地化分类</caption>
                <thead>
                <tr>
                    <th>名称</th>
                    <th>数量</th>
                </tr>
                </thead>
                <tbody>
                <#list doubtfulDimensions as category >
                    <tr>
                        <td>${category.name!''}</td>
                        <td>${category.count!''}</td>

                    </tr>

                </#list>



                </tbody>
            </table>
        </div>
    </div>



    <div class="col-xl-11 col-lg-11">
        <div th:if="{#lists.isEmpty(tasks)}" class="card shadow mb-4">
            <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                <h6 class="m-0 font-weight-bold text-primary">  </h6>
            </div>
            <!-- Card Body -->
            <div class="card-body">
                <p>Your Task List is empty.</p>
            </div>
        </div>
        <div th:each = "task : {tasks}" class="card shadow mb-4">
            <!-- Card Header - Dropdown -->
            <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                <!-- Info Button for OPEN Tasks-->
                <div th:if="{task.status == T(com.example.taskapp.model.Status).OPEN}" class="btn btn-primary btn-icon-split">
                    <span class="icon text-white-50">
                      OPEN
                    </span>
                    <span class="text" th:text="{task.title}"></span>
                </div>
                <!-- Info Button for CLOSED Tasks-->
                <div th:if="{task.status == T(com.example.taskapp.model.Status).CLOSED}" class="btn btn-success btn-icon-split">
                    <span class="icon text-white-50">
                      CLOSED
                    </span>
                    <span class="text" th:text="{task.title}"></span>
                </div>
                <!-- Info Button for REOPENED Tasks-->
                <div th:if="{task.status == T(com.example.taskapp.model.Status).REOPENED}" class="btn btn-warning btn-icon-split">
                    <span class="icon text-white-50">
                      REOPENED
                    </span>
                    <span class="text" th:text="{task.title}"></span>
                </div>
                <h6 class="m-0 font-weight-bold text-primary"> 444 </h6>
                <!-- Dropdown -->
                <div class="dropdown no-arrow">
                    <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right shadow animated--fade-in" aria-labelledby="dropdownMenuLink">
                        <div class="dropdown-header">Actions:</div>
                        <div th:if="{task.status == T(com.example.taskapp.model.Status).OPEN}">
                            <a class="dropdown-item" th:href="@{/task/{id}/{action}(id={task.id}, action='close')}">CLOSE</a>
                        </div>
                        <div th:if="{task.status == T(com.example.taskapp.model.Status).CLOSED}">
                            <a class="dropdown-item" th:href="@{/task/{id}/{action}(id={task.id}, action='reopen')}">REOPEN</a>
                        </div>
                        <div th:if="{task.status == T(com.example.taskapp.model.Status).REOPENED}">
                            <a class="dropdown-item" th:href="@{/task/{id}/{action}(id={task.id}, action='close')}">CLOSE</a>
                        </div>
                        <div class="dropdown-divider"></div>
                        <!--<a class="dropdown-item" th:href="@{/task/{id}/edit(id={task.id})}"><i class="far fa-edit"></i> Edit</a>-->
                        <a class="dropdown-item" th:href="@{/task/{id}/delete(id={task.id})}"><i class="fas fa-trash-alt"></i> Delete</a>
                        <a class="dropdown-item eBtn" th:href="@{findTask/{id}(id={task.id})}"><i class="fas fa-pencil-alt"></i>  Edit</a>
                    </div>
                </div>
            </div>
            <!-- Card Body -->
            <div class="card-body">
                <p th:text="{task.content}">2222</p>
            </div>
        </div>
    </div>


    <!-- Page Wrapper -->
    <div id="wrapper">
        <th:block th:include="fragments/sidebarLeft"></th:block>
        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">
            <!-- Main Content -->
            <div id="content">
                <th:block th:include="fragments/navbar"></th:block>
                <!-- Begin Page Content -->
                <div class="container-fluid">
                    <div class="row">
                        <div class="col">
                            <div style="margin-bottom: 20px;">
                                <button class="btn btn-primary newBtn">
                                    <i class="fas fa-plus-circle"></i>  New Task
                                </button>
                            </div>
                        </div>
                    </div>
                    <!-- Content Row -->
                    <div class="row">
                        <!-- List of Tasks-->
                        <th:block th:include="tasks/tasks"></th:block>
                    </div>
                    <div class="row">
                        <th:block th:include="tasks/editModal"></th:block>
                    </div>
                    <div class="row">
                        <th:block th:include="tasks/newModal"></th:block>
                    </div>
                </div>
                <!-- /.container-fluid -->
            </div>
            <!-- End of Main Content -->
            <th:block th:include="fragments/footer"></th:block>
        </div>
        <!-- End of Content Wrapper -->
    </div>
    <!-- End of Page Wrapper -->
    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>
    <div class="col-xl-8 col-lg-7">
        <div class="newTaskForm">
            <form th:action="@{/task/create}" th:method="post">
            </form>
            <div class="modal fade" id="newTaskModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Edit</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <input  type="hidden" value="" class="form-control" id="id" name="id"/>
                            </div>
                            <div class="form-group">
                                <label for="title">Title:</label>
                                <input value="" type="text" class="form-control" id="title" name="title"/>
                            </div>
                            <div class="form-group">
                                <label for="status">Status:</label>
                                <select id="status" class="form-control" name="status">
                                    <option th:each="status : {statusList}"
                                            th:text="{status}" th:value="{status}">
                                    </option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="content">Content:</label>
                                <textarea value="" class="form-control" name="content"
                                          id="content" rows="5">
                            </textarea>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <input type="submit" class="btn btn-primary" value="save"/>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>

    <div class="toast" role="alert" aria-live="assertive" aria-atomic="true">
        <div class="toast-header">
            <img src="..." class="rounded mr-2" alt="...">
            <strong class="mr-auto">Bootstrap</strong>
            <small>11 mins ago</small>
            <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>
        <div class="toast-body">
            Hello, world! This is a toast message.
        </div>
    </div>
    </div>
    <hr>
    <div class="row">
        <div role="tabpanel">
            <ul class="nav nav-tabs" role="tablist">


                <li role="presentation" class="active"><a href="#doubtful" aria-controls="coalDeals" role="tab"
                                                          data-toggle="tab">疑点列表</a></li>
                <li role="presentation" class=""><a href="#whitelistReason" aria-controls="coalDeals" role="tab"
                                                    data-toggle="tab">whitelistReason</a></li>
            </ul>
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="doubtful">
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

                                        <button class="btn btn-primary" id="btn_export">生成Excel表</button>
                                        <script type="text/javascript">
                                            //导出excel汇总表
                                            $("#btn_export").click(function () {
                                                //打开新窗口
                                                window.open("/excel/makeExcel");
                                            });

                                        </script>

                                        <table class=" table-striped" id="bussiness-table" data-url="${dataUrl}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
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
                        </section>

                    </div>
                </div>
                <div role="tabpanel" class="tab-pane " id="whitelistReason">
                    <div class="row col-lg-12" style="">
                        <section class="">

                            <div class="table-responsive">

                                <div role="tabpanel" class="tab-pane" id="index">
                                    <div class="row col-lg-12" style="padding-top: 10px";>
                                        <div id="whitelistReason_toolbar" class=" " >


                                            <button id="createBtn" type="button" class="btn btn-primary"  >
                                                createBtn
                                            </button>


                                            <script type="text/javascript">


                                                $("#createBtn").click(function() {
                                                    create();
                                                });




                                            </script>


                                        </div>

                                        <table class=" table-striped" id="bussiness-table" data-url="${whitelistReasonUrl}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
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
                                               data-toolbar="#whitelistReason_toolbar">
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
                        </section>

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
    function create() {

        $.ajax({
            url: "${createUrl}",
            contentType: "application/json",
            data: {"a":"body"},
            dataType: "json",
            type: 'POST',
            success: function (response) {
                $('#out_form').val(response.data)
            }
        });

    }




</script>

<#include "../fragments/scripts.ftl">
</body>
</html>
