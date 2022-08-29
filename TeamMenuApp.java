import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMenuApp {

    static Scanner scan = new Scanner(System.in);
    static List<Team> teams = new ArrayList<Team>();

    public static void main(String[] args) {

        int decision = 0;
        while (decision != 5) {
            printOptions();
            decision = scan.nextInt();
            if (decision == 1) {
                teams.add(createNewTeam());
            } else if (decision == 2) {
                addPlayerToTeam();
            } else if (decision == 3) {
                removePlayerFromTeam();
            } else if (decision == 4) {
                describeTeam();
            } else if (decision == 5) {
                System.out.println("goodbye!");
            } else {
                System.out.println("Please enter a valid option.");
            }

        }
    }

    private static void describeTeam() {
        System.out.println("Which team would you like to review the information?");
        String teamName = scan.next();
        try {
            Team teamFound = findTeamByName(teamName);
            teamFound.describe();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private static void removePlayerFromTeam() {
        printTeamNames();
        System.out.println("Enter name of team you wish to remove a player from: ");
        String teamName = scan.next();
        try {
            Team teamFound = findTeamByName(teamName);
            System.out.println("Teams: ");
            teamFound.describe();
            System.out.println("Enter name of player you wish to remove: ");
            String playerName = scan.next();
            teamFound.deletePlayer(playerName);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private static void addPlayerToTeam() {
        printTeamNames();
        System.out.println("Enter name of team you wish to add player to: ");
        String teamName = scan.next();
        try {
            Team foundTeam = findTeamByName(teamName);
            foundTeam.addPlayer(createNewPlayer());
        } catch (Exception e) {
            System.out.println(e.toString());
            // e.printStackTrace();
        }
    }

    private static Player createNewPlayer() {
        System.out.println("Enter new player name: ");
        String name = scan.next();
        System.out.println("Enter new player position: ");
        String position = scan.next();
        System.out.println("Enter new player specialty: ");
        String specialty = scan.next();
        return new Player(name, position, specialty);
    }

    private static void printTeamNames() {
        for (Team team : teams) {
            System.out.println(team.getName());
        }
    }

    private static Team findTeamByName(String teamName) throws Exception {
        for (Team team : teams) {
            if (team.getName().equals(teamName)) {
                return team;
            }
        }
        throw new Exception("team not found: " + teamName);
    }

    private static Team createNewTeam() {
        System.out.println("Enter name of team you want to create: ");
        String name = scan.next();
        return new Team(name);

    }

    private static void printOptions() {
        System.out.println("1) Create new team");
        System.out.println("2) Add new player to team");
        System.out.println("3) Remove player from team");
        System.out.println("4) View team info");
        System.out.println("5) Exit");
    }

    // Player player1 = new Player("Redd", "qb", "throws far");
    // // player.describe();

    // Player player2 = new Player("J", "fb", "runs fast");

    // Player player3 = new Player("Lychee", "k9", "boss lady");

    // Team team1 = new Team("Ass Kickers");
    // team1.addPlayer(player1);
    // team1.addPlayer(player2);
    // // team1.addPlayer(player3);
    // team1.describe();

    // team1.deletePlayer("Redd");
    // team1.describe();
}
