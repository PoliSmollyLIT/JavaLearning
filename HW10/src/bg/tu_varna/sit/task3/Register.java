package bg.tu_varna.sit.task3;

import java.util.HashMap;
import java.util.Map;

public class Register {
    private String unit;
    private Map<Car, Owner> registeredCars = new HashMap<>();
    public Register(String unit, Map<Car, Owner> registeredCars) {
        this.unit = unit;
        this.registeredCars = registeredCars;
    }
    public String getUnit() {
        return unit;
    }
    public Map<Car, Owner> getRegisteredCars() {
        return registeredCars;
    }

    public void addRegistration(Car car, Owner owner){
        registeredCars.put(car, owner);
    }

    public void printRegisteredCars(){
        StringBuffer output = new StringBuffer();
        registeredCars.forEach((car, owner)->{
            output.append(car.toString() + "\n");
        });
        System.out.println(output.toString());
    }

    public String findOwnerByRegistrationNumber(String regNo){
        StringBuffer ownerName = new StringBuffer();
        registeredCars.forEach((car, owner)->{
           if(car.getRegistrationNumber() == regNo){
            ownerName.append(owner.getFirstName() + " " + owner.getLastName());
           }
        });
        if(ownerName.length() ==0){
            ownerName.append("Not found");
        }
        return ownerName.toString();
    }

    public void printLicensedDrivers(){
        StringBuffer output = new StringBuffer();
        registeredCars.forEach((car, owner)->{
            if(owner.nasCompetence()){
                output.append(owner.getFirstName() + " " + owner.getLastName() + "\n");
            }
        });
        System.out.println(output.toString());
    }
}