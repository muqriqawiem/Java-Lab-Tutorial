package WIX1002.TUTO.TUTORIAL6;

import java.util.Random;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Define a static void method that generates 10 random numbers within 0 to 100 to the
        method’s parameter. The random numbers can be accessed by the main method
         */

        int[] arrayA = new int[10];
        generateRandom(arrayA);
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }

    }

    public static void generateRandom(int[] arrayB) {
        final int MAX = 101;
        Random generateRandom = new Random();
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = generateRandom.nextInt(MAX);
        }
    }

}
