package Abstract;

/**
 * 创建时间：2020/5/17
 * 抽象类案例：猫类
 * @author wpf
 */

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String species, String age) {
        super(species, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
