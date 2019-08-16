<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2019/8/15
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>loading</title>
    <!-- 布局 -->
    <style>
        #head {
            padding: 5px;
        }

        #nav {
            line-height: 30px;
            background-color: aliceblue;
            height: 300px;
            width: 100px;
            float: left;
            padding: 5px;
        }

        #section {
            width: 350px;
            float: left;
            padding: 10px;
        }

        #section2 {
            width: 350px;
            float: left;
            padding: 10px;
        }

        #footer {
            clear: both;

            padding: 5px;
        }
    </style>
</head>

<!-- 注册跳转 -->
<script type="text/javascript">
    function tologin(){
        window.location.href="login.html";
    }
</script>

<body>
<!-- 头部 -->
<div id="head" style="border:1px solid red ;width:760px;height: 130px;">
    <img src="img/163/163logo.gif"><br>
    <br><br>
    <a href=""><font color="blue">免费邮</font></a>
    <a href=""><font color="blue">企业邮</font></a>
    <a href=""><font color="blue">VIP邮箱</font></a>
    <a href=""><font color="blue">帮助</font></a>
</div>
<!-- 导航页 -->
<div id="nav" style="border:1px solid red ;width: 370px;height:440px;">
    <img src="img/163/imap.jpg"><br>
    <ul>
        <li>163三大免费邮箱</li>
        <li>全面支持安卓</li>
        <li>客户端，手机与网页</li>
    </ul>
    <br>
    <a href=""><font color="blue">立即同步</font></a>
    <a href=""><font color="blue">普通登陆</font></a>
    <a href=""><font color="blue">立即同步</font></a>

</div>

<!-- 登陆页 -->
<div id="section" style="border:1px solid red ;width: 370px;height: 190px;">
    <form action="load" method="get">
        用户名：
        <input type="text" name="user" id="username" value=""
               placeholder="请输入用户名...  "/>@163.com <br><br>
        密码：
        <input type="password" name="password" id=password" value=""/><br><br>
        <label for="edition">版本</label>
        <select name="edition" id="edition">
            <option value="默认" selected>默认</option>
            <option value="V1.0">V1.0</option>
            <option value="V2.0">V2.0</option>
        </select>
        <br><br>
        <input type="radio" name="login" value="auto"/>自动登陆
        <input type="radio" name="login" value="ssl"/>SSL <br><br>
        <input type="submit" name="登陆" id="登陆" value="登陆"/>
    </form><br><br>
    <img src="img/QQ/btn.bmp" onclick="tologin()" >
</div>

<!-- 页脚 -->
<div id="footer" style="border:1px solid red ;width:760px;height: 50px;">
    <img src="img/163/netease_logo.gif">
    <a href=""><font color="blue">关于网易</font></a>
    <a href=""><font color="blue">免费邮</font></a>
    <a href=""><font color="blue">官方博客</font></a>
    <a href=""><font color="blue">客户服务</font></a>
    <a href=""><font color="blue">隐私政策</font></a>|
    网易公司版权所有 &copy 2015-2018
</div>

</body>
</html>
