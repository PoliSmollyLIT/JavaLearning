package bg.tu_varna.sit.task1;

public abstract class Room implements PriceCalculator {
    private int pricePerDay;
    private Exposure exposure;
    private boolean availiable;

    public Room(int pricePerDay, Exposure exposure) {
        this.pricePerDay = pricePerDay;
        this.exposure = exposure;
        this.availiable = true;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Exposure getExposure() {
        return exposure;
    }

    public void setExposure(Exposure exposure) {
        this.exposure = exposure;
    }

    public boolean isAvailiable() {
        return availiable;
    }

    public void setAvailiable(boolean availiable) {
        this.availiable = availiable;
    }

    @Override
    public double calculateReservationPrice() {
        return calculateStayPrice() - discount();
    }

    @Override
    public abstract double calculateStayPrice();

    @Override
    public abstract double discount();

}