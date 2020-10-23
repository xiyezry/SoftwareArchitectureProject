package userFactory;


public class Athlete implements Personal{
    enum BodyCondition{
        GOOD,NORMAL,BAD
    }

    private String name;
    private String password;
    private int age;
    private double height;
    private double bodyWeight;
    private String faculty;
    private String ID;
    private BodyCondition bodyCondition;
    private boolean isBanned;

    public Athlete(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public BodyCondition getBodyCondition() {
        return bodyCondition;
    }

    public void setBodyCondition(BodyCondition bodyCondition) {
        this.bodyCondition = bodyCondition;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }

    @Override
    public boolean register() {
        System.out.println("运动员已经成功报名！");
        return false;
    }

    @Override
    public boolean quit() {
        return false;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", bodyWeight=" + bodyWeight +
                ", faculty='" + faculty + '\'' +
                ", ID='" + ID + '\'' +
                ", bodyCondition=" + bodyCondition +
                ", isBanned=" + isBanned +
                '}';
    }
}
