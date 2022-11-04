package bg.tu_varna.sit.task6;

public abstract class Building {
    private String address;
    private double width;
    private double length;
    private double height;

    public abstract double heatedVolume();
    public abstract double totalArea();
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
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
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
