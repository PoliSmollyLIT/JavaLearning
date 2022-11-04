package bg.tu_varna.sit;

public class zad8 {
    public static void main(String args[]) {
        int[] numberPages = { 29, 25, 27, 27, 23, 19, 17, 22, 16, 27 };
        double[] price = { 1, 2, 3, 4, 1, 2, 3, 4, 3, 2 };
        boolean[] hardCover = { false, false, true, false, true, true, true, true, true, false };
        Notebook[] notebooks = new Notebook[10];

        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = new Notebook(numberPages[i], price[i], hardCover[i]);
        }
        int avgPrice = 0;
        int softCover = 0;
        for (int i = 0; i < notebooks.length; i++) {
            avgPrice += notebooks[i].getPrice();
            if (notebooks[i].getHardCover() == false) {
                softCover++;
            }
        }

        System.out.println("Notebooks with soft cover are: " + softCover + " and the average price of notebooks is: " + avgPrice/10);
    }    
}
