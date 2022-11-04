package bg.tu_varna.sit.task3;

public abstract class Animal implements Move{
    private int energy;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    public abstract void sleep();
    
    public abstract void eat();

    @Override
    public void moving() {
       
    }
    
    
}
