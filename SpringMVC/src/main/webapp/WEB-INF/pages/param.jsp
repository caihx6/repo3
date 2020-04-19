<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/4/17
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数传递</title>
</head>
<body>
<%--<a href="/param/testParam?userName=caihuaixu">请求参数绑定</a>--%>

<%--  把数据封装到类--%>
<%--<form action="/param/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br/>
    密码：<input type="text" name="password"><br/>
    金额:<input type="text" name="money"/><br/>
    性别：<input type="text" name="user.sex"><br/>
    年龄:<input type="text" name="user.age"/><br/>
         <input type="submit" value="提交"/><br/>
</form>--%>
<%-- 把数据封装到account类，类中存在集合--%>
<%--<form action="/param/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br/>
    密码：<input type="text" name="password"><br/>
    金额:<input type="text" name="money"/><br/>

    性别：<input type="text" name="list[0].sex"><br/>
    年龄:<input type="text" name="list[0].age"/><br/>

    性别：<input type="text" name="map['one'].sex"><br/>
    年龄:<input type="text" name="map['one'].age"/><br/>
    <input type="submit" value="提交"/><br/>
</form>--%>
<%--数据类型转换异常转换器--%>
<%--<form action="/param/saveUser" method="post">

    性别：<input type="text" name="sex"><br/>
    年龄:<input type="text" name="age"/><br/>
    出生日期:<input type="text" name="date"/><br/>

    <input type="submit" value="提交"/><br/>--%>

<a href="/param/testSeverlet">Severlet原生API</a>
</form>
</body>
</html>
