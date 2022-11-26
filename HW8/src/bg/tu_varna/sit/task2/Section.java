package bg.tu_varna.sit.task2;

public class Section<E> {
    private String title;
    private E[] documents;

    public Section(String title, E[] documents) {
        this.title = title;
        this.documents = documents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public E[] getDocuments() {
        return documents;
    }

    public void setDocuments(E[] documents) {
        this.documents = documents;
    }

    public String findDocument(E obj) {
        for (int i = 0; i < documents.length; i++) {
            if (obj.equals(documents[i]))
                return "Открит!\n";
        }
        return "Не е намерен!\n";
    }
}