package bg.tu_varna.sit.task2;

public class Paper {
    
    private int fillrate; 

    public Paper() {
    }

    public Paper(int fillrate) {
        this.fillrate = fillrate;
    }

    public int getFillrate() {
        return fillrate;
    }

    public void setFillrate(int fillrate) {
        this.fillrate = fillrate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
