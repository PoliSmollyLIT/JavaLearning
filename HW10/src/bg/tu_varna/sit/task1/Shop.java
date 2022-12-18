package bg.tu_varna.sit.task1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Shop {
    private Set<Item> items = new HashSet<>();

    public Shop() {
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int countItemsForDelivery() {
        int need = 0;
        for (Item item : items) {
            if (item.needsDelivery()) {
                need++;
            }
        }
        return need;
    }

    public double calculateItemsPrice() {
        double sumPrice = 0.0;
        for (Item item : items) {
            sumPrice += item.getItemPrice();
        }
        return sumPrice;
    }

    public Item getItemWithMostAvailableQuantity(){
        Item mostAvailiableQuality = null;
        for (Item item : items) {
            if(mostAvailiableQuality == null){
                if(item.getAvailiableQuality()>0){
                    mostAvailiableQuality = item;
                }
            }else{
                if(item.getAvailiableQuality()>mostAvailiableQuality.getAvailiableQuality()){
                    mostAvailiableQuality = item;                
                }
            }            
        }
        return mostAvailiableQuality;
    }

    public ItemType getItemTypeWithLeastQuantity(){
        Map<ItemType, Integer> itemsByItemType = new HashMap<>();
        for (Item item : items) {
            if(itemsByItemType.containsKey(item.getItemType())){
               Integer current = itemsByItemType.get(item.getItemType());
                itemsByItemType.put(item.getItemType(), current+1);
            }else{
                itemsByItemType.put(item.getItemType(), 1);
            }
        }
        ItemType minItem = null;
        for (Map.Entry<ItemType, Integer> pair : itemsByItemType.entrySet()) {
            if(minItem == null){
                if(pair.getValue() < 9999){
                    minItem = pair.getKey();
                }
            }else{
                if(pair.getValue()< itemsByItemType.get(minItem)){
                    minItem = pair.getKey();
                }
            }
        }
        return minItem;
    }

    @Override
    public String toString() {
        StringBuffer output = new StringBuffer();
        for (Item item : items) {
            output.append(item.getItemType() + " " + item.getAvailiableQuality() + "\n");
        }
        return output.toString();
    }
    
}