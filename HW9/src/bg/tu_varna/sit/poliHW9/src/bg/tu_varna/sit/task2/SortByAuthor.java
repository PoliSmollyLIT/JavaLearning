package bg.tu_varna.sit.task2;

import java.util.Comparator;

public class SortByAuthor implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return (o1.getAuthor().getFirstName().compareTo(o2.getAuthor().getFirstName())<0)? -1: (o1.getAuthor().getFirstName().compareTo(o2.getAuthor().getFirstName())==0)? 0: 1;
    }


}