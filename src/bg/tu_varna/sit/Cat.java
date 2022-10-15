package bg.tu_varna.sit;

public class Cat {
    private String color;
    private int furSize;

    public Cat() {
    }

    public Cat(String color, int furSize) {
        this.color = color;
        this.furSize = furSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFurSize() {
        return furSize;
    }

    public void setFurSize(int furSize) {
        this.furSize = furSize;
    }

}
