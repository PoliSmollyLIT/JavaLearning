package bg.tu_varna.sit.task1;

public class Application {
    public static void main(String[] args) {
        SingleRoom singleRoom1 = new SingleRoom(20, Exposure.SEA_VIEW, 5);
        SingleRoom singleRoom2 = new SingleRoom(50, Exposure.SEA_VIEW, 2);
        SingleRoom singleRoom3 = new SingleRoom(30, Exposure.PARK_VIEW, 5);
        DoubleRoom doubleRoom1 = new DoubleRoom(20, Exposure.SEA_VIEW, 8, true);
        DoubleRoom doubleRoom2 = new DoubleRoom(50, Exposure.SEA_VIEW, 8, true);
        DoubleRoom doubleRoom3 = new DoubleRoom(35, Exposure.SEA_VIEW, 8, false);
        Hotel hotel1 = new Hotel();
        hotel1.addRoom(singleRoom1);
        hotel1.addRoom(singleRoom2);
        hotel1.addRoom(singleRoom3);
        hotel1.addRoom(doubleRoom1);
        hotel1.addRoom(doubleRoom2);
        hotel1.addRoom(doubleRoom3);
        Hotel.createReservation(singleRoom1);
        Hotel.createReservation(singleRoom2);
        Hotel.createReservation(singleRoom3);
        Hotel.createReservation(doubleRoom2);
        Hotel.createReservation(doubleRoom3);

        System.out.println(hotel1.calculateBokedRoomsDiscount());
        System.out.println(hotel1.calculateAveragePriceOfAvailiableRoomsWithSeaView());
        System.out.println(hotel1.toString());
    }
}