import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Player> players = new ArrayList<Player>();
    private String name;

    // constructor
    public Team(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println("Team Name: " + name);
        for (Player player : players) {
            player.describe();
        }
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void deletePlayer(String playerName) {
        for (Player player : players) {
            if (player.getname().equals(playerName)) {
                players.remove(player);
                System.out.println(player.getname() + " was successfully removed!");
            }
        }
    }

    // setters & getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
