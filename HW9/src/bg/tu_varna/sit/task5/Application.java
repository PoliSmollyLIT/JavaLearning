package bg.tu_varna.sit.task5;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args)    {
        SavingAccount savingAccount1 = new SavingAccount(20, AccoutType.PERSONAL, Currency.BGN, 10);
        SavingAccount savingAccount2 = new SavingAccount(25, AccoutType.PERSONAL, Currency.EUR, 10);
        SavingAccount savingAccount3 = new SavingAccount(30, AccoutType.CORPORATE, Currency.BGN, 10);
        SalaryAccount salaryAccount1 = new SalaryAccount(40, AccoutType.CORPORATE, Currency.BGN, 10);
        SalaryAccount salaryAccount2 = new SalaryAccount(45, AccoutType.PERSONAL, Currency.EUR, 10);
        SalaryAccount salaryAccount3 = new SalaryAccount(50, AccoutType.PERSONAL, Currency.GBP, 10);
        DepositAccount depositAccount1 = new DepositAccount(60,AccoutType.PERSONAL, Currency.USD, 10);
        DepositAccount depositAccount2 = new DepositAccount(65,AccoutType.PERSONAL, Currency.GBP, 10);
        DepositAccount depositAccount3 = new DepositAccount(70,AccoutType.PERSONAL, Currency.BGN, 10);

        List<Account> accounts = new ArrayList<>();
        accounts.add(depositAccount3);
        accounts.add(depositAccount2);
        accounts.add(depositAccount1);
        accounts.add(salaryAccount3);
        accounts.add(salaryAccount2);
        accounts.add(salaryAccount1);
        accounts.add(savingAccount3);
        accounts.add(savingAccount2);
        accounts.add(savingAccount1);

        Bank bank1 = new Bank(accounts);

        System.out.println(bank1.calculateAverageInterestByCurrency(Currency.BGN));
        System.out.println(bank1.calculateNumberOfSalaryAccounts());
        System.out.println(bank1.findHighestInterest());
    }
}