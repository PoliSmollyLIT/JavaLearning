package bg.tu_varna.sit;

public class zad7 {
    public static void main(String args[]) {
        String[] specialnost = {"SIT", "KST", "SIT", "VEI", "EE", "SIT", "KST", "IKT", "SIT", "KST"};
        int[] kurs = {1, 2, 3, 4, 1, 2, 3, 4, 3, 2};
        int[] group = {1, 2, 3, 4 , 5, 1, 2, 3, 4, 5};
        int[] numberStudents = { 29, 25, 27, 27, 23, 19, 17, 22, 16, 27};
        StudentGroup[] studentGroups = new StudentGroup[10];

        for (int i = 0; i < studentGroups.length; i++) {
            studentGroups[i] = new StudentGroup(specialnost[i], kurs[i], group[i], numberStudents[i]);
        }
        StudentGroup firstKurs = new StudentGroup();
        StudentGroup secondKurs = new StudentGroup();
        StudentGroup thirdKurs = new StudentGroup();
        StudentGroup forthKurs = new StudentGroup();
        for (int i = 0; i < studentGroups.length; i++) {
            switch(studentGroups[i].getKurs()){
                case 1:
                if(studentGroups[i].getNumberStudents() > firstKurs.getNumberStudents()){
                    firstKurs = studentGroups[i];
                }
                break;
                case 2:
                if(studentGroups[i].getNumberStudents() > secondKurs.getNumberStudents()){
                 secondKurs = studentGroups[i];
                }
                break;
                case 3:
                if(studentGroups[i].getNumberStudents() > thirdKurs.getNumberStudents()){
                    thirdKurs = studentGroups[i];
                   }
                   break;
                   case 4:
                   if(studentGroups[i].getNumberStudents() > forthKurs.getNumberStudents()){
                    forthKurs = studentGroups[i];
                   }
                   break;
            }
        }
        System.out.println("1 kurs: " + firstKurs.getGroup() + "\n\n2 kurs: " + secondKurs.getGroup() + "\n\n3 kurs: " + thirdKurs.getGroup() + "\n\n4 kurs: " + forthKurs.getGroup());
    }    
}
