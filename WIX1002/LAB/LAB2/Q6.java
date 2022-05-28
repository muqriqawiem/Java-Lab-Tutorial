package WIX1002.LAB.LAB2;

import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Write a program that calculates the energy needed to heat water. 
        float WaterGram, InitialTempFahre, FinalTempFahre, WaterKilogram, energy, InitialTempCelcius, FinalTempCelcius;

        Scanner WaterInGram = new Scanner(System.in);
        System.out.println("Enter the amount of water in gram: ");
        WaterGram = WaterInGram.nextFloat();

        Scanner InitialTempFahrenheit = new Scanner(System.in);
        System.out.println("Enter the initial temperature in Fahrenheit: ");
        InitialTempFahre = InitialTempFahrenheit.nextFloat();

        Scanner FinalTempFahrenheit = new Scanner(System.in);
        System.out.println("Enter the final temperature in Fahrenheit: ");
        FinalTempFahre = FinalTempFahrenheit.nextFloat();

        WaterKilogram = WaterGram / 1000;
        InitialTempCelcius = (float) ((InitialTempFahre - 32) * (0.5555));
        FinalTempCelcius = (float) ((FinalTempFahre - 32) * (0.5555));
        energy = ((WaterKilogram * (FinalTempCelcius - InitialTempCelcius) * 4184) / 1000);

        System.out.printf("\nThe water weight in kilogram is " + "%.2f", WaterKilogram);
        System.out.print("kg. ");
        System.out.printf("\nThe initial temperature in degree Celcius is " + "%.1f", InitialTempCelcius);
        System.out.print(" degree Celcius. ");
        System.out.printf("\nThe final temperature in degree Celcius is " + "%.1f", FinalTempCelcius);
        System.out.print(" degree Celcius. ");
        System.out.printf("\n\nThe energy needed is " + "%.2f", energy);
        System.out.print(" Joules. ");

    }

}
