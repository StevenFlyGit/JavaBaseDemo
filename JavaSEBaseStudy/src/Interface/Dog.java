package Interface;

/**
 * 创建时间：2020/5/18
 * 接口案例：狗类
 * @author wpf
 */

public class Dog extends Animal implements Jump{
    @Override
    public void eat() {
        System.out.println(super.getAge() +"的"+ super.getSpecies() + "吃骨头");
    }

    @Override
    public void jump() {
        System.out.println(super.getAge() +"的"+ super.getSpecies() + "跳高");
    }

    public Dog() {
    }

    public Dog(String species, int age) {
        super(species, age);
    }
}
