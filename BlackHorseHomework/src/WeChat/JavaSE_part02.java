package WeChat;

import java.awt.*;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 创建时间：2020/7/30
 * 微信第二天作业
 * @author wpf
 */

public class JavaSE_part02 {

    public static void Demo1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = a%2 == 0 ? true : false;
        if (b) {
            System.out.println(a +"是偶数");
        } else {
            System.out.println(a +"a是奇数");
        }
    }

    public static void Demo2() {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score > 60 && score <= 100) {
            System.out.println("考试及格");
        } else if (score < 60 && score >=0 ) {
            System.out.println("考试不及格");
        } else {
            System.out.println("分数输入错误");
        }
    }

    public static void Demo3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入身高：");
        int howTall = sc.nextInt();
        System.out.println("我的姓名是"+ name +",年龄"+ age +"岁,身高"+ howTall +"cm");
    }

    public static void Demo4() {
        int num = 123;
        System.out.println("百位数是"+ (num / 100));
        System.out.println("十位数是"+ ((num - (num / 100) * 100)/ 10));
        System.out.println("个位数是"+ (num % 10));
    }

    public static void Demo5() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        System.out.println("长方形的面积为："+ (length * width));
        System.out.println("长方形的周长为："+ (length * 2 + width * 2));
    }

    public static void Demo6() {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int c = a > b ? a+b : a*b;
        System.out.println(c);
    }

    public static void Demo7() {
        int i =5;
        double d = 3.14;
        short s = (short) (i + d);
        System.out.println(s);
    }

    public static void DemoMore1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明左手中的纸牌");
        int leftCard = sc.nextInt();
        System.out.println("请输入小明右手中的纸牌");
        int rightCard = sc.nextInt();
        System.out.println("互换后小明手中的纸牌：");
        System.out.println("左手中的纸牌："+ rightCard);
        System.out.println("右手中的纸牌："+ leftCard);
    }

    public static void DemoMore2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入本金：");
        int a = sc.nextInt();
        double money = a * 1.0;
        System.out.println("存取一年后的本息是："+ money * 1.0225);
        System.out.println("存取两年后的本息是："+ money * 1.027);
        System.out.println("存取三年后的本息是："+ money * 1.0324);
        System.out.println("存取五年后的本息是："+ money * 1.036);
    }

    public static void main(String[] args) {
//        DemoMore2();

//        SortedSet<String> so = new TreeSet<>();
//        so.add("A");
//        so.add("Bidjvos");
//        so.add("CDd");
//        SortedSet<String> sub_so = so.subSet("A", "C");
//        System.out.println(sub_so);


        System.out.println('A'+0);
    }
}
