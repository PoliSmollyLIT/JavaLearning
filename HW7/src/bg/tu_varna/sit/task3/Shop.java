package bg.tu_varna.sit.task3;

public class Shop {
    private Item[] items;

    public Shop(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public int getItemCountDelivery() {
        int needDelivery = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].needsDelivery() == true) {
                needDelivery++;
            }
        }
        return needDelivery;
    }

    public double getAverageDaysToExpire() {
        double days = 0.0;
        for (int i = 0; i < items.length; i++) {
            days += items[i].getDaysToExpire();
        }
        return days / items.length;
    }

    public int getAvailiableDrinksCount() {
        int drinks = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getItemType() == ItemType.DRINK) {
                drinks++;
            }
        }
        return drinks;
    }

}