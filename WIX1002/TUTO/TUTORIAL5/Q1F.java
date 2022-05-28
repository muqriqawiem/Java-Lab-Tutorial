package WIX1002.TUTO.TUTORIAL5;

import java.util.Arrays;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // After initialize the array, modify the value of the above array to

        int arrayOne[][] = { { 6, 9 }, { 2, 5 }, { 4, 6 } };

        arrayOne[1][1] = 4;
        arrayOne[2][0] = 3;
        arrayOne[2][1] = 7;

        System.out.println(Arrays.deepToString(arrayOne));

    }

}
