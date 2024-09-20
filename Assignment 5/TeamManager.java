import java.util.Scanner;

public class TeamManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static void showMenu() {
        Constant constant = new Constant();
        System.out.println(constant.Operations);
        System.out.println(constant.CreateNewTeam);
        System.out.println(constant.AddPlayer);
        System.out.println(constant.ExistingPlayers);
        System.out.println(constant.SelectPlayerAndStartMatch);
        System.out.println(constant.Exit);
        System.out.print(constant.EnterChoice);
    }
    public static void main(String[] args) {
        Constant constant = new Constant();
        while (true) {
            showMenu();
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
                    constant.showPlayers();
                    break;
                case "4":
                    constant.simulateMatchWithPlayerSelection();
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println(constant.InvalidChoiceMain);
            }
        }
    }
}