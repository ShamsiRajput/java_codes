import java.util.ArrayList;


class player {
    private String playerID;
    private String name;
    private String position;


    public player(String playerID, String name, String position) {
        this.playerID = playerID;
        this.name = name;
        this.position = position;
    }
}


class Team {
    private String teamID;
    private String name;
    private ArrayList<player>players;


    public Team(String teamID, String name) {
        this.teamID = teamID;
        this.name = name;
        this.players = new ArrayList<>();
    }


    public String getName() {
        return name;
    }
}

class Match {
    private String matchID;
    private Team team1;
    private Team team2;


    public Match(String matchID, Team team1, Team team2) {
        this.matchID = matchID;
        this.team1 = team1;
        this.team2 = team2;
    }


    public void startMatch()
    {
        System.out.println("Match ID: " + matchID);
        System.out.println("Teams: " + team1.getName() + " vs " + team2.getName());
    }
}


class Main2 {
    public static void main(String[] args) {

        Team team1 = new Team("T001", "Dream Team");
        Team team2 = new Team("T002", "Champion FC");


        Match match = new Match("M001", team1, team2);


        match.startMatch();
}
}