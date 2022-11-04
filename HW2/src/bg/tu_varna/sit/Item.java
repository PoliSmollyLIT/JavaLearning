package bg.tu_varna.sit;

public class Item {
    String type;
    int quantity;
    double price;
    int bestBefore;

    public Item() {

    }

    public Item(String type, int quantity, double price, int bestBefore) {
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.bestBefore = bestBefore;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBestBefore(int bestBefore) {
        this.bestBefore = bestBefore;
    }

    public String toString() {
        return ("The type is: " + this.getType() + "\nThe quantity: " + this.getQuantity() + "\nThe price is: "
                + this.getPrice() + "\nThe best before(in number of days) is: " + this.getBestBefore());
    }
}