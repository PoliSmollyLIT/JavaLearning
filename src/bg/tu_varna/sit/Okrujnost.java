package bg.tu_varna.sit;

public class Okrujnost extends Circle{
    int r;

    public Okrujnost() {
    }

    public Okrujnost(int r) {
        super(r);
    }
    
    public double okrujnostArea(){
        return super.area();
    }
    
}
