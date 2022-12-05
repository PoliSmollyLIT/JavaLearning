package bg.tu_varna.sit.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }
    
    public void createAccount(Account account){
        accounts.add(account);
    }
    public void closeAccount(Account account){
        accounts.remove(account);
    }
    
    @Override
    public String toString() {
        return "Bank [accounts=" + accounts + "]";
    }

    public int calculateNumberOfSalaryAccounts(){
        int numberOfAccounts = 0;
        for (Account account : accounts) {
            if(account.getClass().getName() == SavingAccount.class.getName()){
                numberOfAccounts++;
            }
        }
        return numberOfAccounts;
    }

    public double calculateAverageInterestByCurrency(Currency currency){
        int numberOfAccounts = 0;
        double interests = 0;
        for (Account account : accounts) {
            if(account.getCurrency() == currency){
                numberOfAccounts++;
                interests += account.calculateinterestalue();
            }
        }
        return interests/ numberOfAccounts;
    }

    private void sortInterest(){
        Collections.sort(accounts, new SortByInterest());
    }

    private boolean containsCurrency(List<Account> accountsHighest, Currency currency){
        for (Account accountHigh : accountsHighest) {
            if(accountHigh.getCurrency() == currency)
                return true;
        }
        return false;
    }

    public List<Account> findHighestInterest(){
        sortInterest();
        List<Account> accountsHighest = new ArrayList<>();
        for (Account account : accounts) {
            Currency currentAccountCurrency = account.getCurrency();
            if(containsCurrency(accountsHighest, currentAccountCurrency)) continue;
            else{
                accountsHighest.add(account);
            }
        }
        return accountsHighest;
    }

}