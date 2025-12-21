import java.util.*;

class Solution {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q,
                             ArrayList<Integer> Query) {

        // Query type 1: Insert element
        if (Q == 1) {
            int p = Query.get(0);
            int r = Query.get(1);
            A.add(p, r);          // insert r at index p
            return A;
        }

        // Query type 2: Find last index of element
        else {
            int p = Query.get(0);
            int index = -1;

            for (int i = 0; i < A.size(); i++) {
                if (A.get(i) == p) {
                    index = i;    // keep updating for last occurrence
                }
            }

            ArrayList<Integer> result = new ArrayList<>();
            result.add(index);
            return result;
        }
    }
}
