package bg.tu_varna.sit.task5;

public class AlcoholicBeverage extends Drink{
    private int vol;
    
    public AlcoholicBeverage(String name, int quantity, int serveQuantity, int vol) {
        super.setName(name);
        super.setQuantity(quantity);
        super.setServeQuantity(serveQuantity);
       this.vol = vol;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    @Override
    public boolean needOfDelivery() {
        if(this.getQuantity()<=5){
            return true;
        }
        return false;
    }
    
    
}
