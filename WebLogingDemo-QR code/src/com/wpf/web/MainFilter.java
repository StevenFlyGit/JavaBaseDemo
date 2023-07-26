package com.wpf.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 创建时间：2020/9/18
 * 测试过滤器
 * @author wpf
 */
@WebFilter("/test_tech/*")
public class MainFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        System.out.println("通过了过滤器");

        String username = (String) request.getSession().getAttribute("Username");
        if (username != null) {
            chain.doFilter(request, response);
        } else {
            PrintWriter out = response.getWriter();
            out.println("<script>");
            out.println("alert('请您先登录');");
            out.println("location.href='"+ request.getContextPath() +"/index.jsp';");
            out.println("</script>");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
