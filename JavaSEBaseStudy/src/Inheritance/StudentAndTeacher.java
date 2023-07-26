package Inheritance;

/**
 * 创建时间：2020/5/11
 * 继承案例：学生和老师的父类
 * @author wpf
 */

public class StudentAndTeacher {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentAndTeacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public StudentAndTeacher() {
    }
}
