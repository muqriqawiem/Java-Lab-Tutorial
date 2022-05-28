package WIX1002.FinalExam.src;

//U2000726

import java.util.Random;

public class U2000726Q1 {

    public static void main(String[] args) {
        double RandomPriceValue1, RandomPriceValue2, RandomPriceValue3;
        int year;
        char c = 'Z';
        
        Random generateRandom = new Random();
        RandomPriceValue1 = generateRandom.nextInt(301 - 100) + 100;
        RandomPriceValue2 = generateRandom.nextInt(301 - 100) + 100;
        RandomPriceValue3 = generateRandom.nextInt(301 - 100) + 100;
        System.out.print("3 random price values : ");
        System.out.printf("%.2f", RandomPriceValue1);
        System.out.print(" ");
        System.out.printf("%.2f", RandomPriceValue2);
        System.out.print(" ");
        System.out.printf("%.2f", RandomPriceValue3);
        System.out.println(" ");
        System.out.println(" ");

        System.out.print("5 random even-numbered years : ");
        for (int i = 0; i < 5; i++) {
            year = generateRandom.nextInt(2031 - 1990) + 1990;
            if (year % 2 == 0) {
                System.out.print(" ");
                System.out.print(year);
            }

            if (year % 2 != 0) {
                year = year + 1;
                System.out.print(" ");
                System.out.print(year);
            }

        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.print("Car Plate Number : ");
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            char PlateNum = (char) (Math.random() * 10 + '0');
            s.append(PlateNum);
        }

        for (int i = 0; i < 2; i++) {
            char ch = (char) (Math.random() * 26 + 'A');
            s.append(ch);
        }
        System.out.print(s + " ");
        System.out.println(" ");
        System.out.println(" ");

        String upperChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerChar = "abcdefghijklmnopqrstuvwxyz";

        String mixChar = upperChar + lowerChar;
        StringBuilder sb = new StringBuilder();
        
        int length = 8;
        for (int i = 0; i < length; i++) {
            int index = generateRandom.nextInt(mixChar.length());
            char randomChar = mixChar.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        System.out.println("Random Word : " + randomString);
        System.out.println(" ");
        System.out.println(" ");
    }

}
