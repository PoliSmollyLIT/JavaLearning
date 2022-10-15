package bg.tu_varna.sit;

public class Attecker extends Character{
    private int efficiency;

    public Attecker() {

    }

    public Attecker(String name, int efficiency) {
        super(name, 150);
        this.efficiency = efficiency;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }
        
    
}
