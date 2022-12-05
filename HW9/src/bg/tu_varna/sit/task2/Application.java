package bg.tu_varna.sit.task2;

public class Application {
    public static void main(String[] args){
        Author author1 = new Author("Arthur", "Merrcy", "America");
        Author author2 = new Author("Arthur", "Merrcy", "America");
        Author author3 = new Author("Arthur", "Michigan", "America");
        Author author4 = new Author("Aurora", "Merrcy", "America");
        Book book1 = new Book("Book 1", author1, 2007, 10);
        Book book2 = new Book("Book 2", author2, 2022, 80);
        Book book3 = new Book("Book 3", author3, 2021, 80);
        Book book4 = new Book("Book 4", author4, 2020, 80);
    }    
}