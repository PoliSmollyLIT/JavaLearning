package bg.tu_varna.sit.task2;

public abstract class Property implements Commission{
    private double area;
    private double price;
    private PropertyType propertyType;
    
    public Property(double area, double price, PropertyType propertyType) {
        this.area = area;
        this.price = price;
        this.propertyType = propertyType;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    @Override
    public abstract double calculateCommission();
    
    
}
