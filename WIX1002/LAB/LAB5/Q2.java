package WIX1002.LAB.LAB5;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Muqri Qawiem
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        /*
        Write a program that generates 10 non-duplicate random integers within the range 
        from 0 to 20.
         */
        int tempInteger, countNonDuplicate = 0;
        int[] arrayNumber = new int[10];
        boolean statusNonDuplicate = false;
        //Generate random number for first index
        Random generateRandom = new Random();
        arrayNumber[0] = generateRandom.nextInt(21);
        for (int indexArray = 1; indexArray < arrayNumber.length; indexArray++) {
            tempInteger = generateRandom.nextInt(21);
            for (int indexElements = 0; indexElements < indexArray; indexElements++) {
                if (tempInteger == arrayNumber[indexElements]) {
                    //Duplicate
                    statusNonDuplicate = false;
                    System.out.println("Duplicate value: " + tempInteger);
                    break;
                } else {
                    //Not duplicate
                    statusNonDuplicate = true;
                }
            }
            if (statusNonDuplicate) {//if(statusNonDuplicate == true){
                arrayNumber[indexArray] = tempInteger;
            } else {
                indexArray--;//0
            }
        }
        System.out.println(Arrays.toString(arrayNumber));

    }

}
