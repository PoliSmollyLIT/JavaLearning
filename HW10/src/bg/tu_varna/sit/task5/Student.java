package bg.tu_varna.sit.task5;

public class Student extends Person{
    private Course course;
    private String fakNo;

    public Student(String name, Course course, String fakNo) {
        super(name);
        this.course = course;
        this.fakNo = fakNo;
    }

    public Course getCourse() {
        return course;
    }

    public String getFakNo() {
        return fakNo;
    }
    
}