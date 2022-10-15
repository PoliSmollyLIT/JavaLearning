package bg.tu_varna.sit;

public class PromotionalTicket extends StandartTicket{
    private String nameOfUser;
    
    public PromotionalTicket(String nameEvent, double price, boolean used, String nameOfUser){
        super(nameEvent, price/2, used);
        this.nameOfUser = nameOfUser;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }
    
    
}
