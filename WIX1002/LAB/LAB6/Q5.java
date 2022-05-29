package WIX1002.LAB.LAB6;

import java.util.Scanner;
import java.util.Random;

public class Q5 {

    public static void main(String[] args) {
        int A, B, ANS, quit = 0, countScore = 0;
        try (Scanner userInput = new Scanner(System.in)) {
            Random generateRandom = new Random();
            while (quit >= 0) {
                A = generateRandom.nextInt(13);
                B = generateRandom.nextInt(13);
                System.out.println("Please enter a negative number to quit.");
                System.out.println(A + " x " + B + " = ");
                ANS = userInput.nextInt();
                if (ANS < 0) {
                    break;
                } else {
                    if (checkMultiplication(A, B, ANS) == true) {
                        countScore++;
                    }
                }
            }
        }
        System.out.println("Your score is " + countScore);
    }

    public static boolean checkMultiplication(int valueA, int valueB, int valueAns) {
        if (valueA * valueB == valueAns) {
            return true;
        } else {
            return false;
        }
    }
}
