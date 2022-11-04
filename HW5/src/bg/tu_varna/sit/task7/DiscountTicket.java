package bg.tu_varna.sit.task7;

public class DiscountTicket extends StandartTicket{
    private String userName;

    public DiscountTicket(boolean valid, double price, String userName) {
        super(valid, price);
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public double getPrice() {
        return super.getPrice()/2;
    }
    
    
}
