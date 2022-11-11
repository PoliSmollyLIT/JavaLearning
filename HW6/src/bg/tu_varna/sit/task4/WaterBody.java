package bg.tu_varna.sit.task4;

public abstract class WaterBody implements Usage{
    private String name;
    private int depth;
    private Fish[] fishes;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDepth() {
        return depth;
    }
    public void setDepth(int depth) {
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
        int edible = 0;
        for (int i = 0; i < fishes.length; i++) {
            Class<?> clasFish = fishes[i].getClass();
           if(fishes[i].getQuantity() >= 10 && clasFish.getName().contains("EdibleFish")){
            edible++;
           }
        }
        if(edible>0){
            return true;
        }else{
            return false;
        }
    }

    public abstract boolean isFloaty();

    public int calculateProduction(){
        int production = 0;
        for (int i = 0; i < fishes.length; i++) {
            Class<?> clasFish = fishes[i].getClass();
            if(fishes[i].getQuantity() >= 10 && clasFish.getName().contains("EdibleFish")){
             production += fishes[i].getQuantity();
            }
        }
        return production;
    }
    
}
