package bg.tu_varna.sit;

public class Notebook {
    int numPages;
    double price;
    boolean hardCover;

    public Notebook(){

    }

    public Notebook(int numPages, double price, boolean hardCover){
        this.numPages = numPages;
        this.price = price;
        this.hardCover = hardCover;
    }

    public int getNumPages(){
        return numPages;
    }

    public double getPrice(){
        return price;
    }

    public boolean getHardCover(){
        return hardCover;
    }

    public String toString(){
        return "Notebook with " + this.getNumPages() + " pages for " + this.getPrice() + "BGN and " + (hardCover==true? "with": "without") + "hard cover";
    }

    public boolean equal(Notebook notebook){
        if(this==notebook) return true;
        if(this.getNumPages() == notebook.getNumPages() && this.getPrice() == notebook.getPrice() && this.getHardCover() == notebook.getHardCover())
        return true;
        return false;
    }
}
