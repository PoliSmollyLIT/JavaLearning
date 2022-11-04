package bg.tu_varna.sit.task1;

public class Person {
    String firstName;
    String secondName;
    String thirdName;

    public Person() {
    }

    public Person(String firstName, String secondName, String thirdName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }


    @Override
    public String toString() {
        return thirdName +", " + firstName + " " + secondName;
    }


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


    public String getThirdName() {
        return thirdName;
    }


    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }
    
    
}
