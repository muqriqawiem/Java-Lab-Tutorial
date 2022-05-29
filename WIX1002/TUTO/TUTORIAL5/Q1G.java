package WIX1002.TUTO.TUTORIAL5;
//import java.util.Arrays;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1g.Display all the values of an array name contact in separate lines.
        String contact[] = {"Name1", "Name2", "Name3", "Name4"};
        //Display array in separate lines
        for (String stringRow : contact) {
            System.out.println(stringRow);
        }
        System.out.println("Display method 1:");
        for (int indexArray = 0; indexArray < contact.length; indexArray++) {
            System.out.println(contact[indexArray]);
        }
        System.out.println();
        System.out.println("Display method 2:");
        for (String elements : contact) {
            System.out.println(elements);
        }
    }
}

