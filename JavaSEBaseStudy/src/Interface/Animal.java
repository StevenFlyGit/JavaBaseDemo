package Interface;

/**
 * 创建时间：2020/5/18
 * 接口案例：动物类
 * @author wpf
 */

public abstract class Animal {

    private String species;
    private int age;

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return this.species;
    }

    public int getAge() {
        return this.age;
    }

    public Animal() {
    }

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public abstract void eat();
}
