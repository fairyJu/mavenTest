<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/14
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="/js/jquery-1.8.3.min.js"></script>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">

    </script>
</head>
<body>
<form action="/home/true" method="post">
     编号:
            <input name="userid" id="userid"/><br>
     姓名:
            <input name="username" id="username"/><br>
     密码:
            <input name="pwd" id="pwd"/><br/>
     邮箱:
            <input name="email" id="email"/><br>
    <input type="submit" vlaue="提交" id="sub" />
</form>
</body>
</html>
