package WIX1002.LAB.LabReport2;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1 {

    public static void main(String[] args) {
        /*
        Write a Java method that accepts an integer array as parameter and returns
        the median of the array in double
         */

        int NumOfElement;
        
        try (//ask user about the elements inside the array
        Scanner sc = new Scanner(System.in)) {
            System.out.print("How many elements do you want to have in the array? : ");
            NumOfElement = sc.nextInt();

            int[] arrayA = new int[NumOfElement];
            System.out.println("\nEnter " + NumOfElement + " elements: ");

            for (int i = 0; i < NumOfElement; i++) {
                arrayA[i] = sc.nextInt();
            }

            System.out.println("\n" + Arrays.toString(arrayA));

            double medianAns = CalcMedian(arrayA);
            System.out.println("\nMedian: " + medianAns);
        }

    }

    public static double CalcMedian(int[] arrayB){
        // sort the array
        Arrays.sort(arrayB);
        
        double median;
        
        // get count of scores
        int totalElements = arrayB.length;
        // check if total number of scores is even
        if (totalElements % 2 == 0) {
            int sumOfMiddleElements = arrayB[totalElements / 2] + arrayB[totalElements / 2 - 1];
            // calculate average of middle elements
            median = ((double) sumOfMiddleElements) / 2;
        } else {
            // get the middle element
            median = (double) arrayB[arrayB.length / 2];
        }
        return median;
    }

}
