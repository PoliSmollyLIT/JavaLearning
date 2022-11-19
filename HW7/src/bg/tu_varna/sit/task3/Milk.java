package bg.tu_varna.sit.task3;

public class Milk extends Item {
    private int fatPercentage;

    public Milk(String name, int daysToExpire, int availiableQuantity, ItemType itemType, int fatPercentage) {
        super(name, daysToExpire, availiableQuantity, itemType);
        this.fatPercentage = fatPercentage;
    }

    public int getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(int fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    @Override
    public boolean needsDelivery() {
        if (getDaysToExpire() <= 15 && getAvailiableQuantity() <= 10 && getFatPercentage() >= 2) {
            return true;
        }
        return false;
    }

}