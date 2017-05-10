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
    <title>登入</title>
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
                    <li><i class="glyphicon glyphicon-envelope" ></i><a href="xiyeming@163.com">xiyeming@163.com</a></li>
                    <li><i class="glyphicon glyphicon-earphone" ></i>+86 186-3359-5156</li>

                </ul>
            </div>
            <div class="header-right animated wow fadeInRight" data-wow-delay=".5s">
                <div class="header-right1 ">
                    <ul>

                        <li><i class="glyphicon glyphicon-log-in" ></i><a href="${pageContext.request.contextPath}/view/login">登入</a></li>
                        <li><i class="glyphicon glyphicon-book" ></i><a href="${pageContext.request.contextPath}/view/register">注册</a></li>
                    </ul>
                </div>
                <div class="header-right2">
                    <div class="cart box_1">
                        <a href="../checkout.jsp">
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
                        <li><a href="contact.jsp">关于我们</a></li>
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
        <h3 class="animated wow fadeInRight" data-wow-delay=".5s"><a href="${pageContext.request.contextPath}/view/index">主页</a><label>/</label>登入</h3>
        <div class="clearfix"> </div>
    </div>
</div>
<!-- contact -->
<div class="login">
    <div class="container">
        <form id="from">
            <div class="col-md-6 login-do1 animated wow fadeInLeft" data-wow-delay=".5s">
                <div class="login-mail">
                    <input type="text" placeholder="账号" required="" name="username">
                </div>
                <div class="login-mail">
                    <input type="password" placeholder="密码" required="" name="userpwd">
                </div>
                <a class="news-letter " href="#">
                    <label class="checkbox1"><input type="checkbox" name="checkbox" ><i> </i>记住密码</label>
                </a>


            </div>
            <div class="col-md-6 login-do animated wow fadeInRight" data-wow-delay=".5s">
                <label class="hvr-sweep-to-top login-sub">
                    <input type="button" value="登入" id="onl">
                </label>
                <p>还没有账号?</p>
                <a href="${pageContext.request.contextPath}/view/register" class="hvr-sweep-to-top">注册</a>
            </div>

            <div class="clearfix"> </div>
        </form>

    </div>
</div>

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
                <p>手榴弹付款记录可适当考虑房价快速的看法就流口水的.<span>萨克乐山大拉克丝带你飞开始懂
                    了克鲁塞德老师迪欧威尔尼古拉斯钓翁老师带你.</span></p>
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
<script type="text/javascript">
    $('#onl').click(
        function() {
            var senddata = {
                "username": $("input[name=username]").val(),
                "userpwd": $("input[name=userpwd]").val()
            };
            $.ajax({
                url:'${pageContext.request.contextPath}/user/user/login',
                data:senddata,
                dataType:'json',
                type:'post',
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
        }
    )
</script>
<!-- //footer -->
</body>
</html>
