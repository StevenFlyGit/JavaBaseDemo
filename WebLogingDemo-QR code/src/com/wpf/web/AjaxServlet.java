package com.wpf.web;

import com.wpf.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 创建时间：2020/9/21
 * 利用Ajax发出请的请求来获取所有用户的用户名
 * @author wpf
 */
@WebServlet("/Ajax")
public class AjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        List<String> allUserName = UserService.queryAllUserName();

        PrintWriter out = response.getWriter();
        for (String s : allUserName) {
            out.write(s + "<br/>");
        }

    }
}
