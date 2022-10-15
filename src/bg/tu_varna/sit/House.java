package bg.tu_varna.sit;

public class House extends Building {
    int numFloors;
    String nameOwner;

    public House(String address, double width, double height, double length, double area, int numFloors, String nameOwner) {
        super(address);
        super.height = height;
        super.width = width;
        super.length = length;
        super.area = height*width*numFloors;
        this.numFloors = numFloors;
        this.nameOwner = nameOwner;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

}
