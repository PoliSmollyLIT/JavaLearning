package bg.tu_varna.sit.task3;

public class FoodDiscount implements Discount {
    private Person[] people;
    private int foodDiscountRate;
    
    public FoodDiscount(Person[] people, int foodDiscountRate) {
        this.people = people;
        this.foodDiscountRate = foodDiscountRate;
    }
    public Person[] getPeople() {
        return people;
    }
    public void setPeople(Person[] people) {
        this.people = people;
    }
    public int getFoodDiscountRate() {
        return foodDiscountRate;
    }
    public void setFoodDiscountRate(int foodDiscountRate) {
        this.foodDiscountRate = foodDiscountRate;
    }
    @Override
    public double calculateAverageDiscount() {
        return calculateTotalDiscount()/people.length;
    }
    @Override
    public int calculateTotalDiscount() {
        int discount = 0;
        for (int i = 0; i < people.length; i++) {
            discount += people[i].calculateBaseDiscount() + getFoodDiscountRate();            
        }
        return discount;
    }
    
    
}