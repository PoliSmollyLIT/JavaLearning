package bg.tu_varna.sit.task1;

public class Medical<E> {
    private E patient;
    private Condition condition;

    public Medical(E patient, Condition condition) {
        this.patient = patient;
        this.condition = condition;
    }
    

    public E getPatient() {
        return patient;
    }

    public void setPatient(E patient) {
        this.patient = patient;
    }

    public Condition getCondition() {
        return condition;
    }


    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public int calculatePotion(E patient){
        double dozirovka = 0.0;
        if(patient.getClass().getName() == "Child"){
            dozirovka = ((Child)patient).getWeigth()*0.25;
        }else{
            dozirovka = 25;
        }
        if(condition == Condition.DAMAGED){
            dozirovka*=2;
        }
        return Math.round((int)dozirovka);
    }

    public String getPrescription(){
        return "Пациент:\n" + patient.toString() + "\nДозировка: " + calculatePotion(patient) + "мл.";
    }

    public String getCoupon(){
        return "Издаден купон на: " + (patient.getClass().getName()=="Child" ? ((Child)patient).getName():((Adult)patient).getName());
    }

}