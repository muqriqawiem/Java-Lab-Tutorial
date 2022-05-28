package WIX1002.TUTO.TUTORIAL6;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Define a static void method that returns the area and the circumference of a circle given
        the argument is radius. Area = πr
        2 and Circumference = 2 πr.
         */

        int radius = 3;
        double[] AreaCircumference = new double[2];
        circle(radius, AreaCircumference);
        System.out.println("Area: " + AreaCircumference[0]);
        System.out.println("Circumference: " + AreaCircumference[1]);

    }

    public static void circle(int r, double[] AreaCir) {
        AreaCir[0] = Math.PI * r * r;//area
        AreaCir[1] = Math.PI * 2 * r;//Circum
    }

}
