package WIX1002.LAB.LAB3;

import java.util.Random;

/**
 *
 * @author Muqri Qawiem
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        /*
        Generate a random integer within 0 to 5 and display the integer in word.
        */
        
        int randomnum01;
        
        Random rand = new Random();
        randomnum01 = rand.nextInt(6)-1;
        //System.out.println("The random number is: " + randomnum01);
        
        if(randomnum01 == 0){
            System.out.println(randomnum01 + " is zero. ");
        }else if(randomnum01 == 1){
            System.out.println(randomnum01 + " is one. ");
        }else if(randomnum01 == 2){
            System.out.println(randomnum01 + " is two. ");
        }else if(randomnum01 == 3){
            System.out.println(randomnum01 + " is three. ");
        }else if(randomnum01 == 4){
            System.out.println(randomnum01 + " is four. ");
        }else if(randomnum01 == 5){
            System.out.println(randomnum01 + " is five. ");
        }
    }
    
}
