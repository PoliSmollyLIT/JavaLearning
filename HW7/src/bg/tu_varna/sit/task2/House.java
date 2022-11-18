package bg.tu_varna.sit.task2;

public class House extends Property {
    private int numberOfFloors;
    private boolean hasGarden;

    public House(double area, double price, PropertyType propertyType, int numberOfFloors, boolean hasGarden) {
        super(area, price, propertyType);
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
    public double calculateCommission() {
        if (getPropertyType() == PropertyType.RENT && isHasGarden() == true) {
            return 0.08 * getPrice();
        } else if (getPropertyType() == PropertyType.SALE && getArea() <= 100.0) {
            return 0.05 * getPrice();
        }
        return 0.03 * getPrice();

    }

}