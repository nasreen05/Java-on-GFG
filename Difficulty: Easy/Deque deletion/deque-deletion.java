class Solution {
    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        // Convert to list for indexed removal
        ArrayList<Integer> list = new ArrayList<>(deq);
        list.remove(X);
        deq.clear();
        deq.addAll(list);
    }

    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        if (start == end) return; // nothing to remove
        
        ArrayList<Integer> list = new ArrayList<>(deq);
        
        for (int i = end - 1; i >= start; i--) {
            list.remove(i);
        }
        
        deq.clear();
        deq.addAll(list);
    }

    public static void eraseAll(ArrayDeque<Integer> deq) {
        deq.clear();
    }
}
