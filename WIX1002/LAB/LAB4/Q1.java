package WIX1002.LAB.LAB4;

import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        /*
        Write a program that accepts an integer from user. Then, display its entire factors in increasing order.
        */
        int number;
        try (Scanner number01 = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            number = number01.nextInt();
        }
        System.out.printf("\nFactors of %d are: ",number);
        
        for(int i = 1;i <= number;++i){
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    
}
