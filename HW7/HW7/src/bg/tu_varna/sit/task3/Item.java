package bg.tu_varna.sit.task3;

public abstract class Item implements Delivery {
    private String name;
    private int daysToExpire;
    private int availiableQuantity;
    private ItemType itemType;
    
    public Item(String name, int daysToExpire, int availiableQuantity, ItemType itemType) {
        this.name = name;
        this.daysToExpire = daysToExpire;
        this.availiableQuantity = availiableQuantity;
        this.itemType = itemType;
    }

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

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public abstract boolean needsDelivery();
    
}