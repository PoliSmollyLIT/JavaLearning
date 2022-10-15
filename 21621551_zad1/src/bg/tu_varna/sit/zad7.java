package bg.tu_varna.sit;

public class zad7 {
    public static void main(String[] args){
        zad7_func();
    }

    public static void zad7_func() {
        String[] fakNo = { "2162155", "2216155", "2062155", "1962155", "1862155", "2217511", "1965177", "2219912",
                "2343543", "2232123" };
        int firstyear = 0, secondYear = 0, thirdYear = 0, forthYear = 0, dnYear = 0;
        for (int i = 0; i < fakNo.length; i++) {
            char[] number =  fakNo[i].toCharArray();
            int year = (number[0] - '0')* 10 + (number[1] - '0');
            switch (year) {
                case 22:
                    firstyear++;
                    break;
                case 21:
                    secondYear++;
                    break;
                case 20:
                    thirdYear++;
                    break;
                case 19:
                    forthYear++;
                    break;
                default:
                    dnYear++;
                    break;
            }
        }
        System.out.println("First year students: " + firstyear + "\nSecond year students: " + secondYear
                + "\nThird year students: " + thirdYear + "\nForth year students: " + forthYear + "\nOther students: "
                + dnYear);
    }
}
