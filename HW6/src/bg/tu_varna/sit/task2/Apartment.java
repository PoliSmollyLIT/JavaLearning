package bg.tu_varna.sit.task2;

public class Apartment extends Property {
    private int numberOfRooms;
    private int floor;

    public Apartment(double area, double price, boolean isForRent, int numberOfRooms, int floor) {
        super.setArea(area);
        super.setPrice(price);
        super.setForRent(isForRent);
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public double calculateCommision() {
        if (isForRent()) {
            return 0.15 * getPrice();
        } else if (getArea() < 60) {
            return 0.10 * getPrice();
        } else {
            return 0.07 * getPrice();
        }
    }

}
