package bg.tu_varna.sit.task3;

public interface Food extends Delivery{
    boolean isFood = true;
    boolean isDrink = false;

    @Override
    default boolean needsDelivery(){
        return true;
    }
    
    default boolean isItADrink(){
        return isDrink;
    }

    default boolean isItAFood(){
        return isFood;
    }

}