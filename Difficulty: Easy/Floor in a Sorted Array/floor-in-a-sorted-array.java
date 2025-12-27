class Solution {
    public int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] <= x) {
                ans = mid;          // possible floor
                low = mid + 1;      // move right for last occurrence
            } else {
                high = mid - 1;
            }
        }
        
        return ans;
    }
}
