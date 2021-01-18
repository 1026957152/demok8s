

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
    <#include "../fragments/navbar.ftl">


    <div class=" col-lg-12">
        <table class="table" width="10%" style="table-layout: fixed;">
            <caption>详情</caption>
            <thead>
            <tr>
                <th width="10%">名称</th>
                <th>城市</th>
            </tr>
            </thead>
            <tbody>


            <tr>

                <td width="10%">用户--</td>
                <td> ${quickLog.clientId}</td>
            </tr>
            <tr>
                <td width="10%">编号</td>
                <td>  ${quickLog.idLong}</td>
            </tr>

            <tr>
                <td width="10%">请求主题</td>
                <td>  ${quickLog.requestURI!''}</td>
            </tr>
            <tr>
                <td width="10%">请求地址</td>
                <td>  ${quickLog.remoteAddr!''}</td>
            </tr>
            <tr>

                <td width="10%">发起时间</td>
                <td> ${quickLog.beginDateTime!''}</td>
            </tr>
            <tr>

                <td width="10%">返回时间</td>
                <td> ${quickLog.endDateTime!''}</td>
            </tr>
            <tr>

                <td width="10%">查询用时</td>
                <td> ${quickLog.duration} 秒</td>
            </tr>

            <tr>
                <td width="10%">请求信息</td>
                <td >
                    <p id="show_p_req" class="hidden">${quickLog.reqContent}</p>

<#--
                    <textarea class="form-control" name="message" rows="3" >${quickLog.reqContent} </textarea>
-->
                    <pre id="out_pre_req"></pre>

                </td>
            </tr>

            <tr>
                <td width="10%">返回信息</td>
                <td >
                    <p id="show_p" class="hidden">${quickLog.content} </p>

<#--
                    <textarea class="form-control" name="message" rows="100" id="ow_p">${quickLog.content} </textarea>
-->

                    <pre id="out_pre"></pre>
                </td>
            </tr>

            </tbody>
        </table>

    </div>


</div>
<script type="text/javascript">

    var text = document.getElementById('show_p').innerText; //获取json格式内容

    var result = JSON.stringify(JSON.parse(text), null, 2);//将字符串转换成json对象

    document.getElementById('out_pre').innerText= result ;

    document.getElementById('out_pre_req').innerText= JSON.stringify(JSON.parse(document.getElementById('show_p_req').innerText), null, 2) ;



</script>

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
