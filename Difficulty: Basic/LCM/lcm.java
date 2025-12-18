class Solution {
    public static int LCM(int a, int b) {
        int x = a, y = b;

        // Find GCD using Euclidean algorithm
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;

        // LCM formula
        return (a / gcd) * b;
    }
}
