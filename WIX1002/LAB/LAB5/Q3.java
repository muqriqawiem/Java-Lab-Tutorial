package WIX1002.LAB.LAB5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        /*
        Write a program that randomly generate the seven day work hours (1-8 hours) for N 
        employee. Then, display the work hours in seven days and the total hours for each 
        employee. 
        */
        
        final int MaxHour = 8;
        int N, totalHoursEmployee, totalDay = 7;
        
        //prompt user to enter N employee
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        N = userInput.nextInt();
        
        //Work hours
        int [][]hours = new int [N][7];
        int []totalHours = new int [N];
        
        //Day in a week
        String day = "N MON TUE WED THU FRI SAT SUN TOTAL HOURS";
        System.out.println(day);
        
        Random generateRandom = new Random();
        
        //get hours for each employee
        for(int indexN = 0;indexN < N;indexN++){
            for(int indexDay = 0;indexDay < totalDay;indexDay++){
                hours[indexN][indexDay] = generateRandom.nextInt(MaxHour + 1);
                totalHours[indexN] += hours[indexN][indexDay]; //sum = sum + hours
            }
        }
        
        //display work hours
        for(int indexN = 0;indexN < N;indexN++){
            System.out.print((indexN + 1) + "  ");
            for(int indexDay = 0;indexDay < totalDay;indexDay++){
                System.out.print(hours[indexN][indexDay] + " ");
            }
            System.out.print(" " + totalHours[indexN]);
            System.out.println();
        }
    }
    
}
