package WIX1002.LAB.LAB3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write a simple two players dice game. Each player will roll the dice twice and the 
        player with the highest score wins the game. 
         */
        int dice01, dice02, dice03, dice04, sum01, sum02;
        String player01;

        try (Scanner number01 = new Scanner(System.in)) {
            System.out.print("Are you player one? If not, type [no]. If yes type [ready] to start. ");
            player01 = number01.next();
        }
        if ("ready".equals(player01)) {
            Random rand01 = new Random();
            dice01 = rand01.nextInt(5) + 1;
            System.out.println("\nFirst throw is " + dice01);

            Random rand02 = new Random();
            dice02 = rand02.nextInt(5) + 1;
            System.out.println("Second throw is " + dice02 + ". ");

            sum01 = dice01 + dice02;
            System.out.println("Player One score is " + sum01 + ". ");

            Random rand03 = new Random();
            dice03 = rand03.nextInt(5) + 1;
            System.out.println("\nFirst throw is " + dice03 + ". ");

            Random rand04 = new Random();
            dice04 = rand04.nextInt(5) + 1;
            System.out.println("Second throw is " + dice04 + ". ");

            sum02 = dice03 + dice04;
            System.out.println("Player Two score is " + sum02 + ". ");

            if (sum01 > sum02) {
                System.out.println("\nPlayer One wins! ");
            } else if (sum02 > sum01) {
                System.out.println("\nPlayer Two wins! ");
            } else if (sum01 == sum02) {
                System.out.println("\nNo winners. ");
            }
        } else if ("no".equals(player01)) {
            Random rand01 = new Random();
            dice03 = rand01.nextInt(5) + 1;
            System.out.println("\nFirst throw is " + dice03 + ". ");

            Random rand02 = new Random();
            dice04 = rand02.nextInt(5) + 1;
            System.out.println("Second throw is " + dice04 + ". ");

            sum02 = dice03 + dice04;
            System.out.println("Player Two score is " + sum02 + ". ");

            Random rand03 = new Random();
            dice03 = rand03.nextInt(5) + 1;
            System.out.println("\nFirst throw is " + dice03 + ". ");

            Random rand04 = new Random();
            dice04 = rand04.nextInt(5) + 1;
            System.out.println("Second throw is " + dice04 + ". ");

            sum01 = dice03 + dice04;
            System.out.println("Player One score is " + sum01 + ". ");

            if (sum01 > sum02) {
                System.out.println("\nPlayer One wins! ");
            } else if (sum02 > sum01) {
                System.out.println("\nPlayer Two wins! ");
            } else if (sum01 == sum02) {
                System.out.println("\nNo winners. ");
            }
        }

    }

}
