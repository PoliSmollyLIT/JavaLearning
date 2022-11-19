package bg.tu_varna.sit.task5;

public class AlocoholicBeverage extends Drink {
    private int vol;

    public AlocoholicBeverage(String name, int quantity, int serveQuantity, int vol) {
        super(name, quantity, serveQuantity);
        this.vol = vol;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public boolean isProper(int age) throws AlcoholicBeverageException {
        if (age < 0){
            throw new AlcoholicBeverageException("Въведена е невалидна възраст");
        }
        else if(age<18){
            throw new AlcoholicBeverageException("Лица под 18 години не могат да консумират алкохолни напитки");
        }
        else if (age >= 70 || (age >= 18 && age <= 21) && getVol() <= 10) {
            return true;
        }
        return true;
    }

    @Override
    public boolean needOfDelivery() {
        if(getQuantity()<=5) return true;
        return false;
    }
    

}