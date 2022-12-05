package bg.tu_varna.sit.task2;

import java.util.Comparator;

public class SortByTitle implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
      return (o1.getTitle().charAt(0)<o2.getTitle().charAt(0))? -1: (o1.getTitle().charAt(0) == o2.getTitle().charAt(0))? 0: 1;
    }
    
}