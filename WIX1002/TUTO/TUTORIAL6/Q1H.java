package WIX1002.TUTO.TUTORIAL6;

import java.util.Random;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1H {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Define a static method that generate random number within 0 – 10. The method will
         return the first random number that generate twice.
         */

        System.out.println(duplicate());

    }

    public static int duplicate() {
        Random generateRandom = new Random();
        int[] countRandom = new int[11]; //Why 11?
        int newRandom;
        while (true) {
            newRandom = generateRandom.nextInt(11);
            if (countRandom[newRandom] == 1) {
                return newRandom;
            } else {
                countRandom[newRandom] = 1;
            }
        }
    }

}
