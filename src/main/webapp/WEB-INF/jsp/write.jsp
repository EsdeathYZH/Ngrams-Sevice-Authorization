<%--
  Created by IntelliJ IDEA.
  User: SHIYONG
  Date: 2018/4/23
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>random write</title>
</head>
<body>
    <form action="/randomwrite" method="get">
        <%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
        N值：<input type="text" name="value_n"/><br/>
        生成词数量：<input type="text" name="word_num"/><br/>
        文件名：<input type="text" name="filename"/><br/>
        <input type="submit" value="random write"/>
        <a href="/logout">注销</a>
    </form>
</body>
</html>
