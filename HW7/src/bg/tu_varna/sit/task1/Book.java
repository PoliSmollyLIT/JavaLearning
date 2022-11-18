package bg.tu_varna.sit.task1;

public abstract class Book implements Margin{
    private String title;
    private Author author;
    private int publishingYear;
    private double price;
    private CoverType coverType;
    
    public Book(String title, Author author, int publishingYear, double price, CoverType coverType) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.price = price;
        this.coverType = coverType;
    }
    
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
    public CoverType getCoverType() {
        return coverType;
    }
    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return title + " " + author + " " + publishingYear + " " + price
                + " " + coverType;
    }

    
    @Override
    public abstract double calculateMargin();

    public double getFinalPrice(){
        return getPrice() + calculateMargin();
    }
    
    
}
