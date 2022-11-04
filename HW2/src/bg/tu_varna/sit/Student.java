package bg.tu_varna.sit;

public class Student {
    String firstName;
    String lastName;
    String fakNomer;
    String specialnost;

    public Student(){

    }

    public Student(String firstName, String lastName, String fakNomer, String specialnost){
        setFirstName(firstName);
        setLastName(lastName);
        setFakNomer(fakNomer);
        setSpecialnost(specialnost);
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFakNomer(String fakNomer){
        this.fakNomer = fakNomer;
    }

    public void setSpecialnost(String specialnost){
        this.specialnost = specialnost;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFakNomer(){
        return fakNomer;
    }

    public String getSpecialnost(){
        return specialnost;
    }

    public String toString(){
        return "The Student " + this.getFirstName() + " " + this.getLastName() + " with fak nomer " + this.getFakNomer() + " is " + this.getSpecialnost();
    }

    public boolean equals(Student student){
        if(this == student)
        return true;
        if(this.getFakNomer() == student.getFakNomer()){
            return true;
        }
        return false;
    }

}