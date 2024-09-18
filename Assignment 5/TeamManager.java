import java.util.Scanner;

public class TeamManager {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Constant constant = new Constant();
        while (true) {
            System.out.println("\nOperations to perform: ");
            System.out.println("1. Create a new team");
            System.out.println("2. Add player to a team");
            System.out.println("3. Show existing teams");
            System.out.println("4. Choose 2 teams and select 11 players from each");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().trim();
            constant.clear();
            switch (choice) {
                case "1":
                    constant.createTeam();
                    break;
                case "2": 
                    constant.addPlayerToTeam();
                    break;
                case "3":
                    constant.showTeams();
                    break;
                case "4":
                    constant.chooseAndSelectPlayers();
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose between 1 and 5.");
            }
        }
    }
}

/***
 * // Automatically ask for players
            boolean addingPlayers = true;
            while (addingPlayers) {
                System.out.print("Enter the player's name: ");
                String playerName = scanner.nextLine().trim();
                System.out.print("Enter the player's profession: ");
                String profession = scanner.nextLine().trim();

                if (teams[teamCount - 1].addPlayer(playerName, profession)) {
                    System.out.println("Player added successfully.");
                } else {
                    System.out.println("Failed to add player. Team might be full.");
                }

                System.out.print("Do you want to add another player? (yes/no): ");
                String response = scanner.nextLine().trim().toLowerCase();
                if (!response.equals("yes")) {
                    addingPlayers = false;
                }
            }
 */