package userFactory;

import java.util.Date;

public class OrganizationFactory extends AbstractFactory {


    @Override
    public Personal getPersonal(String type, String name, String password, int age,String ID) {
        return null;
    }

    @Override
    public Organization getOrganization(String tournamentName, int rating, Date time,String ID) {
        return new Tournament(tournamentName, rating, time, ID);
    }
}
