package WIX1002.TUTO.TUTORIAL6;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Define a static method that use to compute combination function C(n,k). C(n,k) gives the
        number of different k-element subsets that can be found in a given set of n elements.
        C(n,k) = n! / (k! (n-k)!
         */

        int N = 5, K = 3;
        System.out.println(functionC(N, K));

    }

    public static double functionC(int n, int k) {
//find factorial for n
        double n_factorial = n;
        for (int i = n - 1; i >= 1; i--) {
            n_factorial *= i;
        }
//find factorial for k
        double k_factorial = k;
        for (int i = k - 1; i >= 1; i--) {
            k_factorial *= i;
        }
//find factorial for (n-k)
        double nk_factorial = n - k;
        for (int i = n - k - 1; i >= 1; i--) {
            nk_factorial *= i;
        }
//C(n,k) = n! / (k! (n-k)!
        double functC = n_factorial / (k_factorial * nk_factorial);
        return functC;
    }

}
