package WIA1002.TUTO.TUTO_2;

public class Container<T> {  //a generic class called Container that accepts one parameter, T
    
    private T t;   //a private variable, t of type T

    public Container() {    //a no-arg constructor
    }
    
    public void add(T t){   //a method, add that returns nothing, accepting a parameter of generic type. Initialize this parameter to the initially declared variable
        this.t = t;
    }
    
    public T retrieve(){   //a generic method called retrieve() that returns the initially declared variable
        return t;
    }
    
    public static void main(String[] args){
        Container<Integer> ContainerInteger = new Container<Integer>();  //two containers of type Integer and String
        Container<String> ContainerString = new Container<String>();
        
        ContainerInteger.add(50);  //Append two objects to the containers
        ContainerString.add("Java");
        
        System.out.println("Integer value is " + ContainerInteger.retrieve());  // Display the Integer and String objects from the respective containers
        System.out.println("String value is " + ContainerString.retrieve());
    }
}
