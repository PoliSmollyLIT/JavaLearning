package bg.tu_varna.sit.task2;

public class Book implements Comparable<Book>{
    private String title;
    private Author author;
    private int publishingYear;
    private int availiableQuantity;
    public Book(String title, Author author, int publishingYear, int availiableQuantity) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.availiableQuantity = availiableQuantity;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public int getAvailiableQuantity() {
        return availiableQuantity;
    }
     public void setAvailiableQuantity(int availiableQuantity) {
        this.availiableQuantity = availiableQuantity;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        return true;
    }
    @Override
    public int compareTo(Book o) {
        if(this.equals(o))return 0;
        if(this.getAuthor().compareTo(o.getAuthor()) < 0 && this.getTitle().charAt(0) < o.getTitle().charAt(0)){
            return -1;
        }
        return 1;
    }
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", publishingYear=" + publishingYear
                + ", availiableQuantity=" + availiableQuantity + "]";
    }
    
}