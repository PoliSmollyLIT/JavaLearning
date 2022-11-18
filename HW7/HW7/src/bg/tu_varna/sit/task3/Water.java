package bg.tu_varna.sit.task3;

public class Water extends Item{
    private int mineralCount;

    public Water(String name, int daysToExpire, int availiableQuantity, ItemType itemType, int mineralCount) {
        super(name, daysToExpire, availiableQuantity, itemType);
        this.mineralCount = mineralCount;
    }

    public int getMineralCount() {
        return mineralCount;
    }

    public void setMineralCount(int mineralCount) {
        this.mineralCount = mineralCount;
    }

    @Override
    public boolean needsDelivery() {
       if(getAvailiableQuantity()<=30 || getDaysToExpire()<=20){
        return true;
       }
       return false;
    }
    
    
}