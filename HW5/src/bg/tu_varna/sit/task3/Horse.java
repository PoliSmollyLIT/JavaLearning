package bg.tu_varna.sit.task3;

public class Horse extends Cow{

    public Horse() {
    }

    @Override
    public void eat() {
        this.setEnergy(getEnergy()+10);
        super.eat();
    }

    @Override
    public void moving() {
        this.setEnergy(getEnergy()+5);
        super.moving();
    }

    @Override
    public void sleep() {
        this.setEnergy(getEnergy()-3);
        super.sleep();
    }

   
}
