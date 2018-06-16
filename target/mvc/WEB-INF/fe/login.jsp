<%--
  Created by IntelliJ IDEA.
  User: cier
  Date: 2018/6/13
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/result" method="post">
    <table>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>性别:</td>
            <td><input type="text" name="sex"></td>
        </tr>
        <tr>
            <td>入学日期:</td>
            <td><input type="text" name="date"></td>
        </tr>
        <tr>
            <td>所学课程:</td>
            <td><input type="text" name="courses"></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
