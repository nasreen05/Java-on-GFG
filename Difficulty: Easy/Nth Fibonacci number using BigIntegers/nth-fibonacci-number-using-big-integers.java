import java.math.BigInteger;

class Solution {
    public static BigInteger fib(int n) {
        
        // Base cases
        if (n == 1 || n == 2) {
            return BigInteger.ONE;
        }

        BigInteger prev1 = BigInteger.ONE; // F(1)
        BigInteger prev2 = BigInteger.ONE; // F(2)
        BigInteger curr = BigInteger.ZERO;

        for (int i = 3; i <= n; i++) {
            curr = prev1.add(prev2);
            prev1 = prev2;
            prev2 = curr;
        }

        return curr;
    }
}
