package WIX1002.TUTO.TUTORIAL6;

import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//Define a static method that determine whether the given integer is a square number.
//Declare or initialize variables
        int intInput;
try (//Ask the user to enter an integer
        Scanner userInput = new Scanner(System.in)) {
            System.out.println("Please enter an integer:");
            intInput = userInput.nextInt();
        }
        //Call method to determine if integer is a square number
        System.out.println("Is integer a square number?");
        System.out.println(checkSquareNumber(intInput));

    }

    public static boolean checkSquareNumber(int checkNumber) {
//Brute force
        int guessNum = 1;
        while (guessNum * guessNum <= checkNumber) {
            if (guessNum * guessNum == checkNumber) {
//checkNumber is a square number
                return true;
            } else {
//checkNumber is NOT a square number
                guessNum++;
            }
        }
        return false;
    }

}
