package bg.tu_varna.sit.task2;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Bank {
    private Map<Account, Double> bankAccount = new HashMap<>();

    public Bank() {
    }

    public void addAccount(Account account, Double interest) {
        bankAccount.put(account, interest);
    }
    
    @Override
    public String toString() {
        StringBuffer output = new StringBuffer();
        bankAccount.forEach((Account key, Double value) ->{
            output.append(key + " " + value + "\n" );
        });
        return output.toString();
    }

    public void sortAccountByBalance(){
      Map<Account, Double> sorted = new TreeMap<Account, Double>(new Comparator<Account>(){
        @Override
        public int compareTo(Account o) {
            return this.compareTo(o);
        }
      });
    }

    public void sortAccountByInterest(){

    }

    public Currency findCurrencyWithMostAccounts(){
        Map<Currency, Integer> currencies = new HashMap<>();
        bankAccount.forEach((Account acc, Double inter) -> {
            if(currencies.containsKey(acc.getCurrency())){
                Integer br = currencies.get(acc.getCurrency());
                currencies.put(acc.getCurrency(), br+1);
            }else{
                currencies.put(acc.getCurrency(), 1);
            }
        });
        Integer max = 0;
        Currency maxCurr = null;
        currencies.forEach((Currency curr, Integer br)->{
            if(br>max){
                max=br;
                maxCurr = curr;
            }
        });
        return maxCurr;
    }
}