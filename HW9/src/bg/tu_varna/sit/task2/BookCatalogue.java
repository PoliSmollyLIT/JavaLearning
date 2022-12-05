package bg.tu_varna.sit.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class BookCatalogue {
    private Set<Book> books;

    public BookCatalogue() {
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void borrowBook(Book book) {
        if (books.contains(book)) {
            Iterator<Book> iterator = books.iterator();
            while (iterator.hasNext()) {
                Book tmp = iterator.next();
                if (tmp.equals(book)) {
                    if (tmp.getAvailiableQuantity() == 1) {
                        removeBook(book);
                    } else {
                        tmp.setAvailiableQuantity(tmp.getAvailiableQuantity() - 1);
                    }
                }
            }
        }
    }

    public void returnBook(Book book){
        if (books.contains(book)) {
            Iterator<Book> iterator = books.iterator();
            while (iterator.hasNext()) {
                Book tmp = iterator.next();
                if (tmp.equals(book)) {
                      tmp.setAvailiableQuantity(tmp.getAvailiableQuantity() + 1);
                }
            }
        }else{
            addBook(book);
        }
    }

    public int countBooksByAuthor(Author author){
        int numberBooks = 0;
        for (Book book : books) {
            if(book.getAuthor().equals(author)){
                numberBooks++;
            }
        }
        return numberBooks;
    }

    public void sortCatalogueByAuthor(){
        List<Book> listBooks = new ArrayList<Book>(books);
        Collections.sort(listBooks, new SortByAuthor());
    }

    public void sortCatalogueByAvailableQuantity(){
        List<Book> listBooks = new ArrayList<Book>(books);
        Collections.sort(listBooks, new SortByAvailiableQuantity());
    }

    public void sortCatalogueByTitle(){
        List<Book> listBooks = new ArrayList<Book>(books);
        Collections.sort(listBooks, new SortByTitle());
    }

    public int countBooksPublishedAfterYear(int year){
        int numberBooks = 0;
        for (Book book : books) {
            if(book.getPublishingYear()>=year){
                numberBooks++;
            }
        }
        return numberBooks;
    }

    @Override
    public String toString() {
        String output = "";
        for (Book book : books) {
            output += book.getTitle() + " " + book.getAuthor() + " " + book.getAvailiableQuantity();
        }
        return output;
    }
    

}