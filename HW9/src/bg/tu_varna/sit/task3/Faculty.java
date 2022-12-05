package bg.tu_varna.sit.task3;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String facultyName;
    private List<Student> students = new ArrayList<>();

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double calculateAverageGrades() {
        double marks = 0;
        int numberStudents = 0;
        for (Student student : students) {
            if (student.getGrades() == 0.0)
                continue;
            else {
                marks += student.getGrades();
                numberStudents++;
            }

        }

        return marks / numberStudents;
    }

    public int getNumberOfStudentsBySpeciality(Speciality speciality) {
        int numberStudents = 0;
        for (Student student : students) {
            if (student.getSpeciality() == speciality)
                numberStudents++;
        }
        return numberStudents;
    }

    public List<Student> getStudentsWithExcellentGrades() {
        List<Student> excelentStudents = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getGrades() >= 5.50)
                excelentStudents.add(student);
        }
        return excelentStudents;
    }

    public int getNumberOfStudentsByCourse(int course) {
        int numberStudents = 0;
        for (Student student : students) {
            if (student.getCourse() == course)
                numberStudents++;
        }
        return numberStudents;
    }

    @Override
    public String toString() {
        String output = "";
        for (Student student : students) {
            output += student.getfNumber() + " " + student.getSpeciality() + " " + student.getGrades() + "\n";
        }
        return output;

    }

}