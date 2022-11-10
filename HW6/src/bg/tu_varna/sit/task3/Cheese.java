package bg.tu_varna.sit.task3;

public class Cheese extends Item  implements Food{
    private int gramsPerPakage;
    
    public Cheese(String name, int daysToExpire, int availiableQuantity, int gramsPerPakage) {
        super.setName(name);
        super.setDaysToExpire(daysToExpire);
        super.setAvailiableQuantity(availiableQuantity);
        this.gramsPerPakage = gramsPerPakage;
    }

    public int getGramsPerPakage() {
        return gramsPerPakage;
    }

    public void setGramsPerPakage(int gramsPerPakage) {
        this.gramsPerPakage = gramsPerPakage;
    }

    @Override
    public boolean needsDelivery() {
        if(getAvailiableQuantity()<10 && getGramsPerPakage()<=400){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public boolean isItADrink() {
        return Food.super.isItADrink();
    }

    @Override
    public boolean isItAFood() {
        return Food.super.isItAFood();
    }
    
}
