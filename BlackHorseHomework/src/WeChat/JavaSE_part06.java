package WeChat;

import java.util.Random;

/**
 * 创建时间：2020/8/6
 * 微信第六天作业吗、
 * @author wpf
 */

public class JavaSE_part06 {

    public static void DemoMore2() {
        Random r = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(5) + 1;
            System.out.print(array[i] + ", ");
        }

        int[] checkMember = new int[5];

        for (int i = 0; i < checkMember.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == checkMember[i]) {
                    checkMember[i] = array[j];
                }
            }
        }

        System.out.println("---");
        for (int i = 0; i < checkMember.length; i++) {
            System.out.print(checkMember[i] + ", ");
        }

    }

    public static void main(String[] args) {
        DemoMore2();
    }
}
