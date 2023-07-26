package Abstract;

/**
 * 创建时间：2020/5/17
 *
 * @author wpf
 */

public class Test {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.eat();
        dog.eat();
    }
}
