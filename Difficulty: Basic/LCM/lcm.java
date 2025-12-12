class Solution {
    
    // Function to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int LCM(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
