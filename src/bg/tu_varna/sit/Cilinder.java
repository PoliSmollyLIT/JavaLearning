package bg.tu_varna.sit;

public class Cilinder extends Circle {
    int r;
    int h;

    public Cilinder() {
    }

    public Cilinder(int r, int h) {
        super(r);
        this.h = h;
    }

    public double cilinderVolume(){
        return super.volume(h);
    }

}
