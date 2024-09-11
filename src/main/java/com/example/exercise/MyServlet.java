package com.example.exercise;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet", value = "/MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out = response.getWriter();
        String html = "<html><body><h1>重定向和转发</h1></body></html>";
        out.println(html);
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
