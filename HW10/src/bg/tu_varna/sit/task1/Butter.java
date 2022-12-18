package bg.tu_varna.sit.task1;

public class Butter extends Item{
    private int packing;
    private int butterContent;
    public Butter(ItemType itemType, double itemPrice, int availiableQuality, int packing, int butterContent) {
        super(itemType, itemPrice, availiableQuality);
        this.packing = packing;
        this.butterContent = butterContent;
    }
    public int getPacking() {
        return packing;
    }
    public int getButterContent() {
        return butterContent;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + packing;
        result = prime * result + butterContent;
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
        Butter other = (Butter) obj;
        if (packing != other.packing)
            return false;
        if (butterContent != other.butterContent)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Butter " + packing + "gr butterContent " + butterContent + "%\n";
    }
    @Override
    public boolean needsDelivery() {
        if((this.getPacking()<=250 && this.getAvailiableQuality()<20) || this.getAvailiableQuality()<30)
        return true;
        return false;
    }
    
    
    
}