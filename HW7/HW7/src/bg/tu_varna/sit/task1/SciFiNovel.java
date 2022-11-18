package bg.tu_varna.sit.task1;

public class SciFiNovel extends Book {

    public SciFiNovel(String title, Author author, int publishingYear, double price, CoverType coverType) {
        super(title, author, publishingYear, price, coverType);
    }
    
    @Override
    public double calculateMargin() {
        if(getCoverType() == CoverType.PAPERBACK){
            return 0.09*getPrice();
        }
        return 0.12*getPrice();
    }
    
    
}