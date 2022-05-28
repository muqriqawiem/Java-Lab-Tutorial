package WIX1002.LAB.LAB2;

import java.util.Random;

/**
 *
 * @author Muqri Qawiem
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Write a program that generates one random number. The range of the random 
        //number is 0 to 10000. Display the number and the sum of all the digits in the number.
        Random rand = new Random();

        int randomNum01;

        randomNum01 = rand.nextInt(10001);

        System.out.println("The random number is: " + randomNum01);

    }

}
