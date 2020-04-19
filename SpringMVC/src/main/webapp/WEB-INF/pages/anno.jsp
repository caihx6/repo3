<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/4/17
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注解</title>
</head>
<body>
<%--       常用注解--%>

<a href="/anno/testRequestParam?name=haha">RequestParam</a>

<%--pathVariable--%>
<a href="/anno/testPathVariable/10">PathVariable</a>

<%--CookieValue--%>
<a href="/anno/CookieValue">CookieValue</a>

<%--ModleAttribute--%>
<form action="/anno/testModleAttribute" method="post">

    姓名：<input type="text" name="username"><br/>
    密码:<input type="text" name="password"/><br/>
    金额:<input type="text" name="money"/><br/>

    <input type="submit" value="提交"/><br/>
    </form>

<%--SessionAttributes--%>
<a href="SessionAttributes">SessionAttributes</a>
</body>
</html>
