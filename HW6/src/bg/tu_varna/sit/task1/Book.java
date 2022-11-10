package bg.tu_varna.sit.task1;

public abstract class Book implements Margin{
    private String title;
    private Author author;
    private int publishingYear;
    private double price;
    private boolean hasHardCover;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isHasHardCover() {
        return hasHardCover;
    }
    public void setHasHardCover(boolean hasHardCover) {
        this.hasHardCover = hasHardCover;
    }

    @Override
    public abstract double calculateMargin();

    public double getFinalPrice(){
        return getPrice()+calculateMargin();
    }

    public String toString(){
        return author.toString() + ": " + title;
    }
    
}
