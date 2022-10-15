package bg.tu_varna.sit;

public class Driver extends Employee {
     DriversLicense driversLicense;
    private int curses;

    public Driver(String firstName, String secondName, String thirdName, char gender, int age, int workingHours,
            double salaryPerHour, DriversLicense driversLicense, int curses) {
        super(firstName, secondName, thirdName, gender, age, workingHours, salaryPerHour);
        this.driversLicense = driversLicense;
        this.curses = curses;
    }

    public double driverSalary() {
        if (curses > 10) {
            return 105 * super.basicSalary() / 100;
        }
        return super.basicSalary();
    }
}
