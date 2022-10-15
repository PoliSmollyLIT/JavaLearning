package bg.tu_varna.sit;

public class zad8 {
    public static void main(String[] args) {
        zad8_func();
    }

    public static void zad8_func() {
        int banicki = 289;
        int[] quantity = { 2, 4, 1 };
        int i = 1;
        int n = 0;
        while (banicki != 0) {
            if (banicki > quantity[i - 1]) {
                banicki -= quantity[i - 1];
                i++;
                n++;
                if (i == 4) {
                    i = 1;
                }
            } else if (banicki == quantity[i - 1]) {
                n++;
                System.out.println("Number of customers: " + n + "\nThe last one got all that he wanted!");
                break;
            } else {
                n++;
                System.out.println("Number of customers: " + n + "\nThe last one got: " + banicki + "/" + quantity[i - 1]);
                break;
            }
        }

    }
}
