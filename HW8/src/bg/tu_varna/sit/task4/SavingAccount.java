package bg.tu_varna.sit.task4;

public class SavingAccount extends Account{

    public SavingAccount(AccountHolder accountHolder, Currency currency, double balance) {
        super(accountHolder, currency, balance);
    }

    @Override
    public double calculateAccountInterest() {
        if(getAccountHolder().getAge()>=62 && getCurrency() == Currency.BGN)
        return 0.08*getBalance();
        if(getCurrency() == Currency.BGN)
        return 0.05*getBalance();
        if(getCurrency() == Currency.USD)
        return 0.025*getBalance();
        return 0.005*getBalance();
    }
    
    
}