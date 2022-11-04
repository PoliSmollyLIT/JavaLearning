package bg.tu_varna.sit.task10;

public class Circle extends Shape {
    private int h;
    private int r;
    
    public Circle() {
    }

    public Circle(int h, int r) {
        this.h = h;
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double calculateArea(int r) {
        return super.calculateArea(getR());
    }
    
}
