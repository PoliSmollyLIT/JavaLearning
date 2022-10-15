package bg.tu_varna.sit;

public class Person {
    private String firstName;
    private String secondName;
    private String thirdname;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdname() {
        return thirdname;
    }

    public void setThirdname(String thirdname) {
        this.thirdname = thirdname;
    }

    public void iAm(){
        System.out.println(thirdname + ", " + firstName + " " + secondName);
    }
}
