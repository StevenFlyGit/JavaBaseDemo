package AthleteAndCoach;

/**
 * 创建时间：2020/5/21
 * 运动员与教练案例：乒乓球教练类
 * @author wpf
 */

public class TableTennisCoach extends Coach implements English{

    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + "正在吃饭");
    }

    @Override
    public void Teach() {
        System.out.println(super.getName() + "正在教授乒乓球课程");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println(super.getName() + "正在说英语");
    }
}
