package bg.tu_varna.sit.task5;

public class Application {
    public static void main(String[] args){
        Hometeam hometeam1 = new Hometeam("Filmari", TeamRank.BOTTOM_TEAM, LastGameResult.WIN);
        Hometeam hometeam2 = new Hometeam("Otlichnicite", TeamRank.AVERAGE_TEAM, LastGameResult.DRAW);
        Hometeam hometeam3 = new Hometeam("Diablos", TeamRank.BOTTOM_TEAM, LastGameResult.LOSS);
        AwayTeam awayteam1 = new AwayTeam("Away Team 1", TeamRank.AVERAGE_TEAM, LastGameResult.WIN);
        AwayTeam awayteam2 = new AwayTeam("Away Team 2", TeamRank.TOP_TEAM, LastGameResult.DRAW);
        AwayTeam awayteam3 = new AwayTeam("Away Team 3", TeamRank.BOTTOM_TEAM, LastGameResult.LOSS);

        Football football1 = new Football(hometeam1, awayteam1);
        Football football2 = new Football(hometeam2, awayteam2);

        Volleyball volleyball1 = new Volleyball(hometeam3, awayteam3, false, true);
        Volleyball volleyball2 = new Volleyball(hometeam2, awayteam3, true, false);
       
        MatchPredication.displayPredictedWinner(football1);
        MatchPredication.displayPredictedWinner(football2);
        MatchPredication.displayPredictedWinner(volleyball1);
        MatchPredication.displayPredictedWinner(volleyball2);
    }
}