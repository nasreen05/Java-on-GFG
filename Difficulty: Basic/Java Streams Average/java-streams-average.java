import java.util.Arrays;

class Solution {

    public double avgUsingStreams(int[] arr) {
        // Using Java Streams to calculate average
        return Arrays.stream(arr).average().orElse(0.0);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(obj.avgUsingStreams(arr)); // Should print 3.0
    }
}
