<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/25
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<% String _path=request.getContextPath();%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="<%=_path%>/css/style.css" rel="stylesheet" type="text/css" />
    <link href="<%=_path%>/css/LoginAndReg.css" rel="stylesheet" type="text/css" />
    <script src="<%=_path%>/js/loginValid.js" ></script>
</head>

<body>
<div id="box">
    <!--top start -->
    <div id="top">
        <a href="<%=_path%>/index/in"><img src="<%=_path%>/images/logo.gif" alt="Estimation" width="255" height="58" border="0" class="logo" /></a>
        <p class="topDiv"></p>
        <p class="navLeft"></p>
        <ul>
            <li><a href="<%=_path%>/index/in" class="hover">首页</a></li>
            <li><a href="#">关于我们</a></li>
            <li><a href="#">在线客服</a></li>
            <li class="chart"><a href="<%=_path%>/chart/in">购物车</a></li>
        </ul>
        <p class="navRight"></p>
        <p class="topDiv"></p>
        <form name="serch" action="#" method="post">
            <input type="text" name="txtbox" value="购物搜索" class="txtBox" />
            <input type="submit" name="go" value="搜" class="go" />
        </form>
    </div>
    <!--top end -->
    <!--header start -->
    <div class="nav">
        <ul>
            <li class="first"><a href="#">新品上架</a></li>
            <li><a href="#">坚果炒货</a></li>
            <li><a href="#">补血大枣</a></li>
            <li><a href="#">经典肉类</a></li>
            <li><a href="#">进口零食</a></li>
            <li><a href="#">美味糖果</a></li>
            <li><a href="#">天然干果</a></li>
            <li><a href="#">蒙古奶酪</a></li>
            <li><a href="#">台湾牛轧糖</a></li>
            <li><a href="#">蜜饯果脯</a></li>
            <li class="last">
                <div id="welcome" class="welmsgdiv2"><span>您好，欢迎光临果果香。</span><a href="/login/in">登录</a><span class="Lloginfg">&nbsp;</span><a href="/reg/reg">注册</a></div>
            </li>
        </ul>
    </div>
    <!--header end -->
    <!--guide01 start -->
    <div class="guide01">
        <img src="<%=_path%>/images/guide_01.jpg" width="973" height="62" border="0" usemap="#Map" />
        <map name="Map" id="Map">
            <area shape="rect" coords="398,11,493,51" href="#" />
            <area shape="rect" coords="540,12,633,51" href="#" />
            <area shape="rect" coords="684,12,790,53" href="#" />
            <area shape="rect" coords="830,10,953,54" href="#" />
        </map>
    </div><!--guide01 end -->
    <!--body start -->
    <div id="body">
        <div id="Login">
            <h1 align="left" style="width:343px;"><img src="<%=_path%>/images/pic_dl.gif"></h1>
            <div class="dlC">
                <div class="regSetTabBox">
                    <div class="regSetTabMenu">
                        <ul>
                            <li id="one1" onclick="setTab('one',1,2)" class="hover">口口香用户</li>
                            <li class="" id="one2" onclick="setTab('one',2,2)" style="display:none;">VIP用户</li>
                        </ul>
                    </div>
                    <div class="regSetTabCon">
                        <form:form id="loginform" modelAttribute="user"  action="${ctx}/login/login" method="post">
                            <%--<form:hidden path="merchandiseid" value="<%=request.getParameter("merchandiseid")%>"></form:hidden>--%>
                            <%--<span><%=request.getParameter("merchandiseid")%></span>--%>
                        <div style="display: block;" id="con_one_1"> <span class="blank20"></span>
                            <div class="FTextArea"><span>用户名：</span>
                                <form:input path="username"  onblur="Check_Username()"  id="Username" />
                                <form:errors path="username"  cssClass="errorClass"></form:errors>
                            </div>
                            <span class="blank20"id="CheckReUserName"></span>
                            <div class="FTextArea"><span>密&nbsp;&nbsp;码：</span>
                                <form:password path="pwd" onblur="Check_pwd()"  id="PassWord" />
                                <form:errors path="pwd"  cssClass="errorClass"></form:errors>
                            </div>
                            <span class="blank15" id="CheckRePassWord"></span>
                            <div class="btnReg">
                                <button type="submit" class="" ></button>
                                <span><a href="GetPwd1.html" title="" target="_new">密码忘记了？</a></span></div>
                            <span class="blank20"></span> </div>
                        </form:form>
                    </div>
                    <span class="blank20"></span>
                    <div class="tishiArea">
                        <div class="tishiHead">温馨提示：</div>
                        <ul>
                            <li>1、请输入您的口口香用户名及密码进行登陆；</li>
                            <li>2、如果还未注册口口香用户名，您可以使用VJIA用户名进行登陆,登陆后系统会自动为您注册一个与VJIA帐户相关联的口口香帐户。帐户关联后您可共享VJIA的会员积分和累积消费金额。</li>
                        </ul>
                        <div class="">如有疑问请进入<a href="#" target="_blank">帮助中心</a>或<a href="#" target="_blank">联系客服</a></div>
                    </div>
                </div>
            </div>
        </div>
        <br class="spacer" />
    </div>
    <!--footer start -->
    <div id="footer">
        <ul>
            <li><a href="#">首页</a>|</li>
            <li><a href="#">关于我们</a>|</li>
            <li><a href="#">新闻资讯</a>|</li>
            <li><a href="#">价单下载</a>|</li>
            <li><a href="#">联系我们</a>|</li>
        </ul>
        <p class="copyright">Copyright 2010 vancl.com All Rights Reserved 冀ICP证xxxxxx号

        </p>
        <p class="design"><a href="http://www.CSSK8.com/" target="_blank" class="link">启奥科技</a></p>
    </div><!--footer end -->
    <!--body end -->
</div><!--box-->
<script type="text/javascript">
    <% if (request.getAttribute("error")!=null){
        String errormsg=(String)request.getAttribute("error");
           out.println("alert('"+errormsg+"');");
        }
    %>
</script>
</body>

</html>
