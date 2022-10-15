package bg.tu_varna.sit;

public class zad6 {
    public static void main(String[] args){
        zad6_func();
    }

    public static void zad6_func() {
        double[] wheatPrice = { 670.50, 687.22, 691.05, 710.56, 750.82, 788.44, 765.97, 698.36, 778.78 };
        double avgPrice = 0;
        for (int i = 0; i < wheatPrice.length; i++) {
            avgPrice += wheatPrice[i];
        }
        avgPrice /= 9;
        System.out.println("Average price = " + avgPrice);
        for (int i = 0; i < wheatPrice.length; i++) {
            if(wheatPrice[i]>avgPrice){
                System.out.println("Wheat price above average in month: " + (i+1));
            }
        }
    }
}
