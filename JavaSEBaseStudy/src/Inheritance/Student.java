package Inheritance;

/**
 * 创建时间：2020/5/11
 * 继承案例：学生类
 * @author wpf
 */

/*
定义学生类-姓名、年龄、学习()
 */
public class Student extends StudentAndTeacher{
//    private String name;
//    private int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Student() {
//    }
//
    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println(super.getName() + "正在学习");
    }
}
