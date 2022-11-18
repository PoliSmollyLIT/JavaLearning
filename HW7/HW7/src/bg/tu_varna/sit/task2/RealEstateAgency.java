package bg.tu_varna.sit.task2;

public class RealEstateAgency {
    private String name;
    private Property[] properties;
    
    public RealEstateAgency(String name, Property[] properties) {
        this.name = name;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Property[] getProperties() {
        return properties;
    }

    public void setProperties(Property[] properties) {
        this.properties = properties;
    }
    
    public double calculateTotalExpectedCommission(){
        double commission = 0.0;
        for (int i = 0; i < properties.length; i++) {
            commission += properties[i].calculateCommission();
        }
        return commission;
    }

    public int getProperiesForSale(){
        int prop = 0;
        for (int i = 0; i < this.properties.length; i++) {
            if(properties[i].getPropertyType() == PropertyType.SALE){
                prop++;
            }
        }
        return prop;
    }
}