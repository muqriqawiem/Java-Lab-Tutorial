package WIA1002.LAB.LAB_6;
import java.util.Scanner;

public class TestIntMyStack {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer value: ");
            stack.push(scanner.nextInt());
            
            System.out.print("Enter an integer value: ");
            stack.push(scanner.nextInt());
            
            System.out.print("Enter an integer value: ");
            stack.push(scanner.nextInt());
        }
        System.out.println("\nSize of the stack: " + stack.getSize());
        
        System.out.println("\nContents inside the stack.");
        for(int i = 0;i < stack.getSize();i++){
            System.out.println(stack.pop());
        }
        System.out.println(stack.pop());
    }
    
}
