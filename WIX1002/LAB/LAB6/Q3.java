package WIX1002.LAB.LAB6;

import java.util.Random;

public class Q3 {

    public static void main(String[] args) {
        int[] arrayRandom = new int[10];
        Random generateRandom = new Random();
        System.out.println("Original array:");
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = generateRandom.nextInt(10);
            System.out.print(arrayRandom[i]);
        }
        System.out.println();
        System.out.println("Reverse array:");
        int[] reverseArray = reverseOrder(arrayRandom);
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.print(reverseArray[i]);
        }
        System.out.println();
    }

    public static int[] reverseOrder(int[] a) {
        int[] newA = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            newA[a.length - 1 - i] = a[i];
        }
        return newA;
    }

}
