package bg.tu_varna.sit.task1;

public class City {
    private String name;
    private int postal_code;

    public City() {
    }
    public City(String name, int postal_code) {
        this.name = name;
        this.postal_code = postal_code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPostal_code() {
        return postal_code;
    }
    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }
    
    
}
