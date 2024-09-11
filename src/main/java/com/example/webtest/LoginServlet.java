package com.example.webtest;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServlet", value = "/login", displayName = "loginServlet", description = "Servlet 的 Login 示例")
public class LoginServlet extends HttpServlet {

    @Override
    public void init() {
        System.out.println(this.getServletName() + "的 init() 方法被调用");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String cookieKey = "userInfo";
        String cookieValue = "skong";

        // 读取 Cookies
        Cookie[] cookies = request.getCookies();
        String user = "";
        String pwd = "";
        String isChecked = "";

        // 判断是否曾经存储过
        if (cookies != null) {
            isChecked = "checked";
            for (Cookie cookie : cookies) {
                // 取出用户
                if (cookie.getName().equals(cookieKey)) {
                    user = cookie.getName();
                }
                // 取出密码
                if (cookie.getValue().equals(cookieValue)) {
                    pwd = cookie.getValue();
                }
            }
        }

        // 渲染文档
        response.setContentType("text/html; charset=GBK");
        PrintWriter out = response.getWriter();
        String buff = "<html>" +
                "<body>" +
                "<title>登录</title>" +
                "<center>" +
                "<form action='CookieTest' method='post'>\n" +
                "姓名: <input type='text' name='UserName' value='" + user + "' /><br/>" +
                "密码: <input type='text' name='Password' value='" + pwd + "' /><br/>" +
                "保存账号密码<input type='checkbox' name='SaveCookie' value='Yes'" + isChecked + ">\n<br/>" +
                "<input type='submit'/>\n" +
                "</form>" +
                "</center>" +
                "</body>" +
                "</html>";

        out.println(buff);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
