package com.example.glassfishservletejb;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private static Hello sayHelloBean;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        sayHelloBean = new HelloBean();
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + sayHelloBean.sayHello() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}