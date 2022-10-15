package bg.tu_varna.sit;

public class zad2 {
    public static void main(String[] args) {
        zad2_func();
    }

    public static void zad2_func() {
        char[] text = {'S','o','m','e',' ','t','e','x','t'};
        int i=0;
        while (i<text.length) {
            System.out.println(text[i++]);
        }
    }
}