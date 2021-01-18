

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>榆林住房公积金openapi</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">

    <link href="${rc.contextPath}/components/bootstrap-select/css/bootstrap-select.min.css" rel="stylesheet">

    <link href="${rc.contextPath}/components/bootstrap_table/bootstrap-table.min.css" rel="stylesheet">

    <link href="${rc.contextPath}/components/bootstrap/css/bootstrap.min.css" rel="stylesheet">

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

        var chart = Highcharts.chart('container', {
            chart: {
                type: 'spline'
            },
            title: {
                text: '某地积雪厚度监测'
            },
            subtitle: {
                text: '非规律性时间内的变化'
            },
            xAxis: {
                type: 'datetime',
                title: {
                    text: null
                }
            },
            colors: ['#6CF', '#39F', '#06C', '#036', '#000'],
            yAxis: {
                title: {
                    text: '积雪 厚度 (m)'
                },
                min: 0
            },
            tooltip: {
                headerFormat: '<b>{series.name}</b><br>',
                pointFormat: '{point.x:%e. %b}: {point.y:.2f} m'
            },
            plotOptions: {
                spline: {
                    marker: {
                        enabled: true
                    }
                }
            },
            series: [{
                name: '2007-2008 冬',
                // Define the data points. All series have a dummy year
                // of 1970/71 in order to be compared on the same x axis. Note
                // that in JavaScript, months start at 0 for January, 1 for February etc.
                data: [
                    [Date.UTC(1970,  9, 27), 0   ],
                    [Date.UTC(1970, 10, 10), 0.6 ],
                    [Date.UTC(1970, 10, 18), 0.7 ],
                    [Date.UTC(1970, 11,  2), 0.8 ],
                    [Date.UTC(1970, 11,  9), 0.6 ],
                    [Date.UTC(1970, 11, 16), 0.6 ],
                    [Date.UTC(1970, 11, 28), 0.67],
                    [Date.UTC(1971,  0,  1), 0.81],
                    [Date.UTC(1971,  0,  8), 0.78],
                    [Date.UTC(1971,  0, 12), 0.98],
                    [Date.UTC(1971,  0, 27), 1.84],
                    [Date.UTC(1971,  1, 10), 1.80],
                    [Date.UTC(1971,  1, 18), 1.80],
                    [Date.UTC(1971,  1, 24), 1.92],
                    [Date.UTC(1971,  2,  4), 2.49],
                    [Date.UTC(1971,  2, 11), 2.79],
                    [Date.UTC(1971,  2, 15), 2.73],
                    [Date.UTC(1971,  2, 25), 2.61],
                    [Date.UTC(1971,  3,  2), 2.76],
                    [Date.UTC(1971,  3,  6), 2.82],
                    [Date.UTC(1971,  3, 13), 2.8 ],
                    [Date.UTC(1971,  4,  3), 2.1 ],
                    [Date.UTC(1971,  4, 26), 1.1 ],
                    [Date.UTC(1971,  5,  9), 0.25],
                    [Date.UTC(1971,  5, 12), 0   ]
                ]
            }, {
                name: '2008-2009 冬',
                data: [
                    [Date.UTC(1970,  9, 18), 0   ],
                    [Date.UTC(1970,  9, 26), 0.2 ],
                    [Date.UTC(1970, 11,  1), 0.47],
                    [Date.UTC(1970, 11, 11), 0.55],
                    [Date.UTC(1970, 11, 25), 1.38],
                    [Date.UTC(1971,  0,  8), 1.38],
                    [Date.UTC(1971,  0, 15), 1.38],
                    [Date.UTC(1971,  1,  1), 1.38],
                    [Date.UTC(1971,  1,  8), 1.48],
                    [Date.UTC(1971,  1, 21), 1.5 ],
                    [Date.UTC(1971,  2, 12), 1.89],
                    [Date.UTC(1971,  2, 25), 2.0 ],
                    [Date.UTC(1971,  3,  4), 1.94],
                    [Date.UTC(1971,  3,  9), 1.91],
                    [Date.UTC(1971,  3, 13), 1.75],
                    [Date.UTC(1971,  3, 19), 1.6 ],
                    [Date.UTC(1971,  4, 25), 0.6 ],
                    [Date.UTC(1971,  4, 31), 0.35],
                    [Date.UTC(1971,  5,  7), 0   ]
                ]
            }, {
                name: '2009-2010 冬',
                data: [
                    [Date.UTC(1970,  9,  9), 0   ],
                    [Date.UTC(1970,  9, 14), 0.15],
                    [Date.UTC(1970, 10, 28), 0.35],
                    [Date.UTC(1970, 11, 12), 0.46],
                    [Date.UTC(1971,  0,  1), 0.59],
                    [Date.UTC(1971,  0, 24), 0.58],
                    [Date.UTC(1971,  1,  1), 0.62],
                    [Date.UTC(1971,  1,  7), 0.65],
                    [Date.UTC(1971,  1, 23), 0.77],
                    [Date.UTC(1971,  2,  8), 0.77],
                    [Date.UTC(1971,  2, 14), 0.79],
                    [Date.UTC(1971,  2, 24), 0.86],
                    [Date.UTC(1971,  3,  4), 0.8 ],
                    [Date.UTC(1971,  3, 18), 0.94],
                    [Date.UTC(1971,  3, 24), 0.9 ],
                    [Date.UTC(1971,  4, 16), 0.39],
                    [Date.UTC(1971,  4, 21), 0   ]
                ]
            }]
        });
    </script>

</head>
<body>
<div class="container" style="margin-bottom:60px; margin-top:20px">
 <#include "../fragments/navbar.ftl">

    <div class="well">
        <a href="${swaggerUrl}" class="btn-success btn-lg">待上线接口测试</a>

    </div>

    <div class="clearfix" style="margin-bottom: 10px;"></div>
        <div class="row">
        <div class="col-lg-12">
            <ul class="nav nav-tabs" role="tablist">


                <li role="presentation" class="active"><a href="#admin" aria-controls="coalDeals" role="tab"
                                                          data-toggle="tab">接口说明</a></li>
                <li role="presentation" class=""><a href="#客户信息" aria-controls="客户信息" role="tab"
                                                          data-toggle="tab">应用信息</a></li>

                <li role="presentation" class=""><a href="#log" aria-controls="日志" role="tab"
                                                    data-toggle="tab">日志</a></li>

            </ul>

            <div class="tab-content border border-top-0" id="myTabContent"  style="padding-top: 10px;padding-bottom: 10px">
                <div class="tab-pane  active" id="admin" role="tabpanel" aria-labelledby="home-tab">

                    <div class=" col-lg-12" style="">

                        <div class="well">
                            <table class="table table-striped">
                                <caption class="text-danger">认证签名  <a href="${caUrl}">下载证书</a></caption>
                                <thead>
                                <tr class="hidden">
                                    <th>名称</th>

                                    <th>是否完成</th>

                                </tr>
                                </thead>
                                <tbody>

                                <#list auth as article >
                                    <tr>
                                        <td>${article.name!''}</td>
                                        <td>${article.value!''}</td>


                                    </tr>

                                </#list>



                                </tbody>
                            </table>
                            <table class="table table-striped">
                                <caption class="text-danger">限制说明</caption>
                                <thead>
                                <tr class="hidden">
                                    <th>名称</th>

                                    <th>是否完成</th>

                                </tr>
                                </thead>
                                <tbody>

                                <#list limited as article >
                                    <tr>
                                        <td>${article.name!''}</td>
                                        <td>${article.value!''}</td>


                                    </tr>

                                </#list>



                                </tbody>
                            </table>


                        </div>


                    </div>
                    <div class=" col-lg-12" style="">

                        <#list documents as document >


                        <table class="table table-striped">
                            <caption class="text-danger">${document.name}</caption>
                            <thead>

                            </thead>
                            <tbody>

                         <#list document.articles as article >
                                <tr>
                                    <td>${article.name!''}</td>
                                    <td>${article.value!''}</td>


                                </tr>

                            </#list>

                         <#if document.parametersDown??>
                             <#list document.parametersDown?keys as key >
                                 <tr>
                                     <td>${key!''}</td>
                                     <td><#assign value = document.parametersDown[key]>
                                         <#list value?keys as key_>
                                             ${value[key_]!''}
                                         </#list>
                                         <#--${document.parametersDown[key]}--> </td>


                                 </tr>

                             </#list>
                         </#if>



                            </tbody>
                        </table>
                        </#list>

                    </div>



                </div>


                <div class="tab-pane " id="客户信息" role="tabpanel" aria-labelledby="contact-tab">

                    <div id="bussiness_toolbar" class=" " >


                        <button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#addAppModal">新建应用</button>
                        <div class="fade modal" id="addAppModal">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                        <h2 class="modal-title" id="myModalLabel">新建应用</h2>
                                    </div>
                                    <div class="modal-body">
                                        <form  id="userForm" accept-charset="UTF-8" action="" method="POST" action="{addCompanyUserUrl}">
                                            <textarea class="form-control counted" name="message" placeholder="Type in your message" rows="2" style="margin-bottom:10px;">当前访问 每分钟200次
                                            </textarea>
                                            <#--         <h6 class="pull-right" id="counter">320 characters remaining</h6>-->

<#--
                                            <fieldset>

                                                <input type="hidden" name="{_csrf.parameterName}" value="{_csrf.token}"/>

                                                <div class="form-group">
                                                    <label class="col-md-4 control-label" for="prependedtext">客户id</label>
                                                    <div class="col-md-8">
                                                        <input   class="control-form" id="clientId" name="clientId"  >

                                                    </div>

                                                </div>


                                                <div class="form-group">
                                                    <label class="col-md-4 control-label" for="prependedtext">角色</label>
                                                    <div class="col-md-8">
                                                        <select id="" class="selectpicker" name="userType" data-style="btn-primary">
                                                            &lt;#&ndash;                                     <#list userType as type>
                                                                                                     <option value="${type.id}" >${type.id}${type.displayValue}</option>
                                                                                                 </#list>&ndash;&gt;
                                                        </select>
                                                    </div>

                                                </div>



                                            </fieldset>-->
                                        </form>

                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>

                                        <button id="addAppModalBtn" ref="${addAuthUrl}" type="button" class="btn btn-info" type="submit" data-dismiss="modal">确认</button>

                                        <script type="text/javascript">

                                            $("#addAppModalBtn").click(function () {
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
                                                        $('#app-table').bootstrapTable('refresh');
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
                    <table class=" table-striped" id="app-table" data-url="${authInfoUrl}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
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
                            <th data-field="createDate">新建时间</th>
                            <th data-field="clientId">clientId</th>
                            <th data-field="accessKey"><b class="text-danger">accessKey(X-api-key)</b></th>
                            <th data-field="secretKey" >secretKey</th>
                            <th data-field="rateLimit" >每分钟访问限制（次）</th>

                            <th data-field=""  data-formatter="operationFormatter">操作</th>

                        </tr>
                        </thead>
                    </table>

                </div>
                <div class="tab-pane " id="log" role="tabpanel" aria-labelledby="contact-tab">

                    <div id="log_toolbar" class=" " >


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


                                            <fieldset>

                                                <input type="hidden" name="{_csrf.parameterName}" value="{_csrf.token}"/>

                                                <div class="form-group">
                                                    <label class="col-md-4 control-label" for="prependedtext">客户id</label>
                                                    <div class="col-md-8">
                                                        <input   class="control-form" id="clientId" name="clientId"  >

                                                    </div>

                                                </div>


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

                                        <button id="issuedModalBtn" ref="${addAuthUrl}" type="button" class="btn btn-info" type="submit" data-dismiss="modal">Post New Message</button>

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

                    <table class=" table-striped" id="bussiness-table" data-url="${logUrl}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
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
                           data-toolbar="#log_toolbar">
                        <thead>
                        <tr>
                            <th data-field="state" data-checkbox="true"></th>
                            <th data-field="createDate">新建时间</th>
                            <th data-field="idLong" data-formatter="idFormatter">id</th>
                            <th data-field="status" >status</th>
                            <th data-field="duration" >查询用时</th>


                            <th data-field="reqContent">请求内容</th>
                            <th data-field="requestURI" >请求主题</th>
                            <th data-field="remoteAddr" >请求地址</th>

                            <th data-field=""  data-formatter="operationFormatter">操作</th>
                        </tr>
                        </thead>
                    </table>

                </div>

            </div>


 <#--           <div role="tabpanel">
                <ul class="nav nav-tabs" role="tablist">





                </ul>
                <div class="tab-content">

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

                                <table class=" table-striped" id="bussiness-table" data-url="{auditPointUrl}" data-toggle="table" data-classes="table table-hover"   data-method="GET"
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

-->

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
    function idFormatter(value, row, index) {
        return   '<strong><a href="'+ row.url + '">'+row.idLong+'</a></strong>';
    }
    function operationFormatter(value, row, index) {


        return   '<strong><a href="'+ row.url + '">操作</a></strong>';



    }




</script>
</body>
</html>
