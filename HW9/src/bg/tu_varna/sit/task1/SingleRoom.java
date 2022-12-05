package bg.tu_varna.sit.task1;

public class SingleRoom extends Room{
    private int days;

    public SingleRoom(int pricePerDay, Exposure exposure, int days) {
        super(pricePerDay, exposure);
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        return "SingleRoom [days=" + days + "]";
    }

    @Override
    public double calculateStayPrice() {
        return getDays()*getPricePerDay();
    }

    @Override
    public double discount() {
        if(getDays()>=3)
        return 0.10*calculateStayPrice();
        return 0;
    }
    
    
}