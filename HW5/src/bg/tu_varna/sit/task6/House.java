package bg.tu_varna.sit.task6;

public class House extends Building{
    private int floors;
    private String owner;

    public House(int floors, String owner) {
        this.floors = floors;
        this.owner = owner;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public double heatedVolume() {
        return totalArea()*0.75;
    }

    @Override
    public double totalArea() {
        return getFloors()*getHeight()*getLength()*getWidth();
    }

    
    
    
}
