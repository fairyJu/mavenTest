<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/29
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MavenSSMTest</title>
</head>
<body>
<form action="login" method="post">
    <table border="0" width="550" id="tb">
        <tr>
            <td width="70">姓名:</td>
            <td width="200"><input name="username" /></td>
            <td><span>*</span>
            </td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input name="pwd" type="password" /></td>
            <td><span>*</span></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="登录" /></td>
            <td></td>
        </tr>

    </table>
</form>
</body>
</html>
