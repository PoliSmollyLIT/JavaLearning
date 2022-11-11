package bg.tu_varna.sit.task4;

public class Lake extends WaterBody{
    private int width;
    private int length;
    
    public Lake(String name, int depth, Fish[] fishes, int width, int length) {
        super.setName(name);
        super.setDepth(depth);
        super.setFishes(fishes);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean isFloaty() {
       if(getDepth()>=5 && getLength()>=1000 && getWidth()>=1000){
        return true;
       }else{
        return false;
       }
    }
    
    
}
