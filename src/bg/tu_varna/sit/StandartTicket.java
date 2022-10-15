package bg.tu_varna.sit;

public class StandartTicket extends Ticket{
    private boolean used;

    public StandartTicket(String nameEvent, double price, boolean used){
        super(nameEvent);
        super.price = price;
        this.used = used;
    }

    public boolean isUsed() {
        return used;
    }
    
}
