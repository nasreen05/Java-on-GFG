class Solution {
    public ArrayList<Integer> constructArr(int[] arr) {

        int m = arr.length;
        if (m == 1) {
            // Only one sum → original array has 2 elements
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(1); 
            ans.add(arr[0] - 1);
            return ans;
        }

        // Find n such that m = n * (n - 1) / 2
        int n = 2;
        while (n * (n - 1) / 2 < m) n++;

        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, 0));

        int s01 = arr[0];      // res[0] + res[1]
        int s02 = arr[1];      // res[0] + res[2]
        int s12 = arr[n - 1];  // res[1] + res[2]

        int r0 = (s01 + s02 - s12) / 2;
        int r1 = s01 - r0;
        int r2 = s02 - r0;

        res.set(0, r0);
        res.set(1, r1);
        res.set(2, r2);

        // Fill others: arr index for res[0] + res[k] (k from 3..n-1)
        int idx = 2;  // first two sums used already
        for (int k = 3; k < n; k++) {
            res.set(k, arr[idx] - r0);
            idx++;
        }

        return res;
    }
}

