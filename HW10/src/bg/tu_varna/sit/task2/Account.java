package bg.tu_varna.sit.task2;

public abstract class Account implements InterestCalculator, Comparable<Account>{
    private int id;
    private AccountType type;
    private Currency currency;
    private double balance;
    public Account(int id, AccountType type, Currency currency, double balance) {
        this.id = id;
        this.type = type;
        this.currency = currency;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public AccountType getType() {
        return type;
    }
    public Currency getCurrency() {
        return currency;
    }
    public double getBalance() {
        return balance;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((currency == null) ? 0 : currency.hashCode());
        long temp;
        temp = Double.doubleToLongBits(balance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (id != other.id)
            return false;
        return true;
    }
    @Override
    public abstract double calculateInterestValue();
    @Override
    public int compareTo(Account o) {
        return (this.getBalance()<o.getBalance())? -1: (this.getBalance()==o.getBalance())? 0: 1;
    }
    
    
}