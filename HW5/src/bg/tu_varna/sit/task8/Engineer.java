package bg.tu_varna.sit.task8;

public class Engineer extends Employee{
    private int numberOfMachines;

    public Engineer(String firstName, String secondName, String thirdName, char gender, int age, int workHours,
            double rate, int numberOfMachines) {
        super(firstName, secondName, thirdName, gender, age, workHours, rate);
        this.numberOfMachines = numberOfMachines;
    }

    public int getNumberOfMachines() {
        return numberOfMachines;
    }

    public void setNumberOfMachines(int numberOfMachines) {
        this.numberOfMachines = numberOfMachines;
    }

    @Override
    public double calculate() {
        return super.calculate()*0.01*getNumberOfMachines();
    }
    
    
}
