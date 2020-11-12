package userFactory;

import domain.AthleteTO;
import domain.JudgeTO;

public class DemoMain {
    public static void main(String[] args) {
        //这里使用一个TO模拟其他模块或者前端传入的数据
        AthleteTO athleteTO = new AthleteTO("张三","123456",10,"20123456");
        JudgeTO judgeTO = new JudgeTO("裁判","12312",50,"88886666");

        AbstractFactory personalFactory = new PersonalFactory();
        Personal personal = personalFactory.getPersonal("ATHLETE",athleteTO.getName(), athleteTO.getPassword(), athleteTO.getAge(),athleteTO.getID());
        Personal judge = personalFactory.getPersonal("JUDGE",judgeTO.getName(),judgeTO.getPassword(),judgeTO.getAge(),judgeTO.getID());
        personal.register();
        judge.register();

    }
}
