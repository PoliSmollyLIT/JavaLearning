package bg.tu_varna.sit.task4;

public class Interest<E> {
    private E account;

    public Interest(E account) {
        this.account = account;
    }

    public E getAccount() {
        return account;
    }

    public void setAccount(E account) {
        this.account = account;
    }
    
    public double displayAccountInterest(){
       return ((Account)account).calculateAccountInterest();
    }
    
}