package bg.tu_varna.sit.task1;

public class Adult {
    private String name;
    private String assuranceNumber;
    
    public Adult(String name, String assuranceNumber) {
        this.name = name;
        this.assuranceNumber = assuranceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssuranceNumber() {
        return assuranceNumber;
    }

    public void setAssuranceNumber(String assuranceNumber) {
        this.assuranceNumber = assuranceNumber;
    }

    @Override
    public String toString() {
        return "Име: " + name + "\nНомер на здравна осигуровка: " + assuranceNumber;
      }
    
    
}