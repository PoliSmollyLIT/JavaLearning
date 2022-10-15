package bg.tu_varna.sit;

public class zad4 {
    public static void main(String[] args) {
        zad4_func();
    }

    public static void zad4_func() {
        char[] text = { 's', 'i', 't', ' ', 't', 'u', '-', 'v', 'A', 'R', 'N', 'A' };
        int i = 0;
        while (i < text.length) {
            if (text[i] == ' ' || text[i] == '-') {
                System.out.print(text[i]);
                i++;
                continue;
            }
            if (text[i] - 'A' > 26) {
                System.out.print((char) (text[i] - 32));
            } else {
                System.out.print((char) (text[i] + 32));
            }
            i++;
        }
    }
}
