package bg.tu_varna.sit.task2;

import java.util.Comparator;

public class SortByAvailiableQuantity implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return (o1.getAvailiableQuantity()<o2.getAvailiableQuantity())? -1: (o1.getAvailiableQuantity()==o2.getAvailiableQuantity())? 0: 1;
    }


}