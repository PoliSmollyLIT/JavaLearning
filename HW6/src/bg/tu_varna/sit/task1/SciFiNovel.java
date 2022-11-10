package bg.tu_varna.sit.task1;

public class SciFiNovel extends Book{

    public SciFiNovel(String title, Author author, int publishingYear, double price, boolean hasHardCover) {
        super.setTitle(title);
        super.setAuthor(author);
        super.setPublishingYear(publishingYear);
        super.setPrice(price);
        super.setHasHardCover(hasHardCover);
    }

    @Override
    public double calculateMargin() {
       if(this.isHasHardCover() == false){
        return 0.09*this.getPrice();
       }
       else{
        return 0.12*this.getPrice();
       }
    }
}
