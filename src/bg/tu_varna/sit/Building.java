package bg.tu_varna.sit;

public class Building {
    double width;
    double height;
    double length;
    double area;
    String address;

    public Building(String address) {
        this.address = address;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }

}
