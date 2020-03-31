package app;

public class App {
    public static void main(String[] args) throws Exception {
        int newScore = calculateScore("Tim", 500);
        System.out.println("Unknown player score is " + newScore);
        calculateScore(500);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
}