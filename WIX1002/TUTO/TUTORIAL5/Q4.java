package WIX1002.TUTO.TUTORIAL5;


/**
 *
 * @author Muqri Qawiem
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the statements that display the number of occurrence of the word "the" (case
        sensitive) in a string array name sentence. 
         */

        String sentence[] = {"the", "Write", "The", "statements", "that", "display", "the", "number"};
        int occurance = 0;
        for (String elements : sentence) {
            if (elements.indexOf("the") != -1) {
                occurance += 1;
            }
        }
        System.out.println("Total occurance of 'the' in array sentence: " + occurance);

    }

}
