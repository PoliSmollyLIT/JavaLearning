package bg.tu_varna.sit.task6;

public class Block extends Building{
    private int entrances;
    private int apartments;

    public Block(int entrances, int apartments) {
        this.entrances = entrances;
        this.apartments = apartments;
    }

    public int getEntrances() {
        return entrances;
    }

    public void setEntrances(int entrances) {
        this.entrances = entrances;
    }

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }
    private double onePartmentVolume(){
        return getLength()*getWidth()*2.45;
    }

    @Override
    public double heatedVolume() {
        return totalArea()*0.9;
    }

    @Override
    public double totalArea() {
        return getEntrances()*getApartments()*onePartmentVolume();
    }
    
    
    
}
