/**
 * 创建时间：2020/4/29
 * 数数组内存分配和有关异常
 *
 * @author wpf
 */

public class Class3 {


    public static void main(String[] args) {

        //数组内存分配

        //栈内存存储局部变量，使用完毕会立即消失
        //堆内存存储new出来的东西（实体或对象），会在垃圾回收器空闲时被回收
        int[] arr; //声明变量时在栈内存内开辟内存空间，用于存储该数组
        arr = new int[10];

        int[] arr1 = new int[3];
        //赋值给数组内元素
        arr1[1] = 50;
        arr1[2] = 60;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        /*
		在栈内存新定义一个数组2，并在堆内存中指向数组1的地址
		实际指的是同一组数组，因此修改数组2元素的值，数组1元素的值也会改变
		*/
        int[] arr2 = arr1;
        arr2[1] = 150;
        arr2[2] = 160;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //数组的常见异常

        int[] arr_wrong = new int[5];
//        System.out.println(arr_wrong[6]); //ArrayIndexOutOfBoundsException(索引越界异常)
        arr_wrong = null;
//        System.out.println(arr_wrong[3]); //NullPointerException(空指针异常)

    }

}
