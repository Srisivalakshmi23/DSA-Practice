class Solution {
    int smallestDivisor(int[] arr, int k) {
        // Code here
        int left = 1;
        int right = getMax(arr);
        int result = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sum = getSum(arr, mid);
            if (sum <= k) {
                result = mid; 
                right = mid - 1;
            } else {
                left = mid + 1; 
            }
        }
        return result;
    }
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }
    private static int getSum(int[] arr, int divisor) {
        int total = 0;
        for (int num : arr) {
            total += (num + divisor - 1) / divisor;
        }
        return total;
    }
}