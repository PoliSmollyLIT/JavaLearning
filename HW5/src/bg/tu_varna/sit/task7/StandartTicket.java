package bg.tu_varna.sit.task7;

public class StandartTicket extends Tickets {
    private boolean valid;

    public StandartTicket(boolean valid, double price ) {
        this.valid = valid;
        super.setPrice(price);
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public double getPrice() {
      return super.price;
    }
    
    
}
