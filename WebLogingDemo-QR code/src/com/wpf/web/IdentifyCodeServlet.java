package com.wpf.web;

import com.wpf.util.IdentityCode;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 创建时间：2020/9/20
 * 验证码Servlet
 * @author wpf
 */
@WebServlet("/IdentifyCodeServlet")
public class IdentifyCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取验证码的字符串
        String codeString = IdentityCode.getCodeByRandomString();

        //2.通过工具类将图片画到内存中
        BufferedImage bufferedImage = IdentityCode.getQRCodeImage(codeString);

        //3.将图片通过IO流显示到浏览器上
        ImageIO.write(bufferedImage, "png", response.getOutputStream());

        //4.将验证码字符串存储在Session域中
        request.getSession().setAttribute("identifyCode", codeString);
    }
}
