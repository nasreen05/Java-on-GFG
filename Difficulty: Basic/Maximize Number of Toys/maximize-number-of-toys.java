import java.util.Arrays;

class Solution {
    public static int max_toys(int arr[], int k) {
        Arrays.sort(arr);

        int count = 0;
        for (int price : arr) {
            if (k >= price) {
                k -= price;
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
