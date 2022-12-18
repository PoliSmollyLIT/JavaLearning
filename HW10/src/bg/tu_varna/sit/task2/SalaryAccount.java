package bg.tu_varna.sit.task2;

public class SalaryAccount extends Account{

    public SalaryAccount(int id, AccountType type, Currency currency, double balance) {
        super(id, type, currency, balance);
    }
    

    @Override
    public double calculateInterestValue() {
        if(this.getType() == AccountType.CORPORATE)
        return 0.00;
        if(this.getCurrency() == Currency.BGN)
        return 0.05*getBalance();
        if(this.getCurrency() == Currency.USD)
        return 0.03*getBalance();
        if(this.getCurrency() == Currency.EUR)
        return 0.02*getBalance();
        return 0.01*getBalance();
    }


    @Override
    public String toString() {
        return "SalaryAccount " + calculateInterestValue() + "\n";
    }
    
    
}