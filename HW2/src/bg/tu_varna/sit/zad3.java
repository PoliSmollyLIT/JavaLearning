package bg.tu_varna.sit;

public class zad3 {
    public static void main(String args[]) {

        String[] marka = { "opel", "vw", "mazda", "ford", "audi", "skoda", "mazda", "toyota", "nissan", "ford" };
        String[] regNo = { "B2132HR", "B3214PR", "B7823RE", "B5429TX", "B6539PC", "B4656HK", "B2964CT", "B5835PT",
                "B9472AT", "B9273TT" };
        String[] probeg = { "1234", "4567", "98534", "123", "76584", "2844221", "5432", "653123", "87654", "23456" };
        Car[] cars = new Car[10];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(marka[i], regNo[i], probeg[i]);
        }

        Car minProbegCar = cars[0];
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getProbeg() < minProbegCar.getProbeg()) {
                minProbegCar = cars[i];
            }
        }
        System.out.println(minProbegCar.toString());
    }    
}
