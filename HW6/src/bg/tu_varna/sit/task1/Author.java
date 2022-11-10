package bg.tu_varna.sit.task1;

public class Author {
    private String firstName;
    private String lastName;
    private String country;

    public Author(String firstName, String lastName, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean equals(Author obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.firstName == null) {
            if (obj.firstName != null)
                return false;
        }
        if (this.lastName == null) {
            if (obj.lastName != null)
                return false;
        }
        if (this.country == null) {
            if (obj.country != null)
                return false;
        }

        if (this.firstName.equals(obj.firstName) && this.lastName.equals(obj.lastName) && this.country.equals(obj.country)) {
            return true;
        } else{
            return false;
        }

    }

    public String toString() {
        return lastName + ", " + firstName;
    }

    
}
