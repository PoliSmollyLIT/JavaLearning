package bg.tu_varna.sit.task8;

public class Employee extends Human implements Salary{
    private int workHours;
    private double rate;
    
    public Employee(String firstName, String secondName, String thirdName, char gender, int age, int workHours,
            double rate) {
        super(firstName, secondName, thirdName, gender, age);
        this.workHours = workHours;
        this.rate = rate;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculate() {
        return getRate()*getWorkHours();
        
    }

    
}
