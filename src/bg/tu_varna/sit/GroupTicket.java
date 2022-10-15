package bg.tu_varna.sit;

public class GroupTicket extends Ticket{
    private int numUsers;

    public GroupTicket(String nameEvent, double price, int numUsers){
        super(nameEvent);
        super.price = price*20 - numUsers*2;
    }

    public int getNumUsers() {
        return numUsers;
    }

    public void adduser(){
        numUsers++;
        if(numUsers <= 20){
            super.price -=2;
        }
    }
    
}
