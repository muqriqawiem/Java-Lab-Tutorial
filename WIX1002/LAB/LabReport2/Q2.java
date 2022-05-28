package WIX1002.LAB.LabReport2;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        try (//create a scanner object
                Scanner j = new Scanner(System.in)) {
            //read an integer
            System.out.println("Enter an integer: ");
            int n = j.nextInt();

            System.out.println(q2(n));
        }

    }

    public static String q2(int n) {
        String num = "";

        //convert n to its binary form
        String binary = "";
        while (n != 0) {
            binary += String.valueOf(n % 2);
            n /= 2;
        }

        //get powers of 2 according to places of ones in binary string
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                num = num + " + " + String.valueOf((int) Math.pow(2, i));
            }
        }

        return num.substring(3, num.length());
    }
}
