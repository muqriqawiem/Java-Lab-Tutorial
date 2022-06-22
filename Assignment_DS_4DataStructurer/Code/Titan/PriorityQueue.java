package Titan;

public class PriorityQueue<E> implements Comparable<E> {

    private final java.util.LinkedList<E> list = new java.util.LinkedList<>();

    public void offer(E e) {
        list.offer(e);
    }

    public E remove() {
        return list.remove();
    }

    public E peek() {
        return list.peek();
    }

    public E poll() {
        return list.poll();
    }

    public void clear() {
        list.clear();
    }

    public int getSize() {
        return list.size();
    }

    public boolean contains(E o) {
        return list.contains(o);
    }

    @Override
    public String toString() {
        return "Sequence to be killed : " + list.toString();
    }

    public boolean search(E o) {
        return list.contains(o);
    }

    @Override
    public int compareTo(E o) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
        // Tools | Templates.
    }
}
