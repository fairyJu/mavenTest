<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/29
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>MavenSSMTest</title>
    <script>
       function del(id){
           if (confirm("确认删除?"))
               alert("删除成功");
           window.location.href="/home/delUser?userID="+id;
       }

    </script>

</head>
<body>

<table border="1" width="600">
    <tr>
        <td>编号</td>
        <td>名字</td>
        <td>密码</td>
        <td>邮箱</td>
        <td width="150">操作</td>
    </tr>

    <c:forEach items="${data}" var="d">
        <tr>

            <td>${d.userid}</td>
            <td>${d.username}</td>
            <td>${d.pwd}</td>
            <td>${d.email}</td>
            <td><a href="/home/editUser?userid=${d.userid}">编辑</a>
                <a href="javascript:del(${d.userid})">删除</a>
                <a href="/home/insertUser">新增</a>
            </td>

        </tr>

    </c:forEach>

</table>

</body>
</html>
