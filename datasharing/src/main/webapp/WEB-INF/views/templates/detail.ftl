

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

            <span class="navbar-brand" ><b></b> 榆林住房公积金省监管平台接入  ${item.名称}</span>



        </div>

        </nav>
<#--    <div class="col-md-8 ">
        <select class="selectpicker" id="orderInventoryId" name="tax"   placeholder="">

&lt;#&ndash;
            <#list statisticalIndexCodeEnums as category >
                <option value="${category.指标编码}">  ${category.指标编码}  ${category.指标名称} </option>
            </#list>
&ndash;&gt;

        </select>

    </div>-->

    <span class="" ><b></b>   ${itemAdd.名称}</span>



    <div role="tabpanel">
        <ul class="nav nav-tabs" role="tablist">


            <li role="presentation" class="active"><a href="#indexes" aria-controls="coalDeals" role="tab"
                                       data-toggle="tab">统计指标编码，</a></li>


        </ul>
        <div class="tab-content">

            <div role="tabpanel" class="tab-pane active" id="indexes">
                <div class="row col-lg-12" style="">
                    <section class="">
                        <table class="table">
                            <caption>基本的表格布局</caption>
                            <thead>
                            <tr>
                                <th>名称</th>
                                <th>城市</th>
                                <th>是否完成</th>
                            </tr>
                            </thead>
                            <tbody>


                            <#list item.elements as category >
                                <tr>
                                    <td>${category.名称}</td>
                                    <td>${category.编码}</td>


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
