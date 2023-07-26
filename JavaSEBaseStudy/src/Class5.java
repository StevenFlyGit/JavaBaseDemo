import java.util.Scanner;

/**
 * 创建时间：2020/4/30
 * Java基础语法案例：不死神兔
 *
 * @author wpf
 */

    /*
    案例需求：
    有一对兔子，从出生后第3个月起每个月都生一对免子，小兔子长到第三个月后每个月又生一对兔子
    假如兔子都不死，问第二十个月的兔子对数为多少?
    例子：
    第一个月：1对，第二个月：1对，第三个月：2对，第四个月：3对，第五个月：5对......
    算法过程：
    从第3个月开始，每一个月的兔子对数为前两个月的兔子对数之和
     */
public class Class5 {

    public static void main(String[] args) {
        //定义月份
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(); //若要求输入月份则加入此行，注意若数量过大可能会超过int类型的范围，且必须从第3月开始
//        int month = 20;
        //定义当月兔子对数
        int num = 0;
//        //外层循环，每两个月要往上递增
//        for (int i = 0; i <= month; i+=2) {
//            //内层循环，从第三个月开始，每个月都要加入新的兔子对，2个月为一组
//            //由于循环只执行两次，也可以直接顺序执行，对最后一次进行数量判断即可
//            if (month - i <= 2) {
//                rabbit = rabbit + num * (month - i);
//            } else {
//                rabbit = rabbit + num * 2;
//            }
//            num++;
//        }
        //定义前两个月的兔子对数
        int firstMonth = 1;
        int secondMonth = 1;

        //利用循环来计算每个月的兔子数量
        for (int i = 3; i <= month; i++) {
            //计算i月的兔子对数
            num = firstMonth + secondMonth;
            //更新前两个月的兔子对数
            firstMonth = secondMonth;
            secondMonth = num;
        }
        System.out.println("第" + month + "个月的兔子对数为" + num);
    }
}
