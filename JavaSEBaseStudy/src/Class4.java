/**
 * 创建时间：2020/4/29
 * 测试方发参数传递
 *
 * @author wpf
 */

public class Class4 {

    //方法参数传递(基本类型)

    public static void change(int number) {
        number = 200;
    }

    //方法中的变量会存储在栈内存中，方法结束时变量就会消失(main也是一个方法，是程序的入口)
    //对于基本参数类型，形式参数的改变，不影响实际参数的值
    public static void main(String[] args) {
        int number = 100;
        System.out.println("方法调用前：" + number);
        change(number);
        System.out.println("方法调用后：" + number);
    }

}
