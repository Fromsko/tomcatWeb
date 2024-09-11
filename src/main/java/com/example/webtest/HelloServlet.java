package com.example.webtest;

import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "helloServlet",
        value = "/hello-servlet",
        initParams = {@WebInitParam(name = "username", value = "qst")},
        displayName = "helloServlet", description = "Servlet 的 Demo 示例"
)
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
        System.out.println(this.getServletName() + "的 init() 方法被调用");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // 获取数据输出流 -> web 浏览器
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
        System.out.println(this.getServletName() + "的 destroy() 方法被调用");
    }
}