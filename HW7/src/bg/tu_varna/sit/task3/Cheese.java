package bg.tu_varna.sit.task3;

public class Cheese extends Item{
    private int gramsPerPackage;

    public Cheese(String name, int daysToExpire, int availiableQuantity, ItemType itemType, int gramsPerPackage) {
        super(name, daysToExpire, availiableQuantity, itemType);
        this.gramsPerPackage = gramsPerPackage;
    }

    public int getGramsPerPackage() {
        return gramsPerPackage;
    }

    public void setGramsPerPackage(int gramsPerPackage) {
        this.gramsPerPackage = gramsPerPackage;
    }

    @Override
    public boolean needsDelivery() {
        if(getAvailiableQuantity()<=10 && getGramsPerPackage()<=400){
            return true;
        }
        return false;
    }
    
    
}