package WIX1002.TUTO.TUTORIAL4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        /*
        Write statements for each of the following
         a. Find the largest integer n so that n^3
            is less than 2000.
         b. Display the square number of the first twelve integers starting from 1.
         c. Display a 4-by-5 matrix using random number within 0 to 100.
         d. Compute the sum of numbers from 1 to a given number. 
         e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal 
            places.
        */
        
        
        //a. Find the largest integer n so that n^3 is less than 2000.
        /*
        int n = 1;int sum = 0;
        while((n*n*n)<2000){
            sum  = n + 1;
            n++;
        }
        System.out.println(n-1); 
        */
        
        //b. Display the square number of the first twelve integers starting from 1.
        /*
        int Power2;
        for(int n = 1;n <= 12;n++){
            Power2 = n*n;
            System.out.println(Power2);
        }
        */
        
        //c. Display a 4-by-5 matrix using random number within 0 to 100.
        /*
        int randomNum;
        int totalRow  = 4, totalCol = 5;
        Random genNum = new Random();
        
        
        for(int i_row = 1;i_row <= totalRow;i_row++){
            for(int i_col = 1;i_col <= totalCol;i_col++){
                randomNum = genNum.nextInt(101);
                System.out.print(randomNum + " ");
            }
            System.out.println("");
        }
        */
        

        //d. Compute the sum of numbers from 1 to a given number.
        /*
        int sum = 0,GivenNum;
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        GivenNum = userInput.nextInt();
        
        for(int n = 1;n <= GivenNum;n++){
            sum += n;
        }
        System.out.printf("The sum from 1 to %d is %d. ",GivenNum,sum);
        */
        
        //e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.
        /*
        final int max = 25, min = 1;
        double dividend,divisor = max,sumQ = 0;
        
        for(dividend = min;dividend <= max;dividend++){
            sumQ += dividend/divisor;
            divisor--;
        }
        System.out.printf("The sum of the series: %.2f\n",sumQ);
        */
        }  
    }
