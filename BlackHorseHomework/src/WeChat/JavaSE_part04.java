package WeChat;

import java.util.Random;
import java.util.Scanner;

/**
 * 创建时间：2020/8/4
 * 微信第四天作业
 * @author wpf
 */

public class JavaSE_part04 {

    public static void DemoMore1() {
       /*
        将数字1-10保存到一个长度为10的一维数组中
        定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
        给新数组的元素赋值
        求新数组所有元素的和
       */

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] new_array = new int[3];
        Random r = new Random();
        for (int i = 0; i < new_array.length; i++) {
            int order = r.nextInt(10);
            new_array[i] = array[order];
        }
        int sum = 0;
        for (int i = 0; i < new_array.length; i++) {
            sum += new_array[i];
        }
        System.out.println("新数组的和是" + sum);
    }

    public static void DemoMore2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级的总人数");
        int member = sc.nextInt();
        int[] students = new int[member];
        Random r = new Random();
        for (int i = 0; i < students.length; i++) {
            students[i] = r.nextInt(101);
        }
        int sum = 0;
        int notPass = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i];
            if (students[i] < 60) {
                notPass++;
            }
        }
        System.out.println("不及格人数有"+ notPass +"个");
        System.out.println("班级平均分是"+ (sum / member) +"分");

    }

    public static void DemoMore3() {
        /*
        从键盘上输入10个整数，合法值为1、2或3，不是这3个数则为非法数字。
        试编程统计每个整数和非法数字的个数。
         */
        Scanner sc = new Scanner(System.in);
        int one = 0, two = 0, three = 0, ohter = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入一个数字");
            int num = sc.nextInt();
            if (num == 1) {
                one++;
            } else if (num == 2) {
                two++;
            } else if (num == 3) {
                three++;
            } else {
                ohter++;
            }
        }
        System.out.println("数字一的个数" + one);
        System.out.println("数字二的个数" + two);
        System.out.println("数字三的个数" + three);
        System.out.println("非法数字的个数" + ohter);
    }

    public static void DemoMore4() {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入5个数字");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("旧数组为：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i <= array.length / 2 - 1; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }

        System.out.println("");
        System.out.println("新数组为：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void DemoMore5() {
        String password = "666666";
        System.out.println("请输入密码");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            if (password.equals(sc.nextLine())) {
                System.out.println("密码输入正确，可以取款");
                break;
            } else {
                if (i == 2) {
                    return;
                }
                System.out.println("密码错误，请重新输入");
            }
        }
        System.out.println("请输入取款金额：");
        while (true) {
            int money = sc.nextInt();
            if (money >= 0 && money <= 1000) {
                System.out.println("请取走现金："+ money +"元");
                break;
            } else {
                System.out.println("您输入的取款金额有误，请重新输入：");
            }
        }
        System.out.println("交易完成，请取卡");
    }


    public static void main(String[] args) {

    }


}
