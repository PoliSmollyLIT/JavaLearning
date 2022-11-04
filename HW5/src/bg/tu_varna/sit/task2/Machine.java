package bg.tu_varna.sit.task2;

public class Machine {
    private double price;

    public Machine() {
    }

    public Machine(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Paper[] createTracePaper(int number_paper){
        return new Paper[number_paper];
    }
    
}
