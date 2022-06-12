package dz;

public class Team {

    private String nameTeam;          //поля класса Team
    private Players[] players;

    public Team(String nameTeam, Players[] players) {        //конструктор  класса Team
        this.nameTeam = nameTeam;
        this.players = players;
    }

    public void printMsg() {
        System.out.println("Представляем Вашему вниманию команду '" + nameTeam
                + "', которая состоит из следующих игроков:");
    }

    public String getNameTeam() {                            // геттеры, для возможности получения данных т.к. поля приватные
        return nameTeam;
    }
    public Players[] getPlayers() {
        return players;
    }
}
