package bg.tu_varna.sit.task1;


public class Application {
    public static void main(String[] args)    {
        Biscuits biscuits = new Biscuits(ItemType.FOOD, 3.20, 10, "Oreo");
        Bread bread = new Bread(ItemType.FOOD_ESSENTIALS, 2.30, 13, "Demea");
        Butter butter = new Butter(ItemType.FOOD_ESSENTIALS, 1.30, 9, 125, 3);
        Chocolate chocolate = new Chocolate(ItemType.FOOD, 2.50, 14, "Svoge", 70);
        Eggs eggs = new Eggs(ItemType.FOOD_ESSENTIALS, 1.10, 4, 6);
        Milk milk = new Milk(ItemType.FOOD_ESSENTIALS, 3.50, 2, "Olimpia", 3);
        Water water1 = new Water(ItemType.DRINKS, 0.40, 10, "Rosa", WaterType.MINERAL);
        Water water2 = new Water(ItemType.DRINKS, 0.50, 10, "Devin", WaterType.SODA);
        Water water3 = new Water(ItemType.DRINKS, 0.60, 10, "Baldaran", WaterType.SPRING);
        Water water4 = new Water(ItemType.DRINKS, 0.70, 10, "Bankia", WaterType.TABLE);
    
        Shop shop = new Shop();

        shop.addItem(biscuits);
        shop.addItem(bread);
        shop.addItem(butter);
        shop.addItem(chocolate);
        shop.addItem(eggs);
        shop.addItem(milk);
        shop.addItem(water1);
        shop.addItem(water2);
        shop.addItem(water3);
        shop.addItem(water4);

        System.out.println("Calculate items price " + shop.calculateItemsPrice());
        System.out.println("Count of items for delivery " + shop.countItemsForDelivery());
        System.out.println("Item with most avaliable quantity " + shop.getItemWithMostAvailableQuantity());
        System.out.println("Item type with least quantity " + shop.getItemTypeWithLeastQuantity());
        System.out.println(shop);

    }
}