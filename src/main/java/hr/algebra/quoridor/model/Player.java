package hr.algebra.quoridor.model;

public class Player {
    private String name;
    private Integer numberOfWins;
    private Integer numberOfWalls;

    public Player(String name) {
        this.name = name;
        numberOfWins = 0;
        numberOfWalls = 6;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getNumberOfWalls() {
        return numberOfWalls;
    }

    public void setNumberOfWalls(Integer numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }

    public void recordWallPlacement() {
        numberOfWalls--;
    }
}
