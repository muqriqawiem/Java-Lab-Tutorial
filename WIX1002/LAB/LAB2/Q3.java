package WIX1002.LAB.LAB2;

import java.util.Random;

/**
 *
 * @author Muqri Qawiem
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Write a program that generates three random numbers. The range of the random 
        //number is 10 to 50. Display the three numbers, sum of the numbers and the average in 
        //two decimal places.
        Random rand = new Random();

        int randNum01, randNum02, randNum03, sum;
        float average;

        randNum01 = rand.nextInt(41) + 9;
        randNum02 = rand.nextInt(41) + 9;
        randNum03 = rand.nextInt(41) + 9;

        sum = randNum01 + randNum02 + randNum03;
        average = (sum) / (3);

        System.out.println("Random number one: " + randNum01);
        System.out.println("Random number two: " + randNum02);
        System.out.println("Random number three: " + randNum03);
        System.out.println("The sum of the three random numbers is: " + sum);
        System.out.printf("The average of the three random numbers is: " + "%.2f", average);

    }

}
