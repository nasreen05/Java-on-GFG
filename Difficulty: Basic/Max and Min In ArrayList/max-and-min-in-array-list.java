import java.util.*;

class Solution {
    public static int maximumElement(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}
