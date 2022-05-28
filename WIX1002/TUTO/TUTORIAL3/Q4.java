import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        /*
        Write the java statements that used the if statement to find the biggest number among 
        three given integers.
        */
        
        int num1,num2,num3;
        
        try (Scanner integer01 = new Scanner(System.in)) {
            System.out.println("Enter any integer: ");
            num1 = integer01.nextInt();
        }
        try (Scanner integer02 = new Scanner(System.in)) {
            System.out.println("Enter any integer: ");
            num2 = integer02.nextInt();
        }
        try (Scanner integer03 = new Scanner(System.in)) {
            System.out.println("Enter any integer: ");
            num3 = integer03.nextInt();
        }
        if( num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the biggest number among the three numbers you entered. ");
        }else if( num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the biggest number among the three numbers you entered. ");
        }else{
            System.out.println(num3 + " is the biggest number among the three numbers you entered. ");
        }
        
    }
    
}
