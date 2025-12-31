import java.util.Arrays;

class Solution {
    public static int filterUsingStreams(int[] arr) {
        return Arrays.stream(arr)
                     .filter(x -> x % 2 != 0)
                     .max()
                     .getAsInt();
    }
}
