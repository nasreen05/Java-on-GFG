class Solution {
    
    public int countLessEqual(int[] arr, int x) {
        int n = arr.length;
        
        // Step 1: Find pivot
        int pivot = findPivot(arr);
        
        // Step 2: Count in left and right sorted parts
        int count = 0;
        count += upperBound(arr, 0, pivot - 1, x);
        count += upperBound(arr, pivot, n - 1, x);
        
        return count;
    }
    
    // Find index of minimum element
    private int findPivot(int[] arr) {
        int low = 0, high = arr.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    
    // Count elements ≤ x in sorted subarray
    private int upperBound(int[] arr, int low, int high, int x) {
        if (low > high) return 0;
        
        int left = low, right = high;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] <= x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left - low;
    }
}
