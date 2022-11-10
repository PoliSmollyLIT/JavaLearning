package bg.tu_varna.sit.task1;

public class PoetryBook extends Book{

    public PoetryBook(String title, Author author, int publishingYear, double price, boolean hasHardCover) {
        super.setTitle(title);
        super.setAuthor(author);
        super.setPublishingYear(publishingYear);
        super.setPrice(price);
        super.setHasHardCover(hasHardCover);
    }

    @Override
    public double calculateMargin() {
       if(this.isHasHardCover() == true && this.getPublishingYear()>2000){
        return 0.01*this.getPrice();
       }
       else{
        return 0.05*this.getPrice();
       }
    }
}
