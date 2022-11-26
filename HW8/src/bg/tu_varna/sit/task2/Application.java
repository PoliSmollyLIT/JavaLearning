package bg.tu_varna.sit.task2;

public class Application {
    public static void main(String[] args) {
        PaperDocument[] papers = { new PaperDocument("Title1", "22-03-22", 20, Access.FREE),
                new PaperDocument("Title2", "22-03-23", 21, Access.RESTRICTED),
                new PaperDocument("Title3", "22-03-24", 22, Access.FREE) };

        DiscStorage[] discs = { new DiscStorage(1, "content1"),
                new DiscStorage(2, "content2"),
                new DiscStorage(3, "content3") };

        Section<PaperDocument> section1 = new Section<>("Section1", papers);
        Section<DiscStorage> section2 = new Section<>("Section2", discs);

        PaperDocument paperToFind = new PaperDocument("Title2", "22-03-23", 21, Access.RESTRICTED);
        DiscStorage discToFind = new DiscStorage(2, "content2");
        DiscStorage discToFind2 = new DiscStorage(4, "content2");
        System.out.println(section1.findDocument(paperToFind));
        System.out.println(section2.findDocument(discToFind));
        System.out.println(section2.findDocument(discToFind2));

    }
}