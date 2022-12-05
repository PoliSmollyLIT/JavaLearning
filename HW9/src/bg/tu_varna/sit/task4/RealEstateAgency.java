package bg.tu_varna.sit.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RealEstateAgency {
    private List<Property> properties = new ArrayList<>();

    public RealEstateAgency(List<Property> properties) {
        this.properties = properties;
    }
    
    public void addProperty(Property property){
        properties.add(property);
    }
    

    @Override
    public String toString() {
        String output = "";
        for (Property property : properties) {
            output += property.getArea() + " " + property.calculate() + "\n";
        }
        return output;
    }

    public double calculatePriceOfAllProperties(){
        double price = 0;
        for (Property property : properties) {
            price+= property.calculate();
        }
        return price;
    }

    public int getNumberOfPropertiesByType(PropertyType type){
        int numberOfProperties = 0;
        for (Property property : properties) {
            if(property.getPropertyType() == type)
            numberOfProperties++;
        }
        return numberOfProperties;
    }

    public int getNumberOfAvailableHouses(){
        int numberOfHouses = 0;
        for (Property property : properties) {
            if(property.getClass().getName()== House.class.getName())
            numberOfHouses++;
        }
        return numberOfHouses;
    }

    public Property getMostExpensiveApartment(){
       sortPropertiesByPrice();
       for (Property property : properties) {
        if(property.getClass().getName() == Apartament.class.getName())
        return property;
       }
        return null;
    }

    public double calculateAverageHousePrice(){
        double averagePrice = 0;
        int numberOfHouses = 0;
        for (Property property : properties) {
         if(property.getClass().getName() == House.class.getName())
            {
                averagePrice += property.calculate();
                numberOfHouses++;
            }
        }
         return averagePrice/numberOfHouses;
     }


    public void sortPropertiesByArea(){
        Collections.sort(properties, new SortBYArea());
    }

    public void sortPropertiesByPrice(){
        Collections.sort(properties, new SortBYPrice());
    }
}