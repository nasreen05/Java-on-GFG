import java.util.*;

class Geeks {

    // Insert element into max-heap PriorityQueue
    void insert(PriorityQueue<Integer> pq, int k) {
        pq.add(k);
    }

    // Check if element exists in PriorityQueue
    boolean find(PriorityQueue<Integer> pq, int k) {
        return pq.contains(k);
    }

    // Delete and return the max element from PriorityQueue
    int delete(PriorityQueue<Integer> pq) {
        return pq.poll(); // pq is a max-heap
    }
}
