package polymorphic;

/**
 * 创建时间：2020/5/16
 * 多态案例：动物类
 * @author wpf
 */

public class Animal {
    String species;
    String age;

    public String getSpecies() {
        return species;
    }

    public String getAge() {
        return age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Animal(String species, String age) {
        this.species = species;
        this.age = age;
    }

    public Animal() {
    }

    public void eat() {
        System.out.println("动物吃东西");
    }
}
