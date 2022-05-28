package WIX1002.LAB.LAB8;

import java.util.Random;
import java.util.Scanner;

public class Game {

    String name;
    int totalValue;

    public Game() {
    }

    public void setAll() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = sc.nextLine();
    }

    public int dice() {
        Random rd = new Random();
        return (rd.nextInt(6) + 1);
    }

    public void updatePosition() {
        totalValue += dice();
    }

    public void printTotalValue() {
        System.out.println(name + "'s position: " + totalValue);
    }

    public void Win() {
        if (totalValue >= 100) {
            System.out.println(name + " wins!");
            System.exit(0);
        }
    }
}
