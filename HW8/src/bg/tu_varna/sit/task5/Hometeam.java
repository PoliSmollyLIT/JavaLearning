package bg.tu_varna.sit.task5;

public class Hometeam extends Team {

    public Hometeam(String name, TeamRank teamRank, LastGameResult lastGameResult) {
        super(name, teamRank, lastGameResult);
    }

    @Override
    public int winProbability() {
        if (getTeamRank() == TeamRank.TOP_TEAM) {
            if (getLastGameResult() == LastGameResult.WIN)
                return 90;
            if (getLastGameResult() == LastGameResult.LOSS)
                return 55;
            return 65;
        } else if (getTeamRank() == TeamRank.AVERAGE_TEAM) {
            if (getLastGameResult() == LastGameResult.WIN)
                return 70;
            if (getLastGameResult() == LastGameResult.LOSS)
                return 35;
            return 48;
        } else {
            if (getLastGameResult() == LastGameResult.WIN)
                return 60;
            if (getLastGameResult() == LastGameResult.LOSS)
                return 20;
            return 40;
        }
    }

}