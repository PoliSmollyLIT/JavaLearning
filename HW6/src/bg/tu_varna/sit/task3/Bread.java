package bg.tu_varna.sit.task3;

public class Bread extends Item implements Food {
    private int whiteFlourPercentage;

    public Bread(String name, int daysToExpire, int availiableQuantity, int whiteFlourPercentage) {
        super.setName(name);
        super.setDaysToExpire(daysToExpire);
        super.setAvailiableQuantity(availiableQuantity);
        this.whiteFlourPercentage = whiteFlourPercentage;
    }

    public int getWhiteFlourPercentage() {
        return whiteFlourPercentage;
    }

    public void setWhiteFlourPercentage(int whiteFlourPercentage) {
        this.whiteFlourPercentage = whiteFlourPercentage;
    }

    @Override
    public boolean needsDelivery() {
        if (getDaysToExpire() < 5 && getWhiteFlourPercentage() > 75 || getAvailiableQuantity() < 10)
            return true;
        else
            return false;
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
