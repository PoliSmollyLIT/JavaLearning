package bg.tu_varna.sit.task4;

import java.util.Comparator;

public class SortBYPrice implements Comparator<Property>{

    @Override
    public int compare(Property o1, Property o2) {
        return (o1.calculate()<o2.calculate())? -1: (o1.calculate()==o2.calculate())? 0:1;
    }

    
    
}