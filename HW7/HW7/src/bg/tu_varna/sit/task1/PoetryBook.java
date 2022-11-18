package bg.tu_varna.sit.task1;

public class PoetryBook extends Book{

    public PoetryBook(String title, Author author, int publishingYear, double price, CoverType coverType) {
        super(title, author, publishingYear, price, coverType);
    }
    
    @Override
    public double calculateMargin() {
        if(getCoverType() == CoverType.HARDCOVER && getPublishingYear()>=2000){
            return 0.01*getPrice();
        }
        return 0.05*getPrice();
    }
    
}