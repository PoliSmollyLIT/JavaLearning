package bg.tu_varna.sit;

public class Truck extends Car {
    int capacity;
    int movingTime;

    public Truck(String marka, String model, int power, String dvigatelType, String powerBoxType, int yearProduced,
            int capacity, int movingTime) {
        super(marka, model, power, dvigatelType, powerBoxType, yearProduced);
        this.capacity = capacity;
        this.movingTime = movingTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMovingTime() {
        return movingTime;
    }

    public void setMovingTime(int movingTime) {
        this.movingTime = movingTime;
    }

    public boolean canStart() {
        if (movingTime < 6) {
            return true;
        }
        return false;
    }

}
