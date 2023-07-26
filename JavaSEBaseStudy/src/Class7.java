/**
 * 创建时间：2020/5/6
 * 方法递归
 * @author wpf
 */

public class Class7 {

    public static long Factorial(int num) {
        if (num == 1) { //递归头
            return 1;
        } else { //递归体
            return num * Factorial(num - 1);
        }
   }

    public static void main(String[] args) {
        System.out.println(Factorial(10));
    }
}
