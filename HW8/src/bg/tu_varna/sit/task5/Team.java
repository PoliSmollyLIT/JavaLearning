package bg.tu_varna.sit.task5;

public abstract class Team implements Resilts{
    private String name;
    private TeamRank teamRank;
    private LastGameResult lastGameResult;
    
    public Team(String name, TeamRank teamRank, LastGameResult lastGameResult) {
        this.name = name;
        this.teamRank = teamRank;
        this.lastGameResult = lastGameResult;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public TeamRank getTeamRank() {
        return teamRank;
    }
    public void setTeamRank(TeamRank teamRank) {
        this.teamRank = teamRank;
    }
    public LastGameResult getLastGameResult() {
        return lastGameResult;
    }
    public void setLastGameResult(LastGameResult lastGameResult) {
        this.lastGameResult = lastGameResult;
    }
        
}