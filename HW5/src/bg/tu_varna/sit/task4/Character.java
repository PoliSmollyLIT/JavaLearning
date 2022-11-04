package bg.tu_varna.sit.task4;

public abstract class Character {
    private String name;
    private int life;

    public abstract int striking();
    public abstract void defense(int striking);
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }  
    
}
