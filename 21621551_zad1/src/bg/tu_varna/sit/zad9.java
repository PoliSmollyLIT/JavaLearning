package bg.tu_varna.sit;

public class zad9 {
    public static void main(String[] args) {
        float[] num1 = { 12.334f, 13.4f, 15.33f, 45.678f, 29.65f, 76.3425f, 1249.45f, 2352.45f, 5.324f, 8.321f };
        float[] num2 = { 1.334f, 135.4f, 145.33f, 5.678f, 2.65f, 736.3425f, 249.45f, 252.45f, 521.324f, 865.321f };
        float[] num3 = { 142.334f, 1213.4f, 56.33f, 59.678f, 987.565f, 736.3425f, 496.45f, 243.45f, 532.324f,
                8645.321f };
        zad9_func(num1);
        zad9_func(num2);
        zad9_func(num3);
    }

    public static void zad9_func(float[] numbers) {
        float[] maxEven = { 0f, 0f, 0f };
        int maxQuantity = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] < numbers[j]) {
                    float temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if  (isEven(numbers[i]) == true) {
                maxEven[maxQuantity] = numbers[i];
                maxQuantity++;
                if (maxQuantity == 3) {
                    break;
                }
            }
        }
        System.out.println("--------------------");
        for (int i = 0; i < maxQuantity; i++) {
            System.out.println(maxEven[i] + " ");
        }
    }

    public static boolean isEven(Float a) {
        String s = a.toString();
        int br = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if(s.charAt(i) == '.'){
                break;
            }
            br++;
        }
        int n = (int) (a * Math.pow(10.0, br+1));
        if (n % 2 == 0) {
            //System.out.println(a + " " + s + " "+ n + " <-------\n");
            return true;
        }
        return false;
    }
}
