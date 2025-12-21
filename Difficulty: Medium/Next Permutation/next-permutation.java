class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: find break point
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: if no break point, reverse entire array
        if (index == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: find next greater element
        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, i, index);
                break;
            }
        }

        // Step 4: reverse suffix
        reverse(arr, index + 1, n - 1);
    }

    void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
