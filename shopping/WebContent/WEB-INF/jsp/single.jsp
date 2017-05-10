<%--
  Created by IntelliJ IDEA.
  User: xiyem
  Date: 2017/3/30
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品</title>
    <!-- for-mobile-apps -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Classic Style Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
    function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- //for-mobile-apps -->
    <link href="../css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <link href="../css/style.css" rel="stylesheet" type="text/css" media="all" />
    <!-- js -->
    <script src="../js/jquery.min.js"></script>
    <!-- //js -->
    <!-- cart -->
    <script src="../js/simpleCart.min.js"></script>
    <!-- cart -->
    <!-- for bootstrap working -->
    <script type="text/javascript" src="../js/bootstrap-3.1.1.min.js"></script>
    <!-- //for bootstrap working -->
    <!-- animation-effect -->
    <link href="../css/animate.min.css" rel="stylesheet">
    <script src="../js/wow.min.js"></script>
    <script>
        new WOW().init();
    </script>
    <!-- //animation-effect -->
    <link href='http://fonts.useso.com/css?family=Cabin:400,500,600,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.useso.com/css?family=Lato:400,100,300,700,900' rel='stylesheet' type='text/css'></head>

<body>
<!-- header -->
<div class="header">
    <div class="header-grid">
        <div class="container">
            <div class="header-left animated wow fadeInLeft" data-wow-delay=".5s">
                <ul>
                    <li><i class="glyphicon glyphicon-headphones"></i><a href="#">24x7 客服服务</a></li>
                    <li><i class="glyphicon glyphicon-envelope" ></i><a href="mailto:info@example.com">xiyeming@163.com</a></li>
                    <li><i class="glyphicon glyphicon-earphone" ></i>+86 186-3359-5156</li>

                </ul>
            </div>
            <div class="header-right animated wow fadeInRight" data-wow-delay=".5s">
                <div class="header-right1 ">
                    <ul>

                        <li id="logli"><i id="login" class="glyphicon glyphicon-log-in" ></i><a id="loga" href="${pageContext.request.contextPath}/view/login">登入</a></li>
                        <li id="logli2"><i id="login2" class="glyphicon glyphicon-book" ></i><a id="loga2" href="${pageContext.request.contextPath}/view/register">注册</a></li>
                    </ul>
                </div>
                <div class="header-right2">
                    <div class="cart box_1">
                        <a href="${pageContext.request.contextPath}/view/checkout">
                            <h3> <div class="total">
                                <span class="simpleCart_total"></span> (<span id="simpleCart_quantity" class="simpleCart_quantity"></span> 件)</div>
                                <img src="../images/cart.png" alt="" />
                            </h3>
                        </a>
                        <p><a href="javascript:;" class="simpleCart_empty">清空购物车</a></p>
                        <div class="clearfix"> </div>
                    </div>
                </div>
                <div class="clearfix"> </div>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
    <div class="container">
        <div class="logo-nav">

            <nav class="navbar navbar-default">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header nav_2">
                    <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <div class="navbar-brand logo-nav-left ">
                        <h1 class="animated wow pulse" data-wow-delay=".5s"><a href="${pageContext.request.contextPath}/view/login">美丽说<span>魅力无限</span></a></h1>
                    </div>

                </div>
                <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="${pageContext.request.contextPath}/view/login" class="act">主页</a></li>
                        <!-- Mega Menu -->
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">女装 <b class="caret"></b></a>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/view/women">女装</a></li>
                                <li role="presentation" class="divider"></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">配件</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">新到货</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">连衣裙</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">休闲衬衫</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">短裤</a></li>
                            </ul>

                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">男装 <b class="caret"></b></a>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/view/men">男装</a></li>
                                <li role="presentation" class="divider"></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">配件</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">大衣 & 夹克</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">牛仔裤</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">新到货</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">西装</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">休闲衬衫</a></li>
                            </ul>
                        </li>
                        <li><a href="${pageContext.request.contextPath}/view/contact">关于我们</a></li>
                    </ul>
                </div>
            </nav>
        </div>

    </div>
</div>
<!-- //header -->
<!--banner-->
<div class="banner-top">
    <div class="container">
        <h2 class="animated wow fadeInLeft" data-wow-delay=".5s">商品详情</h2>
        <h3 class="animated wow fadeInRight" data-wow-delay=".5s"><a href="${pageContext.request.contextPath}/view/login">主页</a><label>/</label>商品详情</h3>
        <div class="clearfix"> </div>
    </div>
</div>
<!--content-->
<div class="product">
    <div class="container">
        <div class="col-md-3 product-bottom">
            <!--categories-->
            <div class="categories animated wow fadeInUp animated" data-wow-delay=".5s" >
                <h3>类别</h3>
                <ul class="cate">
                    <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">畅销</a></li>
                    <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/men">男装</a></li>
                    <ul>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">配件</a> </li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">大衣 &amp; 夹克</a></li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">牛仔裤</a></li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">新到货</a></li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">西装</a> </li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">休闲衬衫</a></li>
                    </ul>
                    <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">女装</a> <span>(15)</span></li>
                    <ul>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">配件</a> </li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">新到货</a> </li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">连衣裙</a> </li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">休闲衬衫</a> </li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">短裤</a> </li>
                    </ul>
                </ul>
            </div>
            <!--//menu-->
            <!--price-->


            <!--//colors-->

            <!---->
        </div>
        <div class="col-md-9 animated wow fadeInRight" data-wow-delay=".5s">
            <div class="col-md-5 grid-im">
                <div class="flexslider">
                    <ul class="slides">
                        <li data-thumb="../images/si.jpg">
                            <div class="thumb-image"> <img src="../images/si.jpg" data-imagezoom="true" class="img-responsive"> </div>
                        </li>
                        <li data-thumb="../images/si1.jpg">
                            <div class="thumb-image"> <img src="../images/si1.jpg" data-imagezoom="true" class="img-responsive"> </div>
                        </li>
                        <li data-thumb="../images/si2.jpg">
                            <div class="thumb-image"> <img src="../images/si2.jpg" data-imagezoom="true" class="img-responsive"> </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="col-md-7 single-top-in">
                <div class="span_2_of_a1 simpleCart_shelfItem">
                    <h3>Nam liber tempor cum</h3>
                    <p class="in-para"> There are many variations of passages of Lorem Ipsum.</p>
                    <div class="price_single">
                        <span class="reducedfrom item_price">$140.00</span>
                        <a href="#" data-text="添加到购物车" class="but-hover1 item_add">添加到购物车</a>
                        <div class="clearfix"></div>
                    </div>



                    <div class="clearfix"> </div>
                </div>
                <!----- tabs-box ---->
                <div class="sap_tabs">
                    <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
                        <ul class="resp-tabs-list">
                            <li class="resp-tab-item " aria-controls="tab_item-0" role="tab"><span>产品详情描述</span></li>
                            <li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>商品属性信息</span></li>
                            <li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>商品评论</span></li>
                            <div class="clearfix"></div>
                        </ul>
                        <div class="resp-tabs-container">
                            <h2 class="resp-accordion resp-tab-active" role="tab" aria-controls="tab_item-0"><span class="resp-arrow"></span>产品详情描述</h2><div class="tab-1 resp-tab-content resp-tab-content-active" aria-labelledby="tab_item-0" style="display:block">
                            <div class="facts">
                                <p > There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration </p>
                                <ul>
                                    <li>Research</li>
                                    <li>Design and Development</li>
                                    <li>Porting and Optimization</li>
                                    <li>System integration</li>
                                    <li>Verification, Validation and Testing</li>
                                    <li>Maintenance and Support</li>
                                </ul>
                            </div>

                        </div>
                            <h2 class="resp-accordion" role="tab" aria-controls="tab_item-1"><span class="resp-arrow"></span>商品属性信息</h2><div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
                            <div class="facts1">

                                <div class="color"><p>Color</p>
                                    <span >Blue, Black, Red</span>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="color">
                                    <p>Size</p>
                                    <span >S, M, L, XL</span>
                                    <div class="clearfix"></div>
                                </div>

                            </div>

                        </div>
                            <h2 class="resp-accordion" role="tab" aria-controls="tab_item-2"><span class="resp-arrow"></span>商品评论</h2><div class="tab-1 resp-tab-content" aria-labelledby="tab_item-2">
                            <div class="comments-top-top">
                                <div class="top-comment-left">
                                    <img class="img-responsive" src="../images/co.png" alt="">
                                </div>
                                <div class="top-comment-right">
                                    <h6><a href="#">Hendri</a> - September 3, 2014</h6>

                                    <p>Wow nice!</p>
                                </div>
                                <div class="clearfix"> </div>
                                <a class="add-re" href="${pageContext.request.contextPath}/view/single">Add Review</a>
                            </div>


                        </div>
                        </div>
                    </div>
                    <script src="../js/easyResponsiveTabs.js" type="text/javascript"></script>
                    <script type="text/javascript">
                        $(document).ready(function () {
                            $('#horizontalTab').easyResponsiveTabs({
                                type: 'default', //Types: default, vertical, accordion
                                width: 'auto', //auto or any width like 600px
                                fit: true   // 100% fit in a container
                            });
                        });
                    </script>
                    <!---->
                </div>

            </div>
            <!----->
            <div class="clearfix"> </div>
            <div class=" col-md-si">

                <div class="clearfix"> </div>
            </div>
        </div>
    </div>
</div>
<!--//products-->


<!-- footer -->
<div class="footer">
    <div class="container">
        <div class="footer-top">
            <div class="clearfix"> </div>
        </div>
        <div class="footer-grids">
            <div class="col-md-4 footer-grid animated wow fadeInLeft" data-wow-delay=".5s">
                <h3>关于我们</h3>
                <p>Duis aute irure dolor in reprehenderit in voluptate velit esse.<span>Excepteur sint occaecat cupidatat
						non proident, sunt in culpa qui officia deserunt mollit.</span></p>
            </div>
            <div class="col-md-4 footer-grid animated wow fadeInLeft" data-wow-delay=".6s">
                <h3>联系方式</h3>
                <ul>
                    <li><i class="glyphicon glyphicon-map-marker" ></i>辽宁省，沈阳市，<span>新秀街2号</span></li>
                    <li class="foot-mid"><i class="glyphicon glyphicon-envelope" ></i><a href="mailto:xiyeming@163.com">xiyeming@163.com</a></li>
                    <li><i class="glyphicon glyphicon-earphone" ></i>+86 186-3359-5156</li>
                </ul>
            </div>
            <div class="col-md-4 footer-grid animated wow fadeInLeft" data-wow-delay=".7s">
                <h3>技术支持</h3>
                <ul>
                    <li></i>开发人员：<span>郗野明</span></li>
                    <li class="foot-mid"><i class="glyphicon glyphicon-envelope" ></i><a href="mailto:xiyeming@163.com">xiyeming@163.com</a></li>
                    <li><i class="glyphicon glyphicon-earphone" ></i>+86 186-3359-5156</li>
                </ul>

            </div>

            <div class="clearfix"> </div>
        </div>

        <div class="copy-right animated wow fadeInUp" data-wow-delay=".5s">
            <p>版权所有 &copy; 2017.本公司保留所有权利。</p>
        </div>
    </div>
</div>
<!-- //footer -->
<script src="../js/imagezoom.js"></script>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script defer src="../js/jquery.flexslider.js"></script>
<link rel="stylesheet" href="../css/flexslider.css" type="text/css" media="screen" />

<script>
    // Can also be used with $(document).ready()
    $(window).load(function() {
        $('.flexslider').flexslider({
            animation: "slide",
            controlNav: "thumbnails"
        });
    });
</script>
<script type="text/javascript">
    $(function () {
        var users = ${user}"";
        if(users != null && users != ""){
            $('#login').remove();
            $('#login2').remove();
            $('#loga').remove();
            $('#loga2').remove();
            $("<i></i>").attr("class","glyphicon glyphicon-user").appendTo($('#logli'));
            $("<i></i>").attr("class","glyphicon glyphicon-log-out").appendTo($('#logli2'));
            $("<a></a>").text("欢迎您：" + users.nick).appendTo($('#logli'));
            $("<a></a>").attr("class","logina").attr("href","").text("退出").appendTo($('#logli2')).click(function(){
                $.ajax({
                    url:'${pageContext.request.contextPath}/user/user/logout',
                    dataType:'json',
                    success:function (data) {
                        if(data.error_code == 1000){
                            document.location ="${pageContext.request.contextPath}/view/index";
                        }else if(data.error_code == 1001){
                            alert(data.result);
                        }else{
                            alert(data.result);
                        }
                    },
                    error:function(a,b,c){
                        alert(c);
                    }
                })
            });

        }
    })
</script>

</body>
</html>
