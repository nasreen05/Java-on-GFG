import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create one row using string multiplication
        String row = "* ".repeat(n).trim();

        // Print square wall using single loop
        for (int i = 0; i < n; i++) {
            System.out.println(row);
        }
    }
}
