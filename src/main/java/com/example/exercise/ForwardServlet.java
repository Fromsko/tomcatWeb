package com.example.exercise;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ForwardServlet", value = "/ForwardServlet")
public class ForwardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out = response.getWriter();
        out.println("转发之前");
        RequestDispatcher rd = request.getRequestDispatcher("/MyServlet");
        rd.forward(request, response);
        out.println("转发之后");
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
