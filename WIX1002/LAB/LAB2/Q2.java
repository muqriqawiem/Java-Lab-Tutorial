package WIX1002.LAB.LAB2;

import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Write a program to calculate the monthly payment for car loan. The following are the 
        // inputs of the program. Output the monthly payment in two decimal places.
        float p, d, r, y, m;

        try (Scanner PriceCar = new Scanner(System.in)) {
            System.out.println("Enter value for the price of the car: ");
            p = PriceCar.nextFloat();
        }
        try (Scanner DownPayment = new Scanner(System.in)) {
            System.out.println("Enter value for down payment: ");
            d = DownPayment.nextFloat();
        }
        try (Scanner InterestRate = new Scanner(System.in)) {
            System.out.println("Enter value for interest rate in % : ");
            r = InterestRate.nextFloat();
        }
        try (Scanner LoanDuration = new Scanner(System.in)) {
            System.out.println("Enter value for the loan duration: ");
            y = LoanDuration.nextFloat();
        }
        m = ((p - d) * ((1 + r * y) / (100)) / (y * 12));

        System.out.printf("The monnthly payment is: " + "%.2f", m);
    }

}
