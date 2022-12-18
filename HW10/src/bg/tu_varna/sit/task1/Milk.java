package bg.tu_varna.sit.task1;

public class Milk extends Item{
    private String name;
    private int daysToExpire;
    public Milk(ItemType itemType, double itemPrice, int availiableQuality, String name, int daysToExpire) {
        super(itemType, itemPrice, availiableQuality);
        this.name = name;
        this.daysToExpire = daysToExpire;
    }
    public String getName() {
        return name;
    }
    public int getDaysToExpire() {
        return daysToExpire;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + daysToExpire;
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
        Milk other = (Milk) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (daysToExpire != other.daysToExpire)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Milk " + name + " daysToExpire " + daysToExpire + "\n";
    }
    @Override
    public boolean needsDelivery() {
        if(this.getAvailiableQuality()<15 && this.getDaysToExpire()<7)
        return true;
        return false;
    }
    

    
}