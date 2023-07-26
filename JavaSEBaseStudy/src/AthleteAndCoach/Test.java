package AthleteAndCoach;

/**
 * 创建时间：2020/5/21
 *
 * @author wpf
 */

public class Test {
    public static void main(String[] args) {
        Person tableTennisCoach = new TableTennisCoach("不德生科技", 50);
        Person tableTennisAthlete = new TableTennisAthlete("孙连成", 28);
        Person basketballAthlete = new BasketballAthlete("两张卡", 15);
        Person basketballCoach = new BasketballCoach("时刻美你", 36);

        tableTennisCoach.eat();
        tableTennisAthlete.eat();
        basketballAthlete.eat();
        basketballCoach.eat();

        TableTennisCoach a = new TableTennisCoach("不德生科技", 50);
        TableTennisAthlete b = new TableTennisAthlete("孙连成", 28);
        BasketballAthlete c = new BasketballAthlete("两张卡", 15);
        BasketballCoach d = new BasketballCoach("时刻美你", 36);
        b.Exercise();
        c.Exercise();
        a.Teach();
        d.Teach();
        a.SpeakEnglish();
        b.SpeakEnglish();
    }
}
