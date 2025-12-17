import java.util.*;

class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int x : arr) {
            dq.addLast(x);   // insert at rear
        }
        
        return dq;
    }
}
