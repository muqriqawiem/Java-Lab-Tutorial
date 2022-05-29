package WIX1002.LAB.LAB5;

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
        /*
6.Write a program that used to create Pascal Triangle in the square
matrix. The program will accept an integer from the users and use the
integer to create the Pascal Triangle.
         */
//Initialize or declare
        int row;
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Enter the number of row of Pascal Triangle to generate:");
            row = userInput.nextInt();
        }
        int[][] Pascal = new int[row][row];
//Assign value 1 for coloumn 1 and zero for the rest
        for (int indexRow = 0; indexRow < row; indexRow++) {
            for (int indexCol = 0; indexCol < row; indexCol++) {
                if (indexCol == 0) {
                    Pascal[indexRow][indexCol] = 1;
                } else {
                    Pascal[indexRow][indexCol] = 0;
                }
            }
        }
//For coloumn > 0, use formula matrix[row][col] = matrix[row-1][col-1] + matrix[row-1][col]
        for (int indexRow = 1; indexRow < row; indexRow++) {
            for (int indexCol = 1; indexCol < row; indexCol++) {
                Pascal[indexRow][indexCol] = Pascal[indexRow - 1][indexCol - 1]
                        + Pascal[indexRow - 1][indexCol];
            }
        }
//Display
        System.out.println("The Pascal Triangle with " + row + "row(s)");
        for (int indexRow = 0; indexRow < row; indexRow++) {
            for (int indexCol = 0; indexCol < row; indexCol++) {
                System.out.print(Pascal[indexRow][indexCol] + " ");
            }
            System.out.println();

        }

    }
}

