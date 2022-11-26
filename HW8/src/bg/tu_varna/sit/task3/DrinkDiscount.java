package bg.tu_varna.sit.task3;

public class DrinkDiscount implements Discount{
    private Person[] people;
    private int drinkDiscountRate;
    public DrinkDiscount(Person[] people, int drinkDiscountRate) {
        this.people = people;
        this.drinkDiscountRate = drinkDiscountRate;
    }
    public Person[] getPeople() {
        return people;
    }
    public void setPeople(Person[] people) {
        this.people = people;
    }
    public int getDrinkDiscountRate() {
        return drinkDiscountRate;
    }
    public void setDrinkDiscountRate(int drinkDiscountRate) {
        this.drinkDiscountRate = drinkDiscountRate;
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
                discount += people[i].calculateBaseDiscount() + getDrinkDiscountRate();        
            }
        }
        return discount;
    }
    
    
}