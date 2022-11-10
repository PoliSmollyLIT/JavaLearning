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
    
    public int getItemCountDelivery(){
        int needsDelivery = 0;
        for (int i = 0; i < items.length; i++) {
            if(items[i].needsDelivery()){
                needsDelivery++;
            }
        }
        return needsDelivery;
    }

    public int getAverageDaysToExpire(){
        int daysToExpire = 0;
        for (int i = 0; i < items.length; i++) {
            daysToExpire+=items[i].getDaysToExpire();
        }
        return daysToExpire/items.length;
    }

    public int getAvailiableDrinkCount(){
        int drinks = 0;
        for (int i = 0; i < items.length; i++) {
            if(items[i].isItADrink()){
                drinks++;
            }
        }
        return drinks;
    }
}
