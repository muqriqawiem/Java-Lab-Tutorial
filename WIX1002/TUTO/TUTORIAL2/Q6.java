package WIX1002.TUTO.TUTORIAL2;

import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6. Write a java program that print the circumference of a circle. The input of the 
        //   program is diameter. Display the result in three decimal places. (Note  = Math.PI)
        double diameter, circumference;
        final double PI = 3.142;

        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Enter the diameter of the circle: ");
            diameter = keyboard.nextFloat();
        }
        circumference = 2 * PI * (diameter / 2);
        System.out.printf("\nThe circumference of the circle is: " + "%.3f", circumference);

    }

}
