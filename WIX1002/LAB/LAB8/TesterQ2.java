package WIX1002.LAB.LAB8;

import java.util.Scanner;

public class TesterQ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount a = new BankAccount();
        System.out.println("Enetr 1 to deposit, Enter 2 to withdraw, Enter 3 to check balance.");
        int n = sc.nextInt();
        while (n == 1 || n == 2 || n == 3) {
            if (n == 1) {
                System.out.print("Deposit Amount: ");
                double depositAmount = sc.nextDouble();
                a.Deposit(depositAmount);
            } else if (n == 2) {
                System.out.print("Withdraw Amount: ");
                double depositAmount = sc.nextDouble();
                a.Withdraw(depositAmount);
            } else {
                a.printBalance();
            }
            System.out.println("Enetr 1 to deposit, Enter 2 to withdraw, Enter 3 to check balance.");
            n = sc.nextInt();
        }
    }
}