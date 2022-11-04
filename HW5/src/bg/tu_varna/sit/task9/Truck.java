package bg.tu_varna.sit.task9;

public class Truck extends Car{
    private int capacity;
    private int elapsedTime;
    public Truck(String brand, String model, int hexColor, int power, double engineType, String transmission, int year,
            long mileage, int capacity, int elapsedTime) {
        super(brand, model, hexColor, power, engineType, transmission, year, mileage);
        this.capacity = capacity;
        this.elapsedTime = elapsedTime;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getElapsedTime() {
        return elapsedTime;
    }
    public void setElapsedTime(int elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
    @Override
    public boolean startup() {
        if(getElapsedTime()<6){
            return super.startup();
        }else{
            return false;
        }
        
    }
    
    
}
