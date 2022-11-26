package bg.tu_varna.sit.task4;

public abstract class Account implements InterestCalculator{
    private AccountHolder accountHolder;
    private Currency currency;
    private double balance;
    public Account(AccountHolder accountHolder, Currency currency, double balance) {
        this.accountHolder = accountHolder;
        this.currency = currency;
        this.balance = balance;
    }
    public AccountHolder getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }
    public Currency getCurrency() {
        return currency;
    }
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public abstract double calculateAccountInterest();
    
}