package bg.tu_varna.sit.task2;

import java.util.Comparator;

public class SortByAuthor implements Comparator<Author>{

    @Override
    public int compare(Author o1, Author o2) {
        return (o1.getFirstName().compareTo(o2.getFirstName())<0)? -1: (o1.getFirstName().equals(o2.getFirstName()) == true)? 0: 1;
    }
    
    
}