package bg.tu_varna.sit.task4;

public class House extends Property{
    private int numberOfFloors;
    private boolean hasGarden;
    public House(int area, int basePrice, PropertyType propertyType, int numberOfFloors, boolean hasGarden) {
        super(area, basePrice, propertyType);
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public boolean isHasGarden() {
        return hasGarden;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + numberOfFloors;
        result = prime * result + (hasGarden ? 1231 : 1237);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        House other = (House) obj;
        if (numberOfFloors != other.numberOfFloors)
            return false;
        if (hasGarden != other.hasGarden)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "House [numberOfFloors=" + numberOfFloors + ", hasGarden=" + hasGarden + "]";
    }
    @Override
    public double calculate() {
        if(getPropertyType() == PropertyType.NEW && isHasGarden() && getNumberOfFloors()>1){
            return getBasePrice()*1.20;
        }
        if(isHasGarden()){
            return getBasePrice()*1.10;
        }
        return getBasePrice()*1.07;
    }
    
    
}