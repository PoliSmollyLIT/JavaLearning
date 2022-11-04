package bg.tu_varna.sit.task7;

public class GroupTicket extends Tickets{
    private int userCount;
    private int currentuserCount;

    public GroupTicket(double price, int currentuserCount) {
        super.setPrice(price);
        this.userCount = 20;
        this.currentuserCount = currentuserCount;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public int getCurrentuserCount() {
        return currentuserCount;
    }

    public void setCurrentuserCount(int currentuserCount) {
        this.currentuserCount = currentuserCount;
    }
    public void addUser(){
        this.currentuserCount++;
        if(currentuserCount >= getUserCount()) currentuserCount = userCount;
    }

    @Override
    public double getPrice() {
        return super.price*getUserCount() - 0.1*getCurrentuserCount();
    }
    
    
    
}
