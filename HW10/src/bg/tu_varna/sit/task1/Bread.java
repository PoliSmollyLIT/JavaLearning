package bg.tu_varna.sit.task1;

public class Bread extends Item{
    private String name;

    public Bread(ItemType itemType, double itemPrice, int availiableQuality, String name) {
        super(itemType, itemPrice, availiableQuality);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Bread other = (Bread) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Bread " + name + "\n";
    }

    @Override
    public boolean needsDelivery() {
        if(this.getAvailiableQuality()<15)
        return true;
        return false;
    }
    
    
}