package bg.tu_varna.sit.task3;

public class Sheep extends Cow {

    public Sheep() {
    }

    @Override
    public void eat() {
        this.setEnergy(getEnergy()+5);
        super.eat();
    }

    @Override
    public void moving() {
        this.setEnergy(getEnergy()-5);
        super.moving();
    }

    @Override
    public void sleep() {
        this.setEnergy(getEnergy()-5);
        super.sleep();
    }

}
