package bg.tu_varna.sit;

public class Book {
    String firstNameAuthor;
    String lastNameauthor;
    String bookTitle;
    int publishYear;
    int pages;

    public Book(){

    }

    public Book(String firstName, String lastName, String title, int year, int pages){
        this.firstNameAuthor = firstName;
        this.lastNameauthor = lastName;
        this.bookTitle = title;
        this.publishYear = year;
        this.pages = pages;
    }

    public String getFirstNameAuthor(){
        return firstNameAuthor;
    }    

    public String getLastNameAuthor(){
        return lastNameauthor;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public int getPublishingYear(){
        return publishYear;
    }

    public int getPages(){
        return pages;
    }

    public String toString() {
        return "The book "+ this.getBookTitle()  +" is written by " + this.getFirstNameAuthor() + " " + this.getLastNameAuthor() + " in "
                + this.getPublishingYear() + " and is " + this.getPages() + " pages";
    }

    public boolean equals(Book book) {
        if (this == book)
            return true;
        if (this.getBookTitle() == book.getBookTitle() && this.getFirstNameAuthor() == book.getFirstNameAuthor() && this.getLastNameAuthor() == book.getLastNameAuthor()) {
            return true;
        }
        return false;
    }
}