package Interface;

/**
 * 创建时间：2020/5/18
 *
 * @author wpf
 */

public class Cat extends Animal implements Jump{
    @Override
    public void eat() {
        System.out.println(super.getAge() +"岁的"+ super.getSpecies() +"吃鱼");
    }

    @Override
    public void jump() {
        System.out.println(super.getAge() +"岁的"+ super.getSpecies() +"跳高");
    }

    public Cat() {
    }

    public Cat(String species, int age) {
        super(species, age);
    }
}
