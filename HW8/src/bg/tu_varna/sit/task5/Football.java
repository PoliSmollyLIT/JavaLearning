package bg.tu_varna.sit.task5;

public class Football implements PredictionCalculator{
    private Hometeam hometeam;
    private AwayTeam awayTeam;
    public Football(Hometeam hometeam, AwayTeam awayTeam) {
        this.hometeam = hometeam;
        this.awayTeam = awayTeam;
    }
    public Hometeam getHometeam() {
        return hometeam;
    }
    public void setHometeam(Hometeam hometeam) {
        this.hometeam = hometeam;
    }
    public AwayTeam getAwayTeam() {
        return awayTeam;
    }
    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }
    @Override
    public Team predictWinner() {
       if(hometeam.winProbability()>=80)
       return hometeam;
       if(hometeam.winProbability()>=50)
       return hometeam; // hmmmm
       return awayTeam;
    }
    
    
}