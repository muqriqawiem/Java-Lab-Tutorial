package WIX1002.LAB.LAB4;

import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        /*
        Write a program that calculates the minimum, maximum, average and standard 
        deviation (s) of the exam score in a subject. The program will accepts the score and 
        quit if negative score is enter. A sample output is given below.
        */
        int currentScore;
        
        
        do{
            try (Scanner number01 = new Scanner(System.in)) {
                System.out.print("Enter a score[negative score to quit]: ");
                currentScore = number01.nextInt();
            }
        }while(currentScore > 0); 
}
    
}

