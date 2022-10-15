package bg.tu_varna.sit;

public class Ticket {
    private String nameEvent;
    double price;

    public Ticket(String nameEvent){
        this.nameEvent = nameEvent;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public double getPrice() {
        return price;
    }
    
    
}
