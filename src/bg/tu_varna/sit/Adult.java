package bg.tu_varna.sit;

public class Adult extends Person{
    IdentificationCard id;
    
    
    public Adult(String idcard, int yearId, String egn, String city) {
        this.id = new IdentificationCard(idcard, yearId, egn, city);
    }


    public IdentificationCard getId() {
        return id;
    }


    public void setId(IdentificationCard id) {
        this.id = id;
    }

    public void personalInfo(){
        super.iAm();
        System.out.println("Лична карта номер: " + id.getIdNumber() + "\tИздадена от: " + id.publishedBy());
    }
    
    
}
