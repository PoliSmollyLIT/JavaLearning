package bg.tu_varna.sit.task9;

public class Bus extends Car {
    private int seats;
    private int courses;

    public Bus(String brand, String model, int hexColor, int power, double engineType, String transmission, int year,
            long mileage, int seats, int courses) {
        super(brand, model, hexColor, power, engineType, transmission, year, mileage);
        this.seats = seats;
        this.courses = courses;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }

    @Override
    public boolean startup() {
        if ((getCourses() - 10) < 5) {
            return super.startup();
        } else {
            return false;
        }

    }

}
