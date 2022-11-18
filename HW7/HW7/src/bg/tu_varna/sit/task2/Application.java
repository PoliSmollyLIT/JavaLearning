package bg.tu_varna.sit.task2;

public class Application {
    public static void main(String args[]){
        Property[] realesates = new Property[3];
        realesates[0] = new House(88.9, 72000.8, PropertyType.RENT, 3, true);
        realesates[1] = new Apartment(120.32, 89000.0,PropertyType.SALE , 4, 7, Parking.ONEPLACEFORSALE);
        try{
            realesates[2] = new Office(230.87, 2000.00, PropertyType.RENT, Parking.ONEPLACEFORRENT, 8);
        }
        catch(InvalidDataException ex){
            System.out.println(ex.toString());
        }
        RealEstateAgency agency = new RealEstateAgency("Poli's agency", realesates);
        System.out.println(agency.calculateTotalExpectedCommission());
        System.out.println(agency.getProperiesForSale());
    }
    
}