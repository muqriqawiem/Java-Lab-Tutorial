package WIA1002.TUTO.TUTO_2;

public class MyArray {

    
    public static void main(String[] args) { //a main method that creates 3 arrays of
        Integer[] num = {1,2,3,4,5}; // integer containing the numbers 1,2,3,4 and 5
        String[] name = {"Jane","Tom","Bob"}; // string containing names, Jane, Tom and Bob
        Character[] alphabet = {'a','b','c'}; //character containing alphabet, a, b and c
        MyArray.listAll(num);
        MyArray.listAll(name);
        MyArray.listAll(alphabet);
        
    }
    
    public static <E> void listAll(E[]list){ // a generic method listAll that displays the list of arrays
        for(int i = 0;i<list.length;i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    
}