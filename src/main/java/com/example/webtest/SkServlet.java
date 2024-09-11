package com.example.webtest;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "sk_servlet", value = "/sk-servlet", description = "自定义的 Servlet")
public class SkServlet extends HelloServlet {

    public void init() {
        System.out.println(this.getServletName() + "的 init() 方法被调用");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String message = "Hello World!";
        PrintWriter out = response.getWriter();

        out.println("<HTML>");
        out.println("<HEAD><TITLE>The first servlet</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<h1>" + message + "</h1>");
        out.println("</BODY></html>");
    }

    public void destroy() {
        super.destroy();
    }
}
