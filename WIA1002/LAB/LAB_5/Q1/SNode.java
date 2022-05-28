package WIA1002.LAB.LAB_5.Q1;

public class SNode<E> {
    E element;
    SNode<E> next;

    public SNode() {
    }

    public SNode(E e) {
        this.element = e;
        this.next = null;
    }
}
