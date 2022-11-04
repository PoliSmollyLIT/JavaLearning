package bg.tu_varna.sit;

public class MobilePhone {
    String marka;
    String pamet;
    String teglo;
    String camera;

    public MobilePhone() {

    }

    public MobilePhone(String marka, String pamet, String teglo, String camera) {  
        setMarka(marka);
        setPamet(pamet);
        setTeglo(teglo);
        setCamera(camera);
    }

    public void setMarka(String marka){
        this.marka = marka;
    }

    public void setPamet(String pamet){
        this.pamet = pamet;
    }

    public void setTeglo(String teglo){
        this.teglo = teglo;
    }

    public void setCamera(String camera){
        this.camera = camera;
    }

    public String getMarka() {
        return marka;
    }

    public String getPamet() {
        return pamet;
    }

    public int getTeglo() {
        return Integer.parseInt(teglo);
    }

    public int getCamera() {
        return Integer.parseInt(camera);
    }

    public String toString() {
        return "The phone is: " + this.getMarka() + " with pamet:" + this.getPamet() + " and "
                + this.getTeglo() + "g teglo and the camera is " + this.getCamera();
    }

    public boolean equals(MobilePhone phone) {
        if (this == phone)
            return true;
        if (this.getPamet() == phone.getPamet() && this.getCamera() == phone.getCamera()) {
            return true;
        }
        return false;
    }
}
