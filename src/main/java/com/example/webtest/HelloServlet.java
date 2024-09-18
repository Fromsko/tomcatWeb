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
        message = "Response for Server: Hello ";
        System.out.println(this.getServletName() + "的 init() 方法被调用");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");

        // 获取数据输出流 -> web 浏览器
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>JSP Hello Servlet</title>");
        out.println("<style>");
        out.println("body {");
        out.println("  margin: 0;");
        out.println("  height: 100vh;");
        out.println("  display: flex;");
        out.println("  justify-content: center;");
        out.println("  align-items: center;");
        out.println("  background: linear-gradient(45deg, #e3f2fd, #bbdefb);");
        out.println("  color: #333;");
        out.println("  font-family: Arial, sans-serif;");
        out.println("  text-align: center;");
        out.println("  user-select: none;");
        out.println("}");
        out.println("h1 {");
        out.println("  font-size: 2.5rem;");
        out.println("  margin-bottom: 20px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> " + message + " </h1>");
        out.println("<br/>");
        out.println("<h1> Servlet </h1>");
        out.println("</body>");
        out.println("</html>");
    }


    public void destroy() {
        System.out.println(this.getServletName() + "的 destroy() 方法被调用");
    }
}