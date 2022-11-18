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

    public double calculateTotalBookPrice() {
        double totalPrice = 0;
        for (int i = 0; i < books.length; i++) {
            totalPrice += books[i].getFinalPrice();
        }
        return totalPrice;
    }

    public double calculateaverageBookPrice(){
        return calculateTotalBookPrice()/books.length;
    }

}