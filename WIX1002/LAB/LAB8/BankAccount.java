package WIX1002.LAB.LAB8;

import java.util.Scanner;

public class BankAccount {

    String name;
    String IC;
    String passportNumber;
    double depositAmount;

    public BankAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your personal infomation");
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("IC: ");
        this.IC = sc.nextLine();
        System.out.print("Passport number: ");
        this.passportNumber = sc.nextLine();
        System.out.print("Deposit Amount: ");
        this.depositAmount = sc.nextDouble();
    }

    public void Deposit(double deposit) {
        System.out.println("Balance before transfer: " + depositAmount);
        depositAmount += deposit;
        System.out.println("Balance after transfer: " + depositAmount);
    }

    public void Withdraw(double withdraw) {
        System.out.println("Balance before transfer: " + depositAmount);
        depositAmount -= withdraw;
        System.out.println("Balance after transfer: " + depositAmount);
    }

    public void printBalance() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + depositAmount);
    }
}

