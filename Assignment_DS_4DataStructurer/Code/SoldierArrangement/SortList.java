package SoldierArrangement;

public class SortList<E> {

    public class Node {

        int data;
        Node next;
        private int size;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size = 0;
        }
    }

    // Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;
    public int size = 0;

    // addNode() will add a new node to the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // Checks if the list is empty
        if (head == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode will become new tail of the list
            tail = newNode;
        }
        size++;
    }

    // sortList() will sort nodes of the list in ascending order
    public void sortList() {
        // Node current will point to head
        Node current = head, index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                // Node index will point to node next to current
                index = current.next;

                while (index != null) {
                    // If current node's data is greater than index's node data, swap the data
                    // between them
                    if (current.data < index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public int show(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        int element = temp.data;
        return element;
    }

    // display() will display all the nodes present in the list
    public void display() {
        // Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }
}
