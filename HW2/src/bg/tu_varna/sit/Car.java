package bg.tu_varna.sit;

public class Car {
    String marka;
    String regNomer;
    String probeg;

    public Car() {

    }

    public Car(String marka, String regNomer, String probeg) {
        this.marka = marka;
        this.regNomer = regNomer;
        this.probeg = probeg;
    }

    public String getMarka() {
        return marka;
    }

    public String getRegNomer() {
        return regNomer;
    }

    public long getProbeg() {
        return Long.parseLong(probeg);
    }

    public String toString() {
        return "The cars is " + this.getMarka() + " with " + this.getRegNomer() + " reg nomer and " + this.getProbeg()
                + " km probeg";
    }
}
