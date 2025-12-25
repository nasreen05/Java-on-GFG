import java.util.*;

class Solution {
    public ArrayList<Integer> findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int left = 0, right = m - 1;

        while (left <= right) {
            int midCol = (left + right) / 2;

            // Find row index of max element in mid column
            int maxRow = 0;
            for (int i = 0; i < n; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }

            int leftVal = (midCol - 1 >= 0) ? mat[maxRow][midCol - 1] : Integer.MIN_VALUE;
            int rightVal = (midCol + 1 < m) ? mat[maxRow][midCol + 1] : Integer.MIN_VALUE;

            // Check if peak
            if (mat[maxRow][midCol] >= leftVal && mat[maxRow][midCol] >= rightVal) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(maxRow);
                result.add(midCol);
                return result;
            }

            // Move search space
            if (leftVal > mat[maxRow][midCol]) {
                right = midCol - 1;
            } else {
                left = midCol + 1;
            }
        }

        return new ArrayList<>();
    }
}
