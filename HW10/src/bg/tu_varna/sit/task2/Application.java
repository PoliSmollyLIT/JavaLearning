package bg.tu_varna.sit.task2;

public class Application {
    public static void main(String[] args){
        DepositAccount depositAccount = new DepositAccount(1, AccountType.PERSONAL, Currency.BGN, 23.40);
        SalaryAccount salaryAccount = new SalaryAccount(2, AccountType.CORPORATE, Currency.EUR, 30.20);
        SavingAccount savingAccount = new SavingAccount(3, AccountType.PERSONAL, Currency.USD, 45.12);
        Bank bank = new Bank();
        bank.addAccount(depositAccount, depositAccount.calculateInterestValue());
        bank.addAccount(savingAccount, savingAccount.calculateInterestValue());
        bank.addAccount(salaryAccount, salaryAccount.calculateInterestValue());

        System.out.println(bank.findCurrencyWithMostAccounts());
        System.out.println(bank);
        bank.sortAccountByBalance();
        System.out.println(bank);
        bank.sortAccountByInterest();
        System.out.println(bank);
    }    
}