package WIX1002.TUTO.TUTORIAL6;

import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Define a static method that displays the number of letters and the number of digits of a
        String parameter.
         */

        String inputString;
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Please enter a string (letter + numbers):");
            inputString = userInput.nextLine();
        }
        //Call java method here
        countCharacter(inputString);
    }

    public static void countCharacter(String userString) {
        int countDigit = 0;
        int countLetter = 0;
        for (int i = 0; i < userString.length(); i++) {
//Count number
            if (Character.isDigit(userString.charAt(i))) {
                countDigit++;
            }
            if (Character.isLetter(userString.charAt(i))) {
                countLetter++;
            }
        }
        System.out.println("Total number of digit: " + countDigit);
        System.out.println("Total number of letters: " + countLetter);
    }

}
