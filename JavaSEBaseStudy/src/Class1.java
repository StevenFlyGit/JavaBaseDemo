import java.util.Scanner;

/**
 * 创建时间：2020/4/28
 * Java基础语法
 *
 * @author wpf
 */

public class Class1 {

    String abc = "abc";


    public static void main(String[] args) {
        long start_time = System.currentTimeMillis();

        //2020.04.28 idea初安装
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println(i);
        }
        System.out.println("");

        //2020.04.29 java 初学习
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个和尚的身高");
        int heightA = sc.nextInt();
        int heightB = sc.nextInt();
        int heightC = sc.nextInt();
        int heightMax = 0;
        heightMax = heightA > heightB ? heightA : heightB;
        heightMax = heightMax > heightC ? heightMax : heightC;
        System.out.println(heightMax);

        //求所有的水仙花数
        for (int i = 100; i < 1000; i++) {
            int three_digit = i / 100;
            int tens_digit = (i - three_digit * 100) / 10;
            int digit = i - three_digit * 100 - tens_digit * 10; //可以用三位数对10取余
            // System.out.println(three_digit);System.out.println(tens_digit);System.out.println(digit);
            // System.out.println("-----------");
            if (three_digit * three_digit * three_digit + tens_digit * tens_digit * tens_digit + digit * digit * digit == i) {
                System.out.println(i);
            }
        }
        char 个位数 = '个';
        System.out.println(个位数 + 3);


        long end_time = System.currentTimeMillis();
        System.out.println("运行时间为：" + (end_time - start_time) + "毫秒");
    }
}
