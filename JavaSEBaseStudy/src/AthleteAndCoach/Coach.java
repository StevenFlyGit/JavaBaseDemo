package AthleteAndCoach;

/**
 * 创建时间：2020/5/21
 * 运动员与教练案例：教练类
 * @author wpf
 */

public abstract class Coach extends Person{

    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }

    public abstract void Teach();
}
