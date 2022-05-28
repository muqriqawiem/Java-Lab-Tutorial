package WIA1002.LAB.LAB_6;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        MyStack<Integer> stack1 = new MyStack<>();
        
        //add elements, a b and c in the stack.
        stack.push('a');
        stack.push('b');
        stack.push('c');
        
        //Print the stack
        System.out.println(stack);
        
        //Check if element ‘b’ is in the stack.
        System.out.println();
        System.out.println("Check if element 'b' is in the stack. " + stack.search('b'));
        
        //Check if element 'k' is in the stack.
        System.out.println();
        System.out.println("Check if element 'k' is in the stack. " + stack.search('k'));
        
        //add element 1,2,3 in the stack.
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        
        //print stack1
        System.out.println();
        System.out.println(stack1);
        
        //Check if element 6 is in the stack.
        System.out.println();
        System.out.println("Check if element 6 is in the stack. " + stack1.search(6));
    }
}
