package bg.tu_varna.sit.task3;

public class Car {
    private String registrationNumber;
    private Color color;
    private String brand;
    private String model;
    private Fuel fuel;
    public Car(String registrationNumber, Color color, String brand, String model, Fuel fuel) {
        try{
            setRegistrationNumber(registrationNumber);
            setColor(color);
            setBrand(brand);
            setModel(model);
            setFuel(fuel);
        } catch( CarDataException ex){
            System.out.println(ex.getStackTrace());
        }
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) throws CarDataException{
       if(registrationNumber == ""){
        throw new CarDataException();
       }
        this.registrationNumber = registrationNumber;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) throws CarDataException{
        if(color == null)
        throw new CarDataException();
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) throws CarDataException{
        if(brand == "")
        throw new CarDataException();
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) throws CarDataException{
        if(model == "")
        throw new CarDataException();
        this.model = model;
    }
    public Fuel getFuel() {
        return fuel;
    }
    public void setFuel(Fuel fuel) throws CarDataException{
        if(fuel == null)
        throw new CarDataException();
        this.fuel = fuel;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((registrationNumber == null) ? 0 : registrationNumber.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (registrationNumber == null) {
            if (other.registrationNumber != null)
                return false;
        } else if (!registrationNumber.equals(other.registrationNumber))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Car [registrationNumber=" + registrationNumber + ", color=" + color + ", brand=" + brand + ", model="
                + model + ", fuel=" + fuel + "]";
    }

    
}
