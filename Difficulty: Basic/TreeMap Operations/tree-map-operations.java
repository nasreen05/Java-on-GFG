import java.util.*;

class GfG {

    /* Inserts an entry with key x and value y in map */
    void add_Value(TreeMap<Integer, Integer> hm, int x, int y) {
        hm.put(x, y);
    }

    /* Returns the value with key x from the map */
    int find_value(TreeMap<Integer, Integer> hm, int x) {
        if (hm.containsKey(x)) {
            return hm.get(x);
        }
        return -1;
    }

    /* Returns the size of the map */
    int getSize(TreeMap<Integer, Integer> hm) {
        return hm.size();
    }

    /* Removes the entry with key x from the map */
    void removeKey(TreeMap<Integer, Integer> hm, int x) {
        hm.remove(x);
    }

    /* Print map sorted by key */
    void sorted_By_Key(TreeMap<Integer, Integer> hm) {
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }
    }
}
