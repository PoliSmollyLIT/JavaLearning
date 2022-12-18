package bg.tu_varna.sit.task3;

public class Owner extends Person{
    private String drivingLicense;

    public Owner(String egn, String firstName, String lastName, int age, String drivingLicense) {
        super(egn, firstName, lastName, age);
        this.drivingLicense = drivingLicense;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((drivingLicense == null) ? 0 : drivingLicense.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Owner other = (Owner) obj;
        if (drivingLicense == null) {
            if (other.drivingLicense != null)
                return false;
        } else if (!drivingLicense.equals(other.drivingLicense))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Owner [drivingLicense=" + drivingLicense + "]";
    }

    @Override
    public boolean nasCompetence() {
    if(this.getAge()>=18 && this.getAge()<=75 && this.drivingLicense != "")
    return true;
    return false;
    }
    
    
}