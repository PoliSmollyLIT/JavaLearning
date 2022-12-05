package bg.tu_varna.sit.task5;

import java.util.Comparator;

public class SortByInterest implements Comparator<Account>{

    @Override
    public int compare(Account o1, Account o2) {
        return (o1.calculateinterestalue()>o2.calculateinterestalue())? 1: (o1.calculateinterestalue()==o2.calculateinterestalue())? 0:-1;
    }


    
}