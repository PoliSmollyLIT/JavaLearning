package bg.tu_varna.sit;

import java.sql.Date;

public class Company {
    private String name;
    private Date establishDate;
    private String bulstad;

    public Company() {

    }

    public Company(String name, Date establishDate, String bulstad) {
        this.name = name;
        this.establishDate = establishDate;
        this.bulstad = bulstad;
    }

    public String getName() {
        return name;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public String getBulstad() {
        return bulstad;
    }

}
