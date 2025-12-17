class Solution {
    public static void invTriangleWall(int s) {

        for (int i = s; i >= 1; i--) {      // number of rows
            for (int j = 1; j <= i; j++) {  // print stars
                System.out.print("* ");
            }
            System.out.println();           // move to next line
        }
    }
}
