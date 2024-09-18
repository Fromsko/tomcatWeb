package com.example.webtest;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ShoppingCarServlet", value = "/ShoppingCarServlet")
public class ShoppingCarServlet extends HttpServlet {

    @Override
    public void init() {
        System.out.println(this.getServletName() + "的 init() 方法被调用");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        writer.println();
        // 获取 Session 对象
        HttpSession session = req.getSession();

        // 获取 Session 传递的属性值
        Map<String, Integer> car = (Map<String, Integer>) session.getAttribute("shoppingCar");

        // 如果不存在属性则实例化一个 hashMap
        if (car == null) {
            car = new HashMap<String, Integer>();
        }

        // 获取用户选择的书籍
        String[] books = req.getParameterValues("book");
        if(books != null && books.length > 0) {
            for (String bookName : books) {
                // 判断是否存在购物车中
                if (car.get(bookName) != null) {
                    int num = car.get(bookName);
                    car.put(bookName, num+1);
                } else {
                    car.put(bookName, 1);
                }
            }
        }

        // 更新 session 会话域
        session.setAttribute("shoppingCar", car);
        resp.sendRedirect("ShoppingListServlet");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
