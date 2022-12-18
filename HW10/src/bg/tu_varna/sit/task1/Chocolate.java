package bg.tu_varna.sit.task1;

public class Chocolate extends Item{
    private String name;
    private int cocoaContent;
    public Chocolate(ItemType itemType, double itemPrice, int availiableQuality, String name, int cocoaContent) {
        super(itemType, itemPrice, availiableQuality);
        this.name = name;
        this.cocoaContent = cocoaContent;
    }
    public String getName() {
        return name;
    }
    public int getCocoaContent() {
        return cocoaContent;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + cocoaContent;
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
        Chocolate other = (Chocolate) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (cocoaContent != other.cocoaContent)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Chocolate " + name + " cocoaContent " + cocoaContent + "%\n";
    }
    @Override
    public boolean needsDelivery() {
        if(this.getAvailiableQuality()<10)
        return true;
        return false;
    }
        
}