class Solution {
    public static void squareWall(int s) {

        // Create one row using StringBuilder
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < s; i++) {
            row.append("* ");
        }

        // Print the row 's' times using single loop
        for (int i = 0; i < s; i++) {
            System.out.println(row.toString());
        }
    }
}
