package WIX1002.LAB.LabReport2;

import java.util.Scanner;

public class Q4 {

    public static int maxSum = 0;

    public static int maxXorSum(int[] a, int[] b) {
        xorSum(0, a, b);

        return maxSum;
    }

    public static void xorSum(int carry, int[] a, int[] b) {
        if (a.length > 1) {
            for (int i = 0; i < a.length; i++) {
                int xor = a[0] ^ b[i];
                int[] newI = removeElement(a, 0);
                int[] newJ = removeElement(b, i);
                xorSum(carry + xor, newI, newJ);
            }
        } else {
            int sum = carry + (a[0] ^ b[0]);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
    }

    public static int[] getIntArrayFromString(String input) {
        String[] stringArray = input.split(",");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);

        }
        return intArray;
    }

    public static int[] removeElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        try (Scanner userinput = new Scanner(System.in)) {
            System.out.println("a = ");
            int[] a = getIntArrayFromString(userinput.nextLine());
            System.out.println("b = ");
            int[] b = getIntArrayFromString(userinput.nextLine());

            System.out.printf("Max sum: %d", maxXorSum(a, b));
        }
    }

}
