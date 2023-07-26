package AthleteAndCoach;

/**
 * 创建时间：2020/5/21
 *
 * @author wpf
 */

public class TableTennisAthlete extends Athlete implements English{

    public TableTennisAthlete() {
    }

    public TableTennisAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + "正在吃饭");
    }

    @Override
    public void Exercise() {
        System.out.println(super.getName() + "正在训练乒乓球");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println(super.getName() + "正在说英语");
    }
}
