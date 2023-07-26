package 线程.线程的创建;

/**
 * 创建时间：2020/8/17
 * 创建线程方法2-实现Runnable接口
 * @author wpf
 */


// 1.创建类，实现Runnable接口
public class CreateThread02 implements Runnable{

    //2.重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("kkk");
        }
    }


    public static void main(String[] args) {
        /*
        3.将子类对象作为参数来创建Thread类对象
        即创建实现类对象和代理类对象
         */
        new Thread(new CreateThread02()).start();

        for (int i = 0; i < 5000; i++) {
            System.out.println("ccc");
        }
    }
}
