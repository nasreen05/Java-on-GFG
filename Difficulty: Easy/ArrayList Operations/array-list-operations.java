import java.util.*;

class Solution {

    // 1. Add element to ArrayList
    public static void add_to_ArrayList(ArrayList<Integer> A, int x) {
        A.add(x);
    }

    // 2. Sort ArrayList in ascending order
    public static void sort_ArrayList_Asc(ArrayList<Integer> A) {
        Collections.sort(A);
    }

    // 3. Reverse the ArrayList
    public static void reverse_ArrayList(ArrayList<Integer> A) {
        Collections.reverse(A);
    }

    // 4. Return size of ArrayList
    public static int size_Of_ArrayList(ArrayList<Integer> A) {
        return A.size();
    }

    // 5. Sort ArrayList in descending order
    public static void sort_ArrayList_Desc(ArrayList<Integer> A) {
        Collections.sort(A, Collections.reverseOrder());
    }

    // 6. Print ArrayList elements
    public static void print_ArrayList(ArrayList<Integer> A) {
        for (int i = 0; i < A.size(); i++) {
            System.out.print(A.get(i) + " ");
        }
    }
}
