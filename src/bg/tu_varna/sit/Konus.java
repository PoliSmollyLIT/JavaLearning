package bg.tu_varna.sit;

public class Konus extends Circle {
    int r;
    int h;

    public Konus() {
    }

    public Konus(int r, int h) {
        super(r);
        this.h = h;
    }

    public double konusVolume(){
        return super.volume(h)/3;
    }

}
