package WIX1002.LAB.LabReport3;

import java.util.Random;

public class Money {

    private int RM100 = 0;
    private int RM50 = 0;
    private int RM20 = 0;
    private int RM10 = 0;
    private int RM5 = 0;
    private int RM1 = 0;
    private int cents50 = 0;
    private int cents20 = 0;
    private int cents10 = 0;
    private int cents5 = 0;
    private int cents1 = 0;
    int myRandomAmount;

    public Money() {
        Random RandomAmountOfMoney = new Random();
        myRandomAmount = RandomAmountOfMoney.nextInt(1000000 - 1000) + 1000 + 1;
        add(myRandomAmount);

    }

    public Money(int amountOfMoney) {

    }

    public Money(int[] amountsOfMoney) {

    }

    public int getRM100() {
        return RM100;
    }

    public void setRM100(int RM100) {
        this.RM100 = RM100;
    }
    int reminder = 0;

    public void add(int amount) {
        RM100 = amount / 10000;
        reminder = amount - (RM100 * 10000);
        RM50 = reminder / 5000;
        reminder -= RM50 * 5000;
        RM20 = reminder / 2000;
        reminder -= RM20 * 2000;
        RM10 = reminder / 1000;
        reminder -= RM10 * 1000;
        RM5 = reminder / 500;
        reminder -= RM5 * 500;
        RM1 = reminder / 100;
        reminder -= RM1 * 100;
        cents50 = reminder / 50;
        reminder -= cents50 * 50;
        cents20 = reminder / 20;
        reminder -= cents20 * 20;
        cents10 = reminder / 10;
        reminder -= cents10 * 10;
        cents5 = reminder / 5;
        reminder -= cents5 * 5;
        cents1 = (amount % 5);

    }

//    int test =
    @Override
    public String toString() {
        return "Amount = " + myRandomAmount + "(" + "RM" + (double) myRandomAmount / 100 + ")"
                + "\n RM100      quantity=   " + RM100
                + "\n RM50       quantity=   " + RM50
                + "\n RM20       quantity=   " + RM20
                + "\n RM10       quantity=   " + RM10
                + "\n RM5        quantity=   " + RM5
                + "\n RM1        quantity=   " + RM1
                + "\n 50cents    quantity=   " + cents50
                + "\n 20cents    quantity=   " + cents20
                + "\n 10cents    quantity=   " + cents10
                + "\n 5cents     quantity=   " + cents5
                + "\n 1cents     quantity=   " + cents1;
    }
}
