<%--
  Created by IntelliJ IDEA.
  User: Brown
  Date: 2022-06-05
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    未注册用户，请
    <a href="${pageContext.request.contextPath}/user/register">注册</a>
    <br/>
    已注册用户，请
    <a href="${pageContext.request.contextPath}/user/login">登录</a>

</body>
</html>
