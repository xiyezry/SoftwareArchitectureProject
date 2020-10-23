package userFactory;

import java.util.Date;

abstract public class AbstractFactory {

    public abstract Personal getPersonal(String type, String name, String password, int age,String ID);

    public abstract Organization getOrganization(String tournamentName, int rating, Date time,String ID);
}
