package bg.tu_varna.sit.task5;

public abstract class Company {
    private String name;
    private String eik;
    private int income;
    private int costs;
    
    public String getName() {
        return name;
    }
    public String getEik() {
        return eik;
    }
    public int getIncome() {
        return income;
    }
    public int getCosts() {
        return costs;
    }
    
    public abstract double tax();    
}
