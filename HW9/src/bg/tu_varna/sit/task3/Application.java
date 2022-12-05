package bg.tu_varna.sit.task3;

public class Application {
    public static void main(String[] args){
    
        Student student1 = new Student("alex", "atanasov", 20, "21324321", Speciality.SIT, 2, 4.5);
        Student student2 = new Student("alexa", "atanasovich", 22, "19324321", Speciality.A, 4, 5.5);
        Student student3 = new Student("palex", "atanasov", 21, "20324321", Speciality.CCT, 3, 5.8);
        Student student4 = new Student("malex", "atanasov", 19, "21324321", Speciality.CCT, 1, 6.4);
        Student student5 = new Student("salex", "atanasov", 20, "21324321", Speciality.SIT, 2, 5.00);

        Faculty faculty = new Faculty("Facilty 1");

        faculty.addStudent(student1);
        faculty.addStudent(student2);
        faculty.addStudent(student3);
        faculty.addStudent(student4);
        faculty.addStudent(student5);

        System.out.println(faculty.calculateAverageGrades());
        System.out.println(faculty.getNumberOfStudentsByCourse(2));
        System.out.println(faculty.getNumberOfStudentsBySpeciality(Speciality.CCT));
        System.out.println(faculty.getStudentsWithExcellentGrades().toString());
    }    
}