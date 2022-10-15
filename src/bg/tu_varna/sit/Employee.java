package bg.tu_varna.sit;

public class Employee extends Human{
    private int workingHours;
    private double salaryPerHour;

    public Employee(String firstName, String secondName, String thirdName, char gender, int age, int workingHours,
            double salaryPerHour) {
        super(firstName, secondName, thirdName, gender, age);
        this.workingHours = workingHours;
        this.salaryPerHour = salaryPerHour;
    }

    public double basicSalary(){
        return workingHours*salaryPerHour;
    }
    
}
