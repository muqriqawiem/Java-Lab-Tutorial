package WIA1002.LAB.LAB_11;

public class TreeNode<E extends Comparable<E>> {
    E element;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E e) {
        this.element = e;
    }
}