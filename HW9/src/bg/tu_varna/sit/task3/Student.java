package bg.tu_varna.sit.task3;

public class Student extends Person implements Comparable<Student> {
    private String fNumber;
    private Speciality speciality;
    private int course;
    private double grades;
    
    
    public Student(String firstName, String lastName, int age, String fNumber, Speciality speciality, int course,
            double grades) {
        super(firstName, lastName, age);
        setfNumber(fNumber);
        setSpeciality(speciality);
        try{
            setCourse(course);
        setGrades(grades);
        }catch(InvalidDataException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    public String getfNumber() {
        return fNumber;
    }
    public Speciality getSpeciality() {
        return speciality;
    }
    public int getCourse() {
        return course;
    }
    public double getGrades() {
        return grades;
    }
    public void setfNumber(String fNumber) {
        this.fNumber = fNumber;
    }
    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
    public void setCourse(int course) throws InvalidDataException{
        if(course<0 || course>4)
        throw new InvalidDataException();
        this.course = course;
    }
    public void setGrades(double grades) throws InvalidDataException{
        if(grades<2 || grades>6)
        throw new InvalidDataException();
        this.grades = grades;
    }
    @Override
    public int compareTo(Student o) {
        return this.getfNumber().compareTo(o.getfNumber());
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fNumber == null) ? 0 : fNumber.hashCode());
        result = prime * result + ((speciality == null) ? 0 : speciality.hashCode());
        result = prime * result + course;
        long temp;
        temp = Double.doubleToLongBits(grades);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Student other = (Student) obj;
        if (fNumber == null) {
            if (other.fNumber != null)
                return false;
        } else if (!fNumber.equals(other.fNumber))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Student [fNumber=" + fNumber + ", speciality=" + speciality + ", course=" + course + ", grades="
                + grades + "]";
    }

    
    
}