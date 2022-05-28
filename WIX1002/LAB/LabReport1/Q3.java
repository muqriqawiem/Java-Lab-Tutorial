package WIX1002.LAB.LabReport1;

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
        double a,b,c,x1,x2;
        
        Scanner userInput = new Scanner (System.in);
        
        System.out.println("The quadratic equation is ax2 + bx + c ");
        
        do{
            //Enter digit for a
            System.out.print("Please enter value for a (between 1 - 9): ");
            a = userInput.nextDouble();
            }while ((a <= -10) || (a >= 10));
        
        do{
            //Enter digit for b
            System.out.print("Please enter a value for c (between 1 - 9): ");
            b = userInput.nextDouble();
            }while ((b <= -10) || (b >= 10));
        
        do{
            //Enter digit for c
            System.out.print("Please enter a valus for c (between 1 - 9): ");
            c = userInput.nextDouble();
            }while ((c <= -10) || (c >= 10));
        
        //Process input
        x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        
        //output results
        if ((b*b-4*a*c) < 0){
            System.out.println("This quadratic equation has no root. ");
            System.out.println("No solution. ");
        }else if ((b*b-4*a*c) > 0){
            System.out.println("This quadratic equation has 2 roots. ");
            System.out.printf("x = %.2f\n", x1);
            System.out.printf("x = %.2f\n", x2);
        }else if ((b*b-4*a*c) == 0){
            System.out.println("This quadratic equation has only 1 root. ");
            System.out.printf("x = %.2f\n", x1);
        }
    }
    
}
