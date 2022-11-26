package bg.tu_varna.sit.task3;

public class GameDiscount implements Discount{
    private Person[] people;
    private int discountRate;
    private int discountRateForAdults;
    public GameDiscount(Person[] people, int discountRate, int discountRateForAdults) {
        this.people = people;
        this.discountRate = discountRate;
        this.discountRateForAdults = discountRateForAdults;
    }
    public Person[] getPeople() {
        return people;
    }
    public void setPeople(Person[] people) {
        this.people = people;
    }
    public int getDiscountRate() {
        return discountRate;
    }
    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
    public int getDiscountRateForAdults() {
        return discountRateForAdults;
    }
    public void setDiscountRateForAdults(int discountRateForAdults) {
        this.discountRateForAdults = discountRateForAdults;
    }
    @Override
    public double calculateAverageDiscount() {
        return calculateTotalDiscount()/people.length;
    }
    @Override
    public int calculateTotalDiscount() {
        int discount = 0;
        for (int i = 0; i < people.length; i++) {
            if(people[i].getAgeGroup() == AgeGroup.ADULT || people[i].getAgeGroup() == AgeGroup.PENSIONER){
                discount += people[i].calculateBaseDiscount() + getDiscountRateForAdults();        
            }else{
                discount += people[i].calculateBaseDiscount() + getDiscountRate();        
            }
        }
        return discount;
    }
    
    
    
}