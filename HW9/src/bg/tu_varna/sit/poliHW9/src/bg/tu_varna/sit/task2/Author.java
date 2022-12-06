package bg.tu_varna.sit.task2;


public class Author implements Comparable<Author> {
    private String firstName;
    private String lastName;
    private String coutry;

    public Author(String firstName, String lastName, String coutry) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.coutry = coutry;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCoutry() {
        return coutry;
    }

    @Override
    public String toString() {
        return "Author [firstName=" + firstName + ", lastName=" + lastName + ", coutry=" + coutry + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((coutry == null) ? 0 : coutry.hashCode());
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
        Author other = (Author) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (coutry == null) {
            if (other.coutry != null)
                return false;
        } else if (!coutry.equals(other.coutry))
            return false;
        return true;
    }

    @Override
    public int compareTo(Author o) {
        if (this.equals(o))
            return 0;
        if (this.getFirstName().charAt(0) < o.getFirstName().charAt(0)
                && this.getLastName().charAt(0) < o.getLastName().charAt(0)
                && this.getCoutry().charAt(0) < o.getCoutry().charAt(0)) {
            return -1;
        } else {
            return 1;
        }
    }
}