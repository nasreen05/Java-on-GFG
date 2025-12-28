class Solution {
    public static String Sorted_Characters(String s) {
        boolean[] present = new boolean[26];

        // Mark characters present in the string
        for (int i = 0; i < s.length(); i++) {
            present[s.charAt(i) - 'a'] = true;
        }

        // Build result in sorted order
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (present[i]) {
                result.append((char) (i + 'a'));
            }
        }

        return result.toString();
    }
}
