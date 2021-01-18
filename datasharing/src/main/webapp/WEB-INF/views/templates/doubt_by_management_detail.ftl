

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
    <#include "fragments/jshighchart.ftl">

</head>
<body>
<div class="container" style="margin-bottom:60px; margin-top:20px">

    <#include "fragments/navbar.ftl">



    <div class="well">
        <a href="{managementUrl}" class="btn-success btn-lg">managementUrl</a>
        <a href="{sigmaUrl}" class="btn-success btn-lg">sigmaUrl</a>


    </div>


    <div class="row">
        <#if itemAdd??>
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
        </#if>
        <#if pb007??>
            <div class=" col-lg-6">
                <div class="well">
                    <table class="table">
                        <caption>机构信息</caption>
                        <thead>
                        <tr>
                            <th>名称</th>
                            <th>城市</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>名称</td>
                            <td> ${pb007.name!''}</td>
                        </tr>
                        <tr>
                            <td>编号</td>
                            <td>  ${pb007.no!''}</td>
                        </tr>
                        <tr>

                            <td>描述</td>
                            <td> ${pb007.desc!''}</td>
                        </tr>


                        </tbody>
                    </table>
                </div>
            </div>
        </#if>

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

    </div>


    <div class="col-lg-12">
        <div role="tabpanel">
            <ul class="nav nav-tabs" role="tablist">



                <li role="presentation" class="active"><a href="#待接收" aria-controls="coalDeals" role="tab"
                                                          data-toggle="tab">待接收</a></li>
                <li role="presentation" class=""><a href="#提取项目s" aria-controls="coalDeals" role="tab"
                                                          data-toggle="tab">提取项目s</a></li>


                <#--
                            <li role="presentation" ><a href="#index" aria-controls="coalDeals" role="tab"
                                                        data-toggle="tab">统计指标编码</a></li>-->

            </ul>
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="待接收">
                    <div class="row col-lg-12" style="">
                        <section class="">
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
                                        <td><a href="${category.url!''}">json返回</a></td>
                                    </tr>

                                </#list>

                                </tbody>
                            </table>

                        </section>

                    </div>
                </div>

                <div role="tabpanel" class="tab-pane " id="提取项目s">

                    <div class="row col-lg-12" style="">
                        <#include "fragments/chart_pie_by_risk.ftl">

                        <section class="">
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
                                        <td><a href="${category.url!''}">json返回</a></td>
                                    </tr>

                                </#list>

                                </tbody>
                            </table>

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




</script>
</body>
</html>
