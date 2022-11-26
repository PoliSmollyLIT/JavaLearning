package bg.tu_varna.sit.task5;

public class AwayTeam extends Team{

    public AwayTeam(String name, TeamRank teamRank, LastGameResult lastGameResult) {
        super(name, teamRank, lastGameResult);
    }

    @Override
    public int winProbability() {
        if (getTeamRank() == TeamRank.TOP_TEAM) {
            if (getLastGameResult() == LastGameResult.WIN)
                return 80;
            if (getLastGameResult() == LastGameResult.LOSS)
                return 45;
            return 60;
        } else if (getTeamRank() == TeamRank.AVERAGE_TEAM) {
            if (getLastGameResult() == LastGameResult.WIN)
                return 60;
            if (getLastGameResult() == LastGameResult.LOSS)
                return 30;
            return 40;
        } else {
            if (getLastGameResult() == LastGameResult.WIN)
                return 55;
            if (getLastGameResult() == LastGameResult.LOSS)
                return 15;
            return 38;
        }
    }
    
    
}