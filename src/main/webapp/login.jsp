<%--
  Created by IntelliJ IDEA.
  User: 16143
  Date: 2024/9/11
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页</title>
    <!-- Import style -->
    <link rel="stylesheet" href="//unpkg.com/element-plus/dist/index.css"/>
    <!-- Import Vue 3 -->
    <script src="//unpkg.com/vue@3"></script>
    <!-- Import component library -->
    <script src="//unpkg.com/element-plus"></script>
    <style>
        /*
          登录组件
        */
        body {
            display: flex;
            align-items: center;
            justify-content: center;
            background-image: url('https://haowallpaper.com/link/common/file/previewFileImg/26787737dbae909be477e2340e522e7a');
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
        }

        * {
            margin: 0;
        }

        .login-container {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            width: 250px;
            min-height: 100vh;
        }

        .login-box {
            display: flex;
            background-color: rgba(255, 255, 255, 0.8);
            padding: 20px;
            border-radius: 10px;
            flex-wrap: wrap;
            align-content: center;
            justify-content: space-around;
            backdrop-filter: blur(10px);
        }

        .logo {
            width: 64px;
            height: 64px;
            margin-bottom: 5px;
            border-radius: 50%;
        }

        .logo:hover {
            box-shadow: 0 0 10px 5px rgba(65, 242, 215, 0.7);
        }

        .button-group {
            display: flex;
            margin-top: 10px;
            margin-bottom: 8px;
            justify-content: center;
        }

        .button-group button {
            /* 设置按钮之间的间距 */
            margin: 0 8px;
        }

        label {
            font-weight: bold;
        }

        input {
            width: 100%;
            padding: 5px;
            border-radius: 5px;
            margin-top: 8px;
            border: 1px solid #ccc;
        }

        input:hover {
            border-color: green;
        }

        button {
            width: 100%;
            padding: 10px 20px;
            border-radius: 5px;
            border: none;
            outline: none;
            background-color: #3498db;
            color: #fff;
            cursor: pointer;
        }

        button:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
<div class="login-container">
    <div class="login-box">
        <img src="http://q1.qlogo.cn/g?b=qq&nk=1614355756&s=100" alt="Login" class="logo">
        <form action="CookieTest" method="post">
            <div class="form-group">
                <label for="qqNumber">账号</label>
                <input type="text" name="UserName" id="qqNumber" placeholder="请输入账号">
            </div>
            <div class="form-group">
                <label for="password">密码</label>
                <input type="password" name="PassWord" id="password" placeholder="请输入密码">
            </div>
            <div class="button-group">
                <button type="submit">提交</button>
            </div>
        </form>
    </div>
</div>
</body>

<script type="jscript">
    const login = () => {

    }
</script>
</html>
