package bg.tu_varna.sit.task5;

public class SoftDrink extends Drink{
    private boolean sugarFree;

    
    public SoftDrink(String name, int quantity, int serveQuantity, boolean sugarFree) {
        super.setName(name);
        super.setQuantity(quantity);
        super.setServeQuantity(serveQuantity);
        this.sugarFree = sugarFree;
    }

    public boolean isSugarFree() {
        return sugarFree;
    }

    public void setSugarFree(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }

    @Override
    public boolean needOfDelivery() {
        if(this.getQuantity()<=10){
            return true;
        }
        return false;
    }
    
    
}
