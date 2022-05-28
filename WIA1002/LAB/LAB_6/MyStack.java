package WIA1002.LAB.LAB_6;

public class MyStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    public void push(E o){
        list.add(o);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public E pop(){
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
    
    public E peek(){
        return list.get(getSize() - 1);
    }
    
    public Boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return "stack: " + list.toString();
    }
    
    public Boolean search(E o){
        return list.contains(o);
    }
}
