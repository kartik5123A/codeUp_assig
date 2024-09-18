import java.util.Scanner;
public class Constant {

    public static class Team {
        private String name;
        private Player[] players = new Player[20];  // Assume a maximum of 20 players per team
        private int playerCount = 0;

        Team(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }

        boolean addPlayer(String name, String profession) {
            if (playerCount < players.length) {
                players[playerCount++] = new Player(name, profession);
                return true;
            }
            return false;
        }

        int getPlayerCount() {
            return playerCount;
        }

        String getPlayerName(int index) {
            if (index >= 0 && index < playerCount) {
                return players[index].getName();
            }
            return null;
        }

        void listPlayers() {
            System.out.println("Available players:");
            for (int i = 0; i < playerCount; i++) {
                System.out.println((i + 1) + ". " + players[i].getName() + " (" + players[i].getProfession() + ")");
            }
        }
    }

    public static class Player {
        private String name;
        private String profession;

        Player(String name, String profession) {
            this.name = name;
            this.profession = profession;
        }

        String getName() {
            return name;
        }

        String getProfession() {
            return profession;
        }
    }
    static Scanner scanner = new Scanner(System.in);

    static String[] teamNames = {"Sooners", "Sky Kings", "Jade Jaguars", "Crimson Tiden","Green Giants", "Rising Titans", "Soul Spartans", "Daring Devils", "Crimson Kings", "Desert Demons", "Burning Blaze", "Power Hitters", "Globetrotters", "Flash Falcons", "Shooting Stars", "Silver Streaks", "Blazing Blades", "Black Panthers", "Red Revolution", "Imperial Eagles", "Lightning Bolts", "Murder of Crows", "Mystic Warriors", "Thundering Herd", "Got The Runs",
                    "Electric Eagles", "Cobras", "Falcons", "Violets", "Masters", "Vandals", "Avengers", "Crazy 11", "In Style", "Crick-IT", "Scorpions", "Explorers", "Seawolves", "Fear this", "Champions", "Fireballs", "Unbeatable", "The Shield", "Red Riders", "Conquerors", "Dominators", "Challengers", "Swing Thing", "Bat Assault", "Fresh Starz",
                    "Thunder Thrashers", "Lightning Raiders", "Bohemian Blasters", "Golden Gladiators", "Emerald Enforcers", "Fearless Fighters", "Front Foot Damsels", "Over the Top Gurus", "Slingy and Skiddy", "Hurdles of Nurdles", "Majestic Mavericks", "Slip Matic", "Hit Machine", "No Sympathy", "Fiery Devils", "The Swingers", "Ball Busters", "Raging Bulls", "25 Fancy", "Dolphin Dolls", "Cool Thumpers", "Golden Eagles", "Century Hitters", "Awkward Turtles", "The Epic Blasters",
                    "Raptors", "Red Wings", "Diva Drive", "Empty Heads", "Pitch Burners", "Railsplitters", "Rainbow Warriors", "Terrific Hitters", "Essential Sidebar", "Ravishing Willows", "Ferocious Fatties", "Bewitching Willows", "Wicked Wicket-Takers", "Ruthless Hard Hitters", "Wide Wonders", "Bowled Over Boys", "Howzat Happeners", "Toss Turners", "Googly Goons", "Spin Doctors", "No-Ball Ninjas", "Silly Pointers", "Umpire Uproar", "Stumped Superstars", "Yorker Yarners"}; 

    static String[] batsman = {"Sachin Tendulkar", "Virat Kohli", "Ricky Ponting", "Brian Lara", "Jacques Kallis", "Kumar Sangakkara", "AB de Villiers", "Sunil Gavaskar", "Vivian Richards", "Steve Smith", "Joe Root", "Kane Williamson", "Rahul Dravid", "Younis Khan", "Hashim Amla", "Michael Clarke", "Inzamam-ul-Haq", "Mahela Jayawardene", "David Warner", "Alastair Cook", "Kevin Pietersen", "Shubman Gill", "Rohit Sharma", "Babar Azam", "Marnus Labuschagne", "Ben Stokes", "Cheteshwar Pujara", "Faf du Plessis", "Ross Taylor", "Angelo Mathews", "Shreyas Iyer", "Usman Khawaja", "Dimuth Karunaratne", "Travis Head", "Litton Das", "Mushfiqur Rahim", "Ben Duckett", "Saud Shakeel", "Temba Bavuma", "Zak Crawley", "Aiden Markram", "Dinesh Chandimal", "Cameron Green", "Dean Elgar", "Jonny Bairstow", "Tom Latham", "Ollie Pope", "Devon Conway", "Shakib Al Hasan", "Ajinkya Rahane"};
    static String[] bowlers = {"Shane Warne", "Muttiah Muralitharan", "Glenn McGrath", "Wasim Akram", "Waqar Younis", "Anil Kumble", "Curtly Ambrose", "Courtney Walsh", "Richard Hadlee", "Malcolm Marshall", "Dennis Lillee", "Imran Khan", "Kapil Dev", "James Anderson", "Dale Steyn", "Shaun Pollock", "Brett Lee", "Allan Donald", "Michael Holding", "Joel Garner", "Fred Trueman", "Bob Willis", "Ian Botham", "Clarrie Grimmett", "Bishan Singh Bedi", "Lance Gibbs", "Saqlain Mushtaq", "Harbhajan Singh", "Zaheer Khan", "Mitchell Johnson", "Stuart Broad", "Ravichandran Ashwin", "Pat Cummins", "Kagiso Rabada", "Jasprit Bumrah", "Trent Boult", "Tim Southee", "Nathan Lyon", "Graeme Swann", "Saeed Ajmal", "Shakib Al Hasan", "Lasith Malinga", "Chaminda Vaas", "Daniel Vettori", "Ravindra Jadeja", "Rashid Khan", "Sunil Narine", "Mustafizur Rahman", "Mohammad Amir"};
    static String[] fielder = {"Jonty Rhodes", "AB de Villiers", "Ricky Ponting", "Brendon McCullum", "Suresh Raina", "Ravindra Jadeja", "Andrew Symonds", "Martin Guptill", "Paul Collingwood", "Herschelle Gibbs", "Virat Kohli", "Glenn Maxwell", "David Warner", "Steve Smith", "Ben Stokes", "Kieron Pollard", "Faf du Plessis", "Eoin Morgan", "Mohammad Kaif", "Yuvraj Singh", "Mahela Jayawardene", "Ross Taylor", "Kane Williamson", "Shikhar Dhawan", "Rohit Sharma", "Shubman Gill", "Hardik Pandya", "Chris Lynn", "Dwayne Bravo", "Tilakaratne Dilshan", "Glenn Phillips", "Mohammad Azharuddin", "Allan Border", "Adam Gilchrist", "Kumar Sangakkara", "MS Dhoni", "Jos Buttler", "Quinton de Kock", "Rishabh Pant", "Pat Cummins", "Trent Boult", "Kagiso Rabada", "Jasprit Bumrah", "Ravichandran Ashwin", "Anil Kumble", "Shane Warne", "Muttiah Muralitharan", "Dale Steyn", "Shaun Pollock"};
    
    public static final int MAX_PLAYERS = 11;
    public static Team[] teams = new Team[100];
    public static int teamCount = 0;

    public static void clear() {
        try {
            if (!System.getProperty("os.name").contains("Windows")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } else {
                // Assume Windows system
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printNames(String[] names){
        for(int i = 0; i < names.length; i++){
            System.out.println(i+1 + " " + names[i]);
        }
    }

    public static void teamOptions(String str){
        System.out.println("Select a method to add a team " + str + ".");
        System.out.println("1. Select a name for team " + str + ".");
        System.out.println("2. Create your own team " + str + " name.");
        System.out.print("Enter your choice: ");
    }

    public static String selectNames(String str, String[] names){
        String team = "";
        teamOptions(str);
        String choice = scanner.nextLine();
        choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("Select a name for the team " + str + " in this list: ");
                printNames(names);
                System.out.print("Enter the team " + str + " number: ");
                int team_num = scanner.nextInt();
                team = teamNames[team_num - 1];
                break;
            case "2":
                System.out.print("Enter the name of team " + str + ": ");
                team = scanner.nextLine();
                break;
            default:
                System.out.println("You have given an Invalid Input!!");
                break;
        }
        return team;
    }

    public static void createTeam() {
        String teamName = selectNames("", teamNames).trim();
        clear();
        if (alreadyExistTeam(teamName) != null) {
            System.out.println("Team already exists.");
        } else if (teamCount >= teams.length) {
            System.out.println("Maximum number of teams reached.");
        } else {
            teams[teamCount] = new Team(teamName);
            teamCount++;
            System.out.println("Team created successfully.");
        }
    }

    public static void addPlayerToTeam() {
        showTeams();
        System.out.print("Enter the team name to add a player to: ");
        String teamName = scanner.nextLine().trim();
        teamName = scanner.nextLine().trim();
        Team team = alreadyExistTeam(teamName);
        if (team == null) {
            System.out.println("Team does not exist.");
            return;
        }
        boolean continueLoop = true;
        String profession = "";
        String playerName = "";
        while(continueLoop){
            System.out.print("Enter the player's profession: ");
            profession = scanner.nextLine().trim();
            switch (profession) {
                case "batsman":
                    boolean continueCase = true;
                    while(continueCase){
                        clear();
                        playerName = selectNames("member", batsman);
                        clear();
                        System.out.print("Would you like to add another batsman(y/n): ");
                        String choice = scanner.nextLine();
                        if(choice == "n"){continueCase = false;}
                    }
                    break;
                case "bowler":

                    break;
                case "fielder":

                    break;            
                default:
                    
                    break;
            }
        }
        if (team.addPlayer(playerName, profession)) {
            System.out.println("Player added successfully.");
        } else {
            System.out.println("Failed to add player. Team might be full.");
        }
    }

    public static void showTeams() {
        if (teamCount == 0) {
            System.out.println("No teams available.");
            return;
        }
        System.out.println("Existing teams:");
        for (int i = 0; i < teamCount; i++) {
            System.out.println((i + 1) + ". " + teams[i].getName());
        }
    }

    public static void chooseAndSelectPlayers() {
        if (teamCount < 2) {
            System.out.println("Not enough teams to choose from.");
            return;
        }

        showTeams();

        System.out.print("Select the first team by number: ");
        int firstTeamIndex = getValidTeamIndex();
        if (firstTeamIndex == -1) return; // Invalid input handling

        System.out.print("Select the second team by number: ");
        int secondTeamIndex = getValidTeamIndex();
        if (secondTeamIndex == -1 || secondTeamIndex == firstTeamIndex) {
            System.out.println("Invalid choice. Teams should be different.");
            return;
        }

        Team firstTeam = teams[firstTeamIndex];
        Team secondTeam = teams[secondTeamIndex];

        System.out.println("Selected Teams:");
        System.out.println("Team 1: " + firstTeam.getName());
        firstTeam.listPlayers();
        System.out.println("Team 2: " + secondTeam.getName());
        secondTeam.listPlayers();

        System.out.println("Select 11 players from Team 1:");
        String[] selectedPlayersFirstTeam = selectPlayers(firstTeam);

        System.out.println("Select 11 players from Team 2:");
        String[] selectedPlayersSecondTeam = selectPlayers(secondTeam);

        System.out.println("Selected players from Team 1:");
        for (String player : selectedPlayersFirstTeam) {
            System.out.println(player);
        }

        System.out.println("Selected players from Team 2:");
        for (String player : selectedPlayersSecondTeam) {
            System.out.println(player);
        }
    }

    public static int getValidTeamIndex() {
        try {
            int index = Integer.parseInt(scanner.nextLine().trim()) - 1;
            if (index >= 0 && index < teamCount) {
                return index;
            } else {
                System.out.println("Invalid choice. Try again.");
                return -1;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Enter a number.");
            return -1;
        }
    }

    public static String[] selectPlayers(Team team) {
        if (team.getPlayerCount() < MAX_PLAYERS) {
            System.out.println("Not enough players in the team. You have " + team.getPlayerCount() + " players.");
            return new String[0];
        }

        team.listPlayers();

        String[] selectedPlayers = new String[MAX_PLAYERS];
        int count = 0;
        while (count < MAX_PLAYERS) {
            System.out.print("Select player " + (count + 1) + " by number (1-" + team.getPlayerCount() + "): ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim()) - 1;
                if (choice >= 0 && choice < team.getPlayerCount()) {
                    String playerName = team.getPlayerName(choice);
                    boolean alreadySelected = false;
                    for (int i = 0; i < count; i++) {
                        if (selectedPlayers[i].equals(playerName)) {
                            alreadySelected = true;
                            break;
                        }
                    }
                    if (!alreadySelected) {
                        selectedPlayers[count++] = playerName;
                    } else {
                        System.out.println("Player already selected.");
                    }
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
            }
        }
        return selectedPlayers;
    }

    public static Team alreadyExistTeam(String teamName) {
        for (int i = 0; i < teamCount; i++) {
            if (teams[i].getName().equals(teamName)) {
                return teams[i];
            }
        }
        return null;
    }
}
