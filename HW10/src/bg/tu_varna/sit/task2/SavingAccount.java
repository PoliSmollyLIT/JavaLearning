package bg.tu_varna.sit.task2;

public class SavingAccount extends Account{

    public SavingAccount(int id, AccountType type, Currency currency, double balance) {
        super(id, type, currency, balance);
    }

    @Override
    public String toString() {
        return "SavingAccount " + calculateInterestValue() + "\n";
    }

    @Override
    public double calculateInterestValue() {
        if(this.getType() == AccountType.PERSONAL && this.getCurrency() == Currency.BGN)
        return 0.15*getBalance();
        if(this.getCurrency() == Currency.BGN)
        return 0.05*getBalance();
        if(this.getCurrency() == Currency.USD && this.getType() == AccountType.PERSONAL)
        return 0.10*getBalance();
        return 0.01*getBalance();
    }

    
    
}