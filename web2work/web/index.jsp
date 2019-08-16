<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2019/8/12
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Login</title>
  </head>
  <body>
  <form action="login"  method="get">
    姓名:<input type="text" name="name"  value="" /><br>
    密码:<input type="password" name="password" /> <br>
    性别: <input type="radio" name="sex"  value="nan" />男
    <input type="radio" name="sex"  value="nv" />女<br>
    爱好:		<select name="fav">
    <option value="LOL">LOL</option>
    <option value="WOW">WOW</option>
    <option value="DNF">DNF</option>
    </select><br>
    <input type="submit" name="" value="注册"/>
  </form>
  <button onclick="load()">登陆</button>
  <script type="text/javascript">
    function load(){
      window.location.href="landing.html";
    }
  </script>
  </body>

</html>
