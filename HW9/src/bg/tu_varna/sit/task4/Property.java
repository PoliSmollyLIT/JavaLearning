package bg.tu_varna.sit.task4;

public abstract class Property implements PriceCalculator, Comparable<Property>{
    private int area;
    private int basePrice;
    private PropertyType propertyType;
    public Property(int area, int basePrice, PropertyType propertyType) {
        this.area = area;
        this.basePrice = basePrice;
        this.propertyType = propertyType;
    }
    public int getArea() {
        return area;
    }
    public int getBasePrice() {
        return basePrice;
    }
    public PropertyType getPropertyType() {
        return propertyType;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + area;
        result = prime * result + basePrice;
        result = prime * result + ((propertyType == null) ? 0 : propertyType.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Property other = (Property) obj;
        if (area != other.area)
            return false;
        if (basePrice != other.basePrice)
            return false;
        if (propertyType != other.propertyType)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Property [area=" + area + ", basePrice=" + basePrice + ", propertyType=" + propertyType + "]";
    }
    @Override
    public abstract double calculate();
    @Override
    public int compareTo(Property o) {
       return (this.getArea() < o.getArea())? -1: (this.getArea() == o.getArea())? 0: 1;
    }

    
}
