package bg.tu_varna.sit.task4;

public abstract class WaterBody implements Usage {
    private String name;
    private double depth;
    private Fish[] fishes;

    public WaterBody(String name, double depth, Fish[] fishes) throws WaterBodyException{
        if(depth < 0) throw new WaterBodyException("Дълбочината не може да бъде отрицателно число");
        this.name = name;
        this.depth = depth;
        this.fishes = fishes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public Fish[] getFishes() {
        return fishes;
    }

    public void setFishes(Fish[] fishes) {
        this.fishes = fishes;
    }

    @Override
    public boolean isProductable() {
        int probablyProductable = 0;
        for (int i = 0; i < fishes.length; i++) {
            if (fishes[i].getClass().getName() == "EdibleFish" && fishes[i].getQuantity() >= 10.0) {
                probablyProductable++;
            }
        }
        if (probablyProductable != 0)
            return true;
        return false;
    }

    public abstract boolean isFloaty();

    public double calculateProduction() {
        if (isProductable() == false)
            return 0.0;
        double quantity = 0.0;
        for (int i = 0; i < fishes.length; i++) {
            if (fishes[i].getClass().getName() == "EdibleFish" && fishes[i].getQuantity() >= 10.0) {
                quantity += fishes[i].getQuantity();
            }
        }
        return quantity;
    }

}