package bg.tu_varna.sit.task5;

public class SavingAccount extends Account{

    public SavingAccount(int id, AccoutType type, Currency currency, double balance) {
        super(id, type, currency, balance);
    }

    @Override
    public String toString() {
        return "SavingAccount []";
    }

    @Override
    public double calculateinterestalue() {
        if(getType() == AccoutType.PERSONAL && getCurrency() == Currency.BGN) 
        return getBalance()*0.15;
        if(getCurrency() == Currency.BGN)
        return getBalance()*0.05;
        if(getType() == AccoutType.PERSONAL && getCurrency() == Currency.USD)
        return getBalance()*0.10;
        return getBalance()*0.01;
    }
    
    
}