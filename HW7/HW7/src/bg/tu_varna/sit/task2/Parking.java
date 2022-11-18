package bg.tu_varna.sit.task2;

public enum Parking {
    NOPARKINGLOT(0, PropertyType.UNDEFINED),
    ONEPLACEFORRENT(1, PropertyType.RENT),
    ONEPLACEFORSALE(1, PropertyType.SALE),
    TWOPLACESFORRENT(2, PropertyType.RENT),
    TWOPLACESFORSALE(2, PropertyType.SALE),
    PLACESFORRENT(100, PropertyType.RENT),
    PLACESFORSALE(100, PropertyType.SALE);

    private int numberOfParkingPlaces;
    private PropertyType propertyType;

    private Parking(int number, PropertyType propertyType) {
        this.numberOfParkingPlaces = number;
        this.propertyType = propertyType;
    }

    int getNumberOfParkingPlaces() {
        return this.numberOfParkingPlaces;
    }

    PropertyType getPropertyType() {
        return this.propertyType;
    }
}