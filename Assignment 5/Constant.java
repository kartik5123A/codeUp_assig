import java.util.Scanner;
class Constant {

    static String Operations = "\nOperations to perform: ";
    static String CreateNewTeam = "1. Create a new team";
    static String AddPlayer = "2. Add player to a team";
    static String ExistingPlayers = "3. Show existing players";
    static String SelectPlayerAndStartMatch = "4. Select players and start match";
    static String AvailablePlayer = "Available players:";
    static String SelectMethod = "Select a method to add a team ";
    static String Exit = "5. Exit";
    static String SelectName = "1. Select a Name for team ";
    static String EnterChoice = "Enter your choice: ";
    static String CreateTeam = "2. Create your own team ";
    static String Name = " Name.";
    static String InvalidChoiceMain = "Invalid choice. Please choose between 1 and 5.";
    static String InvalidInput = "Invalid Input!!\n";
    static String NoInput = "No Input!!\n";
    static String InList = " in this list: ";
    static String EnterName = "Enter the Name of team ";
    static String TeamExist = "Team already exists.";
    static String MaxTeam = "Maximum number of teams reached.";
    static String TeamCreated = "Team created successfully.";
    static String EnterTeamNumber = "Enter the team number to add a player to: ";
    static String TeamNotExist = "Team does not exist."; 
    static String EnterProfession = "Enter the player's profession (batsman/bowler/fielder/quit): ";
    static String InvalidProfession = "Invalid profession. Exiting.\n";
    static String NoMoreProfession = "No more available players of this profession to add.";
    static String PlayerAdded = "Player added successfully.";
    static String PlayerAddedFailed = "Failed to add player. Team might be full.";
    static String AddAnother = "Would you like to add another ";
    static String Bats = "batsman";
    static String Ball = "bowler";
    static String Field = "fielder";
    static String NoTeam = "No teams available.";
    static String ExistingTeam = "Existing teams:";
    static String SelectTeam = "\nSelect the team: ";
    static String InvalidTry = "Invalid choice. Try again.";
    static String InvalidNumber = "Invalid input. Enter a number.";
    static String NoPlayerAvailable = "No players available in the team.";
    static String NotEnoughTeam = "Not enough teams to start a match.";
    static String FirstTeamMember = "Select the first team by number: ";
    static String SecondTeamMember = "Select the second team by number: ";
    static String InvalidChoiceTeam = "Invalid choice. Teams should be different.";
    static String NumberPlayer = "Enter the number of players: ";
    static String PlayerTeam1 = "Select players from Team 1:";
    static String PlayerTeam2 = "Select players from Team 2:";
    static String SelectedPlayerTeam1 = "Selected players from Team 1:";
    static String SelectedPlayerTeam2 = "\nSelected players from Team 2:";
    static String EnterOvers = "\nEnter the number of overs: ";
    static String FinalScore = "\nFinal Score:";
    static String Scored = " scored ";
    static String Wins = " wins!";
    static String IsBatting = " is batting";
    static String MatchTie = "The match is a tie!";
    static String SelectStriker = "Select the striker from ";
    static String SelectNonStriker = "Select the non-striker from ";
    static String SelectBowler = "Select the bowler from ";
    static String EnterOutcome = " - Enter outcome (run, wide, out): ";
    static String RunsScored = "Enter runs scored: ";
    static String WideBall = "Wide ball! 1 run added.";
    static String SelectNewStriker = "Select a new striker from ";
    static String InvalidOutcome = "Invalid outcome. Please enter again.";
    static String InvalidInputNumber = "Invalid input. Please enter a number.";
    static String SelectPlayerNumber = "Select player by number: ";
    static String WicketDown = " wickets down.";

    // This class helps in creating teams by creating their objects and implementing their functions.
    public static class Team {
        private String Name;
        private Player[] players = new Player[20];
        private int playerCount = 0;
        Team(String Name) {
            this.Name = Name;
        }
        String getName() {
            return Name;
        }
        public boolean hasPlayer(String playerName) {
            for (int i = 0; i < playerCount; i++) {
                if (players[i].getName().equals(playerName)) {
                    return true; 
                }
            }
            return false; 
        }
        boolean addPlayer(String Name, String profession) {
            if (playerCount < players.length) {
                players[playerCount++] = new Player(Name, profession);
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
            System.out.println(AvailablePlayer);
            for (int i = 0; i < playerCount; i++) {
                System.out.println("\t\t" + (i + 1) + ". " + players[i].getName() + " (" + players[i].getProfession() + ")");
            }
        }
    }

    // This class creates player and their professions objects and adding into teams.
    public static class Player {
        private String Name;
        private String profession;
        Player(String Name, String profession) {
            this.Name = Name;
            this.profession = profession;
        }
        String getName() {
            return Name;
        }
        String getProfession() {
            return profession;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] teamNames = {"Sooners", "Sky Kings", "Jade Jaguars", "Crimson Tiden","Green Giants", "Rising Titans", "Soul Spartans", "Daring Devils", "Crimson Kings", "Desert Demons", "Burning Blaze", "Power Hitters", "Globetrotters", "Flash Falcons", "Shooting Stars", "Silver Streaks", "Blazing Blades", "Black Panthers", "Red Revolution", "Imperial Eagles", "Lightning Bolts", "Murder of Crows", "Mystic Warriors", "Thundering Herd", "Got The Runs",
                        "Electric Eagles", "Cobras", "Falcons", "Violets", "Masters", "Vandals", "Avengers", "Crazy 11", "In Style", "Crick-IT", "Scorpions", "Explorers", "Seawolves", "Fear this", "Champions", "Fireballs", "Unbeatable", "The Shield", "Red Riders", "Conquerors", "Dominators", "Challengers", "Swing Thing", "Bat Assault", "Fresh Starz",
                        "Thunder Thrashers", "Lightning Raiders", "Bohemian Blasters", "Golden Gladiators", "Emerald Enforcers", "Fearless Fighters", "Front Foot Damsels", "Over the Top Gurus", "Slingy and Skiddy", "Hurdles of Nurdles", "Majestic Mavericks", "Slip Matic", "Hit Machine", "No Sympathy", "Fiery Devils", "The Swingers", "Ball Busters", "Raging Bulls", "25 Fancy", "Dolphin Dolls", "Cool Thumpers", "Golden Eagles", "Century Hitters", "Awkward Turtles", "The Epic Blasters",
                        "Raptors", "Red Wings", "Diva Drive", "Empty Heads", "Pitch Burners", "Railsplitters", "Rainbow Warriors", "Terrific Hitters", "Essential Sidebar", "Ravishing Willows", "Ferocious Fatties", "Bewitching Willows", "Wicked Wicket-Takers", "Ruthless Hard Hitters", "Wide Wonders", "Bowled Over Boys", "Howzat Happeners", "Toss Turners", "Googly Goons", "Spin Doctors", "No-Ball Ninjas", "Silly Pointers", "Umpire Uproar", "Stumped Superstars", "Yorker Yarners"};
    private static final String[] batsman = {"Sachin Tendulkar", "Virat Kohli", "Ricky Ponting", "Brian Lara", "Jacques Kallis", "Kumar Sangakkara", "AB de Villiers", "Sunil Gavaskar", "Vivian Richards", "Steve Smith", "Joe Root", "Kane Williamson", "Rahul Dravid", "Younis Khan", "Hashim Amla", "Michael Clarke", "Inzamam-ul-Haq", "Mahela Jayawardene", "David Warner", "Alastair Cook", "Kevin Pietersen", "Shubman Gill", "Rohit Sharma", "Babar Azam", "Marnus Labuschagne", "Ben Stokes", "Cheteshwar Pujara", "Faf du Plessis", "Ross Taylor", "Angelo Mathews", "Shreyas Iyer", "Usman Khawaja", "Dimuth Karunaratne", "Travis Head", "Litton Das", "Mushfiqur Rahim", "Ben Duckett", "Saud Shakeel", "Temba Bavuma", "Zak Crawley", "Aiden Markram", "Dinesh Chandimal", "Cameron Green", "Dean Elgar", "Jonny Bairstow", "Tom Latham", "Ollie Pope", "Devon Conway", "Shakib Al Hasan", "Ajinkya Rahane"};
    private static final String[] bowlers = {"Shane Warne", "Muttiah Muralitharan", "Glenn McGrath", "Wasim Akram", "Waqar Younis", "Anil Kumble", "Curtly Ambrose", "Courtney Walsh", "Richard Hadlee", "Malcolm Marshall", "Dennis Lillee", "Imran Khan", "Kapil Dev", "James Anderson", "Dale Steyn", "Shaun Pollock", "Brett Lee", "Allan Donald", "Michael Holding", "Joel Garner", "Fred Trueman", "Bob Willis", "Ian Botham", "Clarrie Grimmett", "Bishan Singh Bedi", "Lance Gibbs", "Saqlain Mushtaq", "Harbhajan Singh", "Zaheer Khan", "Mitchell Johnson", "Stuart Broad", "Ravichandran Ashwin", "Pat Cummins", "Kagiso Rabada", "Jasprit Bumrah", "Trent Boult", "Tim Southee", "Nathan Lyon", "Graeme Swann", "Saeed Ajmal", "Shakib Al Hasan", "Lasith Malinga", "Chaminda Vaas", "Daniel Vettori", "Ravindra Jadeja", "Rashid Khan", "Sunil Narine", "Mustafizur Rahman", "Mohammad Amir"};
    private static final String[] fielders = {"Jonty Rhodes", "AB de Villiers", "Ricky Ponting", "Brendon McCullum", "Suresh Raina", "Ravindra Jadeja", "Andrew Symonds", "Martin Guptill", "Paul Collingwood", "Herschelle Gibbs", "Virat Kohli", "Glenn Maxwell", "David Warner", "Steve Smith", "Ben Stokes", "Kieron Pollard", "Faf du Plessis", "Eoin Morgan", "Mohammad Kaif", "Yuvraj Singh", "Mahela Jayawardene", "Ross Taylor", "Kane Williamson", "Shikhar Dhawan", "Rohit Sharma", "Shubman Gill", "Hardik Pandya", "Chris Lynn", "Dwayne Bravo", "Tilakaratne Dilshan", "Glenn Phillips", "Mohammad Azharuddin", "Allan Border", "Adam Gilchrist", "Kumar Sangakkara", "MS Dhoni", "Jos Buttler", "Quinton de Kock", "Rishabh Pant", "Pat Cummins", "Trent Boult", "Kagiso Rabada", "Jasprit Bumrah", "Ravichandran Ashwin", "Anil Kumble", "Shane Warne", "Muttiah Muralitharan", "Dale Steyn", "Shaun Pollock"};
    public static final int MAX_PLAYERS = 11;
    private static Team[] teams = new Team[100];
    private static int teamCount = 0;

    // This function clears the terminal 
    // returns -> void
    // parameters -> none
    public static void clear() {
        try {
            if (System.getProperty("os.Name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error clearing the console: " + e.getMessage());
        }
    }
    
    // This function prints names of teams, team members and others 
    // returns -> void
    // parameters -> String Array
    private static void printNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + " " + names[i]);
        }
    }
    
    // This function asks the methods to add team and team player
    // returns -> void
    // parameters -> String
    private static void teamOptions(String str) {
        System.out.println(SelectMethod + str);
        System.out.println(SelectName + str + ".");
        System.out.println(CreateTeam + str);
        System.out.print(EnterChoice);
    }

    // This function helps in selecting the names of teams and team players
    // returns -> String
    // parameters -> String, String Array
    private static String selectNames(String str, String[] names) {
        String team = "";
        teamOptions(str);
        String choice = scanner.nextLine();
        clear();
        switch (choice) {
            case "1":
                System.out.println(SelectName + str + InList);
                printNames(names);
                System.out.print("Enter the team " + str + " number: ");
                int teamNum = 0;
                try{
                    teamNum = Integer.parseInt(scanner.nextLine().trim());
                    team = names[teamNum - 1];
                }
                catch(Exception e){
                    clear();
                    System.out.println(InvalidInput);
                    selectNames(str, names);
                }
                break;
            case "2":
                System.out.print(EnterName + str + ": ");
                team = scanner.nextLine();
                if(team == ""){
                    clear();
                    System.out.println(NoInput);
                    selectNames(str, names);
                }
                break;
            default:
                clear();
                System.out.println(InvalidInput);
                selectNames(str, names);
                break;
        }
        if(team.equals("")){
            clear();
            selectNames(str, names);
        }
        return team;
    }

    // This function creates team
    // returns -> void
    // parameters -> none
    public static void createTeam() {
        String teamName = selectNames("", teamNames).trim();
        clear();
        if (teamName.isEmpty()) {
            return;
        }
        if (alreadyExistTeam(teamName) != null) {
            System.out.println(TeamExist);
        } else if (teamCount >= teams.length) {
            System.out.println(MaxTeam);
        } else {
            teams[teamCount] = new Team(teamName);
            teamCount++;
            System.out.println(TeamCreated);
        }
    }

    // This function add player to team
    // returns -> void
    // parameters -> none
    public static void addPlayerToTeam() {
        clear();
        showTeams();
        Team team = teams[0];
        System.out.print(EnterTeamNumber);
        try {
            int teamIndex = Integer.parseInt(scanner.nextLine().trim());
            team = teams[teamIndex - 1]; 
        } catch (Exception e) {
            clear();
            System.out.println(InvalidInput);
            return;
        }
        if (team == null) {
            System.out.println(TeamNotExist);
            return;
        }
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.print(EnterProfession);
            String profession = scanner.nextLine().trim().toLowerCase();
            if (!profession.equals(Bats) && !profession.equals(Ball) && !profession.equals(Field) && !profession.equals("quit")) {
                clear();
                System.out.println(InvalidProfession);
                addPlayerToTeam();
                return;
            }
            if (profession.equals("quit")) {
                continueLoop = false;
                clear();
                break;
            }
            boolean continueCase = true;
            while (continueCase) {
                clear();
                String[] availablePlayers = getAvailablePlayersByProfession(profession, team);
                if (availablePlayers.length == 0) {
                    System.out.println(NoMoreProfession);
                    continueCase = false;
                    break;
                }
                String playerName = selectNames("member", availablePlayers);
                clear();
                if (team.addPlayer(playerName, profession)) {
                    System.out.println(PlayerAdded);
                } else {
                    System.out.println(PlayerAddedFailed);
                }
                System.out.print(AddAnother + profession + " (y/n): ");
                String choice = scanner.nextLine().trim().toLowerCase();
                if (!choice.equals("y")) {
                    continueCase = false;
                }
            }
        }
    }
    
    // This function retrieves the list of available players (those not yet added to the team)
    // returns -> String Array
    // parameters -> String, Class
    private static String[] getAvailablePlayersByProfession(String profession, Team team) {
        String[] playersByProfession = getPlayerListByProfession(profession);
        String[] availablePlayers = new String[playersByProfession.length];
        int availableIndex = 0;
        for (int i = 0; i < playersByProfession.length; i++) {
            if (!team.hasPlayer(playersByProfession[i])) {
                availablePlayers[availableIndex++] = playersByProfession[i];
            }
        }
        String[] filteredPlayers = new String[availableIndex];
        for (int i = 0; i < availableIndex; i++) {
            filteredPlayers[i] = availablePlayers[i];
        }
        return filteredPlayers;
    }
    
    // Function to get player list by profession (batsman, bowler, fielder)
    // returns -> String Array
    // parameters -> String
    private static String[] getPlayerListByProfession(String profession) {
        switch (profession) {
            case "batsman": return batsman;
            case "bowler": return bowlers;
            case "fielder": return fielders;
            default: return new String[0];
        }
    }

    // This function shows the created teams
    // returns -> void
    // parameters -> none
    public static void showTeams() {
        if (teamCount == 0) {
            System.out.println(NoTeam);
            return;
        }
        System.out.println(ExistingTeam);
        for (int i = 0; i < teamCount; i++) {
            System.out.println((i + 1) + ". " + teams[i].getName());
        }
    }

    // This function shows players in a team
    // returns -> void
    // parameters -> none
    public static void showPlayers(){
        showTeams();
        System.out.print(SelectTeam);
        int input = scanner.nextInt();
        Team team = teams[input - 1];
        team.listPlayers();
    }

    // This function provides valid indexes to other function 
    // returns -> int
    // parameters -> none
    public static int getValidTeamIndex() {
        try {
            int index = Integer.parseInt(scanner.nextLine().trim()) - 1;
            if (index >= 0 && index < teamCount) {
                return index;
            } else {
                System.out.println(InvalidTry);
                return -1;
            }
        } catch (NumberFormatException e) {
            System.out.println(InvalidNumber);
            return -1;
        }
    }

    // This function checks whether the given team already exist or not
    // returns -> class
    // parameters -> String 
    public static Team alreadyExistTeam(String teamName) {
        for (int i = 0; i < teamCount; i++) {
            if (teams[i].getName().equals(teamName)) {
                return teams[i];
            }
        }
        return null;
    }

    // This function selects player in a team for them to play
    // returns -> String Array
    // parameters -> class, int
    public static String[] selectPlayers(Team team, int numberOfPlayers) {
        // int numPlayersToSelect = Math.min(team.getPlayerCount(), MAX_PLAYERS);
        int numPlayersToSelect = numberOfPlayers;
        if (team.getPlayerCount() == 0) {
            System.out.println(NoPlayerAvailable);
            return new String[0];
        }
        team.listPlayers();
        String[] selectedPlayers = new String[numPlayersToSelect];
        int count = 0;
        while (count < numPlayersToSelect) {
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
                        System.out.println();
                    }
                } else {
                    System.out.println(InvalidTry);
                }
            } catch (NumberFormatException e) {
                System.out.println(InvalidNumber);
            }
        }
        return selectedPlayers;
    }
    
    // This function start the match between selected teams
    // returns -> void
    // parameters -> none
    public static void simulateMatchWithPlayerSelection() {
        if (teamCount < 2) {
            System.out.println(NotEnoughTeam);
            return;
        }
        showTeams();
        System.out.print(FirstTeamMember);
        int firstTeamIndex = getValidTeamIndex();
        if (firstTeamIndex == -1) return;
        System.out.print(SecondTeamMember);
        int secondTeamIndex = getValidTeamIndex();
        if (secondTeamIndex == -1 || secondTeamIndex == firstTeamIndex) {
            System.out.println(InvalidChoiceTeam);
            return;
        }
        clear();
        Team firstTeam = teams[firstTeamIndex];
        Team secondTeam = teams[secondTeamIndex];
        System.out.print(NumberPlayer);
        int numberOfPlayers = 0;
        try{
            numberOfPlayers = scanner.nextInt();
        }
        catch(Exception e){
            clear();
            System.out.println(InvalidInput);
            simulateMatchWithPlayerSelection();
        }
        System.out.println(PlayerTeam1);
        String[] selectedPlayersFirstTeam = selectPlayers(firstTeam, numberOfPlayers);
        System.out.println(PlayerTeam2);
        String[] selectedPlayersSecondTeam = selectPlayers(secondTeam, numberOfPlayers);
        clear();
        System.out.println(SelectedPlayerTeam1);
        for (String player : selectedPlayersFirstTeam) {
            System.out.println(player);
        }
        System.out.println(SelectedPlayerTeam2);
        for (String player : selectedPlayersSecondTeam) {
            System.out.println(player);
        }
        System.out.print(EnterOvers);
        int overs = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("\nInning 1: " + firstTeam.getName() + IsBatting);
        int firstTeamScore = simulateInning(overs, firstTeam, secondTeam, selectedPlayersFirstTeam, selectedPlayersSecondTeam);
        System.out.println("\nInning 2: " + secondTeam.getName() + IsBatting);
        int secondTeamScore = simulateInning(overs, secondTeam, firstTeam, selectedPlayersSecondTeam, selectedPlayersFirstTeam);
        System.out.println(FinalScore);
        System.out.println(firstTeam.getName() + Scored + firstTeamScore);
        System.out.println(secondTeam.getName() + Scored + secondTeamScore);
        if (firstTeamScore > secondTeamScore) {
            System.out.println(firstTeam.getName() + Wins);
        } else if (firstTeamScore < secondTeamScore) {
            System.out.println(secondTeam.getName() + Wins);
        } else {
            System.out.println(MatchTie);
        }
    }
    
    // Simulate an inning of cricket with strikers and bowlers
    // returns -> int
    // parameters -> int, two classes, two string array 
    public static int simulateInning(int overs, Team battingTeam, Team bowlingTeam, String[] battingPlayers, String[] bowlingPlayers) {
        int score = 0;
        int wickets = 0;
        int maxBalls = overs * 6;
        int maxWickets = Math.min(battingPlayers.length, MAX_PLAYERS);
        int strikerIndex = selectPlayer(SelectStriker + battingTeam.getName(), battingPlayers);
        int nonStrikerIndex = selectPlayer(SelectNonStriker + battingTeam.getName(), battingPlayers);
        int bowlerIndex = selectPlayer(SelectBowler + bowlingTeam.getName(), bowlingPlayers);
        for (int ball = 1; ball <= maxBalls && wickets < maxWickets; ball++) {
            System.out.print("Ball " + (ball % 6 == 0 ? 6 : ball % 6) + EnterOutcome);
            String outcome = scanner.nextLine().trim().toLowerCase();
            switch (outcome) {
                case "run":
                    System.out.print(RunsScored);
                    int runs = Integer.parseInt(scanner.nextLine().trim());
                    score += runs;
                    if (runs % 2 != 0) {
                        int temp = strikerIndex;
                        strikerIndex = nonStrikerIndex;
                        nonStrikerIndex = temp;
                    }
                    break;
                case "wide":
                    System.out.println(WideBall);
                    score++;
                    ball--; 
                    break;
                case "out":
                    System.out.println("Wicket! " + (++wickets) + WicketDown);
                    strikerIndex = selectPlayer(SelectNewStriker + battingTeam.getName(), battingPlayers);
                    break;
                default:
                    System.out.println(InvalidOutcome);
                    ball--;
                    break;
            }
            if (ball % 6 == 0 || ball == maxBalls || wickets == maxWickets) {
                System.out.println("End of Over " + (ball / 6) + ": " + battingTeam.getName() + " - " + score + "/" + wickets);
                bowlerIndex = selectPlayer("Select a new bowler from " + bowlingTeam.getName(), bowlingPlayers);
            }
        }
        return score;
    }
    
    // This function selects players 
    // returns -> int
    // parameters -> two string
    public static int selectPlayer(String message, String[] players) {
        System.out.println(message);
        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + ". " + players[i]);
        }
        int choice = -1;
        while (choice < 0 || choice >= players.length) {
            System.out.print(SelectPlayerNumber);
            try {
                choice = Integer.parseInt(scanner.nextLine().trim()) - 1;
                if (choice < 0 || choice >= players.length) {
                    System.out.println(InvalidTry);
                }
            } catch (NumberFormatException e) {
                System.out.println(InvalidInputNumber);
            }
        }
        return choice;
    }
}