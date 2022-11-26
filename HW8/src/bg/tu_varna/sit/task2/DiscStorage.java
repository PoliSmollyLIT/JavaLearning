package bg.tu_varna.sit.task2;

public class DiscStorage {
    private int id;
    private String content;
    public DiscStorage(int id, String content) {
        this.id = id;
        this.content = content;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DiscStorage other = (DiscStorage) obj;
        if (id != other.id)
            return false;
        return true;
    }
        
}