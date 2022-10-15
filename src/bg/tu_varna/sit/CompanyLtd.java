package bg.tu_varna.sit;

public class CompanyLtd extends Company{
    private String ownerName;
    private double starterCapital;
    private double latestCapital;
    
    public double differenceCapital(){
        return latestCapital - starterCapital;
    }
    
    public void setLatestCapital(double latestCapital) {
        this.latestCapital = latestCapital;
    }


    public String getOwnerName() {
        return ownerName;
    }


    public double getStarterCapital() {
        return starterCapital;
    }


    public double getLatestCapital() {
        return latestCapital;
    }
    
}
