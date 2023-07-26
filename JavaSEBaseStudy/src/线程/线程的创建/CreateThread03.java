package 线程.线程的创建;

import java.util.concurrent.*;

/**
 * 创建时间：2020/8/21
 * 创建线程方法2-实现Callable接口
 * 	1.创建类实现Callable接口，该接口需要接上泛型
 * 	2.重写call方法，call方法返回的类型即是泛型中所规定的类型
 * 	3.创建子类(即新建类)的对象
 * 	4.创建执行服务(线程池)：ExecutorService ser = Executor.newFixedThreadPool(此处传递的参数为上一步创建的对象数量);
 * 	5.提交执行线程：Future<E> result = ser.submit(传入子类对象)
 * 	6.获取结果：<E> end = result.get();
 * 	7.关闭服务：ser.shutdownNow();
 * 	8.处理第6步中的get方法所抛出的异常
 * @author wpf
 */

//1.创建类实现Callable接口，该接口需要接上泛型
public class CreateThread03 implements Callable<Integer> {
    

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //3.创建子类(即新建类)的对象
        CreateThread03 callableImplementsClass1 = new CreateThread03();
        CreateThread03 callableImplementsClass2 = new CreateThread03();

        //4.创建执行服务(线程池)
        ExecutorService ser = Executors.newFixedThreadPool(2);

        //5.提交执行线程
        Future<Integer> thread1 = ser.submit(callableImplementsClass1);
        Future<Integer> thread2 = ser.submit(callableImplementsClass2);

        //6.获取结果
        Integer result1 = thread1.get();
        Integer result2 = thread2.get();

        ser.shutdown();
    }

    //2.重写call方法，call方法返回的类型即是泛型中所规定的类型
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            sum += i;
        }
        return sum;
    }
}




