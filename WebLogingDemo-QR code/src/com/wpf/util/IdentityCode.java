package com.wpf.util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * 创建时间：2020/9/19
 * 使用jdk自带绘图类画临时的内存验证码图片输出
 * @author wpf
 */

public class IdentityCode {
    private static String selectedString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static Random random = new Random();

    //获取一个随机颜色
    private static Color getRandomColor(){
        //创建颜色对象语法：new Color(int r,int g,int b)
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r,g,b);
    }

    public static BufferedImage getQRCodeImage(String randomCodeString) {
        BufferedImage image = new BufferedImage(150,50, BufferedImage.TYPE_INT_RGB);

        Graphics g = image.getGraphics();

        g.fillRect(0,0,150,50);
        g.setColor(Color.black);
        g.drawRect(1,1,147,47);

        for (int i = 0; i < 4; i++) {
            g.setColor(getRandomColor());

            int x1 = random.nextInt(147);
            int y1 = random.nextInt(47);
            int x2 = random.nextInt(147);
            int y2 = random.nextInt(47);

            g.drawLine(x1,y1,x2,y2);
        }

        g.setColor(getRandomColor());
        for (int i = 0; i < 4; i++) {

            char c = randomCodeString.charAt(i);
            //设置字体并绘制在图片上
            g.setFont(new Font("微软雅黑", Font.BOLD,20));
            g.drawString(c+"",30+i*30,33);
        }
        return image;
    }

    public static String getCodeByRandomString(){
        StringBuilder codeBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(selectedString.length());
            //1.在字符串中随机选取字符并拼接成二维码的字符
            codeBuilder.append(selectedString.charAt(index));
        }
        return codeBuilder.toString();
    }

}
