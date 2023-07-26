package AthleteAndCoach;

/**
 * 创建时间：2020/5/21
 * 运动员与教练案例：运动员类
 * @author wpf
 */

public abstract class Athlete extends Person{

    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void Exercise();
}
