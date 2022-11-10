package bg.tu_varna.sit.task3;

public class Milk extends Item implements Drink{
    private int fatPercentage;

    
    public Milk(String name, int daysToExpire, int availiableQuantity, int fatPercentage) {
        super.setName(name);
        super.setDaysToExpire(daysToExpire);
        super.setAvailiableQuantity(availiableQuantity);
        this.fatPercentage = fatPercentage;
    }

    public int getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(int fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    @Override
    public boolean needsDelivery() {
        if(getDaysToExpire()<=15 && getAvailiableQuantity()<10 && getFatPercentage()>=2){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isItADrink() {
        return Drink.super.isItADrink();
    }

    @Override
    public boolean isItAFood() {
        return Drink.super.isItAFood();
    }  
}
