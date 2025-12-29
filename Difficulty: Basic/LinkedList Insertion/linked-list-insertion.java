class Solution {
    public static LinkedList<Integer> insertion(int arr[]) {
        LinkedList<Integer> ll = new LinkedList<>();

        for (int x : arr) {
            ll.add(x);
        }

        return ll;
    }
}
