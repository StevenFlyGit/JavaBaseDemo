package com.wpf.web;

import com.wpf.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * 创建时间：2020/9/18
 * 登录Servlet
 * @author wpf
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
//        System.out.println("==>" + request.getAttribute("org.apache.catalina.ASYNC_SUPPORTED"));
//        request.setAttribute("org.apache.catalina.ASYNC_SUPPORTED", true);
//        System.out.println("==>" + request.getAttribute("org.apache.catalina.ASYNC_SUPPORTED"));


        String realIdentifyCode = (String) request.getSession().getAttribute("identifyCode");
        String identifyCode = request.getParameter("identifyCode");

        if (realIdentifyCode.equalsIgnoreCase(identifyCode)) {
            //如果验证码验证正确
            //获取输入的密码和数据库中的真实密码
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String realPassword = UserService.queryPasswordByUsername(username);

            request.setAttribute("username",username);


            //测试监听器
//        this.getServletContext().setAttribute("第一个ServletContext", "最大作用域");
//        request.getSession().setAttribute("第一个Session", "第二大作用域");
//        request.setAttribute("第一个request", "最小作用域");
//        request.getSession().removeAttribute("第一个Session");

            if (password.equals(realPassword)) {
                //如果密码和用户名相匹配
                HttpSession userNameSession = request.getSession();
                userNameSession.setAttribute("Username", username);
                //为保证关闭浏览器后依然能访问到该session，需要手动设置cookie
                Cookie userCookie = new Cookie("JSESSIONID", userNameSession.getId());
                userCookie.setMaxAge(60*30);
                response.addCookie(userCookie);

                //若用户点击了记住密码，则向Cookie中添加密码和用户名数据
                String remember = request.getParameter("remember");
                if (remember != null) {
                    Cookie userNameCookie = new Cookie("username", username);
                    userNameCookie.setMaxAge(60*60*24*10);
                    Cookie passwordCookie = new Cookie("password", password);
                    passwordCookie.setMaxAge(60*60*24*10);
                    response.addCookie(userNameCookie);
                    response.addCookie(passwordCookie);
                }


                request.getRequestDispatcher("/backIndex.jsp").forward(request, response);
            } else {
                //如果用户名和密码不匹配
                request.setAttribute("passwordAndUsernameWrong", "用户名或密码错误");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
        } else {
            //如果验证码验证错误
            request.setAttribute("identifyCodeWrong", "验证码错误");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
