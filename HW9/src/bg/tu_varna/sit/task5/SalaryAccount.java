package bg.tu_varna.sit.task5;

public class SalaryAccount extends Account {

    public SalaryAccount(int id, AccoutType type, Currency currency, double balance) {
        super(id, type, currency, balance);
    }

    @Override
    public String toString() {
        return "SalaryAccount []";
    }

    @Override
    public double calculateinterestalue() {
        if (getType() == AccoutType.CORPORATE)
            return 0;
        if (getCurrency() == Currency.BGN)
            return getBalance() * 0.05;
        if (getCurrency() == Currency.USD)
            return getBalance() * 0.03;
        if (getCurrency() == Currency.EUR)
            return getBalance() * 0.02;
        return getBalance() * 0.01;
    }

}