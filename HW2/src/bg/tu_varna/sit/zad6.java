package bg.tu_varna.sit;

public class zad6 {
    public static void main(String args[]) {
        String[] firstNames = {"Ivan", "Ivan", "Dido", "Anni", "Simona", "Teodora", "Maria", "Svetla", "Ivan", "Ivan"};
        String[] lastNames = {"Dimitrov", "Dimitrov", "Welichkov", "Simeonova", "Todorova", "Sabri", "Filipova", "Jivkova", "Dimitrov", "Dimitrov" };
        String[] tittles = { "Maria 1", "Maria 2", "Maria 3", "Maria 4", "Maria 5", "Maria 6", "Maria 7", "Maria 8", "Maria 9", "Maria 10" };
        int[] publishYears = { 2009, 2005, 2007, 2007, 2003, 1998, 1997, 2012, 1967, 2007};
        int[] pages = { 209, 205, 207, 207, 203, 198, 197, 212, 196, 207};
        Book[] books = new Book[10];

        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(firstNames[i], lastNames[i], tittles[i], publishYears[i], pages[i]);
        }
        int year = 2004, brAfterYear = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i].getPublishingYear() > year){
                brAfterYear++;
            }
        }
        System.out.println("Number of books, published after " + year + " is " + brAfterYear);
    }    
}
