package polymorphic;

/**
 * 创建时间：2020/5/16
 * 多态案例：狗类
 * @author wpf
 */

public class Dog extends Animal{
    public Dog(String species, String age) {
        super(species, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
