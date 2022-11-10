package bg.tu_varna.sit.task2;

public class House extends Property{
    private int numberOfFloors;
    private boolean hasGarden;

    public House(double area, double price, boolean isForRent, int numberOfFloors, boolean hasGarden) {
        super.setArea(area);
        super.setPrice(price);
        super.setForRent(isForRent);
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public double calculateCommision() {
        if(isForRent() && hasGarden){
            return 0.08*getPrice();
        } else if(!isForRent() && getArea()<100){
            return 0.05*getPrice();
        }else{
            return 0.03*getPrice();
        }
    }
    
    
}
