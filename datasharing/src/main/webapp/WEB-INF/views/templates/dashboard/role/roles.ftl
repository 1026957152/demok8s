

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>榆林住房公积金2020年离柜率提升项目需求分析</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.bootcss.com/jquery-treegrid/0.2.0/css/jquery.treegrid.min.css">

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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    <div class="container">
        <h1>树形表格 ： Table Treegrid</h1>
        <table id="table"></table>
        <br/>
        <button onclick="test()">选择</button>
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





<script src="https://cdn.bootcss.com/jquery/3.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-table/1.12.1/bootstrap-table.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-table/1.12.0/extensions/treegrid/bootstrap-table-treegrid.js"></script>
<script src="https://cdn.bootcss.com/jquery-treegrid/0.2.0/js/jquery.treegrid.min.js"></script>
<script type="text/javascript">
    var $table = $('#table');
    var data = JSON.parse(
        '[{"id":1,"pid":0,"status":1,"name":"用户管理","permissionValue":"open:user:manage"},' +
        '{"id":2,"pid":0,"status":1,"name":"系统管理","permissionValue":"open:system:manage"},' +
        '{"id":3,"pid":1,"status":1,"name":"新增用户","permissionValue":"open:user:add"},' +
        '{"id":4,"pid":1,"status":1,"name":"修改用户","permissionValue":"open:user:edit"},' +
        '{"id":5,"pid":1,"status":0,"name":"删除用户","permissionValue":"open:user:del"},' +
        '{"id":6,"pid":2,"status":1,"name":"系统配置管理","permissionValue":"open:systemconfig:manage"},' +
        '{"id":7,"pid":6,"status":1,"name":"新增配置","permissionValue":"open:systemconfig:add"},' +
        '{"id":8,"pid":6,"status":1,"name":"修改配置","permissionValue":"open:systemconfig:edit"},' +
        '{"id":9,"pid":6,"status":0,"name":"删除配置","permissionValue":"open:systemconfig:del"},' +
        '{"id":10,"pid":2,"status":1,"name":"系统日志管理","permissionValue":"open:log:manage"},' +
        '{"id":11,"pid":10,"status":1,"name":"新增日志","permissionValue":"open:log:add"},' +
        '{"id":12,"pid":10,"status":1,"name":"修改日志","permissionValue":"open:log:edit"},' +
        '{"id":13,"pid":10,"status":0,"name":"删除日志","permissionValue":"open:log:del"}]');

    $(function() {

        //控制台输出一下数据
        console.log(data);

        $table.bootstrapTable({
            data:data,
            idField: 'id',
            dataType:'jsonp',
            columns: [
                { field: 'check',  checkbox: true, formatter: function (value, row, index) {
                        if (row.check == true) {
                            // console.log(row.serverName);
                            //设置选中
                            return {  checked: true };
                        }
                    }
                },
                { field: 'name',  title: '名称' },
                // {field: 'id', title: '编号', sortable: true, align: 'center'},
                // {field: 'pid', title: '所属上级'},
                { field: 'status',  title: '状态', sortable: true,  align: 'center', formatter: 'statusFormatter'  },
                { field: 'permissionValue', title: '权限值'  },
                { field: 'operate', title: '操作', align: 'center', events : operateEvents, formatter: 'operateFormatter' },
            ],

            // bootstrap-table-treegrid.js 插件配置 -- start

            //在哪一列展开树形
            treeShowField: 'name',
            //指定父id列
            parentIdField: 'pid',

            onResetView: function(data) {
                //console.log('load');
                $table.treegrid({
                    initialState: 'collapsed',// 所有节点都折叠
                    // initialState: 'expanded',// 所有节点都展开，默认展开
                    treeColumn: 1,
                    // expanderExpandedClass: 'glyphicon glyphicon-minus',  //图标样式
                    // expanderCollapsedClass: 'glyphicon glyphicon-plus',
                    onChange: function() {
                        $table.bootstrapTable('resetWidth');
                    }
                });

                //只展开树形的第一级节点
                $table.treegrid('getRootNodes').treegrid('expand');

            },
            onCheck:function(row){
                var datas = $table.bootstrapTable('getData');
                // 勾选子类
                selectChilds(datas,row,"id","pid",true);

                // 勾选父类
                selectParentChecked(datas,row,"id","pid")

                // 刷新数据
                $table.bootstrapTable('load', datas);
            },

            onUncheck:function(row){
                var datas = $table.bootstrapTable('getData');
                selectChilds(datas,row,"id","pid",false);
                $table.bootstrapTable('load', datas);
            },
            // bootstrap-table-treetreegrid.js 插件配置 -- end
        });
    });

    // 格式化按钮
    function operateFormatter(value, row, index) {
        return [
            '<button type="button" class="RoleOfadd btn-small  btn-primary" style="margin-right:15px;"><i class="fa fa-plus" ></i>&nbsp;新增</button>',
            '<button type="button" class="RoleOfedit btn-small   btn-primary" style="margin-right:15px;"><i class="fa fa-pencil-square-o" ></i>&nbsp;修改</button>',
            '<button type="button" class="RoleOfdelete btn-small   btn-primary" style="margin-right:15px;"><i class="fa fa-trash-o" ></i>&nbsp;删除</button>'
        ].join('');

    }
    // 格式化类型
    function typeFormatter(value, row, index) {
        if (value === 'menu') {  return '菜单';  }
        if (value === 'button') {  return '按钮'; }
        if (value === 'api') {  return '接口'; }
        return '-';
    }
    // 格式化状态
    function statusFormatter(value, row, index) {
        if (value === 1) {
            return '<span class="label label-success">正常</span>';
        } else {
            return '<span class="label label-default">锁定</span>';
        }
    }

    //初始化操作按钮的方法
    window.operateEvents = {
        'click .RoleOfadd': function (e, value, row, index) {
            add(row.id);
        },
        'click .RoleOfdelete': function (e, value, row, index) {
            del(row.id);
        },
        'click .RoleOfedit': function (e, value, row, index) {
            update(row.id);
        }
    };
</script>
<script>
    /**
     * 选中父项时，同时选中子项
     * @param datas 所有的数据
     * @param row 当前数据
     * @param id id 字段名
     * @param pid 父id字段名
     */
    function selectChilds(datas,row,id,pid,checked) {
        for(var i in datas){
            if(datas[i][pid] == row[id]){
                datas[i].check=checked;
                selectChilds(datas,datas[i],id,pid,checked);
            };
        }
    }

    function selectParentChecked(datas,row,id,pid){
        for(var i in datas){
            if(datas[i][id] == row[pid]){
                datas[i].check=true;
                selectParentChecked(datas,datas[i],id,pid);
            };
        }
    }

    function test() {
        var selRows = $table.bootstrapTable("getSelections");
        if(selRows.length == 0){
            alert("请至少选择一行");
            return;
        }

        var postData = "";
        $.each(selRows,function(i) {
            postData +=  this.id;
            if (i < selRows.length - 1) {
                postData += "， ";
            }
        });
        alert("你选中行的 id 为："+postData);

    }

    function add(id) {
        alert("add 方法 , id = " + id);
    }
    function del(id) {
        alert("del 方法 , id = " + id);
    }
    function update(id) {
        alert("update 方法 , id = " + id);
    }


</script>
</body>
</html>
