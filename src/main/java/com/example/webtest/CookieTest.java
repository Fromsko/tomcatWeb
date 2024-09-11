package com.example.webtest;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieTest", value = "/CookieTest")
public class CookieTest extends HttpServlet {

    @Override
    public void init() {
        System.out.println(this.getServletName() + "的 init() 方法被调用");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 设置 Cookies
        Cookie cookieUser = new Cookie("userName", request.getParameter("UserName"));
        Cookie cookiePasswd = new Cookie("userPwd", request.getParameter("PassWord"));

        // 是否存储
        String isSave = request.getParameter("SaveCookie");
        if (isSave != null && isSave.equals("Yes")) {
            cookieUser.setMaxAge(7 * 24 * 60);
            cookiePasswd.setMaxAge(7 * 24 * 60);
        } else {
            cookieUser.setMaxAge(0);
            cookiePasswd.setMaxAge(0);
        }

        // 设置响应头 Cookies
        response.addCookie(cookieUser);
        response.addCookie(cookiePasswd);

        // 数据流响应
        PrintWriter out = response.getWriter();
        out.println("Welcome, " + request.getParameter("UserName"));
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
