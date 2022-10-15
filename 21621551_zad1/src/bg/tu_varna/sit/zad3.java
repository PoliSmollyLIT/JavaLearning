package bg.tu_varna.sit;

public class zad3 {
    public static void main(String[] args)  {
        zad3_func();
    }

    public static void zad3_func() {
        int sumOdd = 0, sumDel7 = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                sumOdd += i;
            }
            if (i % 7 == 0) {
                sumDel7 += i;
            }
        }
        System.out.println(sumOdd + " / " + sumDel7 + " = " + sumOdd / sumDel7 + "." + sumOdd % sumDel7);
    }
}
