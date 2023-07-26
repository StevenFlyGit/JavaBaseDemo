package com.wpf.web;

import com.wpf.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 创建时间：2020/9/18
 * 登录Servlet
 * @author wpf
 */
@WebServlet("/Login2")
public class Login2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String contextPath = request.getContextPath();
//        System.out.println(contextPath);

        String realPassword = UserService.queryPasswordByUsername(username);

        request.setAttribute("username",username);

        this.getServletContext().setAttribute("第一个ServletContext", "最大作用域");
        request.getSession().setAttribute("第一个Session", "第二大作用域");
        request.setAttribute("第一个request", "最小作用域");

        request.getSession().removeAttribute("第一个Session");

        if (password.equals(realPassword)) {
            request.getRequestDispatcher("/backIndex.jsp").forward(request, response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
