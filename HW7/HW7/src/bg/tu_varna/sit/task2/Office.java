package bg.tu_varna.sit.task2;

public class Office extends Property{
    private Parking parkingLot;
    private int numberOfRooms;
    public Office(double area, double price, PropertyType propertyType, Parking parkingLot, int numberOfRooms) throws InvalidDataException {
        super(area, price, propertyType);
        if(propertyType == PropertyType.UNDEFINED)
            throw new InvalidDataException();
        this.parkingLot = parkingLot;
        this.numberOfRooms = numberOfRooms;
    }
    public Parking getParkingLot() {
        return parkingLot;
    }
    public void setParkingLot(Parking parkingLot) {
        this.parkingLot = parkingLot;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    @Override
    public double calculateCommission() {
        if (getPropertyType() == PropertyType.RENT) {
            return 0.18 * getPrice();
        } else if (getParkingLot() != Parking.NOPARKINGLOT && getNumberOfRooms() >= 2) {
            return 0.15 * getPrice();
        }
        return 0.11 * getPrice();
    }
    
    
    
}