package bg.tu_varna.sit.task3;

public class Cow extends Animal{

    public Cow() {
    }

    @Override
    public void eat() {
        this.setEnergy(getEnergy()+5);
    }

    @Override
    public void moving() {
        this.setEnergy(getEnergy()-20);
    }

    @Override
    public void sleep() {
        this.setEnergy(getEnergy()+10); 
    }
    
    
}
