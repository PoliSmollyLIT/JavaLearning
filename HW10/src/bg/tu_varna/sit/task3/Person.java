package bg.tu_varna.sit.task3;

public abstract class Person implements Competency {
    private String egn;
    private String firstName;
    private String lastName;
    private int age;

    public Person(String egn, String firstName, String lastName, int age) {
        try {

            setEgn(egn);
            setFirstName(firstName);
            setLastName(lastName);
            setAge(age);
        } catch (PersonalDataException ex) {
            ex.printStackTrace();
        }

    }

    public String getEgn() {
        return egn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((egn == null) ? 0 : egn.hashCode());
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
        Person other = (Person) obj;
        if (egn == null) {
            if (other.egn != null)
                return false;
        } else if (!egn.equals(other.egn))
            return false;
        return true;
    }

    public void setEgn(String egn) throws PersonalDataException {
        if (egn == "")
            throw new PersonalDataException();
        this.egn = egn;
    }

    public void setFirstName(String firstName) throws PersonalDataException {
        if (firstName == "")
            throw new PersonalDataException();
        this.firstName = firstName;
    }

    public void setLastName(String lastName) throws PersonalDataException {
        if (lastName == "")
            throw new PersonalDataException();
        this.lastName = lastName;
    }

    public void setAge(int age) throws PersonalDataException {
        if (age < 0)
            throw new PersonalDataException();
        this.age = age;
    }

    @Override
    public abstract boolean nasCompetence();
    

}