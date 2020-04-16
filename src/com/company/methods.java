package com.company;

public class methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1200;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore  = calculateScore(true, 800, 5, 100 );
        System.out.println("highScore is: " + highScore);
        displayHighScorePosition("Rahul Verma", calculateHighScorePosition(highScore));
        highScore  = calculateScore(true, 10000, 8, 200);
        System.out.println("highScore is: " + highScore);
        displayHighScorePosition("Neeraj Verma", calculateHighScorePosition(highScore));
        highScore  = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("highScore is: " + highScore);
        displayHighScorePosition("Atul Verma", calculateHighScorePosition(highScore));
    }

    public static int calculateScore(boolean gameOver, int score,
                                      int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted + bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int rank ) {
        System.out.println("Player " + playerName +
                           " has received " + rank +
                           " in highscore table" );
    }
    public static int calculateHighScorePosition(int highScore) {
        if (highScore >= 1000) {
            return 1;
        } else if (highScore >= 500 && highScore < 1000) {
            return 2;
        } else if (highScore >= 100 && highScore < 500) {
            return 3;
        } else{
            return 4;
        }
    }
}
