package bg.tu_varna.sit.task1;

public class Adult extends Person{
    IdentificationCard id_card;
    

    public Adult() {}


    public Adult(String firstName, String secondName, String thirdName, IdentificationCard id_card) {
        super(firstName, secondName, thirdName);
        this.id_card = id_card;
    }


    @Override
    public String toString() {
         return super.toString() + id_card.getNumber() + "\t" + id_card.publishedBy();
    }
    
    
}
