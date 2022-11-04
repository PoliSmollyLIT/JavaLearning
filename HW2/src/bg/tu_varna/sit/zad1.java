package bg.tu_varna.sit;

public class zad1 {
     public static void main(String args[]) {
        Item[] items = new Item[10];
        String[] types = {"pizza", "sushi", "bagette", "cheese", "chips", "praskowki", "ships", "mushrooms", "bears", "lions"};
        int[] quantities = {20, 3, 10, 5, 65, 8, 25, 30, 2, 15};
        double[] prices= {3.50, 5.50, 1.00, 8.30, 1.20, 2.50, 45.76, 4.50, 100.43, 356.32};
        int[] bestBefore = {63, 3, 10, 45, 75, 50, 120, 5, 300, 380};
        for (int i = 0; i < items.length; i++) {
            items[i] = new Item(types[i], quantities[i], prices[i], bestBefore[i]);
        }
        double avgPrice = 0;
        for (int i = 0; i < items.length; i++) {
            avgPrice += items[i].getPrice();
        }
        avgPrice /= 10;
        System.out.println("The average price is: " + avgPrice);
    }    
}