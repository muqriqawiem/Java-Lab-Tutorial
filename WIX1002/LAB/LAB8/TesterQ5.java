package WIX1002.LAB.LAB8;

public class TesterQ5 {

    public static void main(String[] args) {
        Game a = new Game();
        Game b = new Game();
        a.setAll();
        b.setAll();
        while (true) {
            a.updatePosition();
            b.updatePosition();
            a.printTotalValue();
            b.printTotalValue();
            a.Win();
            b.Win();
        }
    }
}
