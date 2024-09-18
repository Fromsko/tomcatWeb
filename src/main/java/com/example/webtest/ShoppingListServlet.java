package com.example.webtest;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "ShoppingListServlet", value = "/ShoppingListServlet")
public class ShoppingListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();

        HttpSession session = request.getSession();
        Map<String, Integer> car = (Map<String, Integer>) session.getAttribute("shoppingCar");

        if (car != null && car.size() >0) {
            for (String bookName : car.keySet()) {
                writer.println("<p> "+bookName+" , "+ car.get(bookName) +"本 </p>");
            }
        } else {
            writer.println("<p>您未购买任何书籍!</p>");
        }
        writer.println("<p><a href='bookChoose.jsp'>继续购买</a></p>");
    }
}
