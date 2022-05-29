package WIX1002.TUTO.TUTORIAL5;

//import java.util.Arrays;

/**
 *
 * @author Muqri Qawiem
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the statements that display the string array name sentence in reverse order. 
        Each string element must be displayed in reverse order as well
         */

        String sentence[] = {"Write", "the", "statements", "that", "display"};
        for (int words = sentence.length - 1; words >= 0; words--) {
            for (int character = sentence[words].length() - 1; character >= 0; character--) {
                System.out.print(sentence[words].charAt(character));
            }
            System.out.println();

        }
    }
}
