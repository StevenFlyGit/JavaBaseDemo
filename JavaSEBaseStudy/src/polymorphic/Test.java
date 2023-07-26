package polymorphic;

/**
 * 创建时间：2020/5/16
 * 多态案例：测试类
 * @author wpf
 */

public class Test {

    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        animal1.eat();
        animal2.eat();
    }
}
