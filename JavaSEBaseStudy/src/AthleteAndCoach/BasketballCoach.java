package AthleteAndCoach;

/**
 * 创建时间：2020/5/21
 * 运动员与教练案例：篮球教练类
 * @author wpf
 */

public class BasketballCoach extends Coach{

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + "正在吃饭");
    }

    @Override
    public void Teach() {
        System.out.println(super.getName() + "正在教授篮球课程");
    }
}
