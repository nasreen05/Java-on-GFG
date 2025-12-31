import java.util.*;

class Solution {

    // Insert elements into TreeSet
    public static TreeSet<Integer> insert(int arr[]) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int val : arr) {
            set.add(val);
        }
        return set;
    }

    // Display elements of TreeSet
    public static void display(TreeSet<Integer> s) {
        for (int val : s) {
            System.out.print(val + " ");
        }
    }

    // Erase element x from TreeSet
    public static void erase(TreeSet<Integer> s, int x) {
        if (s.remove(x)) {
            System.out.print("erased " + x);
        } else {
            System.out.print("not found");
        }
    }
}
