package WIX1002.TUTO.TUTORIAL2;

import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Write a java program that converts inches to meters. (Given 1 inch equals to 2.54 
        // centimeters). Print the output in two decimal places
        float inch;
        float meter;

        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Enter value in inch: ");
            inch = keyboard.nextFloat();
        }
        meter = (float) (inch * 0.0254);

        System.out.printf(inch + " inches = ");
        System.out.printf("%.2f", meter);
        System.out.printf(" meters");
    }

}