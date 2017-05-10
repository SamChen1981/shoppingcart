<%--
  Created by IntelliJ IDEA.
  User: xiyem
  Date: 2017/3/30
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>女装</title>
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
    <link href='http://fonts.useso.com/css?family=Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>
</head>

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
                        <h1 class="animated wow pulse" data-wow-delay=".5s"><a href="${pageContext.request.contextPath}/view/index">美丽说<span>魅力无限</span></a></h1>
                    </div>

                </div>
                <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="${pageContext.request.contextPath}/view/index" class="act">主页</a></li>
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
        <h2 class="animated wow fadeInLeft" data-wow-delay=".5s">美丽说</h2>
        <h3 class="animated wow fadeInRight" data-wow-delay=".5s"><a href="${pageContext.request.contextPath}/view/index">主页</a><label>/</label>产品<label>/</label>女装</h3>
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
                    <li><i class="glyphicon glyphicon-menu-right" ></i><a href="#">畅销</a></li>
                    <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/men">男装</a></li>
                    <ul>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/men">配件</a> </li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/men">大衣 &amp; 夹克</a></li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/men">牛仔裤</a></li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/men">新到货</a></li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/men">西装</a> </li>
                        <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/men">休闲衬衫</a></li>
                    </ul>
                    <li><i class="glyphicon glyphicon-menu-right" ></i><a href="${pageContext.request.contextPath}/view/women">女装</a></li>
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
            <div class="price animated wow fadeInUp animated" data-wow-delay=".5s" >
                <h3>价格范围</h3>
                <div class="price-head">
                    <div class="col-md-6 price-head1">
                        <div class="price-top1">
                            <span class="price-top">$</span>
                            <input type="text"  value="0">
                        </div>
                    </div>
                    <div class="col-md-6 price-head2">
                        <div class="price-top1">
                            <span class="price-top">$</span>
                            <input type="text"  value="500">
                        </div>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <!--//price-->
            <!--colors-->


            <!--//colors-->
            <div class="sellers animated wow fadeInUp" data-wow-delay=".5s">

                <h3 class="best">橱窗推荐</h3>
                <div class="product-head">
                    <div class="product-go">
                        <div class=" fashion-grid">
                            <a href="${pageContext.request.contextPath}/view/single"><img class="img-responsive " src="../images/pcc.jpg" alt=""></a>

                        </div>
                        <div class=" fashion-grid1">
                            <h6 class="best2"><a href="${pageContext.request.contextPath}/view/single">Lorem ipsum </a></h6>
                            <span class=" price-in1"> <del>$50.00</del>$40.00</span>
                            <p>The standard chunk of Lorem Ipsum used</p>
                        </div>

                        <div class="clearfix"> </div>
                    </div>
                    <div class="product-go">
                        <div class=" fashion-grid">
                            <a href="${pageContext.request.contextPath}/view/single"><img class="img-responsive " src="../images/pcc1.jpg" alt=""></a>

                        </div>
                        <div class=" fashion-grid1">
                            <h6 class="best2"><a href="${pageContext.request.contextPath}/view/single">Lorem ipsum </a></h6>
                            <span class=" price-in1"> <del>$50.00</del>$40.00</span>
                            <p>The standard chunk of Lorem Ipsum used</p>
                        </div>
                        <div class="clearfix"> </div>
                    </div>

                </div>
            </div>
            <!---->
        </div>
        <div class="col-md-9 animated wow fadeInRight" data-wow-delay=".5s">
            <div class="mens-toolbar">


                <p class="showing">排序方式
                    <select>
                        <option value=""> 名字</option>
                        <option value="">  价格</option>
                    </select>
                </p>
                <p>显示
                    <select>
                        <option value=""> 9</option>
                        <option value="">  10</option>
                        <option value=""> 11 </option>
                        <option value=""> 12 </option>
                    </select>
                </p>


                <div class="clearfix"></div>
            </div>

            <div class="mid-popular">
                <div class="col-sm-4 item-grid item-gr  simpleCart_shelfItem">
                    <div class="grid-pro">
                        <div  class=" grid-product " >
                            <figure>
                                <a href="${pageContext.request.contextPath}/view/single">
                                    <div class="grid-img">
                                        <img src="../images/pr1.jpg" class="img-responsive" alt="">
                                    </div>
                                    <div class="grid-img">
                                        <img src="../images/pr.jpg" class="img-responsive" alt="">
                                    </div>
                                </a>
                            </figure>
                        </div>
                        <div class="women">
                            <a href="#"><img src="../images/ll.png" alt=""></a>
                            <h6><a href="${pageContext.request.contextPath}/view/single">Sed ut perspiciatis unde</a></h6>
                            <p ><del>$100.00</del><em class="item_price">$70.00</em></p>
                            <a href="#" data-text="添加到购物车" class="but-hover1 item_add">添加到购物车</a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 item-grid item-gr simpleCart_shelfItem">
                    <div class="grid-pro">
                        <div  class=" grid-product " >
                            <figure>
                                <a href="${pageContext.request.contextPath}/view/single">
                                    <div class="grid-img">
                                        <img src="../images/pr3.jpg" class="img-responsive" alt="">
                                    </div>
                                    <div class="grid-img">
                                        <img src="../images/pr2.jpg" class="img-responsive" alt="">
                                    </div>
                                </a>
                            </figure>
                        </div>
                        <div class="women">
                            <a href="#"><img src="../images/ll.png" alt=""></a>
                            <h6><a href="${pageContext.request.contextPath}/view/single">Sed ut perspiciatis unde</a></h6>
                            <p ><del>$100.00</del><em class="item_price">$70.00</em></p>
                            <a href="#" data-text="添加到购物车" class="but-hover1 item_add">添加到购物车</a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 item-grid item-gr simpleCart_shelfItem">
                    <div class="grid-pro">
                        <div  class=" grid-product " >
                            <figure>
                                <a href="${pageContext.request.contextPath}/view/single">
                                    <div class="grid-img">
                                        <img src="../images/pr5.jpg" class="img-responsive" alt="">
                                    </div>
                                    <div class="grid-img">
                                        <img src="../images/pr4.jpg" class="img-responsive" alt="">
                                    </div>
                                </a>
                            </figure>
                        </div>
                        <div class="women">
                            <a href="#"><img src="../images/ll.png" alt=""></a>
                            <h6><a href="${pageContext.request.contextPath}/view/single">Sed ut perspiciatis unde</a></h6>
                            <p ><del>$100.00</del><em class="item_price">$70.00</em></p>
                            <a href="#" data-text="添加到购物车" class="but-hover1 item_add">添加到购物车</a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 item-grid item-gr simpleCart_shelfItem">
                    <div class="grid-pro">
                        <div  class=" grid-product " >
                            <figure>
                                <a href="${pageContext.request.contextPath}/view/single">
                                    <div class="grid-img">
                                        <img src="../images/pr12.jpg" class="img-responsive" alt="">
                                    </div>
                                    <div class="grid-img">
                                        <img src="../images/pr13.jpg" class="img-responsive" alt="">
                                    </div>
                                </a>
                            </figure>
                        </div>
                        <div class="women">
                            <a href="#"><img src="../images/ll.png" alt=""></a>
                            <h6><a href="${pageContext.request.contextPath}/view/single">Sed ut perspiciatis unde</a></h6>
                            <p ><del>$100.00</del><em class="item_price">$70.00</em></p>
                            <a href="#" data-text="添加到购物车" class="but-hover1 item_add">添加到购物车</a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 item-grid item-gr simpleCart_shelfItem">
                    <div class="grid-pro">
                        <div  class=" grid-product " >
                            <figure>
                                <a href="${pageContext.request.contextPath}/view/single">
                                    <div class="grid-img">
                                        <img src="../images/pr15.jpg" class="img-responsive" alt="">
                                    </div>
                                    <div class="grid-img">
                                        <img src="../images/pr14.jpg" class="img-responsive" alt="">
                                    </div>
                                </a>
                            </figure>
                        </div>
                        <div class="women">
                            <a href="#"><img src="../images/ll.png" alt=""></a>
                            <h6><a href="${pageContext.request.contextPath}/view/single">Sed ut perspiciatis unde</a></h6>
                            <p ><del>$100.00</del><em class="item_price">$70.00</em></p>
                            <a href="#" data-text="添加到购物车" class="but-hover1 item_add">添加到购物车</a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 item-grid item-gr simpleCart_shelfItem">
                    <div class="grid-pro">
                        <div  class=" grid-product " >
                            <figure>
                                <a href="${pageContext.request.contextPath}/view/single">
                                    <div class="grid-img">
                                        <img src="../images/pr17.jpg" class="img-responsive" alt="">
                                    </div>
                                    <div class="grid-img">
                                        <img src="../images/pr16.jpg" class="img-responsive" alt="">
                                    </div>
                                </a>
                            </figure>
                        </div>
                        <div class="women">
                            <a href="#"><img src="../images/ll.png" alt=""></a>
                            <h6><a href="${pageContext.request.contextPath}/view/single">Sed ut perspiciatis unde</a></h6>
                            <p ><del>$100.00</del><em class="item_price">$70.00</em></p>
                            <a href="#" data-text="添加到购物车" class="but-hover1 item_add">添加到购物车</a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 item-grid item-gr simpleCart_shelfItem">
                    <div class="grid-pro">
                        <div  class=" grid-product " >
                            <figure>
                                <a href="${pageContext.request.contextPath}/view/single">
                                    <div class="grid-img">
                                        <img src="../images/pr19.jpg" class="img-responsive" alt="">
                                    </div>
                                    <div class="grid-img">
                                        <img src="../images/pr18.jpg" class="img-responsive" alt="">
                                    </div>
                                </a>
                            </figure>
                        </div>
                        <div class="women">
                            <a href="#"><img src="../images/ll.png" alt=""></a>
                            <h6><a href="${pageContext.request.contextPath}/view/single">Sed ut perspiciatis unde</a></h6>
                            <p ><del>$100.00</del><em class="item_price">$70.00</em></p>
                            <a href="#" data-text="添加到购物车" class="but-hover1 item_add">添加到购物车</a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 item-grid item-gr simpleCart_shelfItem">
                    <div class="grid-pro">
                        <div  class=" grid-product " >
                            <figure>
                                <a href="${pageContext.request.contextPath}/view/single">
                                    <div class="grid-img">
                                        <img src="../images/pr21.jpg" class="img-responsive" alt="">
                                    </div>
                                    <div class="grid-img">
                                        <img src="../images/pr20.jpg" class="img-responsive" alt="">
                                    </div>
                                </a>
                            </figure>
                        </div>
                        <div class="women">
                            <a href="#"><img src="../images/ll.png" alt=""></a>
                            <h6><a href="${pageContext.request.contextPath}/view/single">Sed ut perspiciatis unde</a></h6>
                            <p ><del>$100.00</del><em class="item_price">$70.00</em></p>
                            <a href="#" data-text="添加到购物车" class="but-hover1 item_add">添加到购物车</a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 item-grid item-gr simpleCart_shelfItem">
                    <div class="grid-pro">
                        <div  class=" grid-product " >
                            <figure>
                                <a href="${pageContext.request.contextPath}/view/single">
                                    <div class="grid-img">
                                        <img src="../images/pr23.jpg" class="img-responsive" alt="">
                                    </div>
                                    <div class="grid-img">
                                        <img src="../images/pr22.jpg" class="img-responsive" alt="">
                                    </div>
                                </a>
                            </figure>
                        </div>
                        <div class="women">
                            <a href="#"><img src="../images/ll.png" alt=""></a>
                            <h6><a href="${pageContext.request.contextPath}/view/single">Sed ut perspiciatis unde</a></h6>
                            <p ><del>$100.00</del><em class="item_price">$70.00</em></p>
                            <a href="#" data-text="添加到购物车" class="but-hover1 item_add">添加到购物车</a>
                        </div>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>


    </div></div>
</div>
</div>
<!--//products-->

<!--<div class="social animated wow fadeInUp" data-wow-delay=".1s">
	<div class="container">
		<div class="col-sm-3 social-ic">
			<a href="#">FACEBOOK</a>
		</div>
		<div class="col-sm-3 social-ic">
			<a href="#">TWITTER</a>
		</div>
		<div class="col-sm-3 social-ic">
			<a href="#">GOOGLE+</a>
		</div>
		<div class="col-sm-3 social-ic">
			<a href="#">PINTEREST</a>
		</div>
	<div class="clearfix"></div>
	</div>
</div>-->

<!-- footer -->
<div class="footer-top">
    <div class="clearfix"> </div>
</div>
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
