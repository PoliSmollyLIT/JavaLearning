package bg.tu_varna.sit;

public class Bus extends Car {
    int travelPlaces;
    int traveledCurses;

    

    public Bus(String marka, String model, int power, String dvigatelType, String powerBoxType, int yearProduced,
            int travelPlaces, int traveledCurses) {
        super(marka, model, power, dvigatelType, powerBoxType, yearProduced);
        this.travelPlaces = travelPlaces;
        this.traveledCurses = traveledCurses;
    }

    public int getTravelPlaces() {
        return travelPlaces;
    }

    public int getTraveledCurses() {
        return traveledCurses;
    }

    public void setTraveledCurses(int traveledCurses) {
        this.traveledCurses = traveledCurses;
    }

    public boolean isOverTraveled() {
        if (traveledCurses - 10 < 5){
            return false;
        }
        return true;
    }

}
