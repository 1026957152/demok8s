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
                <#list operation_statistics as category >
                    <tr>
                        <td>${category.name!''}</td>
                        <td>${category.count!''}</td>

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
        $.post("${base}/test/gradeScore.jspx",{id:id,score:score},
            function(data){
                alert("评分成功");
            },
            "html");
    }
</script>
</body>
</html>
