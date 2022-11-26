package bg.tu_varna.sit.task2;

public class PaperDocument {
    private String title;
    private String dateCreated;
    private int pages;
    private Access access;
    public PaperDocument(String title, String dateCreated, int pages, Access access) {
        this.title = title;
        this.dateCreated = dateCreated;
        this.pages = pages;
        this.access = access;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public Access getAccess() {
        return access;
    }
    public void setAccess(Access access) {
        this.access = access;
    }
   
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PaperDocument other = (PaperDocument) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (dateCreated == null) {
            if (other.dateCreated != null)
                return false;
        } else if (!dateCreated.equals(other.dateCreated))
            return false;
        return true;
    }

        
    
}
