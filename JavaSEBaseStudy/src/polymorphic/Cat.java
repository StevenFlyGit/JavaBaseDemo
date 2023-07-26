package polymorphic;

/**
 * 创建时间：2020/5/16
 * 多态案例：猫类
 * @author wpf
 */

public class Cat extends Animal{
    public Cat(String species, String age) {
        super(species, age);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
