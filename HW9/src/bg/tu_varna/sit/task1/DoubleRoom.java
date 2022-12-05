package bg.tu_varna.sit.task1;

public class DoubleRoom extends Room{
    private int days;
    private boolean hasChildren;
    public DoubleRoom(int pricePerDay, Exposure exposure, int days, boolean hasChildren) {
        super(pricePerDay, exposure);
        this.days = days;
        this.hasChildren = hasChildren;
    }
    public int getDays() {
        return days;
    }
    public boolean isHasChildren() {
        return hasChildren;
    }
    @Override
    public String toString() {
        return "DoubleRoom [days=" + days + ", hasChildren=" + hasChildren + "]";
    }
    @Override
    public double calculateStayPrice() {
        return getDays()*getPricePerDay() + 10;
    }
    @Override
    public double discount() {
        if(isHasChildren() && getDays()>=5)
        return 0.15*calculateStayPrice();
        return 0;
    }
    
    
}