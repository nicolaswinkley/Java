package app;

public class App {
    public static void main(String[] args) throws Exception {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        //if (score == 5000) {
        //  System.out.println("Your score was 5000");
        //} else if (score < 1000) {
        //    System.out.println("");
        //} else {
        //    System.out.println("Your score was not 5000");
        //}

        // SCOPE - can't access vars created in the code block, outside the code block
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // challenge
        if (gameOver) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}