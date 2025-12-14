class Solution {
    public int factorial(int n) {

        int fact = 1;   // separate variable

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
 