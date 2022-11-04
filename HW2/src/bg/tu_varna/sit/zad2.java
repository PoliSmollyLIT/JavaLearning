package bg.tu_varna.sit;

public class zad2 {
    public static void main(String args[]) {

        int[] floors = { 2, 5, 4, 10, 12, 3, 7, 8, 5, 5 };
        double[] sqMeters = { 83.4, 109.4, 98.4, 112.2, 86.3, 99.4, 98.2, 97.6, 114.3, 109.8 };
        int[] numberRooms = { 3, 5, 2, 3, 2, 4, 2, 3, 4, 2 };
        String[] viewPoint = { "east", "west", "south", "north", "east", "west", "south", "north", "north", "east" };
        Apartment[] appartments = new Apartment[10];

        for (int i = 0; i < 10; i++) {
            appartments[i] = new Apartment(floors[i], sqMeters[i], numberRooms[i], viewPoint[i]);
        }
        Apartment biggestApartment = appartments[0];
        for (int i = 0; i < 10; i++) {
            if (appartments[i].equals(biggestApartment) == true) {
                continue;
            } else if (appartments[i].getSpace() > biggestApartment.getSpace()) {
                biggestApartment = appartments[i];
            }
        }

        System.out.println(biggestApartment.toString());
    }    
}