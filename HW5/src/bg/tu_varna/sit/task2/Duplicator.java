package bg.tu_varna.sit.task2;

public class Duplicator extends Machine{
    private int paperCount;
    
    public Duplicator() {
    }

    public Duplicator(double price, int paperCount) {
        super(price);
        this.paperCount = paperCount;
    }

    public int getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(int paperCount) {
        this.paperCount = paperCount;
    }

    public void content(Paper paper){

    }

    @Override
    public Paper[] createTracePaper(int number_paper) {
      Paper[] papers = new Paper[number_paper];
      Paper[] papers1 =  papers.clone();
        if(this.getPaperCount() == 0 ){
            return papers1;
       }
        return super.createTracePaper(number_paper);
    }

    
    
}
