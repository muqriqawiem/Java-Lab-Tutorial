package WIX1002.TUTO.TUTORIAL5;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Muqri Qawiem
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the statements that generate 1 random integer within 0 – 255. Convert the 
        number to binary and store the bit into an 8 bit array. Then, display the binary 
        number
         */

        int randomNum;

        Random generate = new Random();
        randomNum = generate.nextInt(256);
        System.out.println("The random number genrated is: " + randomNum);

        int binaryArray[] = new int[8];

        for (int indexBit = binaryArray.length - 1; indexBit >= 0; indexBit--) {
            //Start with the largest index because LSB at 2^0
            binaryArray[indexBit] = randomNum % 2; //to get the remainder
            //Remainder take as binary, Quotient will further divide. Repeat until you get quotient equals to 0.
            //Please refer to Computer System Organization class
            randomNum = randomNum / 2; //to further divede quotient

        }
        System.out.println("Display method 1:");
        System.out.println(Arrays.toString(binaryArray));

    }

}
