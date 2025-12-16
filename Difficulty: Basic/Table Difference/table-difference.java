import java.util.*;

public class Solution {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int diff = (n1 * i) - (n2 * i);
            System.out.print(diff);

            if (i < 10) {
                System.out.print(" ");
            }
        }
    }
}
