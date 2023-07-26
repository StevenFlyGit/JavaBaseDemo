  package Abstract;

/**
 * 创建时间：2020/5/17
 * 抽象类案例：狗类
 * @author wpf
 */

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String species, String age) {
        super(species, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
