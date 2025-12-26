import java.util.*;

class Solution {
    public static void freqSorted(int arr[]) {

        // TreeMap keeps keys sorted
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print result
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
