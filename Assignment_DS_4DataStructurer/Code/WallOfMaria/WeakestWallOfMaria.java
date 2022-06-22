package WallOfMaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class WeakestWallOfMaria {

    public static void main(String[] args) {
        System.out.println("\nWall of Maria has already been generated. ");
        System.out.println("\nScanning weakest part of Wall of Maria....\n");
        List<List<Integer>> layer = new ArrayList<>();
        List<Integer> brick1 = new ArrayList<>();
        List<Integer> brick2 = new ArrayList<>();
        List<Integer> brick3 = new ArrayList<>();
        List<Integer> brick4 = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        brick1.add(3);
        brick1.add(6);
        brick1.add(9);
        layer.add(brick1);
        brick2.add(2);
        brick2.add(5);
        brick2.add(8);
        brick2.add(9);
        layer.add(brick2);
        brick3.add(1);
        brick3.add(4);
        brick3.add(10);
        layer.add(brick3);
        brick4.add(5);
        brick4.add(7);
        brick4.add(9);
        layer.add(brick4);
        arr = ConvertToOneList(layer);
        int test = mostFrequentArrayList(arr, arr.size());
        System.out.println("Weakest part of Wall of Maria is at position " + test + "\n");
    }

    public static ArrayList<Integer> ConvertToOneList(List<List<Integer>> data) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (!data.isEmpty()) {
            List<Integer> layer = new ArrayList<>();
            layer = data.get(0);
            data.remove(0);
            while (!layer.isEmpty()) {
                arr.add(layer.get(0));
                layer.remove(0);
            }
        }
        return arr;
    }

    public static int mostFrequentArrayList(ArrayList<Integer> arr, int n) {
        // Sort the array
        Collections.sort(arr);
        // find the max frequency using linear traversal
        Integer max_count = 1;
        Integer res = arr.get(0);
        int curr_count = 1;

        for (int i = 1; i < n; i++) {
            if (Objects.equals(arr.get(i), arr.get(i - 1))) {
                curr_count++;
            } else {
                curr_count = 1;
            }

            if (curr_count > max_count) {
                max_count = curr_count;
                res = arr.get(i - 1);
            }
        }
        return res;
    }
}
