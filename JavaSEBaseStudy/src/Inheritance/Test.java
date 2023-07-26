package Inheritance;

/**
 * 创建时间：2020/5/11
 * 继承案例：测试类
 * @author wpf
 */

/*
 定义老师类和学生类，然后写代码测试;
 最后找到老师类和学生类当中的共性内容,抽取出一个父类,
 用继承的方式改写代码，并进行测试
 */
public class Test {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("张老师", 35);
        Student student = new Student("刘同学", 15);
        teacher.theach();
        student.study();
    }

}
