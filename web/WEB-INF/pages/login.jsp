<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/12
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--登录界面--%>
    <%--通过action属性的login经过web跳转到DoLoginServlet--%>
    <form action="doLogin" method="post"><%--表单,属性：要跳转的地址，提交方式设置隐藏--%>
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="pwd"><br>
        <input type="submit"><br> <%--提交按钮--%>
        <a href="register">尚未注册，请先注册</a>
    </form>
</body>
</html>
