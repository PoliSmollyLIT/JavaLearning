package bg.tu_varna.sit.task5;

import java.util.HashMap;
import java.util.Map;

public class Exam {
    private Discipline discipline;
    private  Map<Student, Integer> students =  discipline.getStudents();

    public Exam(Discipline discipline) {
        this.discipline = discipline;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public Map<Student, Integer> run() {
        Map<Student, Integer> studentFinalPoints = new HashMap<>();
        students.forEach((student, points)->{
            studentFinalPoints.put(student, points + Integer.valueOf((int)Math.random()*60));
        });
        return studentFinalPoints;
    }
}