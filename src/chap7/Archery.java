package chap7;

public class Archery {
    private Player[] players;
    public Archery(int numberOfPlayers) {
    players = new Player[numberOfPlayers];
    }
    public Player[] getPlayers() {
       return players;
    }
}
