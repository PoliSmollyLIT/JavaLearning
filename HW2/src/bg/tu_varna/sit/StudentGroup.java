package bg.tu_varna.sit;

public class StudentGroup {
    String specialnost;
    int kurs;
    int group;
    int numberStudents;

    public StudentGroup(){

    }

    public StudentGroup(String specialnost, int kurs, int group, int numberStudents){
        this.specialnost = specialnost;
        this.kurs = kurs;
        this.group = group;
        this.numberStudents = numberStudents;
    }
    
    public String getSpecialnost(){
        return specialnost;
    }

    public int getKurs(){
        return kurs;
    }

    public int getGroup(){
        return group;
    }

    public int getNumberStudents(){
        return numberStudents;
    }

    public String toString(){
        return "The group is " + this.getSpecialnost() + " " + this.getKurs() + " kurs " + this.getGroup() + " group. And the number of students in the group is: " + this.getNumberStudents();
    }

    public boolean equal(StudentGroup studentGroup){
        if(this == studentGroup)
        return true;
        if(this.getSpecialnost() == studentGroup.getSpecialnost() && this.getKurs() == studentGroup.getKurs() && this.getGroup() == studentGroup.getGroup() && this.getNumberStudents() == studentGroup.getNumberStudents()){
            return true;
        }
        return false;
    }
}
