package bg.tu_varna.sit;

public class IdentificationCard {
    private String idNumber;
    private int yearOfInitializing;
    private String egn;
    private String city;

    public IdentificationCard(String idNumber, int yearOfInitializing, String egn, String city) {
        this.idNumber = idNumber;
        this.yearOfInitializing = yearOfInitializing;
        this.egn = egn;
        this.city = city;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getEgn() {
        return egn;
    }

    public String publishedBy() {
        return  "МВР " + city;
    }

    public int validUntil() {
        return yearOfInitializing + 10;
    }
}
