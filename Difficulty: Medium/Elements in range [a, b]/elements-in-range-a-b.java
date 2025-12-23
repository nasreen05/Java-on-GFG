import java.util.*;

class Solution {
    public ArrayList<Integer> cntInRange(int[] arr, int[][] queries) {

        int MAX = 1000000;
        int[] freq = new int[MAX + 1];

        // Step 1: Build frequency array
        for (int num : arr) {
            freq[num]++;
        }

        // Step 2: Build prefix sum array
        for (int i = 1; i <= MAX; i++) {
            freq[i] += freq[i - 1];
        }

        // Step 3: Process queries
        ArrayList<Integer> result = new ArrayList<>();

        for (int[] q : queries) {
            int a = q[0];
            int b = q[1];

            if (a == 0) {
                result.add(freq[b]);
            } else {
                result.add(freq[b] - freq[a - 1]);
            }
        }

        return result;
    }
}
