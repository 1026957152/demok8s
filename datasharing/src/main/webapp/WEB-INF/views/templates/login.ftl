<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>用户登录</title>
    <link href="${rc.contextPath}/components/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${rc.contextPath}/js/jquery/jquery.js"></script>
    <script src="${rc.contextPath}/components/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>




</head>
<body>
<div class="container" style="margin-bottom:60px; margin-top:20px;max-width:1200px">

    <h1 class="page-header">
        <small>           <img class="ztext-gif" role="presentation" src="https://pic2.zhimg.com/v2-ef20d7f7425386d9c485ae50d394c4b9_b.webp" data-thumbnail="https://pic2.zhimg.com/v2-ef20d7f7425386d9c485ae50d394c4b9_b.jpg" data-size="normal">
            <strong><a href="#"></a></strong> fuck 统一认证 </small>

    </h1>
    <div class=" col-md-5  col-md-offset-3 " id="register-container">
        <img href="https://pic2.zhimg.com/v2-ef20d7f7425386d9c485ae50d394c4b9_b.webp"/>

        <ul class="nav nav-tabs " id="ajaxTabs" role="tablist">

            <li role="presentation" class="active"><a href="#companies" aria-controls="capitalHistory" role="tab"
                                                      data-toggle="tab">密码登录 <span class="badge"></span></a></li>


        </ul>

        <div  class="tab-content">

            <div class="tab-pane active" id="companies">
                <div class="box-body box-profile " style="margin-top:5%;">


                    <form method="post" id="login_form" action="${rc.contextPath}/perform_login" role="login">
<#--
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
-->
<#--
                        <input type="" name="url" value="${url}"/>
-->

                        <fieldset>

                            <div class="form-group">
                                <input type="" name="username" id="phone" placeholder="请输入邮箱"
                                       class="form-control "/>
                            </div>
                            <div class="form-group">
                                <input type="password" name="password" class="form-control " id="password"
                                       placeholder="请输入密码"/>
                            </div>

                            <div class="form-group">
                                <div class="row">
                                    <div class="col-md-6">
                                        记住我: <input type="checkbox" name="remember-me" />
                                    </div>

                                </div>
                            </div>
                                    <#if openId??>
                                                                    <input  name="openId" class="form-control "type="hidden" value="${openId!''}"/>

                                                                            <div class="form-group">
                                                                                <div class="row">
                                                                                    <div class="col-md-6">
                                                                                        绑定微信: <input type="checkbox" name="bind-me" />
                                                                                    </div>

                                                                                </div>
                                                                            </div>

                                    <#else>

                                    </#if>


                        <#if error??>
                            <div class="form-group has-error" id="msg">
                                <span class="help-block" id="serverMsg">${error!''}</span>
                            </div>
                        </#if>





                            <div class="form-group">
                                <button type="submit"  class="btn  btn-primary btn-block">登录
                                </button>
                            </div>

                        </fieldset>
                    </form>


                </div>


            </div>


        </div>



        </div>
</div>




</body>
</html>