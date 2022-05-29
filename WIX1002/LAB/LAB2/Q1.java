package WIX1002.LAB.LAB2;

import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Write a program that convert the temperature in degree Fahrenheit to degree Celsius. 
        // The program will display the degree Celsius in two decimal places.  Celsius = (Fahrenheit – 32) / 1.8
        float fahrenheit, celcius;

        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Enter temperature in degree Fahrenheit: ");
            fahrenheit = keyboard.nextFloat();
        }
        celcius = (float) ((fahrenheit - 32) / 1.8);

        System.out.printf("\nThe temperature in degree Celcius is " + "%.2f", celcius);
        System.out.print(" degree Celcius. ");

    }

}
