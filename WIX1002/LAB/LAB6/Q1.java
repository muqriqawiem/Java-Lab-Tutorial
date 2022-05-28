package WIX1002.LAB.LAB6;

public class Q1 {

    public static void main(String[] args) {
        final int n_triangular = 20;
        System.out.print("The first " + n_triangular + " triangular numbers:");
        for (int i = 1; i <= n_triangular; i++) {
            System.out.println("n = " + i + " is " + calculateTriangular(i));
        }

    }

    public static int calculateTriangular(int n) {
    //formula:1+2+3+…+ n
    //Simply sum
        int sumN = 0;
        for (int i = 1; i <= n; i++) {
            sumN += i;
        }
        return sumN;
    }
}