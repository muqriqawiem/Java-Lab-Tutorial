package WIX1002.LAB.LabReport2;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        String s;
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        s = sc.next();
        System.out.print("Enter any number to be divided with the number above: ");
        k = sc.nextInt();
        System.out.println(CompBrain(s, k));
    }

    public static int CompBrain(String s, int k) {

        // get the index of wildcards
        int[] wcIndex = new int[3];
        int indexCount = 0;
        boolean firstDigitIsWildcard = false;
        int fdiwPosition = 4;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '?') {
                if (i == 0) {
                    firstDigitIsWildcard = true;
                    fdiwPosition = indexCount;
                }
                wcIndex[indexCount] = s.length() - 1 - i;
                indexCount++;
            }
        }

        // getting the values of each wildcard
        int[] wcValue = new int[3];
        for (int i = 0; i < 3; i++) {
            if (i != 0 && wcIndex[i] == 0) {
                continue;
            }
            wcValue[i] = 1 * (int) Math.pow(10, wcIndex[i]);
        }

        // initialize the starting value
        String tempStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                if (i == 0) {
                    tempStr += "1";
                } else {
                    tempStr += "0";
                }
            } else {
                tempStr += s.charAt(i);
            }
        }
        int tempInt = Integer.valueOf(tempStr);

        int formCount = 0;
        int runTime2 = 10, runTime1 = 10, runTime0 = 10;

        if (wcValue[2] == 0) {
            runTime2 = 1;
        }
        if (wcValue[1] == 0) {
            runTime1 = 1;
        }
        if (wcValue[0] == 0) {
            runTime0 = 1;
        }
        if (firstDigitIsWildcard) {
            switch (fdiwPosition) {
                case 2:
                    runTime2--;
                    break;
                case 1:
                    runTime1--;
                    break;
                case 0:
                    runTime0--;
                    break;
                default:
                    break;
            }
        }

        for (int h = 0; h < runTime2; h++) {
            for (int i = 0; i < runTime1; i++) {
                for (int j = 0; j < runTime0; j++) {
                    if ((tempInt + (h * wcValue[2]) + (i * wcValue[1]) + (j * wcValue[0])) % k == 0) {
                        formCount++;
                    }
                }
            }
        }
        return formCount;
    }

}
