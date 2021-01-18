<nav class="navbar navbar-default" role="navigation">
    <#--        <a class="navbar-brand" href="#">榆林住房公积金省监管平台接入  ${version}  ${principals}</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>-->
    <div class="navbar-header">
        <button type="button " class="navbar-toggle btn-primary" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>

        <span class="navbar-brand" ><b></b> 榆林住房公积金 开放api  ${version!''} <#--${principals}--> </span>

    </div>


    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="navbar-brand-centered">
        <ul class="nav navbar-nav">
<#--            <li><a href="#">Link</a></li>
            <li><a href="#">Link</a></li>-->
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">信息 (<b>2</b>)</a>
                <ul class="dropdown-menu notify-drop">
                    <div class="notify-drop-title">
                        <div class="row">
                            <div class="col-md-6 col-sm-6 col-xs-6">Bildirimler (<b>2</b>)</div>
                            <div class="col-md-6 col-sm-6 col-xs-6 text-right"><a href="" class="rIcon allRead" data-tooltip="tooltip" data-placement="bottom" title="tümü okundu."><i class="fa fa-dot-circle-o"></i></a></div>
                        </div>
                    </div>
                    <!-- end notify title -->
                    <!-- notify content -->
                    <div class="drop-content">
                        <li>
                            <div class="col-md-3 col-sm-3 col-xs-3"><div class="notify-img"><img src="http://placehold.it/45x45" alt=""></div></div>
                            <div class="col-md-9 col-sm-9 col-xs-9 pd-l0"><a href="">Ahmet</a> yorumladı. <a href="">Çicek bahçeleri...</a> <a href="" class="rIcon"><i class="fa fa-dot-circle-o"></i></a>

                                <hr>
                                <p class="time">Şimdi</p>
                            </div>
                        </li>
                        <li>
                            <div class="col-md-3 col-sm-3 col-xs-3"><div class="notify-img"><img src="http://placehold.it/45x45" alt=""></div></div>
                            <div class="col-md-9 col-sm-9 col-xs-9 pd-l0"><a href="">Ahmet</a> yorumladı. <a href="">Çicek bahçeleri...</a> <a href="" class="rIcon"><i class="fa fa-dot-circle-o"></i></a>
                                <p>Lorem ipsum sit dolor amet consilium.</p>
                                <p class="time">1 Saat önce</p>
                            </div>
                        </li>
                        <li>
                            <div class="col-md-3 col-sm-3 col-xs-3"><div class="notify-img"><img src="http://placehold.it/45x45" alt=""></div></div>
                            <div class="col-md-9 col-sm-9 col-xs-9 pd-l0"><a href="">Ahmet</a> yorumladı. <a href="">Çicek bahçeleri...</a> <a href="" class="rIcon"><i class="fa fa-dot-circle-o"></i></a>
                                <p>Lorem ipsum sit dolor amet consilium.</p>
                                <p class="time">29 Dakika önce</p>
                            </div>
                        </li>
                        <li>
                            <div class="col-md-3 col-sm-3 col-xs-3"><div class="notify-img"><img src="http://placehold.it/45x45" alt=""></div></div>
                            <div class="col-md-9 col-sm-9 col-xs-9 pd-l0"><a href="">Ahmet</a> yorumladı. <a href="">Çicek bahçeleri...</a> <a href="" class="rIcon"><i class="fa fa-dot-circle-o"></i></a>
                                <p>Lorem ipsum sit dolor amet consilium.</p>
                                <p class="time">Dün 13:18</p>
                            </div>
                        </li>
                        <li>
                            <div class="col-md-3 col-sm-3 col-xs-3"><div class="notify-img"><img src="http://placehold.it/45x45" alt=""></div></div>
                            <div class="col-md-9 col-sm-9 col-xs-9 pd-l0"><a href="">Ahmet</a> yorumladı. <a href="">Çicek bahçeleri...</a> <a href="" class="rIcon"><i class="fa fa-dot-circle-o"></i></a>
                                <p>Lorem ipsum sit dolor amet consilium.</p>
                                <p class="time">2 Hafta önce</p>
                            </div>
                        </li>
                    </div>
                    <div class="notify-drop-footer text-center">
                        <a href=""><i class="fa fa-eye"></i> 查看所有</a>
                    </div>
                </ul>
            </li>
            <#if isAuthenticated>
                <li><a href="#">${authUser.name!''}@${authUser.departmentName!''}</a></li>
                <li><a href="/perform_logout">登出</a></li>

                <#else>
                    <li><a href="#">登录</a></li>

            </#if>


        </ul>
    </div><!-- /.navbar-collapse -->

</nav>