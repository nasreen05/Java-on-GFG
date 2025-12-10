import java.util.*;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        long sum = 0;
        long sumSq = 0;
        for (int num : arr) {
            sum += num;
            sumSq += (long) num * num;
        }
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSumSq = (long) n * (n + 1) * (2 * n + 1) / 6;
        
        long diffSum = expectedSum - sum; // missing - repeating
        long diffSumSq = expectedSumSq - sumSq; // (missing^2 - repeating^2)
        
        long sumMR = diffSumSq / diffSum; // missing + repeating
        
        int missing = (int) ((sumMR + diffSum) / 2);
        int repeating = (int) ((sumMR - diffSum) / 2);
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }
}
