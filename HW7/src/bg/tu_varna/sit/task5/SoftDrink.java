package bg.tu_varna.sit.task5;

public class SoftDrink extends Drink{
    private boolean isSugarFree;
    private Fragrances fragrance;
    public SoftDrink(String name, int quantity, int serveQuantity, boolean isSugarFree, Fragrances fragrance) {
        super(name, quantity, serveQuantity);
        this.isSugarFree = isSugarFree;
        this.fragrance = fragrance;
    }
    public boolean isSugarFree() {
        return isSugarFree;
    }
    public void setSugarFree(boolean isSugarFree) {
        this.isSugarFree = isSugarFree;
    }
    public Fragrances getFragrance() {
        return fragrance;
    }
    public void setFragrance(Fragrances fragrance) {
        this.fragrance = fragrance;
    }
    @Override
    public boolean needOfDelivery() {
        if(getQuantity()<=10) return true;
        return false;
    }
    
    
}