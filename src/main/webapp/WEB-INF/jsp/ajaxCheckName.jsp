<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/6
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#ck").click(function () {
                // alert("kk");
            $.ajax({
                url:"/home/save",
                type:"post",
                data:{"name":$("#uname").val()},
                dataType:"text",
                success:function(res){
                    // alert(true);
                    $("#sp").html(res);
                },
                error:function()
                {
                    alert("error");
                }
              });
            });

        });
    </script>
</head>
<body>
<input id="uname"><span id="sp"></span>
<input type="button" value="检查昵称是否可用" id="ck"><br/>
<br/>
<input type="likeName">
<div id="text"></div>
</body>
</html>
