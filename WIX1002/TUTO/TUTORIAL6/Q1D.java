package WIX1002.TUTO.TUTORIAL6;

import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Define a static method that used to determine whether the parameter is a pentagonal
         number. A pentagonal number is a figurate number that extends the concept of
         triangular and square numbers to the pentagon. Pn = ½ n(3n -1).
         */

        int inputNumber;
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Please enter an integer number:");
            inputNumber = userInput.nextInt();
        }
        //Call Java method here
        System.out.println("Is " + inputNumber + " a pentagonal number?");
        System.out.println(checkPentagonal(inputNumber));
    }
    //Java method to determine pentagonal

    public static boolean checkPentagonal(int numberA) {
//Pn = 1/2n(3n-1)
        int pentagonal = 0, n = 1;
        while (pentagonal <= numberA) {
            pentagonal = (n * (3 * n - 1) / 2);
            if (pentagonal == numberA) {
//numberA is a pentagonal
                return true;
            } else {
                n++;
            }
        }
        return false;
    }

}
