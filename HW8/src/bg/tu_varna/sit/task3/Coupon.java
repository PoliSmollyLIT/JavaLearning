package bg.tu_varna.sit.task3;

public class Coupon<E> {
    private E discount;

    public Coupon(E discount) {
        this.discount = discount;
    }

    public E getDiscount() {
        return discount;
    }

    public void setDiscount(E discount) {
        this.discount = discount;
    }

    public int displayTotaDiscount() {
        return ((Discount) discount).calculateTotalDiscount();
    }

    public double displayAverageDiscount() {
        return ((Discount) discount).calculateAverageDiscount();
    }
}