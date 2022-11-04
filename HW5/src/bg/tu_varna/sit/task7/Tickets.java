package bg.tu_varna.sit.task7;

public abstract class Tickets {
    private String peformanceName;
     double price;

    public String getPeformanceName() {
        return peformanceName; 
    }

    public void setPeformanceName(String peformanceName) {
        this.peformanceName = peformanceName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double getPrice();
}
