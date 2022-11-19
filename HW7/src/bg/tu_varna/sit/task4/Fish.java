package bg.tu_varna.sit.task4;

public class Fish {
    private FishList name;
    private int quantity;
    
    public Fish(FishList name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public FishList getName() {
        return name;
    }
    public void setName(FishList name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
