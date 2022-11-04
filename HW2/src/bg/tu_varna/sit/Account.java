package bg.tu_varna.sit;

public class Account {
    String nomer;
    String currency;
    String nalichnost;
    String type;

    public Account() {

    }

    public Account(String nomer, String currency, String nalichnost, String type) {
        this.nomer = nomer;
        this.currency = currency;
        this.nalichnost = nalichnost;
        this.type = type;
    }

    public String getNomer() {
        return nomer;
    }

    public String getCurrency() {
        return currency;
    }

    public int getNalichnost() {
        return Integer.parseInt(nalichnost);
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "The bank account is with number: " + this.getNomer() + " " + this.getCurrency() + " with "
                + this.getNalichnost()
                + " and the type of the account is " + this.getType();
    }

    public boolean equals(Account account) {
        if (this == account)
            return true;
        if (this.getNalichnost() == account.getNalichnost() && this.getCurrency() == account.getCurrency()) {
            return true;
        }
        return false;
    }
}

