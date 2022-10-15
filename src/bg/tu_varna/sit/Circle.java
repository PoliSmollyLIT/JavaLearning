package bg.tu_varna.sit;

public class Circle {
    int r;

    public Circle() {
    }
    
    public Circle(int r) {
        this.r = r;
    }

    public double area(){
        return Math.PI*r*r;
    }

    public double volume(int h){
        return Math.PI*r*r*h;
    }
    
}
