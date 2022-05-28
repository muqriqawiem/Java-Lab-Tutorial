package WIX1002.LAB.LAB8;

public class TesterQ1 {

    public static void main(String[] args) {
        Number a = new Number();
        a.printAll();
        a.printPrime();
        a.printEven();
        a.printSq();
        a.printMax();
        a.printMin();
        a.printAverage();
        System.out.println("");
        Number b = new Number(5);
        b.printAll();
        b.printPrime();
        b.printEven();
        b.printSq();
        b.printMax();
        b.printMin();
        b.printAverage();
        System.out.println("");
        Number c = new Number(4, 50);
        c.printAll();
        c.printPrime();
        c.printEven();
        c.printSq();
        c.printMax();
        c.printMin();
        c.printAverage();
    }
}
