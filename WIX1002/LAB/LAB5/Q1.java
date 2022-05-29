package WIX1002.LAB.LAB5;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        /*
        Write a program to randomly generate N student scores (0-100). The program will 
        prompt the user to enter N students and store the score in an array. Then, the program 
        will display a list of score, the highest score, the lowest score and the average score.
         */

        int N_students;
        int maxScore = 0, minScore = 100, sum = 0;

        try (//prompt user to input N students
        Scanner userInput = new Scanner(System.in)) {
            System.out.print("Please enter the number of students: ");
            N_students = userInput.nextInt();
        }
        int arrayScore[] = new int[N_students];

        for (int index = 0; index < arrayScore.length; index++) { //for(int index=0;index <N_students;index++){
            //randomly generate N student scores (0-100)
            Random generateRandom = new Random();
            arrayScore[index] = generateRandom.nextInt(101);

            if (arrayScore[index] > maxScore) {
                maxScore = arrayScore[index];
            }
            if (arrayScore[index] <= minScore) {
                minScore = arrayScore[index];
            }
            sum += arrayScore[index];
        }

        //display a list of score
        System.out.println(Arrays.toString(arrayScore));
        // highest score, the lowest score and the average score
        System.out.println("The highest score: " + maxScore);
        System.out.println("The lowest score: " + minScore);
        System.out.println("The average score: " + (sum / arrayScore.length));

    }
}
