<%--
  Created by IntelliJ IDEA.
  User: 16143
  Date: 2024/9/11
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>书籍选购</title>
    <style>
        body {
            margin: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background: linear-gradient(45deg, #f3e5f5, #d1c4e9);
            backdrop-filter: blur(10px);
            color: #333;
            font-family: Arial, sans-serif;
        }

        .container {
            background: rgba(255, 255, 255, 0.8);
            padding: 20px;
            border-radius: 15px;
            box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
            text-align: left;
        }

        h2 {
            margin-bottom: 20px;
            text-align: center;
        }

        p {
            margin: 10px 0;
        }

        /* Custom Checkbox Styles */
        .custom-checkbox {
            display: flex;
            align-items: center;
            cursor: pointer;
        }

        .custom-checkbox input[type="checkbox"] {
            position: relative;
            margin-right: 10px; /* Adjust spacing */
            display: inline-block; /* Ensure it is clickable */
            width: 20px; /* Set width */
            height: 20px; /* Set height */
        }

        input[type="submit"] {
            background: linear-gradient(to right, #6200ea, #3700b3);
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            transition: transform 0.3s, opacity 0.3s;
        }

        input[type="submit"]:hover {
            transform: scale(1.05);
        }

        input[type="submit"]:focus {
            outline: none;
            opacity: 0.8;
        }

    </style>
</head>
<body>
<div class="container">
    <h2>请选择您要购买的书籍</h2>
    <form action="ShoppingCarServlet" method="post">
        <p class="custom-checkbox">
            <label>
                <input class="checkbox-box" type="checkbox" name="book" value="JavaSE 应用与开发"/>
            </label>
            JavaSE 应用与开发
        </p>
        <p class="custom-checkbox">
            <label>
                <input type="checkbox" name="book" value="JavaWeb 应用与开发"/>
            </label>JavaWeb 应用与开发
        </p>
        <p class="custom-checkbox">
            <label>
                <input type="checkbox" name="book" value="JavaEE 应用与开发"/>
            </label>JavaEE 应用与开发
        </p>
        <p><input type="submit" value="提交" style="width: 100%;"/></p>
    </form>
</div>
</body>
</html>
