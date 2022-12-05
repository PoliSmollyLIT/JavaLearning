package bg.tu_varna.sit.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hotel {
    private static List<Room> rooms = new ArrayList<>();

    public Hotel() {
    }
    
    public void addRoom(Room room){
       rooms.add(room);
    }

    public static <E> void createReservation(E wantedRoom){
        for (Room room : rooms) {
            if(room.isAvailiable() && room.getClass().getName() == wantedRoom.getClass().getName()){
                room.setAvailiable(false);
                return;
            }
        }
    }

    public double calculateBokedRoomsDiscount(){
        double discounts = 0;
        Iterator<Room> iterator = rooms.iterator();
        while (iterator.hasNext()) {
            Room tmp = iterator.next();
            if(!tmp.isAvailiable()){
                discounts += tmp.discount();
            }
        }
        return discounts;
    }

    public double calculateAveragePriceOfAvailiableRoomsWithSeaView(){
        double price = 0;
        int numberRooms = 0;
        Iterator<Room> iterator = rooms.iterator();
        while(iterator.hasNext()){
            Room tmp = iterator.next();
            if(tmp.isAvailiable() && tmp.getExposure() == Exposure.SEA_VIEW){
                price += tmp.getPricePerDay();
                numberRooms++;
            }
        }
        return price/numberRooms;
    }

    public String toString() {
        String output = "";
        Iterator<Room> iterator = rooms.iterator();
        while(iterator.hasNext()){
            Room tmp = iterator.next();
            output += "\nReservation price: " + tmp.calculateReservationPrice() + "\nDiscount: " + tmp.discount() + "\nStay price: " + tmp.calculateStayPrice();
        }
        return output;
    }

    
}