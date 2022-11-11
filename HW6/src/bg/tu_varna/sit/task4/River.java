package bg.tu_varna.sit.task4;

public class River extends WaterBody{
    private int speed;

    
    public River(String name, int depth, Fish[] fishes, int speed) {
        super.setName(name);
        super.setDepth(depth);
        super.setFishes(fishes);
       this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean isFloaty() {
        if(getDepth()>=3 && getSpeed()<=30){
            return true;
        }else{
            return false;
        }
    }    
}
