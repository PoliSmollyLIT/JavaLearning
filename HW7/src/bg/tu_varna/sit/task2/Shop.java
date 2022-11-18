package bg.tu_varna.sit.task2;

public class Shop extends Property{

    public Shop(double area, double price, PropertyType propertyType) {
        super(area, price, propertyType);
    }

    @Override
    public double calculateCommission() {
        if (getPropertyType() == PropertyType.RENT && getArea()<=50.0) {
            return 0.02 * getPrice();
        } else if (getArea() >= 100.0) {
            return 0.01 * getPrice();
        }
        return 0.06 * getPrice();}
    
    
}