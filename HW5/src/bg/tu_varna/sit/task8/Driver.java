package bg.tu_varna.sit.task8;

public class Driver extends Employee{
    private DrivingLicense drivingLicense;
    private int courses;
    public Driver(String firstName, String secondName, String thirdName, char gender, int age, int workHours,
            double rate, DrivingLicense drivingLicense, int courses) {
        super(firstName, secondName, thirdName, gender, age, workHours, rate);
        this.drivingLicense = drivingLicense;
        this.courses = courses;
    }
    public DrivingLicense getDrivingLicense() {
        return drivingLicense;
    }
    public void setDrivingLicense(DrivingLicense drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
    public int getCourses() {
        return courses;
    }
    public void setCourses(int courses) {
        this.courses = courses;
    }
    @Override
    public double calculate() {
        if(getCourses()>=10){
            return super.calculate()*1.05;    
        }
        return super.calculate();
    }

    
}
