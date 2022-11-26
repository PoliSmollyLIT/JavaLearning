package bg.tu_varna.sit.task5;

public class MatchPredication<E> {
    private E match;

    public MatchPredication(E match) {
        this.match = match;
    }

    public E getMatch() {
        return match;
    }

    public void setMatch(E match) {
        this.match = match;
    }
    
    public static <E> void displayPredictedWinner(E match){
        System.out.println(((PredictionCalculator)match).predictWinner().getName());
    }
    
}