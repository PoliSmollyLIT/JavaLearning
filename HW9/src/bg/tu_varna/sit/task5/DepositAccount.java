package bg.tu_varna.sit.task5;

public class DepositAccount extends Account{

    public DepositAccount(int id, AccoutType type, Currency currency, double balance) {
        super(id, type, currency, balance);
    }

    @Override
    public double calculateinterestalue() {
        if(getType() == AccoutType.PERSONAL)
        return getBalance()*0.09;
        if(getCurrency() == Currency.BGN)
        return getBalance()*0.07;
        if(getCurrency() == Currency.USD)
        return getBalance()*0.05;
        if(getCurrency() == Currency.EUR)
        return getBalance()*0.02;
        return getBalance()*0.01;
        
    }

    @Override
    public String toString() {
        return "DepositAccount []";
    }
    
    
}