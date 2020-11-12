package userFactory;

public class Judge implements Personal{
    private String name;
    private String password;
    private int age;
    private String jobTitle;
    private String ID;
    //所属单位
    private String Subsidiary;



    public Judge() {
    }

    public Judge(String name, String password, int age, String ID) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.ID = ID;
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSubsidiary() {
        return Subsidiary;
    }

    public void setSubsidiary(String subsidiary) {
        Subsidiary = subsidiary;
    }

    @Override
    public boolean register() {
        System.out.println("我是裁判 我注册成功啦");
        return false;
    }

    @Override
    public boolean quit() {
        return false;
    }

    @Override
    public String toString() {
        return "Judge{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", Subsidiary='" + Subsidiary + '\'' +
                '}';
    }
}
