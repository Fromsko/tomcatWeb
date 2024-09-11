package com.example.exercise;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RedirectServlet", value = "/RedirectServlet")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out = response.getWriter();
        out.println("重定向之前");
        response.sendRedirect(request.getContextPath() + "/MyServlet");
        out.println("重定向之后");
    }

    @Override
    public void init() {
        System.out.println(this.getServletName() + "被调用!");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
