package 线程.线程的创建;

/**
 * 创建时间：2020/8/17
 * 创建线程方法1-继承Thread类
 * @author wpf
 */

// 1.创建类，继承Thread类
public class CreateThread01 extends Thread{

    //2.重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("hhh");
        }
    }

    public static void main(String[] args) {
        //3.创建子类对象，调用start方法
        new CreateThread01().start();

        for (int i = 0; i < 5000; i++) {
            System.out.println("fff");
        }
    }
}
