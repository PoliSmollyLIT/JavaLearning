package bg.tu_varna.sit.task4;

public class NonEdibleFish extends Fish{
    private String threat;

    
    public NonEdibleFish(String name, int quantity, String threat) {
        super(name, quantity);
        this.threat = threat;
    }

    public String getThreat() {
        return threat;
    }

    public void setThreat(String threat) {
        this.threat = threat;
    }
    
    
}
