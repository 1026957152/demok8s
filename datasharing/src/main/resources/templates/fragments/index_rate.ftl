<div class="row">
    <div class="col-md-4">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <h3 class="panel-title">分类占比 ${indexMap.分类占比}</h3>
                <span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-down"></i></span>
            </div>
            <div class="panel-body">已分类的疑点数量与总疑点数量的占比，分类占比越高，说明逐笔排查工作有成效。</div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="panel panel-success">
            <div class="panel-heading">
                <h3 class="panel-title">销号占比 ${indexMap.销号占比}</h3>
                <span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-up"></i></span>
            </div>
            <div class="panel-body">整改销号的疑点数量占初始可降指标的疑点数量的占比。销号占比越高，说明整改销号工作推进有成效。</div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="panel panel-info">
            <div class="panel-heading">
                <h3 class="panel-title">留痕占比 ${indexMap.留痕占比}</h3>
                <span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-up"></i></span>
            </div>
            <div class="panel-body">在已整改销号的疑点数量中，通过业务流程整改销号的比率，占所有销号数量的占比。留痕占比越高，说明整改销号过程在有保障的情况下进行，有效防止因整改而产生新的风险。</div>
        </div>
    </div>


    <div class="col-md-4">
        <div class="panel panel-warning">
            <div class="panel-heading">
                <h3 class="panel-title">有增指标 ${indexMap.有增指标}</h3>
                <span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-up"></i></span>
            </div>
            <div class="panel-body">监控在3个月内发现“有增多趋势”的指标数量，有指标增加，要着重关注。</div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="panel panel-warning">
            <div class="panel-heading">
                <h3 class="panel-title">零增指标 ${indexMap.零增指标}</h3>
                <span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-up"></i></span>
            </div>
            <div class="panel-body">同时监控3个月内“保持零增”的指标，零增指标越多，说明防控措施越有成效。</div>
        </div>
    </div>
    <#if pie_by_risk??>
        <div class="col-md-4">
            <div class="panel panel-danger">
                <div class="panel-heading">
                    <h3 class="panel-title">指标分类占比</h3>
                    <span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-up"></i></span>
                </div>
                <div class="panel-body">
                    <#include "chart_pie_by_risk.ftl">
                </div>
            </div>
        </div>

    </#if>


</div>

