package WIA1002.LAB.LAB_2;

public class MinMax {

    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 7, 1, 4, 9, 8, 2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        String intString = minmax(intArray);
        String strString = minmax(strArray);
        
        System.out.println(intString);
        System.out.println(strString);
    }

    public static <E extends Comparable<E>> String minmax(E[] array) {
        E min = array[0];
        E max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min.compareTo(array[i]) > 0) {
                min = array[i];
            }
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
            
        }
        return "Min = " + min + " Max = " + max;
    }
}