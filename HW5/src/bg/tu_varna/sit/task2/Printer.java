package bg.tu_varna.sit.task2;

public class Printer extends Machine{
    private int numberOfPages;

    public Printer() {
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

    public void content(String contents){
        this.setNumberOfPages(contents.length()/2500);
    }

    @Override
    public Paper[] createTracePaper(int number_paper) {
       
        return super.createTracePaper(number_paper);
    }
    
    
}
