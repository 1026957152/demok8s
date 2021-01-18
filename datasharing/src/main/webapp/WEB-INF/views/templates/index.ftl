

<!DOCTYPE html>
<html>
<#include "fragments/header.ftl">
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

            <span class="navbar-brand" ><b></b> 榆林住房公积金省监管平台接入  ${version}</span>

        </div>

        </nav>


    <div class="col-l">
    </div>
    <div class="well">
        <a href="${auditUrl}" class="btn-success btn-lg">稽核系统</a>
        <a href="${auditDepartmentUrl}" class="btn-success btn-lg">稽核系统管理部</a>

        <a href="${datasharingUrl}" class="btn-success btn-lg">共享查询系统</a>
        <a href="${creditUrl}" class="btn-success btn-lg">二代征信上报</a>
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
