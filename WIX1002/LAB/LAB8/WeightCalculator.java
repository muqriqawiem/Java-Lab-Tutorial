package WIX1002.LAB.LAB8;

import java.util.Scanner;

public class WeightCalculator {

    int age;
    double height;
    double weight;

    public WeightCalculator() {
        this.age = 0;
        this.height = 0;
        this.weight = 0;
    }

    public void setAll() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            this.age = sc.nextInt();
            System.out.print("Enter height: ");
            this.height = sc.nextInt();
        }
        this.weight = (height - 100 + age / 10) * 0.9;
    }

    @Override
    public String toString() {
        return "Age: " + age + "\nHeight: " + height + "\nRecommended weight: " + weight;
    }
}
