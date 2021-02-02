import java.util.Scanner;

public class BasketballDemo {
    public static void main(String[] args) {

        char teamEnteredChar;
        int teamEnteredInt;
        int scoreEntered;
        char shouldContinue;
        Scanner keyboard = new Scanner(System.in);
        BasketballGame bigGame = new BasketballGame("Zoomies", "Slurpies");

        System.out.println(
            "Welcome to the long awaited Zoomies vs. Slurpies basketball game!\n" +
            "Tonight, you control the score!\n" +
            "When prompted, enter a letter (a: Zoomies, b: Slurpies) and score to change the standings.\n" +
            "Example: \"b 2\" adds two points to the Slurpies score.\n" +
            "With that, you are ready to go. Begin!\n"
        );

        while (bigGame.getGameInProgress()) {
            System.out.print("Enter a score: ");

            teamEnteredChar = keyboard.next().charAt(0);
            switch (teamEnteredChar) {
            case 'a':
                teamEnteredInt = 1;
                break;
            case 'b':
                teamEnteredInt = 2;
                break;
            default:
                System.out.println("ERROR: Invalid team entered. Valid input: a, b"); 
                continue;
            }

            scoreEntered = keyboard.nextInt();
            switch (scoreEntered) {
            case 1:
                bigGame.teamScoredOne(teamEnteredInt);
                break;
            case 2:
                bigGame.teamScoredTwo(teamEnteredInt);
                break;
            case 3:
                bigGame.teamScoredThree(teamEnteredInt);
                break;
            default:
                System.out.println("ERROR: Invalid score entered. Valid input: 1, 2, 3");
                continue;
            }

            System.out.println(
                bigGame.getTeam1Name() + " " + bigGame.getTeam1Score() + ", " + 
                bigGame.getTeam2Name() + " " + bigGame.getTeam2Score() + ". " + 
                bigGame.winningTeamName() + " are winning."
            );
            System.out.print("Continue (y/n)? ");
            shouldContinue = keyboard.next().charAt(0);
            if (shouldContinue == 'n') {
                keyboard.close();
                bigGame.finishGame();
            }
        }

        System.out.println("The game has finished! The winners are ... " + bigGame.winningTeamName() + "!");

    }
}

public class BasketballGame {

    private String team1Name, team2Name;
    private int team1Score, team2Score;
    private boolean gameInProgress;

    BasketballGame(String t1n, String t2n) {
        team1Name = t1n;
        team2Name = t2n;
        team1Score = team2Score = 0;
        gameInProgress = true;
    }

    public void teamScoredOne(int team) {
        if (team == 1) team1Score++;
        else if (team == 2) team2Score++;
    }

    public void teamScoredTwo(int team) {
        if (team == 1) team1Score += 2;
        else if (team == 2) team2Score += 2;
    }

    public void teamScoredThree(int team) {
        if (team == 1) team1Score += 3;
        else if (team == 2) team2Score += 3;
    }

    public void finishGame() {
        gameInProgress = false;
    }

    public String winningTeamName() {
        return team1Score > team2Score ? team1Name : team2Score > team1Score ? team2Name : "Neither";
    }

    public String getTeam1Name() {
        return team1Name;
    }

    public void setTeam1Name(String name) {
        team1Name = name;
    }

    public String getTeam2Name() {
        return team2Name;
    }

    public void setTeam2Name(String name) {
        team2Name = name;
    }

    public int getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(int score) {
        team1Score = score;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(int score) {
        team2Score = score;
    }

    public boolean getGameInProgress() {
        return gameInProgress;
    }

    public void setGameInProgress(boolean inProgress) {
        gameInProgress = inProgress;
    }

}