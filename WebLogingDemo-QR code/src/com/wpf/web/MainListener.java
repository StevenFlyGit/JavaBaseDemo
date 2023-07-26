package com.wpf.web;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * 创建时间：2020/9/18
 * 主监听器
 * @author wpf
 */
@WebListener()
public class MainListener implements
        ServletRequestListener, ServletRequestAttributeListener,
        HttpSessionListener, HttpSessionAttributeListener,
        ServletContextListener, ServletContextAttributeListener{

    // Public constructor is required by servlet spec
    public MainListener() {
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sqe) {
        System.out.println("request对象已销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sqe) {
        System.out.println("request对象已创建");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println(srae.getName()+"添加到了request域,值为："+srae.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println(srae.getName()+"从request域中删除了");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println(srae.getName()+"在request域中被修改了，修改后的值为："+srae.getValue());
    }

    @Override
    public void sessionCreated(HttpSessionEvent hse) {
        System.out.println("session对象已创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent hse) {
        System.out.println("session对象已销毁");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent hsbe) {
        System.out.println(hsbe.getName()+"添加到了session域,值为："+hsbe.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent hsbe) {
        System.out.println(hsbe.getName()+"从session域中删除了");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent hsbe) {
        System.out.println(hsbe.getName()+"在session域中被修改了，修改后的值为："+hsbe.getValue());
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext对象已创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext对象已销毁");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println(scae.getName()+"添加到了ServletContext域,值为："+scae.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println(scae.getName()+"从ServletContext域中删除了");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println(scae.getName()+"在ServletContext域中被修改了，修改后的值为："+scae.getValue());
    }


    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------

}
