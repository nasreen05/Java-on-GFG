import java.util.ArrayList;

class Solution {

    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            int x = query[2];

            int left = firstOccurrence(arr, x);
            int right = lastOccurrence(arr, x);

            // If x does not exist or is outside range
            if (left == -1 || left > r || right < l) {
                result.add(0);
            } else {
                int start = Math.max(left, l);
                int end = Math.min(right, r);
                result.add(end - start + 1);
            }
        }

        return result;
    }

    // First occurrence of x
    private int firstOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Last occurrence of x
    private int lastOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
