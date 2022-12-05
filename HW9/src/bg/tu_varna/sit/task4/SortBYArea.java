package bg.tu_varna.sit.task4;

import java.util.Comparator;

public class SortBYArea implements Comparator<Property>{

    @Override
    public int compare(Property o1, Property o2) {
        return o1.compareTo(o2);
    }
    

}