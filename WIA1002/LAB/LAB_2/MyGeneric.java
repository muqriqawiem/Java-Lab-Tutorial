package WIA1002.LAB.LAB_2;

public class MyGeneric <E>{
    
    private E e; //Declare a variable called e for the type parameter

    public MyGeneric() { //Create a no-arg constructor
    }

    public MyGeneric(E e) { //Create a constructor that accepts one generic parameter
        this.e = e;
    }

    public void setE(E e) { //Create a setter and getter method for the generic type
        this.e = e;
    }

    public E getE() {
        return e;
    }
    
    public static void main(String[] args) {
        //creates two instances of generic class of type String called strObj and of type Integer called intObj
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        
        // Set a value for each of these objects
        strObj.setE("Hello");
        intObj.setE(3);
        
        //Display these values using the getter method
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
        
    }
}
