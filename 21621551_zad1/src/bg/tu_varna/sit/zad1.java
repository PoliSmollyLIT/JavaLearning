package bg.tu_varna.sit;

public class zad1 {
    public static void main(String[] args) {
        zad1_func(3, 4, 5);
        zad1_func(3, 4, 9);
        zad1_func(10, 7, 5);
    }

    public static void zad1_func(float a, float b, float c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a * a + b * b == c * c) {
                System.out.println("It is a valid right triangle");
            } else {
                System.out.println("It is a valid triangle");
            }
        }
        else{
            System.out.println("It is not a valid triangle");
        }
    }
}
