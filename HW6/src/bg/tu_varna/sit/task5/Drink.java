package bg.tu_varna.sit.task5;

public abstract class Drink implements Delivery, Serving{
    private String name;
    private int quantity;
    private int serveQuantity;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getServeQuantity() {
        return serveQuantity;
    }
    public void setServeQuantity(int serveQuantity) {
        this.serveQuantity = serveQuantity;
    }

    @Override
    public void deliver(int quantity) {
        setQuantity(getQuantity() + quantity);
    }

    @Override
    public abstract boolean needOfDelivery();

    @Override
    public void serve(int quantity) {
       if(quantity * getServeQuantity() <= getQuantity()){
            setQuantity(getQuantity() - (getServeQuantity()*quantity));
       }else{
            setQuantity(getQuantity() - (getQuantity()/getServeQuantity()));
       }

    }
    @Override
    public String toString() {
        return name + " " + quantity + " " + needOfDelivery();
    }
    
    
}
