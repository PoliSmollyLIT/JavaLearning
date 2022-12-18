package bg.tu_varna.sit.task2;

public class DepositAccount extends Account{

    public DepositAccount(int id, AccountType type, Currency currency, double balance) {
        super(id, type, currency, balance);
    }

    @Override
    public String toString() {
        return "DepositAccount " + calculateInterestValue() + "\n";
    }

    @Override
    public double calculateInterestValue() {
        if(this.getType() == AccountType.PERSONAL)
        return 0.09*getBalance();
        if(this.getCurrency() == Currency.BGN)
        return 0.07*getBalance();
        if(this.getCurrency() == Currency.USD)
        return 0.05*getBalance();
        if(this.getCurrency() == Currency.EUR)
        return 0.02*getBalance();
        return 0.01*getBalance();
        
    }
    
    
}