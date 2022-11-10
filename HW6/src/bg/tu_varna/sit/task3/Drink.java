package bg.tu_varna.sit.task3;

public interface Drink extends Delivery{
    boolean isFood = false;
    boolean isDrink = true;

    @Override
    default boolean needsDelivery() {
        return true;
    }

    default boolean isItADrink(){
        return isDrink;
    }

    default boolean isItAFood(){
        return isFood;
    }
    
}