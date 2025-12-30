class Solution {
    public String reverseWords(String s) {

        // Split by dot
        String[] parts = s.split("\\.");

        StringBuilder result = new StringBuilder();

        // Traverse from end to start
        for (int i = parts.length - 1; i >= 0; i--) {

            // Ignore empty strings caused by extra dots
            if (!parts[i].isEmpty()) {

                if (result.length() > 0) {
                    result.append(".");
                }
                result.append(parts[i]);
            }
        }
        return result.toString();
    }
}
