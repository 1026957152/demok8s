
<div id="containerPie_by_risk" style="height: 400px"></div>



<script type="text/javascript">

    var chart = Highcharts.chart('containerPie_by_risk', {
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
            data: ${pie_by_risk}/*[

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
