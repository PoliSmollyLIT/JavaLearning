package bg.tu_varna.sit.task8;

public class Human {
    private String firstName;
    private String secondName;
    private String thirdName;
    private char gender;
    private int age;
    
    public Human(String firstName, String secondName, String thirdName, char gender, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.gender = gender;
        this.age = age;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
