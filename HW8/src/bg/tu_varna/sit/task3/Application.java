package bg.tu_varna.sit.task3;

public class Application {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Pachi Pachinov", AgeGroup.ADULT, 3.65),
                new Person("Poli Polinova", AgeGroup.CHILD, 0.69),
                new Person("Gosho Mafiata", AgeGroup.PENSIONER, 4.20),
                new Person("Rado Daskala", AgeGroup.TEENAGE, 0.01)
        };
        FoodDiscount foodDiscount = new FoodDiscount(people, 20);
        DrinkDiscount drinkDiscount = new DrinkDiscount(people, 10);
        GameDiscount gameDiscount = new GameDiscount(people, 15, 25);

        Coupon<FoodDiscount> foodCoupon = new Coupon<FoodDiscount>(foodDiscount);
        Coupon<DrinkDiscount> driCoupon = new Coupon<DrinkDiscount>(drinkDiscount);
        Coupon<GameDiscount> gameCoupon = new Coupon<GameDiscount>(gameDiscount);

        System.out.println(foodCoupon.displayTotaDiscount());
        System.out.println(driCoupon.displayTotaDiscount());
        System.out.println(gameCoupon.displayTotaDiscount());

        System.out.println(foodCoupon.displayAverageDiscount());
        System.out.println(driCoupon.displayAverageDiscount());
        System.out.println(gameCoupon.displayAverageDiscount());
    }
}