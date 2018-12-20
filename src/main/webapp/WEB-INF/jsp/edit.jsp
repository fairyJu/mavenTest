<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/10
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<h2>欢迎</h2>
<body>
<form action="/home/show" method="post">
    <input type="hidden" name="userid" value="${editUser.userid}"/>
    <table>
        <tr>
            <td>编号</td>
            <td><input type="text" value="${editUser.userid}" name="userid" id="userid"/></td><br>
            <td>名字</td>
            <td><input type="text" value="${editUser.username}" name="username" id="username"/></td><br>
            <td>密码</td>
            <td><input type="text" value="${editUser.pwd}" name="pwd" id="pwd"/></td>
            <td>邮箱</td>
            <td><input type="text" value="${editUser.email}" name="email" id="email"/></td>
            <td><button type="submit" value="修改" >修改</button>
                <button type="submit" value="返回列表" id="selAll">返回列表</button>
            </td>
        </tr>

    </table>
</form>
</body>
<script type="text/javascript">
    $(function () {
        $("#selAll").click(function () {
            window.location.href="/home/show";
        })
    })

</script>
</html>
