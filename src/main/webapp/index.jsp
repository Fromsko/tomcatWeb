<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>欢迎 - JSP Hello World</title>
    <style>
        body {
            margin: 0;
            height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            background: linear-gradient(45deg, #e3f2fd, #bbdefb);
            color: #333;
            font-family: Arial, sans-serif;
            text-align: center;
            user-select: none;
        }

        h1 {
            font-size: 2.5rem;
            margin-bottom: 20px;
        }

        a {
            text-decoration: none;
            font-size: 1.2rem;
            color: #6200ea; /* Main link color */
            padding: 10px 20px;
            border: 2px solid #6200ea;
            border-radius: 5px;
            transition: background 0.3s, color 0.3s;
        }

        a:hover {
            background: #6200ea; /* Background change on hover */
            color: white; /* Text color change on hover */
        }
    </style>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>
