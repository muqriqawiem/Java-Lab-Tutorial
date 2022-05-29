package WIX1002.LAB.LAB5;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Muqri Qawiem
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        /*
        Write a program that generates 20 random integers within the range from 0 to 100. 
        Sort the array in descending order. Then, accepts an integer input from the user. Then, 
        search the array using this number. Compare the performance of linear search and 
        binary search. 
         */

        //Declare or initialize
        int[] arrayNumber = new int[20];
        int hold, searchNumber;
        //generates 20 random integers within the range from 0 to 100
        Random generateRandom = new Random();
        for (int index = 0; index < arrayNumber.length; index++) {
            arrayNumber[index] = generateRandom.nextInt(101);
        }
        System.out.println("A list of 20 random integer within 0 to 100");
        System.out.println(Arrays.toString(arrayNumber));
        // Sort the array in descending order (big to small)
        for (int index = 0; index < arrayNumber.length; index++) {
            for (int indexOthers = index; indexOthers < (arrayNumber.length); indexOthers++) {
                if (arrayNumber[index] < arrayNumber[indexOthers]) {
                    //switch value
                    hold = arrayNumber[index];
                    arrayNumber[index] = arrayNumber[indexOthers];
                    arrayNumber[indexOthers] = hold;
                }
            }
        }
        System.out.println("Array n descending order");
        System.out.println(Arrays.toString(arrayNumber));
        try (// integer input from the user
        Scanner userInput = new Scanner(System.in)) {
            System.out.println("Enter a number to search:");
            searchNumber = userInput.nextInt();
        }
        //search the array using this number
        //Using linear search
        boolean status = false;
        int counter = 0;
        for (int index = 0; index < arrayNumber.length; index++) {
            counter++;
            if (arrayNumber[index] == searchNumber) {
                status = true;
                break;
            }
        }
        if (status) {
            System.out.println(searchNumber + " found");
            System.out.println("Linear Search - " + counter + " loop(s)");
        }
        //Using binary search
        counter = 0;
        status = false;
        int startIndex = 0;
        int endIndex = arrayNumber.length - 1; // because we start with 0
        int middleIndex = (startIndex + endIndex) / 2;
        while (startIndex <= endIndex) {
            counter++;
            if (searchNumber == arrayNumber[middleIndex]) {
                status = true;
                break;
            } else if (searchNumber < arrayNumber[middleIndex]) {
                middleIndex += 1;
                startIndex = middleIndex;
            } else {
                middleIndex -= 1;
                endIndex = middleIndex;
            }
        }
        if (status) {
            System.out.println(searchNumber + " found");
            System.out.println("Binary Search - " + counter + " loop(s)");
        } else {
            System.out.println(searchNumber + " not found");

        }

    }
}

