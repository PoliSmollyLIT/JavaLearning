package bg.tu_varna.sit.task1;

public abstract class Item implements Delivery, Comparable<Item>{
    private ItemType itemType;
    private double itemPrice;
    private int availiableQuality;
    public Item(ItemType itemType, double itemPrice, int availiableQuality) {
        this.itemType = itemType;
        this.itemPrice = itemPrice;
        this.availiableQuality = availiableQuality;
    }
    public ItemType getItemType() {
        return itemType;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public int getAvailiableQuality() {
        return availiableQuality;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
        long temp;
        temp = Double.doubleToLongBits(itemPrice);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + availiableQuality;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        if (itemType != other.itemType)
            return false;
        if (Double.doubleToLongBits(itemPrice) != Double.doubleToLongBits(other.itemPrice))
            return false;
        if (availiableQuality != other.availiableQuality)
            return false;
        return true;
    }
    @Override
    public abstract boolean needsDelivery();
    @Override
    public int compareTo(Item o) {
        return (o.getAvailiableQuality()>this.getAvailiableQuality())? -1: (o.getAvailiableQuality()==this.getAvailiableQuality())? 0: 1;
    }

    

}
