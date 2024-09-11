package com.example.webtest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
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
        try {
            this.doPost(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String buff = "<html>" +
                "<body>" +
                "<form>" +
                "<input type='text' name='demo'/>" +
                "</form>" +
                "</body>" +
                "</html>";

        out.println(buff);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
