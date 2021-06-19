package lesson5.Task2;

import java.util.ArrayList;

public class Game {
    private String gameName;
    private String ipAddres;
    private int port;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Game(String name, String ip, int port) {
    }

    public Game(String gameName, String ipAddres, int port, ArrayList<Player> players) {
        this.gameName = gameName;
        this.ipAddres = ipAddres;
        this.port = port;
        this.players = players;
    }


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getIpAddres() {
        return ipAddres;
    }

    public void setIpAddres(String ipAddres) {
        this.ipAddres = ipAddres;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", ipAddres='" + ipAddres + '\'' +
                ", port=" + port +
                ", players=" + players +
                '}';
    }
}
