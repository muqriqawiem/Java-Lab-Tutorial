package WIX1002.LAB.LAB6;

public class Q2 {

    public static void main(String[] args) {
        int rowTriangles = 5;
        //Triangles
        System.out.println("Triangle:");
        for (int i = 1; i <= rowTriangles; i++) {
            multiPrint(rowTriangles - i, ' ');
            multiPrint(2 * i - 1, '*');
            multiPrint(rowTriangles - i, ' ');
            System.out.println();
        }
        //Diamonds
        int rowDiamondsPerPeak = 5;
        System.out.println("Diamond:");
        //straight up triangle
        for (int i = 1; i <= rowDiamondsPerPeak; i++) {
            multiPrint(rowDiamondsPerPeak - i, ' ');
            multiPrint(2 * i - 1, '*');
            multiPrint(rowDiamondsPerPeak - i, ' ');
            System.out.println();
        }
        //inverse triangle
        for (int i = rowDiamondsPerPeak - 1; i >= 1; i--) {
            multiPrint(rowDiamondsPerPeak - i, ' ');
            multiPrint(2 * i - 1, '*');
            multiPrint(rowDiamondsPerPeak - i, ' ');
            System.out.println();
        }
    }

    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

}
