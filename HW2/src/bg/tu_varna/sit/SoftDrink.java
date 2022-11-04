package bg.tu_varna.sit;

public class SoftDrink {
    String name;
    String dueToDate;
    String bottleVolume;
    String sugarPer100;

    public SoftDrink() {

    }

    public SoftDrink(String name, String dueToDate, String bottleVolume, String sugarPer100) {
        this.name = name;
        this.dueToDate = dueToDate;
        this.bottleVolume = bottleVolume;
        this.sugarPer100 = sugarPer100;
    }

    public String getName() {
        return name;
    }

    public String getDueToDate() {
        return dueToDate;
    }

    public String getBottleVolume() {
        return bottleVolume;
    }

    public int getSugarPer100() {
        return Integer.parseInt(sugarPer100);
    }

    public String toString() {
        return "The soft drink is with name: " + this.getName() + " and is best before:" + this.getDueToDate() + " in "
                + this.getBottleVolume() + "ml bottle and the sugarPer100 is " + this.getSugarPer100();
    }

    public boolean equals(SoftDrink drink) {
        if (this == drink)
            return true;
        if (this.getName() == drink.getName() && this.getSugarPer100() == drink.getSugarPer100()) {
            return true;
        }
        return false;
    }
}
