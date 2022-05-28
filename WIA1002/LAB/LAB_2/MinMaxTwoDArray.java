package WIA1002.LAB.LAB_2;

public class MinMaxTwoDArray {

    //first method returns the minimum element in a 2D array
    public static <E extends Comparable<E>> E min(E[][] list) {
        E min = list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (min.compareTo(list[i][j]) > 0) {
                    min = list[i][j];
                }
            }
        }
        return min;
    }
    
    //second method returns the maximum element in a 2D array
    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (max.compareTo(list[i][j]) < 0) {
                    max = list[i][j];
                }
            }
        }
        return max;
    }
    
    //test prog. that creates one instance of generic class of type Integer called numbers with elements {4,5,6},{1,2,3}
    //display the minimum  and maximum elements using the min and max methods
    public static void main(String[] args){
        Integer[][] numbers = {{4,5,6},{1,2,3}};
        
        System.out.println("Min is: " + min(numbers));
        System.out.println("Max is: " + max(numbers));
    }
}
