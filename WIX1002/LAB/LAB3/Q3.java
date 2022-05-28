package WIX1002.LAB.LAB3;

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
        Write a program that calculates the total commission receives based on the table 
        below. The program will accept the sales volume and calculate the commission.
        Display the commission in two decimal places.
        */
        
        double SaleVolume,commission,TotalSale;
        
        Scanner number01 = new Scanner(System.in);
        System.out.print("Enter the sales volume: ");
        SaleVolume = number01.nextDouble();
        
        Scanner number02 = new Scanner(System.in);
        System.out.print("Enter the total sale: ");
        TotalSale = number02.nextDouble();
        
        if(SaleVolume <= 100){
            commission = 0.05 *  TotalSale;
            System.out.printf("Your commission is %.2f . ",commission);
        }else if(SaleVolume > 100 && SaleVolume <= 500){
            commission = 0.075 *  TotalSale;
            System.out.printf("Your commission is %.2f . ",commission);
        }else if(SaleVolume >500 && SaleVolume <= 1000){
            commission = 0.01 *  TotalSale;
            System.out.printf("Your commission is %.2f . ",commission);
        }else if(SaleVolume > 1000){
            commission = 0.125 *  TotalSale;
            System.out.printf("Your commission is %.2f . ",commission);
        }
    }
    
}
