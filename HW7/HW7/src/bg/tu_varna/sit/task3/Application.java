package bg.tu_varna.sit.task3;

public class Application {
    public static void main(String args[]){
        Item[] items = new Item[3];
        items[0] = new Bread("Demea", 20, 8, ItemType.FOOD, 80);
        items[1] = new Milk("Olimpia", 5, 6, ItemType.DRINK, 3);
        items[2] = new Water("Devin", 100, 30, ItemType.DRINK, 12);
        Shop shop = new Shop(items);
        System.out.println(shop.getAvailiableDrinksCount());
        System.out.println(shop.getAverageDaysToExpire());
        System.out.println(shop.getItemCountDelivery());
    }
}