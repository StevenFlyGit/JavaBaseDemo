package Inheritance;

/**
 * 创建时间：2020/5/11
 * 继承案例：老师类
 * @author wpf
 */

public class Teacher extends StudentAndTeacher{
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
    public Teacher(String name, int age) {
        super(name, age);
    }
//
//    public Teacher() {
//    }

    public void theach() {
        System.out.println(super.getName() + "正在上课");
    }
}
