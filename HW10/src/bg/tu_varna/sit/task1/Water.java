package bg.tu_varna.sit.task1;

public class Water extends Item{
    private String name;
    private WaterType waterType;
    public Water(ItemType itemType, double itemPrice, int availiableQuality, String name, WaterType waterType) {
        super(itemType, itemPrice, availiableQuality);
        this.name = name;
        this.waterType = waterType;
    }
    public String getName() {
        return name;
    }
    public WaterType getWaterType() {
        return waterType;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((waterType == null) ? 0 : waterType.hashCode());
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
        Water other = (Water) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (waterType != other.waterType)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Water " + name + " waterType " + waterType + "\n";
    }
    @Override
    public boolean needsDelivery() {
        if(this.getAvailiableQuality()<15 || (this.getWaterType() == WaterType.SODA && this.getAvailiableQuality()<30) )
        return true;
        return false;
    }

    
}