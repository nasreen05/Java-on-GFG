import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 100) {
            System.out.println("Big");
        } else if (a < 10) {
            System.out.println("Small");
        } else {
            System.out.println("Number");
        }
    }
}
