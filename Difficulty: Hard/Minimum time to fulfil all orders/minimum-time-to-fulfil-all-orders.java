class Solution {
    public int minTime(int[] ranks, int n) {
        int minRank = Integer.MAX_VALUE;
        for (int r : ranks) {
            minRank = Math.min(minRank, r);
        }

        int low = 0;
        int high = minRank * n * (n + 1) / 2;
        int answer = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMakeDonuts(ranks, n, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }

    private boolean canMakeDonuts(int[] ranks, int n, int time) {
        int donuts = 0;

        for (int r : ranks) {
            int t = 0;
            int k = 1;

            while (t + r * k <= time) {
                t += r * k;
                donuts++;
                k++;
                if (donuts >= n) return true;
            }
        }
        return false;
    }
}
