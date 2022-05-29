package WIX1002.LAB.LAB8;

import java.util.Scanner;

public class Fraction {

    int numerator;
    int denominator;
    int GCD;

    public Fraction() {
    }

    public void set() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Numerator: ");
            this.numerator = sc.nextInt();
            System.out.print("Denominator: ");
            this.denominator = sc.nextInt();
        }
        simplestForm();
    }

    public void simplestForm() {
        int a = numerator;
        int b = denominator;
        int temp = 0;
        if (a >= b) {
            while (b != 0) {
                temp = b;
                b = a % b;
                a = temp;
                this.GCD = a;
            }
        } else {
            while (a != 0) {
                temp = a;
                a = b % a;
                b = temp;
                this.GCD = b;
            }
        }
        this.numerator = numerator / GCD;
        this.denominator = denominator / GCD;
    }

    public void printFraction() {
        System.out.println(numerator + "/" + denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplestForm();
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
        simplestForm();
    }

}
