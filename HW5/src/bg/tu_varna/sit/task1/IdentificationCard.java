package bg.tu_varna.sit.task1;

public class IdentificationCard {
    private int number;
    private int year;
    private String egn;
    private City city;

    public IdentificationCard() {
     }
    
    public IdentificationCard(int number, int year, String egn, City city) {
        this.number = number;
        this.year = year;
        this.egn = egn;
        this.city = city;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getEgn() {
        return egn;
    }
    public void setEgn(String egn) {
        this.egn = egn;
    }
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }

    public String publishedBy(){
        return "МВР " + this.city.getName();
    }

    public String validUntil(){
        return String.valueOf(this.year + 10) ;
    }
    
    
}
