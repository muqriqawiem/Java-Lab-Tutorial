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
        Write the java statements that determine whether the Leap year. A Leap year is 
        divisible by 4 but not by 100. However, a Leap year is also divisible by 400
        */
        
        int year;
        
        try (Scanner input = new Scanner (System.in)) {
            System.out.println("Enter a year: ");
            year = input.nextInt();
        }
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }
    }
    
}
