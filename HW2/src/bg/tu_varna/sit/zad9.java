package bg.tu_varna.sit;

public class zad9 {
    public static void main(String args[]) {
        String[] names = { "cola", "derbi", "pepsi", "fanta", "bbb", "coca cola", "step", "etap", "colla", "peppsiii" };
        String[] dueToDates = { "12/03/2022", "11/03/2022", "10/03/2022", "9/03/2022", "8/03/2022", "7/03/2022",
                "6/03/2022", "5/03/2022", "4/03/2022", "3/03/2022" };
        String[] bottleVolumes = { "500", "250", "550", "1000", "1500", "2000", "500", "250", "330", "330" };
        String[] sugarPer100s = { "34", "56", "76", "22", "23", "43", "54", "37", "69", "55" };
        SoftDrink[] softDrinks = new SoftDrink[10];

        for (int i = 0; i < softDrinks.length; i++) {
            softDrinks[i] = new SoftDrink(names[i], dueToDates[i], bottleVolumes[i], sugarPer100s[i]);
        }
        int avgSugar = 0;
        for (int i = 0; i < softDrinks.length; i++) {
            avgSugar += softDrinks[i].getSugarPer100();
        }

        System.out.println("Average sugar in softDrinks is: " + avgSugar/10);
    }    
}
