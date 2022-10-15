package bg.tu_varna.sit;

public class Engineer extends Employee{
    private int madeMachines;

    public Engineer(String firstName, String secondName, String thirdName, char gender, int age, int workingHours,
            double salaryPerHour, int madeMachines) {
        super(firstName, secondName, thirdName, gender, age, workingHours, salaryPerHour);
        this.madeMachines = madeMachines;
    }

    public double engineerSalary(){
        return (madeMachines*0.1/100)*super.basicSalary() + super.basicSalary();
    }   
    
}
