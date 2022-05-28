package WIA1002.LAB.LAB_7_Queue;

public class TestQueue {
    public static void main(String[] args) {
        MyQueue<String> fruitQ = new MyQueue<String>(new String[]{"Durian", "Blueberry"});
        
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        
        System.out.println("Display the queue: " + fruitQ.toString());
        System.out.println();
        System.out.println("Show the top item: " + fruitQ.peek());
        System.out.println();
        System.out.println("Get the queue size: "+fruitQ.getSize());
        System.out.println();
        fruitQ.dequeue();
        System.out.println("Delete Durian. " + fruitQ.toString());
        System.out.println();
        System.out.println("Get item in index of position 2. " + fruitQ.getElement(2));
        System.out.println();
        System.out.println("Check whether the queue consist of Cherry. " + fruitQ.contains("Cherry"));
        System.out.println();
        System.out.println("Check whether the queue consist of Durian. " + fruitQ.contains("Durian"));
        System.out.println();
        System.out.println("Display the queue using isEmpty condition. " + fruitQ.isEmpty());
        
    }
}
