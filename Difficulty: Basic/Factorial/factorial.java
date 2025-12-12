class Solution {
    public static int nFactorial(int n) {
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= i;  // multiply all numbers from 1 to n
        }

        return ans;
    }
}
