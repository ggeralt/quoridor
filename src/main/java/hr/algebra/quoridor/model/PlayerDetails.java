package hr.algebra.quoridor.model;

public class PlayerDetails {
    private String playerName;
    private Integer numberOfWins;

    public PlayerDetails(String playerName) {
        this.playerName = playerName;
        numberOfWins = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(Integer numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public void recordWin() {
        numberOfWins++;
    }
}
