package bg.tu_varna.sit.task1;

public class Bookstore {
    private Book[] books;  

    public Bookstore(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
    
    public double calculateTotalBookPrice(){
        double price = 0.0;
        for (int i = 0; i < books.length; i++) {
            price += books[i].getFinalPrice();
        }
        return price;
    }
    
    public double calculateAverageBookPrice(){
        return calculateTotalBookPrice()/books.length;
    }
}
