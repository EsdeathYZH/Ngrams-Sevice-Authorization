<%--
  Created by IntelliJ IDEA.
  User: Yao Zihang
  Date: 2018/4/23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
</head>
<body>
<form action="/register" method="post">
    <%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
    请输入用户名：<input type="text" name="username"/><br/>
    输入密码：<input type="password" name="password"/><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
