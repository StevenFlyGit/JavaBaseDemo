package AthleteAndCoach;

/**
 * 创建时间：2020/5/21
 * 运动员与教练案例：篮球运动员类
 * @author wpf
 */

public class BasketballAthlete extends Athlete{

    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + "正在吃饭");
    }

    @Override
    public void Exercise() {
        System.out.println(super.getName() + "正在训练篮球");
    }

}
