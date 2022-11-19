package bg.tu_varna.sit.task4;

public class Lake extends WaterBody{
    private double width;
    private double length;
    public Lake(String name, double depth, Fish[] fishes, double width, double length) throws WaterBodyException{
        super(name, depth, fishes);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public boolean isFloaty() {
      if(getDepth()>=5 && getLength()>=1000 && getWidth()>=1000) return true;
      return false;
    }
    
    
}