package bg.tu_varna.sit.task2;

public abstract class Property implements Commision{
    private double area;
    private double price;
    private boolean isForRent;
    
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
    public boolean isForRent() {
        return isForRent;
    }
    public void setForRent(boolean isForRent) {
        this.isForRent = isForRent;
    }
    @Override
    public abstract double calculateCommision();

    
}
