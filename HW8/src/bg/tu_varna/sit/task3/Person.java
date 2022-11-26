package bg.tu_varna.sit.task3;

public class Person {
    private String name;
    private AgeGroup ageGroup;
    private double priceProduct;
    public Person(String name, AgeGroup ageGroup, double priceProduct) {
        this.name = name;
        this.ageGroup = ageGroup;
        this.priceProduct = priceProduct;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public AgeGroup getAgeGroup() {
        return ageGroup;
    }
    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }
    public double getPriceProduct() {
        return priceProduct;
    }
    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }
    
    public int calculateBaseDiscount(){
        if(getAgeGroup() == AgeGroup.CHILD || getAgeGroup() == AgeGroup.PENSIONER)
        return 8;
        return 3;
    }
}