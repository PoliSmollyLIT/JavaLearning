package bg.tu_varna.sit.task05;

public class Library {

    private Book[] books = new Book[10];

    public Library() {
    }

    public Book[] getBooks() {
        return books;
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public int countBooksByAuthor(Author author) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getAuthor().toString().equals(author.toString()))
                    count++;
            }
        }
        return count;
    }

}
