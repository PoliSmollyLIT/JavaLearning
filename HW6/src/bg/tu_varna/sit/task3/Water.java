package bg.tu_varna.sit.task3;

public class Water extends Item implements Drink{
    private int mineralContent;

    
    public Water(String name, int daysToExpire, int availiableQuantity, int mineralContent) {
        super.setName(name);
        super.setDaysToExpire(daysToExpire);
        super.setAvailiableQuantity(availiableQuantity);
        this.mineralContent = mineralContent;
    }

    public int getMineralContent() {
        return mineralContent;
    }

    public void setMineralContent(int mineralContent) {
        this.mineralContent = mineralContent;
    }

    @Override
    public boolean needsDelivery() {
        if(getAvailiableQuantity()<30 || getDaysToExpire()<20){
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
