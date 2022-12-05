package bg.tu_varna.sit.task4;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args){
        Apartament apartamen1 = new Apartament(67, 120000, PropertyType.NEW, 2, 3, Exposition.SOUTHWEST, true);
        Apartament apartamen2 = new Apartament(67, 12000, PropertyType.NEW, 2, 3, Exposition.SOUTHWEST, true);
        Apartament apartamen3 = new Apartament(67, 1200, PropertyType.NEW, 2, 3, Exposition.SOUTHWEST, true);
        Apartament apartamen4 = new Apartament(67, 120, PropertyType.NEW, 2, 3, Exposition.SOUTHWEST, true);
        House house1 = new House(100, 500000, PropertyType.NEW, 2, true);
        House house2 = new House(100, 50000, PropertyType.NEW, 2, true);
        House house3 = new House(100, 5000, PropertyType.NEW, 2, true);
        House house4 = new House(100, 500, PropertyType.NEW, 2, true);
        House house5 = new House(100, 50, PropertyType.NEW, 2, true);

        List<Property> properties = new ArrayList<Property>();
        properties.add(apartamen1);
        properties.add(apartamen2);
        properties.add(apartamen3);
        properties.add(apartamen4);
        properties.add(house1);
        properties.add(house2);
        properties.add(house3);

        RealEstateAgency agency = new RealEstateAgency(properties);
        agency.addProperty(house4);
        agency.addProperty(house5);

        System.out.println(agency.calculateAverageHousePrice());
        System.out.println(agency.calculatePriceOfAllProperties());
        System.out.println(agency.getNumberOfAvailableHouses());
        System.out.println(agency.getNumberOfPropertiesByType(PropertyType.NEW));
        System.out.println(agency.toString());
        agency.sortPropertiesByPrice();
        System.out.println(agency.toString());

    }    
}