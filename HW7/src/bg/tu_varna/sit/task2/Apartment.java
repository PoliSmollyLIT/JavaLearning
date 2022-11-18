package bg.tu_varna.sit.task2;

public class Apartment extends Property{
    private int numberOfRooms;
    private int floor;
    private Parking parkingLot;
    
    public Apartment(double area, double price, PropertyType propertyType, int numberOfRooms, int floor,
            Parking parkingLot) {
        super(area, price, propertyType);
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;
        this.parkingLot = parkingLot;
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
    public Parking getParkingLot() {
        return parkingLot;
    }
    public void setParkingLot(Parking parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public double calculateCommission() {
        if(getPropertyType() ==  PropertyType.RENT && ( getParkingLot() == Parking.ONEPLACEFORRENT || getParkingLot() == Parking.TWOPLACESFORRENT)){
            return 0.15*getPrice();
        }else if(getArea()<=60.0){
            return 0.10*getPrice();
        }
        return 0.07*getPrice();
    }
}
