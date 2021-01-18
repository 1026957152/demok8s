

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

    <script src="https://cdn.bootcss.com/sigma.js/1.2.1/sigma.min.js"></script>
<#--    <script src="http://sigmajs.org/assets/js/sigma.parsers.gexf.min.js"></script>-->
    <script src="https://cdn.bootcss.com/sigma.js/1.2.1/plugins/sigma.parsers.json.min.js"></script>
    <style type="text/css">
        #container {
            max-width: 400px;
            height: 400px;
            margin: auto;
        }
    </style>

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


<div class="container" style="margin-bottom:60px; margin-top:20px">

    <div id="container"></div>

    <#--    <script src="./sigma.min.js"></script>-->
   <script>
        // Let's first initialize sigma:
        var s = new sigma('container');

        // Then, let's add some data to display:
        s.graph.addNode({
            // Main attributes:
            id: 'n0',
            label: 'Hello',
            // Display attributes:
            x: 0,
            y: 0,
            size: 1,
            color: '#f00'
        }).addNode({
            // Main attributes:
            id: 'n1',
            label: 'World !',
            // Display attributes:
            x: 1,
            y: 1,
            size: 1,
            color: '#00f'
        }).addEdge({
            id: 'e0',
            // Reference extremities:
            source: 'n0',
            target: 'n1'
        });

        // Finally, let's ask our sigma instance to refresh:
        s.refresh();
    </script>
<#--    <script>
        sigma.parsers.json('data.json', {
            container: 'container',
            settings: {
                defaultNodeColor: '#ec5148'
            }
        });
    </script>-->


    <div id="container">
        <style>
            #graph-container {
                top: 0;
                bottom: 0;
                left: 0;
                right: 0;
                position: absolute;
            }
        </style>
        <div id="graph-container"></div>
    </div>
    <script>
        /**
         * Here is just a basic example on how to properly display a graph
         * exported from Gephi as a JSON file, with the JSON Exporter plugin from
         * the Oxford Internet Institute:
         *
         *  > https://marketplace.gephi.org/plugin/json-exporter/
         *
         * The plugin sigma.parsers.json can load and parse the JSON graph file,
         * and instantiate sigma when the graph is received.
         *
         * The object given as the second parameter is the base of the instance
         * configuration object. The plugin will just add the "graph" key to it
         * before the instanciation.
         */
        sigma.parsers.json('${dataUrl}', {
            container: 'graph-container'
        });
    </script>

    <nav class="navbar navbar-default" role="navigation">

        <div class="navbar-header">
            <button type="button " class="navbar-toggle btn-primary" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

            <span class="navbar-brand" ><b></b> 榆林住房公积金省监管平台接入 </span>

        </div>

        </nav>


    <div class="col-l">
    </div>

    <div role="tabpanel">
        <ul class="nav nav-tabs" role="tablist">




            <li role="presentation" class="active"><a href="#提取项目s" aria-controls="coalDeals" role="tab"
                                                      data-toggle="tab">提取项目s</a></li>



        </ul>
        <div class="tab-content">
            <div role="tabpanel" class="tab-pane active" id="提取项目s">
                <div class="row col-lg-12" style="">
                    <section class="">
                        <table class="table table-striped">
                            <caption>基本的表格布局</caption>
                            <thead>
                            <tr>
                                <th>名称</th>

                                <th>是否完成</th>

                                <th>城市</th>
                            </tr>
                            </thead>
                            <tbody>

<#--                            <#list auditItems as category >
                                <tr>
                                    <td>${category.no}</td>
                                    <td>${category.name!''}</td>


                                    <td>
                                        ${category.desc!''}
                                    </td>


                                    <td><a href="${category.url!''}">json返回</a></td>
                                </tr>

                            </#list>-->

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
