import java.util.HashSet;

class Solution {
    public static int unique_substring(String s) {
        HashSet<String> set = new HashSet<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                set.add(s.substring(i, j));
            }
        }

        return set.size();
    }
}
