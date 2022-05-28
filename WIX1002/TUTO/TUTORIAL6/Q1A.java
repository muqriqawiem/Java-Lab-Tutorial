package WIX1002.TUTO.TUTORIAL6;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Define a static method that returns the maximum number from 3 integer parameters.

        int inputA = 5, inputB = 9, inputC = 6;
        System.out.println("The largest integer is: " + getMAX(inputA, inputB, inputC));

    }

    public static int getMAX(int A, int B, int C) {
        if (A > B && A > C) {
            return A;
        } else if (B > A && B > C) {
            return B;
        } else {
            return C;
        }
    }

}
