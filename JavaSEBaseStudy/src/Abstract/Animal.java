package Abstract;

/**
 * 创建时间：2020/5/17
 * 抽象类案例：动物类
 * @author wpf
 */

public abstract class Animal {
    String species;
    String age;

    public String getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Animal() {
    }

    public Animal(String species, String age) {
        this.species = species;
        this.age = age;
    }

    public abstract void eat();
}
