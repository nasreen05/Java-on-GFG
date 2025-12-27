class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int n = mat.length;
        
        int low = mat[0][0];
        int high = mat[n - 1][n - 1];
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            int count = countLessEqual(mat, mid);
            
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    }
    
    // Counts how many elements are <= target
    private int countLessEqual(int[][] mat, int target) {
        int n = mat.length;
        int row = 0;
        int col = n - 1;
        int count = 0;
        
        while (row < n && col >= 0) {
            if (mat[row][col] <= target) {
                count += (col + 1);
                row++;
            } else {
                col--;
            }
        }
        
        return count;
    }
}
