package bg.tu_varna.sit.task5;

public class Teacher extends Person{
    private AcademicPositions academicPositions;

    public Teacher(String name, AcademicPositions academicPositions) {
        super(name);
        this.academicPositions = academicPositions;
    }

    public AcademicPositions getAcademicPositions() {
        return academicPositions;
    }
    
}