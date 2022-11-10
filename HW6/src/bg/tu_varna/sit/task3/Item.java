package bg.tu_varna.sit.task3;

public abstract class Item implements Delivery{
    private String name;
    private int daysToExpire;
    private int availiableQuantity;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDaysToExpire() {
        return daysToExpire;
    }
    public void setDaysToExpire(int daysToExpire) {
        this.daysToExpire = daysToExpire;
    }
    public int getAvailiableQuantity() {
        return availiableQuantity;
    }
    public void setAvailiableQuantity(int availiableQuantity) {
        this.availiableQuantity = availiableQuantity;
    }
    @Override
    public abstract boolean needsDelivery();

    @Override
    public boolean isItADrink() {
        return Delivery.super.isItADrink();
    }
    
    @Override
    public boolean isItAFood() {
        return Delivery.super.isItAFood();
    }
    
    
}
