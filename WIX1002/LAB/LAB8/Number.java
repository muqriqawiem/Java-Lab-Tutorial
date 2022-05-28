package WIX1002.LAB.LAB8;

import java.util.Random;

public class Number {

    private int n;
    private int max;
    private int[] num;

    public Number(int n, int max) {
        this.n = n;
        this.max = max;
        Random rd = new Random();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = rd.nextInt(max + 1);
        }
        this.num = number;
    }

    public Number() {
        Random rd = new Random();
        n = 10;
        max = 100;
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = rd.nextInt(max + 1);
        }
        this.num = number;
    }

    public Number(int n) {
        Random rd = new Random();
        this.n = n;
        max = 100;
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = rd.nextInt(max + 1);
        }
        this.num = number;
    }

    public void printAll() {
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public void printPrime() {
        System.out.print("Prime number: ");
        for (int i = 0; i < n; i++) {
            boolean prime = true;
            if (num[i] < 2) {
                prime = false;
                continue;
            }
            for (int j = 2; j <= num[i] / 2; j++) {
                if (num[i] == 2) {
                    break;
                } else if (num[i] % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
    }

    public void printEven() {
        System.out.print("Even number: ");
        for (int i = 0; i < n; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
    }

    public void printSq() {
        System.out.print("Square number: ");
        for (int i = 0; i < n; i++) {
            if (Math.sqrt(num[i] * 1.0) % 1 == 0) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
    }

    public void printMax() {
        System.out.print("Max number: ");
        int max = num[0];
        for (int i = 1; i < n; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(max);
    }

    public void printMin() {
        System.out.print("Min number: ");
        int min = num[0];
        for (int i = 1; i < n; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println(min);
    }

    public void printAverage() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += num[i];
        }
        System.out.println("Average: " + ((sum * 1.0) / n));
    }
}
