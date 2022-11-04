package bg.tu_varna.sit.task8;

public class DrivingLicense {
    private int number;
    private int validity;
    public DrivingLicense(int number, int validity) {
        this.number = number;
        this.validity = validity;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getValidity() {
        return validity;
    }
    public void setValidity(int validity) {
        this.validity = validity;
    }
    
    
}
