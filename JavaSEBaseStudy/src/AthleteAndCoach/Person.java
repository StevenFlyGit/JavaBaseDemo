package AthleteAndCoach;

/**
 * 创建时间：2020/5/21
 * 运动员与教练案例：人类
 * @author wpf
 */

/*
我们现在有乒乓球运动员和篮球运动员,乒乓球教练和篮球教练。
为了出国交流,跟乒乓球相关的人员都需要学习英语。
请用所有知识分析，这个案例中有哪些具体类,哪些抽象类,哪些接口，并用代码实现
 */
public abstract class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
}
