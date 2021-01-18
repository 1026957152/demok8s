<div class=" col-lg-4">
    <div class="well">
        <table class="table">
            <caption>销号信息</caption>
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
        <div id="containerPie_by_rectify" style="height: 400px"></div>

    </div>
</div>
<div class=" col-lg-4">
    <div class="well">
        <table class="table">
            <caption>分类信息</caption>
            <thead>
            <tr>
                <th>名称</th>
                <th>数量</th>
            </tr>
            </thead>
            <tbody>
            <#list categories as category >
                <tr>
                    <td>${category.name!''}</td>
                    <td>${category.count!''}</td>

                </tr>

            </#list>



            </tbody>
        </table>
        <div id="containerPie_by_classify" style="height: 400px"></div>


    </div>
</div>

<div class=" col-lg-4">
    <div class="well">
        <table class="table">
            <caption>留痕信息</caption>
            <thead>
            <tr>
                <th>名称</th>
                <th>数量</th>
            </tr>
            </thead>
            <tbody>
            <#list categories as category >
                <tr>
                    <td>${category.name!''}</td>
                    <td>${category.count!''}</td>

                </tr>

            </#list>



            </tbody>
        </table>
        <div id="containerPie_by_classify" style="height: 400px"></div>


    </div>
</div>


<script type="text/javascript">

    var chart = Highcharts.chart('containerPie_by_classify', {
        chart: {
            type: 'pie',
            options3d: {
                enabled: true,
                alpha: 45,
                beta: 0
            }
        },
        title: {
            text: '2014年某网站不同浏览器访问量占比'
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                depth: 35,
                dataLabels: {
                    enabled: true,
                    format: '{point.name}'
                }
            }
        },
        series: [{
            type: 'pie',
            name: '浏览器占比',
            data: ${pieClassify}/*[

                    {
                        name: 'Chrojjjjme',
                        y: 16.8,
                        sliced: true,
                        selected: true
                    },
                    {
                        name: 'Chrome',
                        y: 12.8,
                        sliced: true,
                        selected: true
                    },
                    ['Safari',    8.5],
                    ['Opera',     6.2],
                    ['Others',   0.7]
                ]*/
        }]
    });

    var chart = Highcharts.chart('containerPie_by_rectify', {
        chart: {
            type: 'pie',
            options3d: {
                enabled: true,
                alpha: 45,
                beta: 0
            }
        },
        title: {
            text: '2014年某网站不同浏览器访问量占比'
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                depth: 35,
                dataLabels: {
                    enabled: true,
                    format: '{point.name}'
                }
            }
        },

        series: [{
            type: 'pie',
            name: '浏览器占比',
            data: ${pieRectify}/*[

                    {
                        name: 'Chrojjjjme',
                        y: 16.8,
                        sliced: true,
                        selected: true
                    },
                    {
                        name: 'Chrome',
                        y: 12.8,
                        sliced: true,
                        selected: true
                    },
                    ['Safari',    8.5],
                    ['Opera',     6.2],
                    ['Others',   0.7]
                ]*/
        }]
    });

</script>
