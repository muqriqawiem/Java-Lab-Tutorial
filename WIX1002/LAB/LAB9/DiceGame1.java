package WIX1002.LAB.LAB9;

import java.util.Random;

public class DiceGame1 {

    private String Player1;
    private String Player2;
    private int score1;
    private int score2;
    private int dice1;
    private int dice2;

    public DiceGame1(String Player1, String Player2) {
        this.Player1 = Player1;
        this.Player2 = Player2;
    }

    public void playGame() {
        Random random = new Random();
        while (score1 < 100 || score2 < 100) {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            score1 += dice1 + dice2;
            if (dice1 == dice2) {
                dice1 = random.nextInt(6) + 1;
                dice2 = random.nextInt(6) + 1;
                score1 += dice1 + dice2;
            }
            System.out.println("Score of " + Player1 + ": " + score1);
            if (score1 >= 100) {
                System.out.println(Player1 + "wins" + "\nScore: " + score1);
                break;
            }
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            score2 += dice1 + dice2;
            if (dice1 == dice2) {
                dice1 = random.nextInt(6) + 1;
                dice2 = random.nextInt(6) + 1;
                score2 += dice1 + dice2;
            }
            System.out.println("Score of " + Player2 + ": " + score2);
            if (score2 >= 100) {
                System.out.println(Player2 + "wins" + "\nScore: " + score2);
                break;
            }
        }
    }

}
