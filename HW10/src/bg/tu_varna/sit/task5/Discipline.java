package bg.tu_varna.sit.task5;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Discipline {
    private String name;
    private Map<Student ,Integer>  students = new HashMap<>();
    private Teacher lector;
    private Set<Teacher> teachers = new LinkedHashSet<>();
    public Discipline(String name, Map<Student, Integer> students, Teacher lector, Set<Teacher> teachers) {
        this.name = name;
        this.students = students;
        this.lector = lector;
        this.teachers = teachers;
    }
    public String getName() {
        return name;
    }
    public Map<Student, Integer> getStudents() {
        return students;
    }
    public Teacher getLector() {
        return lector;
    }
    public Set<Teacher> getTeachers() {
        return teachers;
    }
    public void addStudent(Student student, Integer points) throws SemesterControlException{
        if(points<0 || points>40)
        throw new SemesterControlException();
        students.put(student, points);
    }
}