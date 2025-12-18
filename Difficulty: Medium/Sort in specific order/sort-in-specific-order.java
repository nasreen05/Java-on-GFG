import java.util.*;

class Solution {
    public void sortIt(int[] arr) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        // Separate odd and even numbers
        for (int num : arr) {
            if (num % 2 != 0)
                odd.add(num);
            else
                even.add(num);
        }

        // Sort odd descending
        odd.sort(Collections.reverseOrder());

        // Sort even ascending
        Collections.sort(even);

        // Put back into original array
        int idx = 0;
        for (int num : odd) {
            arr[idx++] = num;
        }
        for (int num : even) {
            arr[idx++] = num;
        }
    }
}
