package WIX1002.LAB.LabReport1;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1 {

    public static int checkValidity(int a, int b, int c) {

        // side lengths of each other must be more (a + b > c, a + c > b, b + c > a) 
        if (a + b <= c || a + c <= b || b + c <= a) // 0 = False and 1 = True
        {
            return 0;
        } else {
            return 1;
        }
    }

    public static void checkTriangle(int a, int b, int c) {

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        }

        if (a == b || b == c || c == a) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

    }

    public static void main(String[] args) {
        // Method to check if a triangle is possible with the given side lengths
        // Method to check the type of the triangle
    }
}
