package WIX1002.TUTO.TUTORIAL5;

import java.util.Arrays;
/**
 *
 * @author Muqri Qawiem
 */
public class Q1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        /*
        Declare an array that used to store 12 floating point numbers.
        */
        
        float[]arrayFloat = new float[12];
        //Fill the array
        Arrays.fill(arrayFloat, 8.8f);
        //Display array
        //Various ways to print the array such as using loop or as Arrays.toString
        System.out.println(Arrays.toString(arrayFloat));
    }
    
}
