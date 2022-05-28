package WIX1002.LAB.LAB6;

public class Q4 {

    public static void main(String[] args) {
        System.out.println("The GCD of (24,8) is " + GCD(24, 8));
        System.out.println("The GCD of (200,625) is " + GCD(200, 625));
    }

    public static int GCD(int valueA, int valueB) {
        int remainder = 10;
        while (remainder > 0) {
            remainder = valueA % valueB;
            valueA = valueB;
            valueB = remainder;
        }
        return valueA;
    }

}
