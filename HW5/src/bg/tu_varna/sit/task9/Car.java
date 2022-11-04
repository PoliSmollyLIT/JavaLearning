package bg.tu_varna.sit.task9;

public class Car {
    private String brand;
    private String model;
    private int hexColor;
    private int power;
    private double engineType;
    private String transmission;
    private int year;
    private long mileage;
    public Car(String brand, String model, int hexColor, int power, double engineType, String transmission, int year,
            long mileage) {
        this.brand = brand;
        this.model = model;
        this.hexColor = 0xCCCCCC;
        this.power = power;
        this.engineType = engineType;
        this.transmission = transmission;
        this.year = year;
        this.mileage = 0;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getHexColor() {
        return hexColor;
    }
    public void setHexColor(int hexColor) {
        this.hexColor = hexColor;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public double getEngineType() {
        return engineType;
    }
    public void setEngineType(double engineType) {
        this.engineType = engineType;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public long getMileage() {
        return mileage;
    }
    public void setMileage(long mileage) {
        this.mileage = mileage;
    }
    
    public boolean startup(){
        return true;
    }
    
}
