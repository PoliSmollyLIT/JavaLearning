package bg.tu_varna.sit.task10;

public abstract class Shape implements Volume, Area{

    @Override
    public double calculateVolume(int r, int h) {
        return Math.PI*r*r*h;
    }
    @Override
    public double calculateArea(int r) {
        return Math.PI*r*r;
    }
    
}
