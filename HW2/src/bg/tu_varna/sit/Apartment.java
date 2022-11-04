package bg.tu_varna.sit;

public class Apartment {
    int floor;
    double space;
    int numberRoooms;
    String viewPoint;

    public Apartment() {

    }

    public Apartment(int floor, double space, int numberRooms, String viewPoint) {
        setFloor(floor);
        setSpace(space);
        setNumberRooms(numberRooms);
        setViewPoint(viewPoint);
    }

    public int getFloor() {
        return this.floor;
    }

    public double getSpace() {
        return this.space;
    }

    public int getNumberRooms() {
        return this.numberRoooms;
    }

    public String getViewPoint() {
        return this.viewPoint;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setSpace(double space) {
        this.space = space;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRoooms = numberRooms;
    }

    public void setViewPoint(String viewPoint) {
        this.viewPoint = viewPoint;
    }

    public String toString() {
        return "Appartment on " + this.getFloor() + " floor with " + this.getSpace() + "sqare meters and "
                + this.getNumberRooms()
                + " rooms and with " + this.getViewPoint() + " view point";
    }

    public boolean equals(Apartment apartment) {
        if (this == apartment) {
            return true;
        }
        if (this.getSpace() == apartment.getSpace()) {
            return true;
        }
        return false;
    }
}