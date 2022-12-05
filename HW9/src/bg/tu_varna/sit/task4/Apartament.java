package bg.tu_varna.sit.task4;

public class Apartament extends Property{
    private int floornumber;
    private int numberOfRooms;
    private Exposition exposition;
    private boolean hasParkingPlace;
    public Apartament(int area, int basePrice, PropertyType propertyType, int floornumber, int numberOfRooms,
            Exposition exposition, boolean hasParkingPlace) {
        super(area, basePrice, propertyType);
        this.floornumber = floornumber;
        this.numberOfRooms = numberOfRooms;
        this.exposition = exposition;
        this.hasParkingPlace = hasParkingPlace;
    }
    public int getFloornumber() {
        return floornumber;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public Exposition getExposition() {
        return exposition;
    }
    public boolean isHasParkingPlace() {
        return hasParkingPlace;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + floornumber;
        result = prime * result + numberOfRooms;
        result = prime * result + ((exposition == null) ? 0 : exposition.hashCode());
        result = prime * result + (hasParkingPlace ? 1231 : 1237);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Apartament other = (Apartament) obj;
        if (floornumber != other.floornumber)
            return false;
        if (numberOfRooms != other.numberOfRooms)
            return false;
        if (exposition != other.exposition)
            return false;
        if (hasParkingPlace != other.hasParkingPlace)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Apartament [floornumber=" + floornumber + ", numberOfRooms=" + numberOfRooms + ", exposition="
                + exposition + ", hasParkingPlace=" + hasParkingPlace + "]";
    }
    @Override
    public double calculate() {
        if(this.getArea()>=50 && isHasParkingPlace() && getExposition() == Exposition.SOUTH || getExposition() == Exposition.WEST || getExposition() == Exposition.SOUTHWEST && getPropertyType() == PropertyType.NEW){
            return getBasePrice()*1.25;
        }
        if(getExposition() == Exposition.SOUTH || getExposition() == Exposition.WEST || getExposition() == Exposition.SOUTHWEST && getPropertyType() == PropertyType.NEW){
            return getBasePrice()*1.20;
        }
        if(getPropertyType() == PropertyType.NEW){
            return getBasePrice()*1.15;
        }
        if(isHasParkingPlace() && getPropertyType() == PropertyType.OLD){
            return getBasePrice()*1.18;
        }
        return getBasePrice()*1.12;
    }
    
    
}