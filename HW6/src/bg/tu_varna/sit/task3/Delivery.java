package bg.tu_varna.sit.task3;

public interface Delivery {
    boolean isFood = true;
    boolean isDrink = false;

        boolean needsDelivery();

        default boolean isItADrink(){
            return isDrink;
        }
    
        default boolean isItAFood(){
            return isFood;
        }
    
}