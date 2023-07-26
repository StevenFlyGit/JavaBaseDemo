package Interface;

/**
 * 创建时间：2020/5/18
 *
 * @author wpf
 */

public class Test {

    public static void main(String[] args) {
        Animal cat = new Cat("加菲", 5);
        Animal dog = new Dog("二哈", 10);
        cat.eat();
        dog.eat();
        Jump cat_jump = new Cat("加菲", 5);
        Jump dog_jump = new Dog("二哈", 10);
        cat_jump.jump();
        dog_jump.jump();
    }
}
