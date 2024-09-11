<%--
  Created by IntelliJ IDEA.
  User: 16143
  Date: 2024/9/11
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>书籍选购</title>
</head>
<body>
<div style="text-align: center;">
    <h2>请选择您要购买的书籍</h2>
    <form action="ShoppingCarServlet" method="post">
        <p><input type="checkbox" name="book" value="JavaSE 应用与开发"/>JavaSE 应用与开发</p>
        <p><input type="checkbox" name="book" value="JavaWeb 应用与开发"/>JavaWeb 应用与开发</p>
        <p><input type="checkbox" name="book" value="JavaEE 应用与开发"/>JavaEE 应用与开发</p>
        <p><input type="submit" value="提交"/></p>
    </form>
</div>
</body>
</html>
