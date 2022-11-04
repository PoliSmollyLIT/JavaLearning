package bg.tu_varna.sit;

public class zad4 {
    public static void main(String args[]) {
        String[] firstnames = {"Ivan", "Petar", "Dido", "Anni", "Simona", "Teodora", "Maria", "Svetla", "Lyubo", "Georgi"};
        String[] lastNames = {"Ivanow", "Dimitrov", "Welichkov", "Simeonova", "Todorova", "Sabri", "Filipova", "Jivkova", "Simeonov", "Dimitrov"};
        String[] fakNomers ={"21621551", "20191817", "19824332", "21324354", "22154387", "22764554", "20985115", "20938475", "21912834", "19817227"};
        String[] specialnosti = {"SIT", "KST", "SIT", "VEI", "EE", "SIT", "KST", "IKT", "SIT", "KSt"};
        Student[] students = new Student[10];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(firstnames[i], lastNames[i], fakNomers[i], specialnosti[i]);
        }
        String lastName = "Dimitrov";
        int numStudentsWithLastName = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getLastName() == lastName){
                numStudentsWithLastName++;
            }
        }

        System.out.println("The number of students with last name: " + lastName + " is " + numStudentsWithLastName);
    }    
}
