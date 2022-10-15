package bg.tu_varna.sit;

public class Car {
    String marka;
    String model;
    String color;
    int power;
    String dvigatelType;
    String powerBoxType;
    int yearProduced;
    long kmMoved;

    public Car(String marka, String model, int power, String dvigatelType, String powerBoxType, int yearProduced) {
        this.marka = marka;
        this.model = model;
        this.power = power;
        this.dvigatelType = dvigatelType;
        this.powerBoxType = powerBoxType;
        this.yearProduced = yearProduced;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public String getDvigatelType() {
        return dvigatelType;
    }

    public String getPowerBoxType() {
        return powerBoxType;
    }

    public int getYearProduced() {
        return yearProduced;
    }

    public long getKmMoved() {
        return kmMoved;
    }

    public void setColor(String color) {
        this.color = Integer.valueOf(color, 16).toString();
    }

    public void setKmMoved(long kmMoved) {
        this.kmMoved = kmMoved;
    }

}
