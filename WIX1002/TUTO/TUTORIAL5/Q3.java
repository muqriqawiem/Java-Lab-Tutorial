package WIX1002.TUTO.TUTORIAL5;

//import java.util.Arrays;

/**
 *
 * @author Muqri Qawiem
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Determine the values of each element of array marks.

        int[] marks = new int[5];
        int i = 0, j = 1;
        marks[i] = 12;
        marks[j] = marks[i] + 19;
        marks[j - 1] = marks[j] * marks[j];
        marks[j * 3] = marks[i + 1];
        marks[++j] = marks[i] % 5;
        marks[2 * j] = marks[j - 1];
        
        /*
        
        i = 0, j = 1
        
        marks[0] = 12
        marks[1] = 12 + 19
        marks[0] = (12+19) * (12+19)
        marks[3] = 12+19
        marks[4] = 12 % 5
        marks[2] = 12
        */
        
        /*
        Answer:
        marks[0] = (12+19)*(12+19)
        marks[1] = 12+19
        marks[2] = 12
        marks[3] = 12+19
        marks[4] = 12%5
        */

    }

}
