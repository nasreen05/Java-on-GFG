class Solution {
    static int areAnagram(String S1, String S2) {
        
        // Step 1: length check
        if (S1.length() != S2.length()) {
            return 0;
        }

        // Step 2: frequency array (ASCII characters)
        int[] freq = new int[256];

        // Step 3: count characters
        for (int i = 0; i < S1.length(); i++) {
            freq[S1.charAt(i)]++;
            freq[S2.charAt(i)]--;
        }

        // Step 4: check frequency balance
        for (int count : freq) {
            if (count != 0) {
                return 0;
            }
        }

        return 1;
    }
}
