package bg.tu_varna.sit.task2;

public class Office extends Property{
    private boolean hasParkingLot;
    private int numberOfRooms;
    
    
    public Office(double area, double price, boolean isForRent, int numberOfFloors, boolean hasGarden, boolean hasParkingLot, int numberOfRooms) {
        super.setArea(area);
        super.setPrice(price);
        super.setForRent(isForRent);   
        this.hasParkingLot = hasParkingLot;
        this.numberOfRooms = numberOfRooms;
    }

    public boolean isHasParkingLot() {
        return hasParkingLot;
    }
    public void setHasParkingLot(boolean hasParkingLot) {
        this.hasParkingLot = hasParkingLot;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public double calculateCommision() {
        if(isForRent()){
            return 0.18*getPrice();
        } else if(hasParkingLot && numberOfRooms>=2){
            return 0.15*getPrice();
        } else{
            return 0.11*getPrice();
        }
    }

    
    
}
