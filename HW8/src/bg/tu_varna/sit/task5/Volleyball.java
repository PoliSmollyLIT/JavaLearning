package bg.tu_varna.sit.task5;

public class Volleyball implements PredictionCalculator{
    private Hometeam homeTeam;
    private AwayTeam awayTeam;
    private boolean lastGameTieBreakHome;
    private boolean lastGameTieBreakAway;
    public Volleyball(Hometeam homeTeam, AwayTeam awayTeam, boolean lastGameTieBreakHome, boolean lastGameTieBreakAway) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.lastGameTieBreakHome = lastGameTieBreakHome;
        this.lastGameTieBreakAway = lastGameTieBreakAway;
    }
    public Hometeam getHomeTeam() {
        return homeTeam;
    }
    public void setHomeTeam(Hometeam homeTeam) {
        this.homeTeam = homeTeam;
    }
    public AwayTeam getAwayTeam() {
        return awayTeam;
    }
    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }
    public boolean isLastGameTieBreakHome() {
        return lastGameTieBreakHome;
    }
    public void setLastGameTieBreakHome(boolean lastGameTieBreakHome) {
        this.lastGameTieBreakHome = lastGameTieBreakHome;
    }
    public boolean isLastGameTieBreakAway() {
        return lastGameTieBreakAway;
    }
    public void setLastGameTieBreakAway(boolean lastGameTieBreakAway) {
        this.lastGameTieBreakAway = lastGameTieBreakAway;
    }
    @Override
    public Team predictWinner() {
        if(isLastGameTieBreakHome()){
            if(homeTeam.winProbability()<=60)
            return awayTeam;
            return homeTeam;
        }else if(isLastGameTieBreakAway()){
            if(homeTeam.winProbability()<=60)
            return homeTeam;
            return awayTeam;
        }else{
            if(homeTeam.winProbability()<=70)
            return awayTeam;
            return homeTeam;
        }

    }
    
    
}