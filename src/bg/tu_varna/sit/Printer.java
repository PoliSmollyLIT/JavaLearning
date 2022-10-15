package bg.tu_varna.sit;

public class Printer extends Machine{
    private int numberOfPages;

    public Printer(){

    }

    public Printer(double price, int numberOfPages) {
        super(price);
        this.numberOfPages = numberOfPages;
    } 
    
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    
}
