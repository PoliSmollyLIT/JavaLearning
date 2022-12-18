package bg.tu_varna.sit.task1;

public class Eggs extends Item{
    private int numberInPackaging;

    public Eggs(ItemType itemType, double itemPrice, int availiableQuality, int numberInPackaging) {
        super(itemType, itemPrice, availiableQuality);
        this.numberInPackaging = numberInPackaging;
    }

    public int getNumberInPackaging() {
        return numberInPackaging;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + numberInPackaging;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Eggs other = (Eggs) obj;
        if (numberInPackaging != other.numberInPackaging)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Eggs in packaging " + numberInPackaging + "\n";
    }

    @Override
    public boolean needsDelivery() {
        if(this.getAvailiableQuality()<15)
        return true;
        return false;
    }
    
    
}