package bg.tu_varna.sit.task1;

public class Application {
    public static void main(String args[]) {
        Book[] books = new Book[3];
        books[0] = new PoetryBook("Bla Bla Bla", new Author("Ali", "Baba", "Egypt"), 2005, 12.5, CoverType.HARDCOVER);
        books[1] = new SciFiNovel("sciFi novel", new Author("Sali", "Qshar", "Sibir"), 1997, 6.80, CoverType.PAPERBACK);
        books[2] = new CrimeNovel("12 negurcheta", new Author("Agatha", "Christie", "England"), 2003, 20.4, CoverType.HARDCOVER);

        Bookstore bookStore = new Bookstore(books);
        System.out.println(bookStore.calculateTotalBookPrice());
        System.out.println(bookStore.calculateaverageBookPrice());
    }

}
