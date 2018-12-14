<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/12
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--注册页面--%>
    <%--通过action属性的register经过web跳转到RegisterServlet--%>
    <form action="doRegister" method="post"><%--设置地址栏不显示私有数据--%>
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="pwd"><br>
        确认密码：<input type="password" name="pwds"><br>
        电话：<input type="text" name="tele"><br>
        <input type="submit" value="注册"><%--修改按钮名字--%>
    </form>
</body>
</html>
