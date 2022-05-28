package WIA1002.LAB.LAB_5_DoublyLinkedList.Q1;

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
