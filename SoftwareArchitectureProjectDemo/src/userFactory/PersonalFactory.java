package userFactory;

import java.util.Date;

public class PersonalFactory extends AbstractFactory{
    @Override
    public Personal getPersonal(String type, String name, String password, int age,String ID) {
        if(type.equalsIgnoreCase("ATHLETE")){
            return new Athlete(name, password, age);
        }else if(type.equalsIgnoreCase("JUDGE")){
            return new Judge(name,password,age,ID);
        }else{
            return null;
        }
    }

    @Override
    public Organization getOrganization(String tournamentName, int rating, Date time,String ID) {
        return null;
    }
}
