package bg.tu_varna.sit.task3;

public class Bread extends Item{
    private int whiteFlourPrecentage;

    public Bread(String name, int daysToExpire, int availiableQuantity, ItemType itemType, int whiteFlourPrecentage) {
        super(name, daysToExpire, availiableQuantity, itemType);
        this.whiteFlourPrecentage = whiteFlourPrecentage;
    }

    public int getWhiteFlourPrecentage() {
        return whiteFlourPrecentage;
    }

    public void setWhiteFlourPrecentage(int whiteFlourPrecentage) {
        this.whiteFlourPrecentage = whiteFlourPrecentage;
    }

    @Override
    public boolean needsDelivery() {
        if((getDaysToExpire()<=5 && getWhiteFlourPrecentage()>=75) || getAvailiableQuantity()<=10){
            return true;
        }
        return false;
    }
    
    
}