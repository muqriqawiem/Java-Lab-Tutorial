package WIA1002.LAB.LAB_2_GENERICS;

public class CompareMax {
    /*
    create a generic static method called maximum where the generic type extends the Comparable interface,
    which receives three parameters
    */
    public static <T extends Comparable<T>> T maximum(T a,T b,T c){
        //Find the maximum of three values invoked by the main method
        T max = a; //assume the max value is a
        
        if(b.compareTo(max) > 0){
            max = b; //b is the largest value
        }
        
        if(c.compareTo(max) > 0){
            max = c; //c will be the largest value
        }
        
        return max; //return the largest value
    }
    
    public static void main( String args[] ){
        System.out.printf( "Max of %d, %d and %d is %d\n\n", 1, 2, 3, maximum( 1, 2, 3 ) );
        
        System.out.printf( "Max of %.1f, %.1f and %.1f is %.1f\n",1.2,2.3, 3.4, maximum( 1.2, 2.3, 3.4 ) );
    }
}