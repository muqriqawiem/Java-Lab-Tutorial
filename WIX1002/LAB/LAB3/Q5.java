package WIX1002.LAB.LAB3;

import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        /*
        Cramer’s rule is used to solve the linear equations.
        ax + by = e, cx + dy = f; x = (ed-bf)/(ad-bc) y=(af-ec)/(ad-bc)
        Write a program that ask the user to enter a, b, c, d, e, f. and display the result of x 
        and y. If ad – bc is equal to 0. Display "The equation has no solution"
        */
        
        int a,b,c,d,e,f,x,y;
        
        System.out.println("ax + by = e \t cx + dy = f\n");
        
        try (Scanner number01 = new Scanner(System.in)) {
            System.out.print("Enter value for a: ");
            a = number01.nextInt();
        }
        try (Scanner number02 = new Scanner(System.in)) {
            System.out.print("Enter value for b: ");
            b = number02.nextInt();
        }
        try (Scanner number03 = new Scanner(System.in)) {
            System.out.print("Enter value for c: ");
            c = number03.nextInt();
        }
        try (Scanner number04 = new Scanner(System.in)) {
            System.out.print("Enter value for d: ");
            d = number04.nextInt();
        }
        try (Scanner number05 = new Scanner(System.in)) {
            System.out.print("Enter value for e: ");
            e = number05.nextInt();
        }
        try (Scanner number06 = new Scanner(System.in)) {
            System.out.print("Enter value for f: ");
            f = number06.nextInt();
        }
        if( ((a*d)-(b*c)) == 0){
            System.out.println("\nThe equation has no solution. ");
        }else{
            x = (((e*d)-(b*f))/((a*d)-(b*c)));
            y = (((a*f)-(e*c)) /((a*d)-(b*c)));
            
            System.out.printf("\nX is " + x);
            System.out.println("Y is "+ y);
        }
    }
    
}
