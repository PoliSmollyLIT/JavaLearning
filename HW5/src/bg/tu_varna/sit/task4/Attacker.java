package bg.tu_varna.sit.task4;

public class Attacker extends Character{
    private int efficiency;

    public Attacker(int efficiency) {
        super.setLife(150);
        this.efficiency = efficiency;
    }

    public int getEfficiency() {
        return efficiency;
    }


    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }
    
    @Override
    public void defense(int striking) {
        setLife(getLife() - striking);
    }

    @Override
    public int striking() {
        return getEfficiency();
    }    
}
