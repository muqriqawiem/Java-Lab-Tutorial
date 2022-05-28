package WIA1002.LAB.LAB_7;

public class MyQueue<E> {
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();
    
    public MyQueue(E[]e){
        for(E element: e){
            enqueue(element);
        }
    }
    
    public MyQueue(){
        
    }
    
    public void enqueue(E e){
        list.addLast(e);
    }
    
    public E dequeue(){
        return list.removeFirst();
    }
    
    public E getElement(int i){
        if(i<0 || i >= list.size()) return null;
        return list.get(i);
    }
    
    public E peek(){
        return list.getFirst();
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean contains(E e){
        return list.contains(e);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return "Queue: " + list.toString();
    }
    
}
