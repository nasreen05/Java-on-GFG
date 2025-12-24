import java.util.*;

class Solution {
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // Add elements to ArrayList
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
        
        // Use Iterator to remove elements < k
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() < k) {
                it.remove();
            }
        }
        
        // Sort the remaining elements
        Collections.sort(list);
        
        return list;
    }
}
