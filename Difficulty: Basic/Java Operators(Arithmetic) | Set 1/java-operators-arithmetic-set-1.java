class Solution {
    public double[] FindRoots(int A, int B, int C) {
        double D = (double) B * B - 4.0 * A * C;

        // If roots are not real
        if (D < 0) {
            return new double[]{-1};
        }

        double sqrtD = Math.sqrt(D);

        double root1 = (-B - sqrtD) / (2.0 * A);
        double root2 = (-B + sqrtD) / (2.0 * A);

        // Return in ascending order
        if (root1 < root2) {
            return new double[]{root1, root2};
        } else {
            return new double[]{root2, root1};
        }
    }
}
