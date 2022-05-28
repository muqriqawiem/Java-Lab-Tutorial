package WIX1002.LAB.LAB5;

/**
 *
 * @author Muqri Qawiem
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //4.Write a program that rotates 90 degrees clockwise a 3 by 3 matrix
        final int totalRow = 3;
        int[][] matrixA = {{1, 5, 7}, {3, 6, 9}, {5, 3, 8}};
        int[][] matrixB = new int[3][3]; //Rotated matrix
        System.out.println("3 by 3 Matrix");
        for (int indexRow = 0; indexRow < totalRow; indexRow++) {
            for (int indexCol = 0; indexCol < totalRow; indexCol++) {
                System.out.print(matrixA[indexRow][indexCol] + " ");
            }
            System.out.println();
        }
        System.out.println("After rotates 90 degress clockwise");
        //Rotated matrix by 90 degree
        for (int indexRow = 0; indexRow < totalRow; indexRow++) {
            for (int indexCol = 0; indexCol < totalRow; indexCol++) {
                matrixB[indexRow][indexCol] = matrixA[3 - indexCol - 1][indexRow];
                System.out.print(matrixB[indexRow][indexCol] + " ");
            }
            System.out.println();
        }

    }
}

