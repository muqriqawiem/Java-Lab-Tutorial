package WIA1002.LAB.LAB_2_GENERICS;

public class StorePair {

    private int first, second;

    public StorePair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public void setPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return "first = " + first + " second = " + second;
    }
}
