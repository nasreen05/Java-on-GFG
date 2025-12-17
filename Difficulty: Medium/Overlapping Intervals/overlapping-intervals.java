import java.util.*;

class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {

        ArrayList<int[]> result = new ArrayList<>();

       
        if (arr == null || arr.length == 0) {
            return result;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int start = arr[0][0];
        int end = arr[0][1];

         for (int i = 1; i < arr.length; i++) {
            int currStart = arr[i][0];
            int currEnd = arr[i][1];

          
            if (currStart <= end) {
                end = Math.max(end, currEnd);
            } else {
                   result.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }

        // Add last interval
        result.add(new int[]{start, end});

        return result;
    }
}
