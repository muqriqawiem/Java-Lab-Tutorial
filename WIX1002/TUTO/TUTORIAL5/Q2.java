package WIX1002.TUTO.TUTORIAL5;

import java.util.Arrays;

/**
 *
 * @author Muqri Qawiem
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int k = 0; k < num.length; k++) {
        }
        /*
         * c.
         * int [][]t = new int[3][];
         * t[1][2] = 5;
         */
        // c.
        int[][] t = new int[3][];
        t[1] = new int[3];// add the size of column to row 1
        t[1][2] = 5;
        System.out.println(Arrays.deepToString(t));
        /*
         * d.
         * int i=4;
         * int []score = new int[5];
         * score [1] = 78;
         * score[++i] = 100; //++i is same as i = i + 1 (i = 4+1 = 5)
         */
        int i = 4;
        int[] score = new int[5];
        score[1] = 78;
        score[i] = 100;
        // Remember index array start with 0
    }

}
