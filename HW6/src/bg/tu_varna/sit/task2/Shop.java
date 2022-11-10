package bg.tu_varna.sit.task2;

public class Shop extends Property{

    public Shop(double area, double price, boolean isForRent) {
        super.setArea(area);
        super.setPrice(price);
        super.setForRent(isForRent);
    }

    @Override
    public double calculateCommision() {
        if(isForRent() && getArea()<50){
            return 0.02*getArea();
        }else if(getArea()>100){
            return 0.01*getArea();
        }else{
            return 0.06*getArea();
        }
    }

    
    
}
