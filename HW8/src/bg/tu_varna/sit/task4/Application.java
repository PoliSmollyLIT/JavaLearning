package bg.tu_varna.sit.task4;

public class Application {
    public static void main(String[] args){
        AccountHolder pepo = new AccountHolder("Pepo", "Pepov", 32);
        DepositAccount depositPepo = new DepositAccount(pepo, Currency.BGN, 10000);
        SalaryAccount salaryPepo = new SalaryAccount(pepo, Currency.USD, 3000);
        SavingAccount savingPepo = new SavingAccount(pepo, Currency.EUR, 18000);
        Interest<DepositAccount> interestdeposit = new Interest<DepositAccount>(depositPepo);
        Interest<SalaryAccount> interestSalary = new Interest<SalaryAccount>(salaryPepo);
        Interest<SavingAccount> interestSaving = new Interest<SavingAccount>(savingPepo);

        System.out.println(interestdeposit.displayAccountInterest());
        System.out.println(interestSalary.displayAccountInterest());
        System.out.println(interestSaving.displayAccountInterest());
    }
}