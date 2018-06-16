<%--
  Created by IntelliJ IDEA.
  User: cier
  Date: 2018/6/16
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>收货地址</title>
</head>
<body>
<form action="/result" method="post">
    <table>
        <tr>
            <td>国家:</td>
            <td><input type="text" name="country"></td>
        </tr>
        <tr>
            <td>省份:</td>
            <td><input type="text" name="provice"></td>
        </tr>
        <tr>
            <td>城市:</td>
            <td><input type="text" name="city"></td>
        </tr>
        <tr>
            <td>区:</td>
            <td><input type="text" name="area"></td>
        </tr>
        <tr>
            <td>其他部分:</td>
            <td><input type="text" name="details"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
