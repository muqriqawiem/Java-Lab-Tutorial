package WIX1002.LAB.LAB2;

import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Write a program that converts the seconds to hours, minutes and seconds.
        int second, minute, hour, saat;

        try (Scanner sec = new Scanner(System.in)) {
            System.out.println("Enter the number of seconds: ");
            second = sec.nextInt();
        }
        hour = second / 3600;
        minute = ((second % 3600) / 60);
        saat = ((second % 3600) % 60);

        System.out.println("\n" + second + " seconds is " + hour + " hours, " + minute + " minutes and " + saat + " seconds.");

    }

}
